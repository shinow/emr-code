package pkuhit.iih.mr.md;

import xap.model.BaseMasterModel;








 public static final String   OBJ_CD  = "MRM14";
public static final   String  CODE = "MRM14.AT01";
// 父医疗记录自定义分类编码
public static final   String  PARENT_CODE = "MRM14.AT02";
// 组织机构编码
public static final   String  ORGANIZATION_CODE = "MRM14.AT03";
// 名称
public static final   String  NAME = "MRM14.AT04";
// 描述
public static final   String  DESCRIPTION = "MRM14.AT05";
// 层级
public static final   String  LEVEL = "MRM14.AT06";
// 叶节点标志
public static final   String  LEAF_FLAG = "MRM14.AT07";


@Column(name="MR_TP_CCAT_CD") 
private  String code;

@Column(name="PAR_MR_TP_CCAT_CD") 
private  String parentCode;

@Column(name="ORG_CD") 
private  String organizationCode;

@Column(name="NM") 
private  String name;

@Column(name="DES") 
private  String description;

@Column(name="LVL") 
private  Integer level;

@Column(name="LEAF_F") 
private  Integer leafFlag;
// 父医疗记录自定义分类名称
//@DictionaryTag(code = "parentCode")
private  String parentName;
// 组织机构编码名称
//@DictionaryTag(code = "organizationCode")
private  String organizationName;

//是否续打标志
@Column(name="CONTINUE_PRINT_F") 
private  Integer continuePrintF;

//医护标记
@Column(name="DCT_NS_F") 
private  Integer dctNsF;

public String getSortNo()
{
    return sortNo;
}

public void setSortNo(String sortNo)
{
    this.sortNo = sortNo;
}
@Column(name = "SORT_NO")
private String sortNo;

 {
     return this.code;
 }

 {
  this.code = code;
 }

 {
     return this.parentCode;
 }

 {
  this.parentCode = parentCode;
 }

 {
     return this.organizationCode;
 }

 {
  this.organizationCode = organizationCode;
 }

 {
     return this.name;
 }

 {
  this.name = name;
 }

 {
     return this.description;
 }

 {
  this.description = description;
 }

 {
     return this.level;
 }

 {
  this.level = level;
 }

 {
     return this.leafFlag;
 }

 {
  this.leafFlag = leafFlag;
 }

 {
     return this.parentName;
 }

 {
  this.parentName = parentName;
 }

 {
     return this.organizationName;
 }

 {
  this.organizationName = organizationName;
 }

public Integer getContinuePrintF()
{
    return continuePrintF;
}

public void setContinuePrintF(Integer continuePrintF)
{
    this.continuePrintF = continuePrintF;
}

public Integer getDctNsF()
{
    return dctNsF;
}

public void setDctNsF(Integer dctNsF)
{
    this.dctNsF = dctNsF;
}

