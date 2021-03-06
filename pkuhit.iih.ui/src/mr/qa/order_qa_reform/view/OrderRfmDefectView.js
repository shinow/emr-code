
/** 
 * 环节整改通知缺陷列表
 * @author ：yao_lijie
 */
 
Ext.define('iih.mr.qa.order_qa_reform.view.OrderRfmDefectView',{
	extend: 'Xap.ej.template.BaseTemplate',

	requires: [
			   'Xap.ej.element.grid.Grid',
	           'Xap.ej.element.field.Checkbox',
	           'Xap.ej.element.field.ComboBox',
	           'Xap.ej.element.button.Button',
	           'Xap.ej.element.label.Label',
	           'Xap.ej.element.grid.column.Date',
	           'Xap.ej.element.grid.column.ActionColumn',
	           'iih.mr.qa.QaStatusGlobal',
	           'iih.mr.qa.order_qa_work.block.QaOrderListBlock',
	           'iih.mr.qa.process_qa_reform.block.DefectRfmListBlock',
	           'iih.mr.qa.process_qa_reform.action.DefectListAction',
	           'iih.mr.qa.process_qa_reform.action.ProcessRfmDefectViewreadyAction', 
	           'iih.mr.qa.process_qa_reform.action.ConfirmAction',
	           'iih.mr.qa.process_qa_reform.action.DefectRfmAction',
	           'iih.mr.qa.process_qa_reform.action.DefectFinishRfmAction',
	           'iih.mr.qa.process_qa_reform.action.QaMrSignOpenAction',
	           'iih.mr.qa.process_qa_reform.action.DefectIfRfmAction',
	           'iih.mr.qa.process_qa_reform.action.MrDocSaveAction',
	           'iih.mr.qa.order_qa_work.action.OrderListInitAction'
	           
	],

	alias:'widget.orderRfmdefectview',
	
	layout: {
        type : 'vbox',
        align : 'stretch'
    },
 
	xapConfig: {
		blocks: {
		    'top': {
                xclass: 'iih.mr.qa.order_qa_work.block.QaOrderListBlock',
				flex:1
            },
			'bottom': {
				xclass: 'iih.mr.qa.process_qa_reform.block.DefectRfmListBlock',
				height:180
			}
		},
		
		actions: {
			'init': {
				xclass: 'iih.mr.qa.process_qa_reform.action.DefectListAction',
//				url: 'qacustom/faults',
				url: 'qa/notification/faults',
				blocks: {
					top: 'top',
					bottom: 'bottom'
				}
			},
			'initOrder': {
				xclass: 'iih.mr.qa.order_qa_work.action.OrderListInitAction',
				url:'orders',
				blocks:{
					orderlist: 'top'
				}
			},
			'processRfmDefectViewready': {
				xclass: 'iih.mr.qa.process_qa_reform.action.ProcessRfmDefectViewreadyAction', 
				blocks: {
					top: 'top',
					bottom: 'bottom'
				}
			},
			'confirm' : {
				xclass: 'iih.mr.qa.process_qa_reform.action.ConfirmAction',
				url: 'qa/fault/rfm',
				blocks: {
					top: 'top',
					bottom: 'bottom'
				}
			},
			'rfmDefect': {
				xclass: 'iih.mr.qa.process_qa_reform.action.DefectRfmAction',
				url: 'qa/fault/rfm',
				blocks: {
					top: 'top',
					bottom: 'bottom'
				}
			},
			'defectStatusJudge': {
				xclass: 'iih.mr.qa.process_qa_reform.action.DefectStatusJudgeAction',
				url: 'qa/notification/faultStatistical',
				blocks: {
					top: 'top',
					bottom: 'bottom'
				}
			},
			'finishRfm': {
				xclass: 'iih.mr.qa.process_qa_reform.action.DefectFinishRfmAction',
				url: 'qa/notification/finishRfm',
				blocks: {
					top: 'top',
					bottom: 'bottom'
				}
			},
			'qaMrSignOpen': {
				xclass: 'iih.mr.qa.process_qa_reform.action.QaMrSignOpenAction',
				blocks: {
					top: 'top',
					bottom: 'bottom'
				}
			},
			/*'ifRef': {
				xclass: 'iih.mr.qa.process_qa_reform.action.DefectIfRfmAction',
				blocks: {
					top: 'top',
					bottom: 'bottom'
				}
			},*/
			'doSave': {
                xclass: 'iih.mr.qa.process_qa_reform.action.MrDocSaveAction',
//                url: 'mr',
                blocks: {
                    content: 'top'
                }
            }
		},

		chains: {
			'init':['init'],
			'initOrder':['initOrder'],
			'processRfmDefectViewready':['processRfmDefectViewready'],
			'confirm':['confirm'],
			'rfmDefect':['rfmDefect'],
			'defectStatusJudge':['defectStatusJudge'],
			'finishRfm':['finishRfm'],
			'qaMrSignOpen':['qaMrSignOpen'],
//			'ifRef':['ifRef'],
			'doSave':['doSave']
		},

		connections: {
			'top':[{
				event: 'afterrender',
				chain: 'initOrder'
			}],
			'bottom':[{
				event: 'afterrender',
				chain: 'init'
			},{
				selector: 'xapgrid',
				event: 'viewready',
				chain: 'processRfmDefectViewready'
			},{
				selector: 'xapgrid',
				event:'itemdblclick',
				chain: 'confirm'
			},{
				selector: 'xapgrid',
				event:'select',
				chain: 'ifRef'
			},{
				selector: 'xapgrid',
				event:'linkClick',
				chain: 'confirm'
			}]
		}
	},
	
	 hasEdit: function() {/*
        var plugin = document.getElementById('iemrEditor');
        if (plugin != undefined &&plugin.valid&&plugin.IsModified()) {
            return true;
        } else {
            return false;
        }
    */}/*,
		
	initComponent : function() {
			this.callParent();
			this.addEvents("pageRefresh");//为视图添加刷新事件
			this.addListener('pageRefresh', function(){//添加监听事件
		        var chain = this.getActionChain('init');
		        if(chain) {
		            chain.execute();
		        }
			});
		}*/
})