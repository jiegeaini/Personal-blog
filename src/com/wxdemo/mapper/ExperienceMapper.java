package com.wxdemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wxdemo.pojo.Experience;


public interface ExperienceMapper {
	
	List<Experience> getAll();
	Experience getExperience(@Param("id")int id);
	void addExperience(Experience experience);
	void updateExperience(Experience experience);
	void deleteExperience(@Param("id")int id);
}
