package com.wxdemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wxdemo.pojo.Content;

public interface ContentMapper {
	List<Content> getAll(@Param("start")int start,@Param("count")int count,@Param("id")int id);
	List<Content> getAll_c(@Param("id")int id);
	List<Content> getAll_all();
	void add(Content content);
	void delete(int id);
	Content get(int id);
	void updateContent(Content content);
	int total();
}
