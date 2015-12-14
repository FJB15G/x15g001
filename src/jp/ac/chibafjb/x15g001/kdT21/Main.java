package jp.ac.chibafjb.x15g001.kdT21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.print("ハンバーガーの個数-->");
		int hum = sin.nextInt();
		System.out.print("フライドポテトの個数-->");
		int fri = sin.nextInt();
		int hum1 = 100;
		int fri1 = 180;
		int syo = (int)Math.floor((hum1*hum+fri*fri1)*0.08);
		System.out.println("ハンバーガーの代金　　　=　"+(hum*hum1+"円"));
		System.out.println("フライドポテトのの代金　=　"+(fri*fri1+"円"));
		System.out.println("小計　　　　　　　　　　=　"+(fri*fri1+hum1*hum+"円"));
		System.out.println("");
		System.out.println("消費税　　　　　　　　　=　"+(syo)+"円");
		System.out.print("受取金額　　　　　　　　　　-->");
		int kin = sin.nextInt();
		sin.close();
		System.out.print("つり銭　　　　　　　　　　=　"+(kin-(syo+fri*fri1+hum*hum1))+"円");
	}

}
