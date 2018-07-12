package chapter_one.LSP.SoldierAndGun;

/**
 * Created by shengwen.gan on 2018/7/12.
 * desc:
 */
public class Client {

	public static void main(String[] args) {
		Soldier sanMao = new Soldier();
		sanMao.setGun(new MachineGun());
		sanMao.killEnemy();
	}

}
