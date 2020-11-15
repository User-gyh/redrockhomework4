package redrockhomework4LV1;

import java.util.Scanner;

public class couple {
    int number,n=0;
    public void Count(){
        number=0;
        boolean i=true;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                int a= sc.nextInt();
                number=number+a;
                n++;
            }catch (Exception e){
                i=false;
            }
        }while (i);
        }
        public int getCount(){
        return number;
    }
}
