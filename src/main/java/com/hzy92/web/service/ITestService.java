package com.hzy92.web.service;

import com.hzy92.web.orm.Test;

public interface ITestService {
	public void saveTest(Test test);

	public void delTest(Test test);

	public void updateTest(Test test);

	public Test getTestByName(String name);
}
