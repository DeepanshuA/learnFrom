package com.learning.learn_from_experts.model;

import com.learning.learn_from_experts.util.PersonType;
import com.learning.learn_from_experts.util.Subject;

public class Teacher extends Person {

	private Subject subjectExpert;

	public Teacher(String id, String name, Subject subject) {
		this.id = id ;
		this.name = name;
		this.subjectExpert = subject;
				
	}
	
	public Subject getSubjectExpert() {
		return subjectExpert;
	}

	public void setSubjectExpert(Subject subjectExpert) {
		this.subjectExpert = subjectExpert;
	}
	
	@Override
	public void setType() {
		this.type = PersonType.TEACHER;
	}
	
}
