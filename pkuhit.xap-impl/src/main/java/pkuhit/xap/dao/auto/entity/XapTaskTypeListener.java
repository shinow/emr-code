package pkuhit.xap.dao.auto.entity;

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
public class XapTaskTypeListener implements EntityListener<XapTaskType> {

    @Override
    public void preInsert(XapTaskType entity, PreInsertContext<XapTaskType> context) {
		Session session = Session.get();
		entity.crtUserId = session.getUserId();
    	entity.crtTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = entity.crtTime;
    	entity.delF = (short)0;
      	entity.crtDeptCd = session.getDeptId();
    }

    @Override
    public void preUpdate(XapTaskType entity, PreUpdateContext<XapTaskType> context) {
		Session session = Session.get();
		entity.lastUpdUserId = session.getUserId();
    	entity.lastUpdTime = new Timestamp(System.currentTimeMillis());
    	entity.lastUpdDeptCd = session.getDeptId();    	
    }

    @Override
    public void preDelete(XapTaskType entity, PreDeleteContext<XapTaskType> context) {
    }

    @Override
    public void postInsert(XapTaskType entity, PostInsertContext<XapTaskType> context) {
    }

    @Override
    public void postUpdate(XapTaskType entity, PostUpdateContext<XapTaskType> context) {
    }

    @Override
    public void postDelete(XapTaskType entity, PostDeleteContext<XapTaskType> context) {
    }
}