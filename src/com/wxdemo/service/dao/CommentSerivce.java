package com.wxdemo.service.dao;

import java.util.List;

import com.wxdemo.pojo.Comment;

public interface CommentSerivce {
	List<Comment> getAll(int number);
	void addComment(Comment comment);
	void deleteComment(int id);
	List<Comment> getAll_all();
}
