package com.hzy92.web.dao.impl;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hzy92.web.dao.ITestDao;
import com.hzy92.web.orm.Test;

@Repository
public class TestDaoImpl implements ITestDao {
	@Resource
	private SessionFactory sessionFactory;
	@Override
	public void saveTest(Test test) throws SQLException {
		sessionFactory.getCurrentSession().save(test);
	}

	@Override
	public void delTest(Test test) throws SQLException {
		sessionFactory.getCurrentSession().delete(test);
	}

	@Override
	public void updateTest(Test test) throws SQLException {
		sessionFactory.getCurrentSession().update(test);
	}

	@Override
	public Test getTestByName(String name) throws SQLException {
		return (Test) sessionFactory.getCurrentSession().get(Test.class,name);
	}

}
