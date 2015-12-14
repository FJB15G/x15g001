package jp.ac.chibafjb.x15g001.kd171;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int k = 3;
		int [] data = {100,200,300,0};
		for(int i=k;i>0;i--)
			data[i] = data[i-1];
		for(int u=0;u<k+1;u++)
			System.out.format("data[%d] = %d\n",u,data[u]);
	}

}
