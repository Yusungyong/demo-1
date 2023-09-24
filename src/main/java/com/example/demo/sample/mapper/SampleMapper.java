package com.example.demo.sample.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {
	
	public int insertSampleTable();
	
	public String selectSampleTable();
}
