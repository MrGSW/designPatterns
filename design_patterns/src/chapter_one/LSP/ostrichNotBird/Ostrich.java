package chapter_one.LSP.ostrichNotBird;

/**
 * Created by shengwen.gan on 2018/7/12.
 * desc:
 */
public class Ostrich extends Bird {

	public void fly() {
		System.out.println("I can't fly!");
	}

	public void setVelocity(double velocity) {
		super.setVelocity(0);
	}

	public double getVelocity() {
		return super.getVelocity();
	}

}
