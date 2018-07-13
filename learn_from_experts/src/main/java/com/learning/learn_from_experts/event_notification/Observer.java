package com.learning.learn_from_experts.event_notification;

import com.learning.learn_from_experts.model.Lecture;

public interface Observer {

	void update(Lecture lecture);
	
}
