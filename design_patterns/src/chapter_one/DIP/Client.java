package chapter_one.DIP;

/**
 * Created by shengwen.gan on 2018/7/5.
 * desc:
 */
public class Client {

	public static void main(String[] args) {
		Driver gsw = new Driver();
//		Benz benz = new Benz();
		Bmw bmw = new Bmw();
		gsw.driver(bmw);
	}

}
