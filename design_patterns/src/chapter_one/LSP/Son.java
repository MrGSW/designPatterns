package chapter_two.LSP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shengwen.gan on 2018/7/5.
 * desc:
 */
public class Son extends Father {

	public Collection doSomething (Map map) {
		System.out.println("子类被执行!");
		return map.values();
	}

	public Collection doSomething1 (HashMap map) {
		System.out.println("子类被执行!");
		return map.values();
	}
}
