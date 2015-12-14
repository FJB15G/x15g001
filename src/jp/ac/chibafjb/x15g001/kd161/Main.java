package jp.ac.chibafjb.x15g001.kd161;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] test = {10,20};
		int work = 0;
		work = test[0];
		test[0] = test[1];
		test[1] = work;
		for(int i=0;i<2;i++)
			System.out.println("test["+i+"] = "+test[i]);
	}

}
