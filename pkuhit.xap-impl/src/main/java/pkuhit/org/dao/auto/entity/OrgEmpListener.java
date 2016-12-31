package pkuhit.org.dao.auto.entity;

import java.sql.Timestamp;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

import pkuhit.xap.ac.Session;

/**
 * 
 */
public class OrgEmpListener implements EntityListener<OrgEmp> {

    @Override
    public void preInsert(OrgEmp entity, PreInsertContext<OrgEmp> context) {
		Session session = Session.get();
		entity.crtUserId = session.getUserId();
    	entity.crtTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = entity.crtTime;
    	entity.delF = (short)0;
      	entity.crtDeptCd = session.getDeptId();
    }

    @Override
    public void preUpdate(OrgEmp entity, PreUpdateContext<OrgEmp> context) {
		Session session = Session.get();
		entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdDeptCd = session.getDeptId();    	
    }

    @Override
    public void preDelete(OrgEmp entity, PreDeleteContext<OrgEmp> context) {
    }

    @Override
    public void postInsert(OrgEmp entity, PostInsertContext<OrgEmp> context) {
    }

    @Override
    public void postUpdate(OrgEmp entity, PostUpdateContext<OrgEmp> context) {
    }

    @Override
    public void postDelete(OrgEmp entity, PostDeleteContext<OrgEmp> context) {
    }
}