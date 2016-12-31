Ext.define("iih.mr.model.DefectModel",{
	extend: 'Ext.data.Model',
	fields:[
		{name:"sign",type:"string"},
		{name:"needDefect",type:"int"},
		{name:"defectDescription",type:"string"},
		{name:"deductionStandard",type:"string"},
		{name:"defectMark",type:"string"},
		{name:"givenThat",type:"string"},
		{name:"mrDoc",type:"string"},
		{name:"defectState",type:"string"},
		{name:"rectificationInstruction",type:"string"},
		{name:"cutOffTime",type:"string"},
		{name:"businessActivities",type:"string"},
		{name:"forwardDepartment",type:"string"},
		{name:"forwardPeople",type:"string"},
		{name:"forwardTime",type:"string"},
		'processTask'
	]
});