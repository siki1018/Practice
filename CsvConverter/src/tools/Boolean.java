package tools;

import java.util.Random;

public class Boolean {
	//念のため保存
	
	/**
	 * @return 50%の確率でtrue/falseを生成
	 */
	public static boolean isTrue() {
		Random r = new Random();
		return r.nextInt(2) == 0 ? true : false;
	}

}
