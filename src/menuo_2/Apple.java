package menuo_2;

public class Apple {
	
	// globalieji kintamieji
	int mass = 0;
	String name;
	
	// konstruktorius
	public Apple() {
		System.out.println("Hello, I'm an apple!");
	}
	
	public Apple(String name) {
		this.name = name;
		System.out.println("Hello, my name is " + name);
	}
	
	public Apple(String name, int mass) {
		this.name = name;
		this.mass = mass;
		System.out.println("Hello, my name is " + name);
	}
	
	public Apple(int mass) {
		this.mass = mass;
		System.out.println("Hello, I'm an apple!");
	}
	
	// metodai
	public void setMass(int mass) {
		this.mass = mass;
	}
	
	public int getMass() {
		return mass;
	}

}
