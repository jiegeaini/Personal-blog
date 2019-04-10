package com.wxdemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wxdemo.pojo.Comment;

public interface CommentMapper {
	List<Comment> getAll(@Param("start")int start,@Param("count")int count);
	int total();
	void addComment(Comment comment);
	List<Comment> getAll_all();
	void deleteComment(@Param("id")int id);
}	
