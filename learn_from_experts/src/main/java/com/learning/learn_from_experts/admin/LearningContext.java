package com.learning.learn_from_experts.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.learning.learn_from_experts.model.Student;
import com.learning.learn_from_experts.model.Teacher;
import com.learning.learn_from_experts.util.Subject;

public class LearningContext {

	private List<Teacher> teachers;
	private List<Student> students;
	private Map<Subject, List<Student>> subjectPreferredStudentMap;
	
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public List<Student> getStudents() {
		return students;
	}
	public Map<Subject, List<Student>> getSubjectPreferredStudentMap() {
		return subjectPreferredStudentMap;
	}
	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}
	public void addStudent(Student student) {
		this.students.add(student);
	}
	public void addSubjectPreferredStudentMap(Subject subject, Student student) {
		this.subjectPreferredStudentMap.computeIfAbsent(subject, k -> new ArrayList<>()).add(student);
	}

	
}
