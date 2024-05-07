package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		//직원 1에 대한 정보를 담을 변수명과 객체생성
		Employee emp1 = new Employee();
		emp1.empNo = 1;
		emp1.empName = "감자맛있음";
		emp1.gender = 'M';
		System.out.println("직원 1 ");
		System.out.println("사원 번호 : " + emp1.empNo);
		System.out.println("사원 이름 : " + emp1.empName);
		System.out.println("사원 성별 : " + emp1.gender);
		
		//직원 2는 이름 번호 필수
		//객체를 생성한후 필수생성자로 작성하기
		Employee emp2 = new Employee(2,"동그라미");
		System.out.println("직원 2");
		System.out.println("사원 번호 : " + emp2.empNo);
		System.out.println("사원 이름 : " + emp2.empName);
		
		//직원 3 필수로 모두 작성후 제출
		/*Employee emp3 = new Employee(3, "가나다","마케팅"
				,"사무직",20,'남',5000 , 1000,"010-0000-0000"
				,"서울시 강남구");
		System.out.println("직원 3");
		System.out.println("사원 번호 : " + emp3.empNo);
		System.out.println("사원 이름 : " + emp3.empName);
		*/
		
		
		
		
		
		
	}

}
