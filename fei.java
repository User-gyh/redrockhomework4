package redrockhomework4LV1;

import java.util.Scanner;

public class fei {
    long a=1 , b=1 , c, n;
    boolean j;
    public void fei(){
        Scanner sc=new Scanner(System.in);
        while(n<=0) {
            System.out.println("请输入斐波拉契数列第n项(n>=1):");
            n=sc.nextInt();
        }
        for (int i = 0; i <= n-3; i++) {
            if(n>=3)
            {
                c=a+b;
                a=b;
                b=c;
            }
            else if(n==2)
                c=b;
            else if(n==1)
                c=a;
        }
        System.out.println("斐波拉契数列第"+n+"项为:"+c);
    }

}
