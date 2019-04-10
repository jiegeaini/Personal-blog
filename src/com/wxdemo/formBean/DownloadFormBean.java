package com.wxdemo.formBean;

import org.springframework.web.multipart.MultipartFile;

public class DownloadFormBean {
	private int id;
	private String name;
	private String url;
	private String content;
	private String img;
	private String category;
	private String downloadName;
	private String booleanImg;
	private String time;
	private MultipartFile file_img;
	private MultipartFile file_file;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the img
	 */
	public String getImg() {
		return img;
	}
	/**
	 * @param img the img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the downloadName
	 */
	public String getDownloadName() {
		return downloadName;
	}
	/**
	 * @param downloadName the downloadName to set
	 */
	public void setDownloadName(String downloadName) {
		this.downloadName = downloadName;
	}
	/**
	 * @return the booleanImg
	 */
	public String getBooleanImg() {
		return booleanImg;
	}
	/**
	 * @param booleanImg the booleanImg to set
	 */
	public void setBooleanImg(String booleanImg) {
		this.booleanImg = booleanImg;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the file_img
	 */
	public MultipartFile getFile_img() {
		return file_img;
	}
	/**
	 * @param file_img the file_img to set
	 */
	public void setFile_img(MultipartFile file_img) {
		this.file_img = file_img;
	}
	/**
	 * @return the file_file
	 */
	public MultipartFile getFile_file() {
		return file_file;
	}
	/**
	 * @param file_file the file_file to set
	 */
	public void setFile_file(MultipartFile file_file) {
		this.file_file = file_file;
	}
	
	
	
	
}
