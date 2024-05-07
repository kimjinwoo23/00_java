package practice3.model.vo;
//abstract를 쓰려면 클래스에도 적용시켜야함
public abstract class  Animal {

	private String name;
	private String kinds;
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	//getter 
	public String getName() {
		return name;
	}
	public String getKinds() {
		return kinds;
	}
	//생성자 
	public Animal() {
		
	}
	public Animal(String name, String kinds) {
		this.kinds = kinds;
		this.name = name;
		
	}
	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고"
				 + "종류는" + kinds + "입니다";
	}
	public abstract void speak();
	
	
	
	
	
	
	
	
	
	
	
	
}
