package com.yedam.generic;

public class WildCardExample { //타입 종류
	public static void registerCourse(Course<?> cour) { //<?> : 아무타입이나 다 오게 하겠다
		
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {//Student 포함 하위 클래스들을 받겠다
		
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) { //Worker 포함 상위 클래스들에 등록 된 것만 받겠다
		
	}
	
	public static void main(String[] args) {
		Course<Person> crsPerson = new Course<>("일반인과정", 5);	
		crsPerson.add(new Person("일반인1"));
		crsPerson.add(new Worker("직장인1"));
		crsPerson.add(new Student("학생1"));
		crsPerson.add(new HighStudent("고등학생1"));
		
		Course<Worker> crsWorker = new Course<>("직장인과정", 5);
//		crsWorker.add(new Person("일반인2")); //에러
		crsWorker.add(new Worker("직장인2"));
		
		Course<Student> crsStudent = new Course<>("학생인과정", 5);
		crsStudent.add(new Student("학생2"));
//		crsStudent.add(new Person("일반인1"));
		crsPerson.add(new HighStudent("고등학생1"));
		
		Course<HighStudent> crsHighStudent = new Course<>("고등학생과정", 5);
		crsPerson.add(new HighStudent("고등학생1"));
		
		//일반인 등록 가능
		registerCourse(crsPerson);
		registerCourse(crsWorker);
		registerCourse(crsStudent);
		
		registerCourse(crsHighStudent);
		
		//직장인 등록 가능
		registerCourse(crsPerson);
		registerCourse(crsWorker);
		
		
		//학생 등록 가능
		
		//고등학생 등록 가능
	}
}
