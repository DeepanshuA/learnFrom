package com.learning.learn_from_experts.admin;

import java.util.List;

import com.learning.learn_from_experts.model.Lecture;
import com.learning.learn_from_experts.model.Student;
import com.learning.learn_from_experts.model.Teacher;

public class Administrator implements IAdministrator {

	private LearningContext context;
	
	public Administrator(LearningContext context) {
		this.context = context;
	}

	public void registerTeacher(Teacher teacher) {
		context.addTeacher(teacher);;
	}
	
	public void registerStudent(Student student) {
		context.addStudent(student);;
	}

	@Override
	public void notifyObservers(List<Student> students, Lecture lecture) {
		students.forEach(student -> student.update(lecture));
		
	}

	public void removeTeacher(Teacher teacher) {
		context.getStudents().remove(teacher);
	}

	public void removeStudent(Student student) {
		context.getStudents().remove(student);
	}

	public void assignLecture(Lecture lecture, Teacher teacher) {
		lecture.setTeacherId(teacher.getId());
		notifyObservers(context.getSubjectPreferredStudentMap().get(lecture.getSubject()), lecture);
	}
	
}
