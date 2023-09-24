package com.example.demo.sample.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.sample.mapper.SampleMapper;
import com.example.demo.sample.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService{

	@Autowired
	SampleMapper sampleMapper;
	
	@Override
	public String selectTable() {
		System.out.println("Service Implements ... ");
		sampleMapper.insertSampleTable();
		String testCount = sampleMapper.selectSampleTable();
			System.out.println("테스트 횟수 ... : " + testCount);
		return testCount;
	}

}
