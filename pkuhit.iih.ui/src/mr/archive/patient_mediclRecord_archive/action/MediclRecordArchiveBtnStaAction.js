Ext.define('iih.mr.archive.patient_mediclRecord_archive.action.MediclRecordArchiveBtnStaAction', {
	extend: 'Xap.ej.action.Action',
	
	/*
	* @Override
	*/
	execute: function(context) {
		//獲取grid如有選中
		var view =this.getOwner();
		var block=view.getBlock('content');
		var grid=block.down('xapgrid');
		var reds=grid.getSelectionModel().getSelection();
		var btn=view.getBlock('condition').down('button[name=uploadFileBtn]');
		if(reds&&reds.length>0){
			btn.setDisabled(false);
		}else{
			btn.setDisabled(true);
		}
	}

});
