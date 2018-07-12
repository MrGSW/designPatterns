package chapter_one.LSP.ostrichNotBird;

/**
 * Created by shengwen.gan on 2018/7/12.
 * desc:
 */
public class Bird {

	private double velocity;

	public void fly() {
		System.out.println("I can fly!");
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public double getVelocity() {
		return velocity;
	}

}
