package com.wxdemo.service.dao;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.wxdemo.formBean.ContentFormBean;
import com.wxdemo.pojo.Content;

public interface WxService {
	List<Content> getAll(int number,int id);
	List<Content> getAll(int id);
	Content getContent(int id);
	List<Content> getAll();
	void addContent(ContentFormBean bean,HttpServletRequest request) 
			throws IllegalStateException, IOException ;
	void updateContent(ContentFormBean bean,HttpServletRequest request)
			throws IllegalStateException, IOException ;
	void deleteContent(int id);
}
