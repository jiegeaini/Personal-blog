package com.wxdemo.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import com.wxdemo.pojo.ExperienceMessage;

public interface ExperienceMessageMapper {
	
	List<ExperienceMessage> getAll();
	
	ExperienceMessage getExperienceMessage(@Param("id")int id);
	
	void addExperienceMessage(ExperienceMessage message);
	void updateExperienceMessage(ExperienceMessage message);
	void deleteExperienceMessage(@Param("id")int id);
}
