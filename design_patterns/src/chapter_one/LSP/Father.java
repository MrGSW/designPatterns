package chapter_two.LSP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shengwen.gan on 2018/7/5.
 * desc:
 */
public class Father extends People {

	@Override
	public Collection doSomething (HashMap map) {
		System.out.println("父类被执行！");
		return map.values();
	}

	public Collection doSomething1 (Map map) {
		System.out.println("父类被执行！");
		return map.values();
	}
}
