package redrockhomework4LV1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean a=true;
        fei fei=new fei();
        couple couple=new couple();
        System.out.println("请选择服务:");
        System.out.println("1.计数求和");
        System.out.println("2.斐波拉契前n项和");
        Scanner sc=new Scanner(System.in);
        int choose =sc.nextInt();
        do {
            if (choose == 1) {
                System.out.println("请输入数字(非数字停止):");
                couple.Count();
                couple.getCount();
                System.out.println(couple.n+"个数字和为"+couple.number);
                break;
            }
            else if(choose==2)
            {
                fei.fei();
                break;
            }
            else
            {
                System.out.println("输入错误，请重新输入:");
                choose=sc.nextInt();
            }
        }while(a);
    }
}
