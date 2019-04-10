package com.wxdemo.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxdemo.formBean.ContentFormBean;
import com.wxdemo.mapper.ClassMasterMapper;
import com.wxdemo.mapper.ContentMapper;
import com.wxdemo.pojo.Content;
import com.wxdemo.service.dao.WxService;
@Service
public class WxServiceImpl implements WxService{
	
	
	
	@Autowired
	ContentMapper mapper;
	@Autowired
	ClassMasterMapper classmapper;
	@Override
	public List<Content> getAll(int number,int id) {
		List<Content> list = new ArrayList<>();
		if (number ==1) {
			list = mapper.getAll(0,5,id);
		}else if (number != 1 && number >= 1) {
			list = mapper.getAll(number*5-5,5,id);
		}
		return list;
	}
	@Override
	public Content getContent(int id) {
		return mapper.get(id);
	}
	@Override
	public List<Content> getAll(int id) {
		return mapper.getAll_c(id);
	}
	@Override
	public List<Content> getAll() {
		return mapper.getAll_all();
	}
	@Override
	public void addContent(ContentFormBean bean,HttpServletRequest request) 
			throws IllegalStateException, IOException {
		if (bean.getBooleanImg().equals("yes")) {
			System.out.println("yes_contentAdd");
			addContent(bean);
		} else {
			System.out.println("no_contentAdd");
			String newFileName = bean.getImgSrc();
			String filepath = request.getServletContext().getRealPath("/")+"../images/wx";
			System.out.println("upload_src   "+filepath);
			File file = new File(filepath,newFileName);
			bean.getFile_img().transferTo(file);
			addContent(bean);
		}

	}

	public void addContent(ContentFormBean bean) {
		Content content = new Content();
		content.setName(bean.getName());
		content.setImgSrc(bean.getImgSrc());
		content.setUrl(bean.getUrl());
		content.setCimg(bean.getCimg());
		content.setClassMasterId(bean.getClassMasterId());
		mapper.add(content);
	}
	@Override
	public void updateContent(ContentFormBean bean, HttpServletRequest request)
			throws IllegalStateException, IOException {


		if (bean.getBooleanImg().equals("no")) {
			String newFileName = bean.getImgSrc();
			String filepath = request.getServletContext().getRealPath("/")+"../images/wx";
			System.out.println("upload_src   "+filepath);
			File file = new File(filepath,newFileName);
			bean.getFile_img().transferTo(file);
		}

		Content content = new Content();
		content.setId(bean.getId());
		content.setName(bean.getName());
		content.setImgSrc(bean.getImgSrc());
		content.setUrl(bean.getUrl());
		content.setCimg(bean.getCimg());
		content.setClassMasterId(bean.getClassMasterId());

		mapper.updateContent(content);
	}
	@Override
	public void deleteContent(int id) {
		mapper.delete(id);
	}
	

}
