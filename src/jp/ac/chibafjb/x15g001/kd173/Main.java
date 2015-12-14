package jp.ac.chibafjb.x15g001.kd173;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int k = 3;
		int data[] ={0,0,0,0};
		Scanner sin = new Scanner(System.in);
		for(int i=0;i<=k;i++){
			int dat = sin.nextInt();
			data [i] = dat;
		}
		sin.close();
		for(int s=k;s>0;s--)
			data[s]=data[s-1];
		for(int u=0;u<=k;u++)
		System.out.format("data[%d] = %d\n",u,data[u]);
	}

}
