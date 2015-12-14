package jp.ac.chibafjb.x15g001.kd163;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] test = {33,18,102,47,5};
		int n = test.length;
		int sum = 0;
		for(int i=0;i<n;i++)
			sum=test[i]+sum;
		System.out.print("合計　=　"+sum);
	}

}
