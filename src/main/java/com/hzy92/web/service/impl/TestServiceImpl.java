package com.hzy92.web.service.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hzy92.web.dao.ITestDao;
import com.hzy92.web.orm.Test;
import com.hzy92.web.service.ITestService;

@Service
@Transactional
public class TestServiceImpl implements ITestService {

	@Autowired
	private ITestDao testDao;

	@Override
	public void saveTest(Test test) {
		try {
			testDao.saveTest(test);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delTest(Test test) {
		try {
			testDao.delTest(test);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateTest(Test test) {
		try {
			testDao.updateTest(test);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Test getTestByName(String name) {
		try {
			return testDao.getTestByName(name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
