# Collections Framework List, Set 
데이터를 효율적으로 처리할 수 있도록 제공하는 자바 API중 List, Set을 보다 쉽게 이해할 수 있게 간단한 예제를 만들었습니다.

## List기능, Set기능
ArrayList 5개 StudentData 객체삽입하기
```
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
        	```
```
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
        	```
	 
 ## Set정렬하기
  ArrayList에 정렬하는 방식과 동일하게 ArrayList를 받을 "setList"와 생성자에 set을 넣어줍니다.
```
List <StudentData> setList = new ArrayList(set);
		Collections.sort(setList);
		for(StudentData data: setList) {
			System.out.println(data);
		}
	```
