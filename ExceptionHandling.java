package org.perscholas;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main (String args[]) {
	int a,b;
	double d=0;
	Scanner s = new Scanner(System.in);
	
	

	
	while(s.hasNext()) {
		a=s.nextInt();
		b=s.nextInt();
		try {
			d=a/b;
			System.out.println(d);
		}catch(Exception e) {
			if(a==0||b==0) {
				e.printStackTrace();
			}else {
				e.printStackTrace();
			}
		}
	}
	

}
}
