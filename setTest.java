package com.mire.set2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class setTest {

	public static void main(String[] args) {
		//ArrayList 5�� StudentData ��ü�����ϱ�
		ArrayList<StudentData> al = new ArrayList<StudentData>();
		al.add(new StudentData("�ż���1", 20, 100, 'A'));
		al.add(new StudentData("�ż���2", 22, 95, 'A'));
		al.add(new StudentData("�ż���3", 23, 60, 'D'));
		al.add(new StudentData("�ż���4", 25, 70, 'C'));
		al.add(new StudentData("�ż���5", 27, 80, 'B'));
		//���� for������ ����ϱ�
		for(StudentData data: al) {
			System.out.println(data);
		}
		System.out.println("========================");
		//�Ϲ�for������ ����ϱ�
		Collections.sort(al);
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("=========================");
		//HashSet 5�� StdentData ��ü �����ϱ�
		Set<StudentData> set = new HashSet<StudentData>();
		set.add(new StudentData("������1", 20, 100, 'A'));
		set.add(new StudentData("������2", 21,  50, 'F'));
		set.add(new StudentData("������3", 22,  70, 'C'));
		set.add(new StudentData("������4", 23,  95, 'A'));
		set.add(new StudentData("������5", 27,  60, 'D'));
		//HashSet iterator�� ����ϱ�
		Iterator<StudentData> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=========================");
		//HashSet���� for������ ����ϱ� + Set �����ϱ�
		List <StudentData> setList = new ArrayList(set);
		Collections.sort(setList);
		for(StudentData data: setList) {
			System.out.println(data);
		}
	}

}
