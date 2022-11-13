import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by H on 21/09/2022.
 */
public class h3_8 {
    public static void main(String[] args) {
        System.out.println(" من فضلك ادخل اسمك ثم عدد ساعات عملك");
        Scanner in = new Scanner(System.in);
        Scanner D = new Scanner(System.in);
        //Scanner C = new Scanner(System.in);
      //  double c=C.nextDouble();
        String name=in.next();
        double d=D.nextDouble();
        double x=9.25;
        double s=d*x;
        double e;
        double a;

        ////////
        if (d>40){
          e=d%40;

            a=e*100%150;
            System.out.println("الساعات الاضافيه= "+e);
            System.out.println(" اجر الساعات الاضافيه= "+a);
        }
        else {
            a=0;
           // System.out.println("راتبك هو" +s);

        }
        System.out.println("الساعات المعتمدة = "+s);
        System.out.println(" اجر الساعات كاملة = "+s+a);
//        System.out.println("enter the month amd the day");
//        int month ,day;
//        String w="Winter";
//        String s="Spring";
//        String u="Summer";
//        String f="Fall";
//        month = in.nextInt();
//        day = d.nextInt();
//        if (month>0)
//       if (month <=3 ) System.out.println(w);
//        else
//        if (month <=6) System.out.println(s);
//        else
//        if (month <=9) System.out.println(u);
//        else
//        if (month <=12) System.out.println(f);
//        if (month%3==0)
//            if (day>=21)
//                if (month <=3) set(w)=(s);
//
//    }
//
//    private static String set(String w) {
//        w=w;
//        return w;
//    }
}}
