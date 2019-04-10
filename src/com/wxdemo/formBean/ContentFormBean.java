package com.wxdemo.formBean;

import org.springframework.web.multipart.MultipartFile;

public class ContentFormBean {
	private int id;
	private String name;
	private int classMasterId;
	private MultipartFile file_img;
	private String booleanImg;
	private String imgSrc;
	private String url;
	private String cimg;
	
	
	
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
	 * @return the classMasterId
	 */
	public int getClassMasterId() {
		return classMasterId;
	}
	/**
	 * @param classMasterId the classMasterId to set
	 */
	public void setClassMasterId(int classMasterId) {
		this.classMasterId = classMasterId;
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
	 * @return the imgSrc
	 */
	public String getImgSrc() {
		return imgSrc;
	}
	/**
	 * @param imgSrc the imgSrc to set
	 */
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
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
	 * @return the cimg
	 */
	public String getCimg() {
		return cimg;
	}
	/**
	 * @param cimg the cimg to set
	 */
	public void setCimg(String cimg) {
		this.cimg = cimg;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContentFormBean [name=" + name + ", classMasterId=" + classMasterId + ", file_img=" + file_img
				+ ", booleanImg=" + booleanImg + ", imgSrc=" + imgSrc + ", url=" + url + ", cimg=" + cimg + "]";
	}
	
	
	
	
}
