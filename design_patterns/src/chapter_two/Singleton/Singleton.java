package chapter_two.Singleton;

/**
 * Created by shengwen.gan on 2018/7/12.
 * desc: 单例模式之-饿汉模式
 */
/*
public class Singleton {

	//限制产生多个对象
	private static final Singleton sigleton = new Singleton();

	private Singleton() {}

	//通过该方法获得实例对象
	public static Singleton getSigleton() {
		return sigleton;
	}

	public static void doSomething() {
		//类中其他方法，尽量都是static
	}

}
*/
/*

public class Singleton {
	//限制产生多个对象
	private static Singleton sigleton = null;

	private Singleton() {}

	public static Singleton newInstance() {
		if (null == sigleton) {
			sigleton = new Singleton();
		}
		return sigleton;
	}
}
*/

public class Singleton {

	//限制产生多个对象
	private static Singleton instance = null;

	private Singleton() {}

	public static Singleton newInstance() {
		if (null == instance) {
			synchronized(Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}