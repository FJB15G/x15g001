package jp.ac.chibafjb.x15g001.kd142;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sin = new Scanner(System.in);
		System.out.print("整数aの入力　-->");
		int num1 = sin.nextInt();
		System.out.print("整数bの入力　-->");
		int num2 = sin.nextInt();
		sin.close();
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
	}

}
