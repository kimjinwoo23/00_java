package practice3.model.vo;

public class Horse extends Animal {

	private  String location;
	private String color;
	public void setLocation(String location) {
		this.location = location;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getLocation() {
		return location;
	}
	public String getColor() {
		return color;
	}
	public Horse() {
		
	}
	public Horse(String name , String kides,String location, String color) {
		super(name , kides);
		this.location = location;
		this.color = color;
	}
	@Override
	public void speak() {
		System.out.println(super.toString() +"말은 " + location + "에서 서식하고"
				+"말의"+color + "는 검정색입니다");
	}
	
	
	
}
