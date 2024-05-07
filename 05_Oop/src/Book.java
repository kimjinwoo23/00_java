
public class Book {

	public String title;
	public String publisher;
	public String author;
	public int price;
	public double discountRate;
	
	public Book( ) {
		
	}
	public Book(String title,String publisher , String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String a,String b , String c,int price
			,double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	public void info() {
		System.out.println("책 이름 : " + title);
		System.out.println("출판사  :" + publisher);
		System.out.println("지은이 : " + author);
		System.out.println("책가격 : " + price);
		System.out.println("할인율 : " + discountRate);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	public static void main(String[] args) {
		System.out.println("kh도서관에 오신걸 환영안합니다 ");
		Book book1 = new Book();
		book1.title = "2시15분";
		book1.publisher = "adad";
		book1.author = "코난";
		book1.price = 25000;
		book1.discountRate = 18.4;
		book1.info();
		
		Book book2 = new Book("2시 17분", "알수없음","유령");
		book2.info();
		
		Book book3 = new Book("2시 18분","명탐정","김전일",9900,10.0);
		book3.info();
		
		
		
	}

}
