package com.wxdemo.service.dao;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.wxdemo.formBean.ClassMasterFormBean;
import com.wxdemo.pojo.ClassMaster;

public interface WxClassService {
	List<ClassMaster> getClassM();
	void addClassMaster(ClassMasterFormBean bean,HttpServletRequest request) 
			throws IllegalStateException, IOException ;
	ClassMaster getClassMaster(int id);
	void updateClassMaster(ClassMasterFormBean bean,HttpServletRequest request)
			throws IllegalStateException, IOException ;
	void deleteClassMaster(int id);
}
