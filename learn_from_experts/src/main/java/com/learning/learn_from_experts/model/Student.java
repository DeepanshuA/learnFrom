package com.learning.learn_from_experts.model;

import java.util.ArrayList;
import java.util.List;

import com.learning.learn_from_experts.admin.LearningContext;
import com.learning.learn_from_experts.event_notification.Observer;
import com.learning.learn_from_experts.util.PersonType;
import com.learning.learn_from_experts.util.Subject;

public class Student extends Person implements Observer {

	private LearningContext context;
	private List<Teacher> teachers;
	public Student(LearningContext context) {
		this.context = context;
	}
	

	@Override
	public void setType() {
		this.type = PersonType.STUDENT;
	}

	public void joinTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	public void addPreferredSubject(Subject subject) {
		context.addSubjectPreferredStudentMap(subject, this);
	}

	public void update(Lecture lecture) {
		System.out.println("Student " + this.getName() + " is notified about " + lecture);
	}
	
}
