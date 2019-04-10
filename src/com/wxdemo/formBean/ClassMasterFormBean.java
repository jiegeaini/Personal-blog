package com.wxdemo.formBean;

import org.springframework.web.multipart.MultipartFile;

public class ClassMasterFormBean {
	private int id;
	private String name;
	private String desc_name;
	private String time;
	private String title;
	private String cimg;
	private String mimg;
	private String booleanImg;
	private MultipartFile file_cimg;
	private MultipartFile file_mimg;
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
	 * @return the desc
	 */
	public String getDesc_name() {
		return desc_name;
	}
	/**
	 * @param desc_name the desc_name to set
	 */
	public void setDesc_name(String desc_name) {
		this.desc_name = desc_name;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
	/**
	 * @return the mimg
	 */
	public String getMimg() {
		return mimg;
	}
	/**
	 * @param mimg the mimg to set
	 */
	public void setMimg(String mimg) {
		this.mimg = mimg;
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
	 * @return the file_cimg
	 */
	public MultipartFile getFile_cimg() {
		return file_cimg;
	}
	/**
	 * @param file_cimg the file_cimg to set
	 */
	public void setFile_cimg(MultipartFile file_cimg) {
		this.file_cimg = file_cimg;
	}
	/**
	 * @return the file_mimg
	 */
	public MultipartFile getFile_mimg() {
		return file_mimg;
	}
	/**
	 * @param file_mimg the file_mimg to set
	 */
	public void setFile_mimg(MultipartFile file_mimg) {
		this.file_mimg = file_mimg;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClassMasterFormBean [id=" + id + ", name=" + name + ", desc_name=" + desc_name + ", time=" + time + ", title="
				+ title + ", cimg=" + cimg + ", mimg=" + mimg + ", booleanImg=" + booleanImg + ", file_cimg="
				+ file_cimg + ", file_mimg=" + file_mimg + "]";
	}
	
	
}
