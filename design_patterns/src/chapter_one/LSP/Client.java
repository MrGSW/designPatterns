package chapter_two.LSP;

import java.util.HashMap;

/**
 * Created by shengwen.gan on 2018/7/5.
 * desc:
 */
public class Client {

	public static void invoker() {
//		Father f = new Father();
		Son f = new Son();
		People p = new Father();
		HashMap map = new HashMap();
		f.doSomething(map);
		f.doSomething1(map);
	}

	public static void main(String[] args) {
		invoker();
	}

}
