package com.wxdemo.service.impl;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxdemo.formBean.DownloadFormBean;
import com.wxdemo.mapper.DownloadMapper;
import com.wxdemo.pojo.Download;
import com.wxdemo.service.dao.DownloadService;
import com.wxdemo.util.DateUtil;

@Service
public class DownloadServiceImpl implements DownloadService{

	@Autowired
	DownloadMapper mapper;
	
	@Override
	public List<Download> getAll() {
		return mapper.getAll();
	}

	@Override
	public Download getDownload(int id) {
		return mapper.getDownload(id);
	}

	@Override
	public void addDownload(DownloadFormBean formbean,HttpServletRequest request) {
		Socket socket = new Socket();
		try {
			socket.setSoTimeout(60000);
		} catch (SocketException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String newFileName = formbean.getImg();
		String newFileName1 = formbean.getDownloadName();
		String filepath = request.getServletContext().getRealPath("/")+"../images/wx";
		String filepath1 = request.getServletContext().getRealPath("/")+"../images/wx/project";
		File file = new File(filepath,newFileName);
		File file1 = new File(filepath1,newFileName1);
		try {
			formbean.getFile_img().transferTo(file);
			formbean.getFile_file().transferTo(file1);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Download download = formBeanToaddDownload(formbean,true);
		mapper.addDownload(download);
	}
	
	@Override
	public void updateDownload(DownloadFormBean formBean, HttpServletRequest request) {
		System.out.println(formBean.getName());
		System.out.println(formBean.getBooleanImg());
		if ("yes".equals(formBean.getBooleanImg())) {
			String newFileName = formBean.getImg();
			String filepath = request.getServletContext().getRealPath("/")+"../images/wx";
			System.out.println("upload_src   "+filepath);
			File file = new File(filepath,newFileName);
			try {
				formBean.getFile_img().transferTo(file);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Download download = formBeanToaddDownload(formBean,false);
		mapper.updateDownload(download);
		
	}

	@Override
	public void deleteDownload(int id) {
		mapper.deleteDownload(id);	
	}
	
	private Download formBeanToaddDownload(DownloadFormBean formBean,Boolean btime) {
		Download download = new Download();
		download.setName(formBean.getName());
		download.setCategory(formBean.getCategory());
		download.setContent(formBean.getContent());
		download.setDownloadName(formBean.getDownloadName());
		download.setImg(formBean.getImg());
		download.setUrl(formBean.getUrl());
		if (btime) {
			String time = DateUtil.getTime();
			download.setTime(time);
		}else {
			download.setTime(formBean.getTime());
			download.setId(formBean.getId());
		}
		return download;
	}

}
