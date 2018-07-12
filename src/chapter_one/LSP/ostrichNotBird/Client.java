package chapter_one.LSP.ostrichNotBird;

/**
 * Created by shengwen.gan on 2018/7/12.
 * desc:
 */
public class Client {

	public static void calcFlyTime(Bird bird) {
		double riverWidth = 3000;
		try {
			if (bird.getVelocity() == 0) {
				throw new Exception("0");
			}
			System.out.println("Velocity = " + bird.getVelocity());
			System.out.println("Fly time = " +riverWidth/bird.getVelocity());
		} catch (Exception e) {
			System.out.println("An error occured!");
		}
	}

	public static void main(String[] args) {
		Bird bird = new Ostrich();
		bird.setVelocity(100);
		calcFlyTime(bird);
	}

}
