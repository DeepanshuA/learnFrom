package com.learning.learn_from_experts.model;

import java.util.List;

import com.learning.learn_from_experts.util.Subject;

public class Lecture {

	private String teacherId;
	private List<Student> studentId;
	private final long startTime;
	private final long endTime;
	private final Subject subject;

	public Lecture(long startTime, long endTime, final Subject subject) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.subject = subject;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public void ADDStudentId(List<Student> studentId) {
		this.studentId = studentId;
	}

	public String getTeacherId() {
		return teacherId;
	}
	public List<Student> getStudentId() {
		return studentId;
	}
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}

	public Subject getSubject() {
		return subject;
	}
	
	@Override
	public String toString() {
		return "Lecture of Subject " + this.getSubject().name() + " with start time " + this.getStartTime();
	}
	
}
