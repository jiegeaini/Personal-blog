package com.wxdemo.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxdemo.formBean.ClassMasterFormBean;
import com.wxdemo.mapper.ClassMasterMapper;
import com.wxdemo.pojo.ClassMaster;
import com.wxdemo.service.dao.WxClassService;
@Service
public class WxClassSerivceImpl implements WxClassService{

	@Autowired
	ClassMasterMapper mapper;
	
	@Override
	public List<ClassMaster> getClassM() {
		return mapper.getAll();
	}

	@Override
	public void addClassMaster(ClassMasterFormBean bean, HttpServletRequest request)
			throws IllegalStateException, IOException {
		if ("yes".equals(bean.getBooleanImg())) {
			System.out.println("yes_cimg");
			String newFileName = bean.getCimg();
			String filepath = request.getServletContext().getRealPath("/")+"../images/wx";
			System.out.println("upload_src   "+filepath);
			File file = new File(filepath,newFileName);
			bean.getFile_cimg().transferTo(file);
		} 
		
		System.out.println("mimg_upload");
		String newFileName = bean.getMimg();
		String filepath = request.getServletContext().getRealPath("/")+"../images/wx";
		System.out.println("upload_src   "+filepath);
		File file = new File(filepath,newFileName);
		bean.getFile_mimg().transferTo(file);
		
		ClassMaster master = new ClassMaster();
		master.setDesc_name(bean.getDesc_name());
		master.setTime(bean.getTime());
		master.setTitle(bean.getTitle());
		master.setName(bean.getName());
		master.setCimg(bean.getCimg());
		master.setMimg(bean.getMimg());
		
		mapper.addClassMaster(master);
	}

	@Override
	public ClassMaster getClassMaster(int id) {
		return mapper.getClassMaster(id);
	}

	@Override
	public void updateClassMaster(ClassMasterFormBean bean, HttpServletRequest request)
			throws IllegalStateException, IOException {
		
		switch (bean.getBooleanImg()) {
		case "cimg":
			System.out.println("upload cimg begin");
			String newFileName = bean.getCimg();
			String filepath = request.getServletContext().getRealPath("/")+"../images/wx";
			System.out.println("upload_src   "+filepath);
			File file = new File(filepath,newFileName);
			bean.getFile_cimg().transferTo(file);
			break;
		case "mimg":
			System.out.println("upload mimg begin");
			String newFileName1 = bean.getMimg();
			String filepath1 = request.getServletContext().getRealPath("/")+"../images/wx";
			System.out.println("upload_src   "+filepath1);
			File file1 = new File(filepath1,newFileName1);
			bean.getFile_mimg().transferTo(file1);
			break;
		default:
			break;
		}
		
		ClassMaster master = new ClassMaster();
		master.setId(bean.getId());
		master.setDesc_name(bean.getDesc_name());
		master.setTime(bean.getTime());
		master.setTitle(bean.getTitle());
		master.setName(bean.getName());
		master.setCimg(bean.getCimg());
		master.setMimg(bean.getMimg());
		
		mapper.updateClassMaster(master);
	}

	@Override
	public void deleteClassMaster(int id) {
		mapper.deleteClassMaster(id);
	}
	
}
