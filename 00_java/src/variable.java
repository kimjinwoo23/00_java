
public class variable {

	public static void main(String[] args) {
	/*1.정수 2.문자 3.문자열 4.실수 5.참 거짓
	1. 정수 byte short int long
	byte = 1byte */
	byte 바이트 =1;
    System.out.println(바이트);
    System.out.println("바이트");
    
    short 쇼트 = 3;
    System.out.println(쇼트);
	
    int 인트 = 1;
    System.out.println(인트);
    /*byte 자료형 선언 선언이름 bte 안에 숫자 2넣고 출력 
    short 자료형 선언 선언이름 shrt 안에 숫자 2넣고 출력 
    int 자료형 선언 선언이름 nt 안에 숫자 2넣고 출력
    long 자료형 선언 선언이름 lng 안에 숫자 2넣고 출력
    byte bte = 2;
    System.out.println(bte);
    short shrt = 2;
    System.out.println(shrt);
    int nt = 2;
    System.out.println(nt);
    long lng = 2;
    System.out.println(lng);*/
    
    /*2. 문자에는 char와 string이있다
    문자를 나타내는 char은 ''작은따옴표를 사용해서 표현
    큰 따옴표는 string 문자열을 나타내는 표현  
    char myChar ='A';
    System.out.println(myChar);
    
    char mychar2 = "A";
    System.out.println(mychar2);
    char 에는 하나의 문자만 담을수있기 떄문에 
    A나 B 둘 중 하나만 작성 가능 
    char myChar3 = 'AB';*/
    
    String str1 ="문자";
    System.out.println(str1);
    
    String name ="김진우";
    System.out.print("당신의 이름은 ");
    System.out.println(name+"입니다.");
    // 여러 글자나 내용을 한줄로 출력할떄 +를 사용 
    System.out.println("당신의 이름은" + name + "입니다");
    System.out.println("당신의 이름은  "+name+"  입니다");
    //문자의 간격을 벌리고싶을떄 큰 따옴표 내부에 띄워쓰기하기 
    System.out.println("당 신 의 이 름 은 "+name+  "  입 니 다 ");
     //정수 + 문자 + 문자열 출력하기
    /*
     * 안녕하세요. 저는요. 서울에 사는 o o o 입니다.
     * 제 전화번호는 111-2222-3333입니다.
     * 제 주민번호는 비밀입니다.
     * 제 혈액형은 A형입니다.
     */
     String geeting = "안녕하세요";
     String introduction ="저는요. 서울에 사는 ooo입니다.";
     String number = "111-2222-3333";
     char dash = '-';
     String secret = "비밀";
     String bloodType = "A형";
    
     System.out.print(geeting);
     System.out.println(introduction);
     System.out.print("제 전화번호는"+number+ "입니다");
     System.out.println(" 제 주민번호는 "+ secret+ "입니다.");
     System.out.println("제 혈액형은" + bloodType+ "입니다");
     
     //4. 실수 5. 논리형 
     //실수는 float 와 double 이 있음 
     //실수는 기본으로 double 형식으로 되어있다 
     //float=4byte double=8byte
     //float에 실수를 담기위해서는 f를 붙여야한다 
     //실수 뒤에 f를 붙일 떄 대소문자 구별 없이 사용 가능 
     float ff1 = 3.14f;
     float ff2 = 3.14F;
     System.out.println("ff1은 : "+ff1+ " 이다  ");
     System.out.println("ff2는 : " + ff2 + " 이다 ");
     
     double dd1 = 3.14;
     System.out.println("double dd1: " + dd1);
     
     //5. 논리형 
     //boolean을 사용해서 true인지 false인지 표현 가능 
     boolean isTrue = true;
     boolean isfalse = false; 
     System.out.println("오늘 날씨는 " + isTrue);
     System.out.println("내일 날씨는 " + isfalse+" ? ");
     
     //정수 문자 문자열 실수 논리형 
     int num = 10;
     System.out.println("정수 num의 값"+ num);
     
     char ch = 'Z';
     System.out.println("문자 ch 의 값+ ch");
     
     String text = "Hello,World!";
     System.out.println("문자열은 text =" + text);
     
     double ab1 = 3.14;
     System.out.println(ab1);
     boolean isTrue2= true;
     System.out.println("isTrue2 =" +isTrue2);
     
     System.out.println("num =" + num);
     
     // num에 10 대신 20을 넣고싶다면 
     	}
	

	
}
