package jp.ac.chibafjb.x15g001.kd165;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] a = {5,10,15};
		int [] b = new int[a.length];
		int m = a.length;
		for(int i = 0;i<m;i++)
			b[2-i] = a[i]; 
		for(int s = 0;s<m;s++)
		System.out.println("b["+s+"]　=　"+b[s]);
	}

}
