package com.mire.set2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class setTest {

	public static void main(String[] args) {
		//ArrayList 5개 StudentData 객체삽입하기
		ArrayList<StudentData> al = new ArrayList<StudentData>();
		al.add(new StudentData("신성욱1", 20, 100, 'A'));
		al.add(new StudentData("신성욱2", 22, 95, 'A'));
		al.add(new StudentData("신성욱3", 23, 60, 'D'));
		al.add(new StudentData("신성욱4", 25, 70, 'C'));
		al.add(new StudentData("신성욱5", 27, 80, 'B'));
		//향상된 for문으로 출력하기
		for(StudentData data: al) {
			System.out.println(data);
		}
		System.out.println("========================");
		//일반for문으로 출력하기
		Collections.sort(al);
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("=========================");
		//HashSet 5개 StdentData 객체 삽입하기
		Set<StudentData> set = new HashSet<StudentData>();
		set.add(new StudentData("저성욱1", 20, 100, 'A'));
		set.add(new StudentData("저성욱2", 21,  50, 'F'));
		set.add(new StudentData("저성욱3", 22,  70, 'C'));
		set.add(new StudentData("저성욱4", 23,  95, 'A'));
		set.add(new StudentData("저성욱5", 27,  60, 'D'));
		//HashSet iterator로 출력하기
		Iterator<StudentData> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=========================");
		//HashSet향상된 for문으로 출력하기 + Set 정렬하기
		List <StudentData> setList = new ArrayList(set);
		Collections.sort(setList);
		for(StudentData data: setList) {
			System.out.println(data);
		}
	}

}
