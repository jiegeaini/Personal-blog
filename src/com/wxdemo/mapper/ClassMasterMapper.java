package com.wxdemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wxdemo.pojo.ClassMaster;

public interface ClassMasterMapper {
	List<ClassMaster> getAll();
	ClassMaster getClassMaster(@Param("id")int id);
	void addClassMaster(ClassMaster master);
	void updateClassMaster(ClassMaster master);
	void deleteClassMaster(@Param("id")int id);
}
