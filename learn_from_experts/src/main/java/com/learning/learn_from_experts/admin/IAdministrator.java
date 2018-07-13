package com.learning.learn_from_experts.admin;

import com.learning.learn_from_experts.event_notification.Observable;
import com.learning.learn_from_experts.model.Lecture;
import com.learning.learn_from_experts.model.Student;
import com.learning.learn_from_experts.model.Teacher;

public interface IAdministrator extends Observable {

	void registerTeacher(Teacher teacher);
	void removeTeacher(Teacher teacher);
	void registerStudent(Student studentId);
	void removeStudent(Student student);
	void assignLecture(Lecture lecture, Teacher teacher);
	
}
