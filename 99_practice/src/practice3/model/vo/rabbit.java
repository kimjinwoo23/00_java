package practice3.model.vo;

public class rabbit extends Animal {

	
	private int weight;
	private String color;
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
	public rabbit() {
	}
	public rabbit(String name , String kides ,int weight, String color) {
		super(name,kides);
		this.weight = weight;
		this.color = color;
	}
	@Override
	public void speak() {
		System.out.println(super.toString()+"토끼의 몸무게는" + weight +"이고"
				+"토끼 색깔은" + color);
	}
	
}
