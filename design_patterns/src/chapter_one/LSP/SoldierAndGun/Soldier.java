package chapter_one.LSP.SoldierAndGun;

/**
 * Created by shengwen.gan on 2018/7/12.
 * desc:
 */
public class Soldier {

	AbstractGun gun;

	public void setGun(AbstractGun gun) {
		this.gun = gun;
	}

	public void killEnemy() {
		System.out.println("士兵开始杀敌人。。。。");
		gun.shoot();
	}

}
