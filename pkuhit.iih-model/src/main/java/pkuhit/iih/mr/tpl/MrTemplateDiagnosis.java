package pkuhit.iih.mr.tpl;

import xap.sv.annotation.Column;










// 医疗记录模板诊断编码
public static final   String  CODE = "MRK03.AT01";
// 医疗记录模板编码
public static final   String  MR_TEMPLATE_CODE = "MRK03.AT02";
// 诊断编码
public static final   String  DIAGNOSIS_CODE = "MRK03.AT03";


@Column(name="MR_TPL_DI_CD") 
private  String code;

@Column(name="MR_TPL_CD") 
private  String mrTemplateCode;

@Column(name="DI_CD") 
private  String diagnosisCode;
// 医疗记录模板名称
private  String mrTemplateName;
// 诊断名称
private  String diagnosisName;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.mrTemplateCode;
 }

 {
  this.mrTemplateCode = mrTemplateCode;
 }

 {
     return this.diagnosisCode;
 }

 {
  this.diagnosisCode = diagnosisCode;
 }

 {
     return this.mrTemplateName;
 }

 {
  this.mrTemplateName = mrTemplateName;
 }

 {
     return this.diagnosisName;
 }

 {
  this.diagnosisName = diagnosisName;
 }

