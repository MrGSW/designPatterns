package chapter_one.IDP;

/**
 * Created by shengwen.gan on 2018/7/5.
 * desc:
 */
public class Client {

	public static void main(String[] args) {
		IPettyGirl yanYan = new PettyGirl("燕燕");
		AbstractSearcher searcher = new Searcher(yanYan);
		searcher.show();
	}

}
