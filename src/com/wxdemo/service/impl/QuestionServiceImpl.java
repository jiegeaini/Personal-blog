package com.wxdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxdemo.mapper.QuestionMapper;
import com.wxdemo.pojo.Question;
import com.wxdemo.service.dao.QuestionService;
@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionMapper mapper;
	
	@Override
	public List<Question> getAll() {
		return mapper.getAll();
	}

	@Override
	public Question getQuestion(int id) {
		return mapper.getQuestion(id);
	}

	@Override
	public void addQuestion(Question question) {
		mapper.addQuestion(question);
	}

	@Override
	public void updateQuestion(Question question) {
		mapper.updateQuestion(question);
	}

	@Override
	public void deleteQuestion(int id) {
		mapper.deleteQuestion(id);
	}
}
