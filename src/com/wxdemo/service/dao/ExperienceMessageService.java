package com.wxdemo.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wxdemo.pojo.ExperienceMessage;


public interface ExperienceMessageService {
	List<ExperienceMessage> getAll();
	ExperienceMessage getExperienceMessage(int id);
	void addExperienceMessage(ExperienceMessage message);
	void updateExperienceMessage(ExperienceMessage message);
	void deleteExperienceMessage(@Param("id")int id);
}
