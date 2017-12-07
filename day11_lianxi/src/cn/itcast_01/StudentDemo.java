package cn.itcast_01;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =new Student();
		s.setAge(18);
		s.setName("zhoumiao");
		s.show();
		System.out.println("----------------------");
		Student s2 =new Student(17,"michael");
		s2.show();
		
	}

}
