package pkuhit.md.dao.auto.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.35.0" }, date = "2017-01-01T01:49:41.404+0800")
public final class _MdMrTpCcatItm extends org.seasar.doma.jdbc.entity.AbstractEntityType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.35.0");
    }

    private static final _MdMrTpCcatItm __singleton = new _MdMrTpCcatItm();

    /** the mrTpCcatItmCd */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object> $mrTpCcatItmCd = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "mrTpCcatItmCd", "MR_TP_CCAT_ITM_CD");

    /** the mrTpCcatCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object> $mrTpCcatCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "mrTpCcatCd", "MR_TP_CCAT_CD", true, true);

    /** the mrTpCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object> $mrTpCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "mrTpCd", "MR_TP_CD", true, true);

    /** the enTpCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object> $enTpCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "enTpCd", "EN_TP_CD", true, true);

    /** the sortNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object> $sortNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sortNo", "SORT_NO", true, true);

    /** the updCnt */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.math.BigInteger, java.lang.Object> $updCnt = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.math.BigInteger, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.math.BigInteger.class, org.seasar.doma.wrapper.BigIntegerWrapper.class, null, null, "updCnt", "UPD_CNT", true, true);

    /** the crtTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.sql.Timestamp, java.lang.Object> $crtTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.sql.Timestamp, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "crtTime", "CRT_TIME", true, true);

    /** the crtUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object> $crtUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "crtUserId", "CRT_USER_ID", true, true);

    /** the crtDeptCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object> $crtDeptCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "crtDeptCd", "CRT_DEPT_CD", true, true);

    /** the lastUpdTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.sql.Timestamp, java.lang.Object> $lastUpdTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.sql.Timestamp, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "lastUpdTime", "LAST_UPD_TIME", true, true);

    /** the lastUpdDeptCd */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object> $lastUpdDeptCd = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "lastUpdDeptCd", "LAST_UPD_DEPT_CD", true, true);

    /** the lastUpdUserId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object> $lastUpdUserId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.String, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "lastUpdUserId", "LAST_UPD_USER_ID", true, true);

    /** the delF */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.Short, java.lang.Object> $delF = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, java.lang.Short, java.lang.Object>(pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class, java.lang.Short.class, org.seasar.doma.wrapper.ShortWrapper.class, null, null, "delF", "DEL_F", true, true);

    private final pkuhit.md.dao.auto.entity.MdMrTpCcatItmListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?>> __entityPropertyTypeMap;

    private _MdMrTpCcatItm() {
        __listener = new pkuhit.md.dao.auto.entity.MdMrTpCcatItmListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "MdMrTpCcatItm";
        __catalogName = "";
        __schemaName = "";
        __tableName = "MD_MR_TP_CCAT_ITM";
        __qualifiedTableName = "MD_MR_TP_CCAT_ITM";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?>>(13);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?>>(13);
        __idList.add($mrTpCcatItmCd);
        __list.add($mrTpCcatItmCd);
        __map.put("mrTpCcatItmCd", $mrTpCcatItmCd);
        __list.add($mrTpCcatCd);
        __map.put("mrTpCcatCd", $mrTpCcatCd);
        __list.add($mrTpCd);
        __map.put("mrTpCd", $mrTpCd);
        __list.add($enTpCd);
        __map.put("enTpCd", $enTpCd);
        __list.add($sortNo);
        __map.put("sortNo", $sortNo);
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
    public void preInsert(pkuhit.md.dao.auto.entity.MdMrTpCcatItm entity, org.seasar.doma.jdbc.entity.PreInsertContext<pkuhit.md.dao.auto.entity.MdMrTpCcatItm> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(pkuhit.md.dao.auto.entity.MdMrTpCcatItm entity, org.seasar.doma.jdbc.entity.PreUpdateContext<pkuhit.md.dao.auto.entity.MdMrTpCcatItm> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(pkuhit.md.dao.auto.entity.MdMrTpCcatItm entity, org.seasar.doma.jdbc.entity.PreDeleteContext<pkuhit.md.dao.auto.entity.MdMrTpCcatItm> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(pkuhit.md.dao.auto.entity.MdMrTpCcatItm entity, org.seasar.doma.jdbc.entity.PostInsertContext<pkuhit.md.dao.auto.entity.MdMrTpCcatItm> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(pkuhit.md.dao.auto.entity.MdMrTpCcatItm entity, org.seasar.doma.jdbc.entity.PostUpdateContext<pkuhit.md.dao.auto.entity.MdMrTpCcatItm> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(pkuhit.md.dao.auto.entity.MdMrTpCcatItm entity, org.seasar.doma.jdbc.entity.PostDeleteContext<pkuhit.md.dao.auto.entity.MdMrTpCcatItm> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, pkuhit.md.dao.auto.entity.MdMrTpCcatItm, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public pkuhit.md.dao.auto.entity.MdMrTpCcatItm newEntity() {
        return new pkuhit.md.dao.auto.entity.MdMrTpCcatItm();
    }

    @Override
    public pkuhit.md.dao.auto.entity.MdMrTpCcatItm newEntity(java.util.Map<String, Object> __args) {
        return new pkuhit.md.dao.auto.entity.MdMrTpCcatItm();
    }

    @Override
    public Class<pkuhit.md.dao.auto.entity.MdMrTpCcatItm> getEntityClass() {
        return pkuhit.md.dao.auto.entity.MdMrTpCcatItm.class;
    }

    @Override
    public pkuhit.md.dao.auto.entity.MdMrTpCcatItm getOriginalStates(pkuhit.md.dao.auto.entity.MdMrTpCcatItm __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(pkuhit.md.dao.auto.entity.MdMrTpCcatItm __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MdMrTpCcatItm getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MdMrTpCcatItm newInstance() {
        return new _MdMrTpCcatItm();
    }

}
