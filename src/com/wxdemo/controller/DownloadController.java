package com.wxdemo.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxdemo.formBean.DownloadFormBean;
import com.wxdemo.pojo.Download;
import com.wxdemo.service.dao.DownloadService;

@Controller
public class DownloadController {
	
	@Autowired
	DownloadService service;
	
	@RequestMapping("/getAll_download")
	@ResponseBody
	public List<Download> getAll(){
		return service.getAll();
	}
	
	@RequestMapping("/download_project")
	public ResponseEntity<byte[]> download(Integer id)throws IOException{
			String fileName,url;
			Download download = service.getDownload(id);
			fileName = download.getDownloadName();
			url = download.getUrl();
			HttpHeaders headers = new HttpHeaders();
			File file = new File(url);
			  headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);    
		        headers.setContentDispositionFormData("attachment", fileName);   
		  return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
                  headers, HttpStatus.CREATED); 
	}
	
	@RequestMapping(value="/addDownload",method=RequestMethod.POST)
	public String addDownload(DownloadFormBean bean,HttpServletRequest request) {
		System.out.println("adddownload begin");
		service.addDownload(bean, request);
		return "redirect:page/getDownload";
	}
	
	@RequestMapping("/updateDownload")
	public String updateDownload(DownloadFormBean bean,HttpServletRequest request) {
		System.out.println("updatedownload begin");
		service.updateDownload(bean, request);
		return "redirect:page/getDownload";
	}
	
	@RequestMapping("/deleteDownload")
	public String deleteDownload(Integer id) {
		service.deleteDownload(id);
		return "redirect:page/getDownload";
	}
}
