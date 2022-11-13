import java.util.Scanner;

/**
 * Created by H on 31/10/2022.
 */
public class h3_3 {
    public static void main(String[] args) {
        System.out.println("ادخل رقم ");
        Scanner A =new Scanner(System.in);
        int a;
        a=A.nextInt();
        if (a==0){
            System.out.println("العددالذي ادخلته="+a);
        }
        else if (a>0){
            System.out.println("الرقم("+a+")رقم موجب");

        }
        else {
            System.out.println("الرقم("+a+")رقم سالب");
        }
    }
}
