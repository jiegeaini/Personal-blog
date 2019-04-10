package com.wxdemo.service.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.wxdemo.formBean.DownloadFormBean;
import com.wxdemo.pojo.Download;

public interface DownloadService {
	List<Download> getAll();
	Download getDownload(int id);
	void addDownload(DownloadFormBean formbean,HttpServletRequest request);
	void updateDownload(DownloadFormBean formBean,HttpServletRequest request);
	void deleteDownload(int id);
}
