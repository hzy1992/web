package com.hzy92.web.dao;
import java.sql.SQLException;

import com.hzy92.web.orm.Test;

public interface ITestDao {

	public void saveTest(Test test) throws SQLException;
	
	public void delTest(Test test) throws SQLException;
	
	public void updateTest(Test test) throws SQLException;
	
	public Test getTestByName(String name) throws SQLException;
}
 