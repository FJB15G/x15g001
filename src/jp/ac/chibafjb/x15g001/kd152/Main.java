package jp.ac.chibafjb.x15g001.kd152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r -->");
		Float r = sin.nextFloat();
		sin.close();
		Float i =3.14f;
		System.out.println("円周　=　"+(2*r*i));
		System.out.println("面積　=　"+(r*r*i));
	}

}
