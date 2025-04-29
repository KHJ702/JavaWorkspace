package com.kh.practice.snack.model.vo;

public class Snack {

	private String kind; // 종류
	private String name; // 이름
	private String flavor; // 맛
	private int numOf; // 개수
	private int price; // 가격
	
public Snack() {
	
}
	
public Snack (String kind, String name, String flavor, int numOf, int price) {
	//이거 왜 getter,setter에 값 초기화 했는데 왜 여기서 초기화 또 해야하는지 물어보기
	this.kind = kind;
	this.name = name;
	this.flavor = flavor;
	this.numOf = numOf;
	this.price = price;
}

public String information() {
	return kind+"("+name+"-"+flavor+")"+numOf+"개"+price+"원"; 	//return name+"님의 나이는"+age+"살이고, 키는 "+height+"cm입니다."; // 이거는 public String(문자열로 반환한다) 이렇게 했기 때문에 가능함.

}	

	public void setKind(String kind) { //(변수명은 필드명과 똑같이(관례)
		this.kind = kind; //현재 객체의 필드의 kind을 얻어옴 (this.= 현재 이 메소드를 실행하고 있는 객체의 kind이라는 인스턴스 변수의 값을 가져와라)
	}
	public void setName(String name) { //(변수명은 필드명과 똑같이(관례)
		this.name = name;
	}
	public void setFlavor(String flavor) { //(변수명은 필드명과 똑같이(관례)
		this.flavor = flavor;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	// getter메서드
	// 객체 내부의 필드값을 반환해주는 메서드
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public String getFlavor() {
		return flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public int getPrice() {
		return price;
	}

}

