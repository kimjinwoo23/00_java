package practice3.model.vo;

import java.util.Random;

public class AnimalManager {

	
	
	
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[5];
		//무작위로
		Random random = new Random();
		
		for(int i = 0; i < animals.length; i++) {
			//만약에 랜덤으로 true false 를 가져오게 한 다음 
			//true면 강아지 false는 고양이를 넣을예정 
			if(random.nextBoolean()) {
				//public       Dog(String name , String kinds,int weight)
				animals[i] = new Dog("멍멍이" + i, "개", random.nextInt(30)+1);
				
			}else {
				animals[i] = new Cat("야옹이" + i, "고양이","집","검은색");
			}
			for(Animal a :animals) {
				a.speak();
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
