package com.learning.learn_from_experts.interactor;

import com.learning.learn_from_experts.admin.LearningContext;
import com.learning.learn_from_experts.model.Teacher;
import com.learning.learn_from_experts.util.Subject;

public class HardCodedInputTaker implements IInputTaker {

	private LearningContext context;
	
	public HardCodedInputTaker(LearningContext context) {
		
		
	}
	
	@Override
	public void registerTeachers() {
		context.addTeacher(new Teacher("1", "Teacher01", Subject.MATHS));
		context.addTeacher(new Teacher("2", "Teacher02", Subject.HINDI));
	}

	@Override
	public void registerStudents() {
		// TODO Auto-generated method stub

	}

	@Override
	public void scheduleLectures() {
		// TODO Auto-generated method stub

	}

	@Override
	public void assignLectures() {
		// TODO Auto-generated method stub

	}

	@Override
	public void joinStudentsToTeachers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addStudentsPreferrredSubject() {
		// TODO Auto-generated method stub

	}

}
