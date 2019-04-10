package com.wxdemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.wxdemo.pojo.Question;

public interface QuestionMapper {
	List<Question> getAll();
	Question getQuestion(@Param("id")int id);
	void addQuestion(Question question);
	void updateQuestion(Question question);
	void deleteQuestion(@Param("id")int id);
}
