package com.kh.Oop.constructor;

public class Join {
	//1.회원가입 
	//필드 회원 번호 아이디 이름 연락처 
	public String memberId;
	public int memberNo;
	public String memberName;
	public String phonNumber;
	
	public Join() {
		
	}
	public Join(int memberNo,String memberId , 
			String memberName , String phonNumber) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName= memberName;
		this.phonNumber = phonNumber;
	}
	
	//void 메서드 : 결과를 전달하지않음
	public void memberInfo() {
		System.out.println("멤버 번호 " + memberNo);
		System.out.println("멤버 I D " + memberId);
		System.out.println("멤버 이름 " + memberName);
		System.out.println("멤버 번호 " + phonNumber);
		
	}
	

	
	public static void main(String[] args) {
		System.out.println("~~~ kh쇼핑 회원 정보 확인~~~");
		//회원 1에 대한 정보 
		Join member1 = new Join();
		member1.memberId = "감자";
		member1.memberName = "동그라미";
		member1.phonNumber = "010-1111-1111";
		member1.memberInfo();
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		Join member2 = new Join();
		member2.memberId = "학생";
		member2.memberName = "홍길동";
		member2.memberInfo();
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		//회원 번호 아이디 이름 번호 필수
		Join member3 = new Join(3, "파워보이","박영미","010-1212-1321");
		member3.memberInfo();
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		//회원 4와 5가 회원가입할떄 
		//회원4는 기본 생성자를 가지고 가입 
		//맴버 번호 이름만 출력
		//맴버 5는 필수 생성자가지고 회원가입
		//맴버 5 info로출력
		//번호 5 이름 슈퍼맨 딘 케인 
		
		Join member4 = new Join();
		member4.phonNumber = "010-4444-4444";
		member4.memberName = "블랙아담";
		member4.memberInfo();
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		Join member5 = new Join(5, "슈퍼맨" ,"딘 케인", "010-9999-9999");
		member5.memberInfo();
		
		/*값을 지정한 생성자
		값을 지정한 생성자는 초기의 값만 지정해주기 떄문에
		매개변수를 필수로 넣어주지않아도 되지만 
		기본생성자와 생김새가 똑같아서 에러가나기 때문에
		임의로 매개변수를 넣어줌 
		보통은 public ConstructorEx() {
		public ConstructorEx(int a) {
			
			name = "이름을 입력해주세요";
			phone= "번호를 입력해주세요";
			idNo = 1;
			money = 0;
			
		}
		*/
		
	
		
		
	}

}
