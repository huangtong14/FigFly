package com.SIF.pj.activity.Service;

import java.util.List;

import com.SIF.pj.activity.pojo.Activity;

public interface ActivityService {
	
	List<Activity> fandActivity();
	
	 void deleteById(Integer id);
	 
	 void insertActivity(Activity activity);
	
}
