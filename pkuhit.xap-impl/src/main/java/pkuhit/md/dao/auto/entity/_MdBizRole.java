package pkuhit.md.dao.auto.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.35.0" }, date = "2017-01-01T01:49:41.281+0800")
public final class _MdBizRole extends org.seasar.doma.jdbc.entity.AbstractEntityType<pkuhit.md.dao.auto.entity.MdBizRole> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.35.0");
    }

    private static final _MdBizRole __singleton = new _MdBizRole();

    /** the bizRoleCd */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $bizRoleCd = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "bizRoleCd", "BIZ_ROLE_CD");

    /** the signLvlCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $signLvlCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "signLvlCd", "SIGN_LVL_CD", true, true);

    /** the nm */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $nm = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "nm", "NM", true, true);

    /** the des */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $des = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "des", "DES", true, true);

    /** the nmEn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $nmEn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "nmEn", "NM_EN", true, true);

    /** the shtNmEn */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $shtNmEn = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "shtNmEn", "SHT_NM_EN", true, true);

    /** the memo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $memo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "memo", "MEMO", true, true);

    /** the sortNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $sortNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sortNo", "SORT_NO", true, true);

    /** the spellNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $spellNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "spellNo", "SPELL_NO", true, true);

    /** the wubiNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $wubiNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "wubiNo", "WUBI_NO", true, true);

    /** the updCnt */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.math.BigInteger, java.lang.Object> $updCnt = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.math.BigInteger, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.math.BigInteger.class, org.seasar.doma.wrapper.BigIntegerWrapper.class, null, null, "updCnt", "UPD_CNT", true, true);

    /** the crtTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.sql.Timestamp, java.lang.Object> $crtTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.sql.Timestamp, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "crtTime", "CRT_TIME", true, true);

    /** the crtUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $crtUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "crtUserId", "CRT_USER_ID", true, true);

    /** the crtDeptCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $crtDeptCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "crtDeptCd", "CRT_DEPT_CD", true, true);

    /** the lastUpdTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.sql.Timestamp, java.lang.Object> $lastUpdTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.sql.Timestamp, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "lastUpdTime", "LAST_UPD_TIME", true, true);

    /** the lastUpdDeptCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $lastUpdDeptCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "lastUpdDeptCd", "LAST_UPD_DEPT_CD", true, true);

    /** the lastUpdUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object> $lastUpdUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "lastUpdUserId", "LAST_UPD_USER_ID", true, true);

    /** the delF */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.Short, java.lang.Object> $delF = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, java.lang.Short, java.lang.Object>(pkuhit.md.dao.auto.entity.MdBizRole.class, java.lang.Short.class, org.seasar.doma.wrapper.ShortWrapper.class, null, null, "delF", "DEL_F", true, true);

    private final pkuhit.md.dao.auto.entity.MdBizRoleListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdBizRole, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdBizRole, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdBizRole, ?>> __entityPropertyTypeMap;

    private _MdBizRole() {
        __listener = new pkuhit.md.dao.auto.entity.MdBizRoleListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "MdBizRole";
        __catalogName = "";
        __schemaName = "";
        __tableName = "MD_BIZ_ROLE";
        __qualifiedTableName = "MD_BIZ_ROLE";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdBizRole, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdBizRole, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdBizRole, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdBizRole, ?>>(18);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdBizRole, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdBizRole, ?>>(18);
        __idList.add($bizRoleCd);
        __list.add($bizRoleCd);
        __map.put("bizRoleCd", $bizRoleCd);
        __list.add($signLvlCd);
        __map.put("signLvlCd", $signLvlCd);
        __list.add($nm);
        __map.put("nm", $nm);
        __list.add($des);
        __map.put("des", $des);
        __list.add($nmEn);
        __map.put("nmEn", $nmEn);
        __list.add($shtNmEn);
        __map.put("shtNmEn", $shtNmEn);
        __list.add($memo);
        __map.put("memo", $memo);
        __list.add($sortNo);
        __map.put("sortNo", $sortNo);
        __list.add($spellNo);
        __map.put("spellNo", $spellNo);
        __list.add($wubiNo);
        __map.put("wubiNo", $wubiNo);
        __list.add($updCnt);
        __map.put("updCnt", $updCnt);
        __list.add($crtTime);
        __map.put("crtTime", $crtTime);
        __list.add($crtUserId);
        __map.put("crtUserId", $crtUserId);
        __list.add($crtDeptCd);
        __map.put("crtDeptCd", $crtDeptCd);
        __list.add($lastUpdTime);
        __map.put("lastUpdTime", $lastUpdTime);
        __list.add($lastUpdDeptCd);
        __map.put("lastUpdDeptCd", $lastUpdDeptCd);
        __list.add($lastUpdUserId);
        __map.put("lastUpdUserId", $lastUpdUserId);
        __list.add($delF);
        __map.put("delF", $delF);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(pkuhit.md.dao.auto.entity.MdBizRole entity, org.seasar.doma.jdbc.entity.PreInsertContext<pkuhit.md.dao.auto.entity.MdBizRole> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(pkuhit.md.dao.auto.entity.MdBizRole entity, org.seasar.doma.jdbc.entity.PreUpdateContext<pkuhit.md.dao.auto.entity.MdBizRole> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(pkuhit.md.dao.auto.entity.MdBizRole entity, org.seasar.doma.jdbc.entity.PreDeleteContext<pkuhit.md.dao.auto.entity.MdBizRole> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(pkuhit.md.dao.auto.entity.MdBizRole entity, org.seasar.doma.jdbc.entity.PostInsertContext<pkuhit.md.dao.auto.entity.MdBizRole> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(pkuhit.md.dao.auto.entity.MdBizRole entity, org.seasar.doma.jdbc.entity.PostUpdateContext<pkuhit.md.dao.auto.entity.MdBizRole> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(pkuhit.md.dao.auto.entity.MdBizRole entity, org.seasar.doma.jdbc.entity.PostDeleteContext<pkuhit.md.dao.auto.entity.MdBizRole> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdBizRole, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdBizRole, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdBizRole, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdBizRole, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public pkuhit.md.dao.auto.entity.MdBizRole newEntity() {
        return new pkuhit.md.dao.auto.entity.MdBizRole();
    }

    @Override
    public pkuhit.md.dao.auto.entity.MdBizRole newEntity(java.util.Map<String, Object> __args) {
        return new pkuhit.md.dao.auto.entity.MdBizRole();
    }

    @Override
    public Class<pkuhit.md.dao.auto.entity.MdBizRole> getEntityClass() {
        return pkuhit.md.dao.auto.entity.MdBizRole.class;
    }

    @Override
    public pkuhit.md.dao.auto.entity.MdBizRole getOriginalStates(pkuhit.md.dao.auto.entity.MdBizRole __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(pkuhit.md.dao.auto.entity.MdBizRole __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MdBizRole getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MdBizRole newInstance() {
        return new _MdBizRole();
    }

}
