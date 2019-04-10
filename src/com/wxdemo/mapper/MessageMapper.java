package com.wxdemo.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import com.wxdemo.pojo.Message;

public interface MessageMapper {
	
	List<Message> getAll();
	
	Message getMessage(@Param("id")int id);
	
	void addMessage(Message message);
	void updateMessage(Message message);
	void deleteMessage(@Param("id")int id);
}
