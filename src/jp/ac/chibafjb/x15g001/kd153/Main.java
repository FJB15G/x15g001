package jp.ac.chibafjb.x15g001.kd153;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r -->");
		Float r = sin.nextFloat();
		sin.close();
		Float i =3.14f;
		System.out.println("円周　=　"+Math.round((2*r*i)*10)/10.f);
		System.out.println("面積　=　"+Math.round((r*r*i)*10)/10.f);
	}

}
