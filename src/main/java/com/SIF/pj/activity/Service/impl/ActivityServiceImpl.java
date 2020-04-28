package com.SIF.pj.activity.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SIF.pj.activity.Service.ActivityService;
import com.SIF.pj.activity.dao.activityDao;
import com.SIF.pj.activity.pojo.Activity;

@Service
public class ActivityServiceImpl implements ActivityService {
	
	@Autowired
	private activityDao dao;

	/**
	 * 查询所有活动的信息
	 */
	@Override
	public List<Activity> fandActivity() {
		List<Activity> list = dao.fandActivity();
		return list;
	}
	
	@Override
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}
	
	@Override
	public void insertActivity(Activity activity) {
		dao.insertActivity(activity);
		
	}
}
