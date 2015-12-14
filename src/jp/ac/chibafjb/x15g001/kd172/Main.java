package jp.ac.chibafjb.x15g001.kd172;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] x={1,2,3};
		int [] y={7,8};
		int [] z=new int[x.length+y.length];
		for(int i=0;i<x.length;i++)
			z[i] = x[i];
		for(int u=0;u<y.length;u++)
			z[u+x.length]=y[u];
		System.out.print("z[] = {");
		for(int z1=0;z1<z.length;z1++)
		System.out.format("%d,",z[z1]);
		System.out.print("}");
	}

}
