package practice3.model.vo;

import com.kh.chap02_abstract.part01.model.vo.Football;
import com.kh.chap02_abstract.part01.model.vo.Sports;

public class Dog extends Animal{
	
	public static final String PLACE = "애견카페"; //두꺼운건 스테틱, 밑줄은 파이널 (바뀌었을수도..)
	private int weight;

	public Dog() {
	
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
		
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void speak() {
		String result = super.toString()+" 몸무게는 " + weight + "kg 입니다.";
		System.out.println(result);
	}

}