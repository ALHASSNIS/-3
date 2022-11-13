import java.util.Scanner;

/**
 * Created by H on 31/10/2022.
 */
public class h3_7 {
    public static void main(String[] args) {
        System.out.println("من فضلك ادخل ثلاثة ارقام");
        Scanner A =new Scanner(System.in);
        Scanner B =new Scanner(System.in);
        Scanner C =new Scanner(System.in);
        int a,b,c;
        a=A.nextInt();
        b=B.nextInt();
        c=C.nextInt();
        if (a>b && b>c){
            System.out.println("بالترتيب ");
        }
        else  if (a<b && b<=c){
            System.out.println("بالترتيب");
        }
        else {
            System.out.println("ليس بالترتيب");
        }
    }
}
