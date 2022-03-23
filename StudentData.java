package com.mire.set2;

import java.util.Objects;

public class StudentData implements Comparable<Object> {
	//�̸�, ����, ����, ���
	private String name;
	private int age;
	private int score;
	private char grade;
	//�Ű�����������
	public StudentData(String name, int age, int score, char grade) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.grade = grade;
	}
	//�ؽ��ڵ�
	@Override
	public int hashCode() {
		return Objects.hash(name + age);
	}
	//equals
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(!(obj instanceof StudentData)) {
			throw new IllegalArgumentException("StudentData Class�� �ƴմϴ�.");
		}
		StudentData sd = (StudentData)obj;
		if(this.age == sd.age && this.name.equals(sd.name)) {
			flag = true;
		}
		return flag;
	}
	
	//compareTo
	@Override
	public int compareTo(Object object) {
		int value = 0;
		if(!(object instanceof StudentData)) {
			throw new IllegalArgumentException("StudentData Class�� �ƴմϴ�.");
		}
		StudentData sd = (StudentData)object;
		if(this.score < sd.score) {
			return -1;
		}else if(this.score > sd.score) {
			return 1;
		}
		return value;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	//toString(������)
	@Override
	public String toString() {
		return "[name :" + name + ", age: " + age + ", score :" + score + ", grade :" + grade + "]";
	}
}
