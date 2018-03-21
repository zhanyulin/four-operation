package cn.itcast01;

import java.util.Scanner;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}
	static char h,i,j,k;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e;
		
		a=(int) (Math.random()*100);
		b=(int) (Math.random()*100);
		c=(int) (Math.random()*100);
		d=(int) (Math.random()*100);
		e=(int) (Math.random()*4);
		System.out.println(e);
		if (e==0){
			h='+';
		}
		else if (e==1){
			i='-';
		}
		else if (e==2){
			j='*';
		}
		else {
			k='/';
		}
		System.out.println("请输入要生成式子的个数n:");
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
	
        for(int m=0;m<=n;m++){
        String str=""+a+h+b+i+c+j+d+"=";
        System.out.println(str);
        }
	}

	private static int random() {
		// TODO Auto-generated method stub
		return 0;
	}
   
}
