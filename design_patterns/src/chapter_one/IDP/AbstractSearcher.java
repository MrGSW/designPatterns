package chapter_one.IDP;

/**
 * Created by shengwen.gan on 2018/7/5.
 * desc:
 */
public abstract class AbstractSearcher {

	protected IPettyGirl pettyGirl;

	public AbstractSearcher(IPettyGirl _pettyGirl) {
		this.pettyGirl = _pettyGirl;
	}

	public abstract void show();

}
