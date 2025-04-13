package model;

public class Animal {
	// 定義
	
	// 動物名
	private String name;
	
	// 体長（メートル）
	private double length;
	
	// 速度（km/h）
	private int speed;

	// コンストラクタ
	public Animal(String name, double length, int speed) {
		this.name = name;
		this.length = length;
		this.speed = speed;
	}

	// nameフィールドのgetter
	public String getName() {
		return this.name;
	}

	// nameフィールドのsetter
	public void setName(String name) {
		this.name = name;
	}

	// lengthフィールドのgetter
	public double getLength() {
		return this.length;
	}

	// lengthフィールドのsetter
	public void setLength(double length) {
		this.length = length;
	}

	// speedフィールドのgetter
	public int getSpeed() {
		return this.speed;
	}

	// speedフィールドのsetter
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
