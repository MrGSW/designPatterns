package chapter_one.IDP;

/**
 * Created by shengwen.gan on 2018/7/5.
 * desc:
 */
public class Searcher extends AbstractSearcher {

	public Searcher(IPettyGirl pettyGirl) {
		super(pettyGirl);
	}

	@Override
	public void show() {
		System.out.println("----美女的信息如下：----");
		super.pettyGirl.goodLooking();
		super.pettyGirl.greatTemperament();
		super.pettyGirl.niceFigure();
	}
}
