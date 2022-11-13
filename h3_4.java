import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by H on 31/10/2022.
 */
public class h3_4 {
    public static void main(String[] args) {
        System.out.println("ادخل رقم ");
        Scanner A =new Scanner(System.in);
        int num=A.nextInt();
        int num1=num/1000000000;
        num=num%1000000000;
        int num2=num/100000000;
        num=num%100000000;
        int num3=num/10000000;
        num=num%10000000;
        int num4=num/1000000;
        num=num%1000000;
        int num5=num/100000;
        num=num%100000;
        int num6=num/10000;
        num=num%10000;
        int num7=num/1000;
        num=num%1000;
        int num8=num/100;
        num=num%100;
        int num9=num/10;
        num=num%10;

           System.out.println(num1 + "  " + num2 + "  " + num3 + "  " + num4 + "  " + num5 + "  " + num6 + "  " + num7 + "  " + num8 + "  " + num9 + "  " + num);

    }
}
