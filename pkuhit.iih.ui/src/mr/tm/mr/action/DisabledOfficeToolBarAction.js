Ext.define('iih.mr.tm.mr.action.DisabledOfficeToolBarAction', {
    extend: 'Xap.ej.action.ServiceInvocation',
    
    /*
     * @Override
     */
    doExecute: function(context) {
        var operations = context.operations;
        if(!operations) {
            return;
        }
        var emrPrintSelectedValue=this.getOwner().ownerCt.emrPrintSelected;
        var me = this;
        var emrSave = 'com.founder.iemr.editor.toolbar:emrSave';//保存
        var emrSaveAs = 'com.founder.iemr.editor.toolbar:emrSaveAs';//保存
        var emrRelease = 'com.founder.iemr.editor.toolbar:emrRelease';//保存
        var emrSubmit = 'com.founder.iemr.editor.toolbar:emrSubmit';//提交
        var emrRevoke = 'com.founder.iemr.editor.toolbar:emrRevoke';//撤销
        var emrStartApprove ='com.founder.iemr.editor.toolbar:emrStartApprove';//开始审签
        var emrApprove ='com.founder.iemr.editor.toolbar:emrApprove';//审签
        var emrAuditRevoke ='com.founder.iemr.editor.toolbar:emrAuditRevoke';//审签撤回
        var emrReject = 'com.founder.iemr.editor.toolbar:emrReject';//驳回
        var emrDocDelete = 'com.founder.iemr.editor.toolbar:emrDocDelete';//删除
        var emrRefreshMacro = 'com.founder.iemr.editor.toolbar:emrRefreshMacro';//刷新宏元素
        var emrRefreshDiagnosis = 'com.founder.iemr.editor.toolbar:emrRefreshDiagnosis';//刷新诊断
        var emrImageLibraries = 'com.founder.iemr.editor.toolbar:emrImageLibraries';//插入图片
        var emrContinuePrint = 'com.founder.iemr.editor.toolbar:emrContinuePrint';//续打
        var emrSelectContinuePrint = 'com.founder.iemr.editor.toolbar:emrSelectContinuePrint';//选页打印
        var emrSaveAsTemplate = 'com.founder.iemr.editor.toolbar:emrSaveAsTemplate';//病历另存为模板
        var emrRefreshDiagnosis = 'com.founder.iemr.editor.toolbar:emrRefreshDiagnosis';//病历另存为模板
        var emrRefreshOutpatientDisposal = 'com.founder.iemr.editor.toolbar:emrRefreshOutpatientDisposal';//病历另存为模板
        var emrUpdateTempl = 'com.founder.iemr.editor.toolbar:emrUpdateTempl';//病历另存为模板
        var emrChangeBaseTempl = 'com.founder.iemr.editor.toolbar:emrChangeBaseTempl';//病历另存为模板
        var emrRefreshMacro = 'com.founder.iemr.editor.toolbar:emrRefreshMacro';//病历另存为模板
        var emrPrintSelected="com.founder.iemr.editor.toolbar:emrPrintSelected";//选中位置续打
        //        var emrSelectContinuePrint = 'com.founder.iemr.editor.toolbar:emrSelectContinuePrint';//选页续打
//        var emrContinuePrint = 'com.founder.iemr.editor.toolbar:emrContinuePrint';//病历另存为模板
//        var iddMedocalHistory = '';//月经史公式编辑
        var readonly = me.getOwner().ownerCt.readonly;
        var release = me.getOwner().ownerCt.release;
        if(release!=undefined && !Ext.isEmpty(release,false)){
        	release = 'false';
        }
        var plugin = document.getElementById('iemrEditor');
        var opType = me.getOwner().ownerCt.opType;
        setTimeout(function() {
        	if(emrPrintSelectedValue){
        		plugin.SetCommandVisible(emrPrintSelected,emrPrintSelectedValue);
        	}
        	plugin.SetCommandVisible(emrStartApprove,false);
        	plugin.SetCommandVisible(emrRefreshOutpatientDisposal,false);
        	plugin.SetCommandVisible(emrRefreshDiagnosis,false);
        	plugin.SetCommandVisible(emrRefreshMacro,false);
        	if(opType=='open'){
        		if(readonly){
        			plugin.SetCommandEnable(emrSave,!readonly);
        			plugin.SetCommandEnable(emrRelease,release);
        		}else{
        			plugin.SetCommandEnable(emrSave,true);
        			//plugin.SetCommandEnable(emrRelease,release);
        		}
            }else if(opType=='new' || opType=='saveAs'){
            	plugin.SetCommandEnable(emrSaveAs,false);
            }
        	plugin.UpdateToolbar();
        },750);
    }
});
