Ext.define('iih.mr.wr.nsv.view.NurScoreDocPropertyEditView',{
	extend : 'Xap.ej.stl.view.SingleRecordEditTemplate',

	requires: [
	    'iih.mr.wr.nsv.block.NurScorePropertyEditBlock',
	    'iih.mr.wr.omr.action.ConfimCreateOmrDocAction',
	    'iih.mr.wr.omr.action.ModifyOmrProAction'
	],

	alias:'widget.nurscoredocpropertyeditview',
	
	layout:'fit',
	
	xapConfig: {
		blocks: {
		    'content': {
                xclass: 'iih.mr.wr.nsv.block.NurScorePropertyEditBlock',
                height:150
            }
		},
		actions: {
		    'init': { 
		    	xclass: 'iih.mr.wr.nsv.action.InitNurScorePropertyEditAction',
		        url:'',
		        blocks: {
		            content:'content'
		        }
		    }/*,
		    'initjobTitle': { 
                xclass: 'iih.mr.wr.mr.action.InitjobTitleAction',
                blocks: {
                    content:'content'
                }
            },
		    'initCombox': { 
                xclass: 'iih.mr.wr.mr.action.InitComboxAction',
                blocks: {
                    content:'content'
                }
            }*/,
            'confimUpPro':{
                xclass:'iih.mr.wr.omr.action.ModifyOmrProAction',
                url:'omr',
                blocks:{
                    content:'content'
                }
            },
		    'cancel': {
		        xclass: 'iih.mr.wr.mr.action.CancelCreateMrDocAction',
		        //url:'cancelTemplatePropertyEdit',
		        blocks: {
		            content: 'content'
		        }
		    },
            'templateProperty': {
                xclass: 'iih.mr.wr.mr.action.MrTemplatePropertyInitAction',
                url:'mr/tpl/template',
                blocks: {
                    content: 'content'
                }
            }/*,
            'mrDocPropertyEditInitComboxAction': {
                xclass: 'iih.mr.wr.mr.action.MrDocPropertyEditInitComboxAction',
                url:'/app/sup/doctors',
                blocks: {
                    content: 'content'
                }
            }*/
		},

		chains: {
		    'init': ['init'],
//		    'initjobTitle': ['initjobTitle'],
            'confimUpPro': ['confimUpPro'],
//            'mrDocPropertyEditInitComboxAction': ['mrDocPropertyEditInitComboxAction'],
            'cancel': ['cancel'],
            'templateProperty':['templateProperty']
		},

		connections: {
		    'content':[/*{
                event:'afterrender',
                chain:'init'
            },*/{    
                //确认按钮（修改病历属性）
                selector: 'button[method=confimUpPro]',
                event: 'click',
                chain: 'confimUpPro'
            },{    
                //关闭按钮
                selector: 'button[method=close]',
                event: 'click',
                chain: 'cancel'
            },{    
                //取消按钮
                selector: 'button[method=cancel]',
                event: 'click',
                chain: 'cancel'
            },{
                selector: 'xapdisplayfield[name=templeName]',
                event: 'click',
                chain: 'templateProperty'
            },{    
                //上级医师
                selector: 'xapcombobox[name=higherLvlEmpId]',
                event: 'change',
                chain: 'initjobTitle'
            }]
		}
	}
})