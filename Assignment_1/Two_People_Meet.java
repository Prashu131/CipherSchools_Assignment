package Assignment_1;
import java.util.Scanner;
import static java.lang.System.exit;

public class Two_People_Meet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x1 = sc.nextInt();
       int v1 = sc.nextInt();
        int x2 = sc.nextInt();
       int v2 = sc.nextInt();
       // check whether speed as well as position is higher
       if(x1>x2 && v1>v2)
       { System.out.println("No");  exit(0);}
        if(x2>x1 && v2>v1)
        {System.out.println("No");  exit(0); }
        int k=0;
        //Swap function
        if(x1<x2)
        {
            x1 = x1+x2;
            x2 = x1-x2;
            x1 = x1-x2;
            v1 = v1+v2;
            v2 = v1-v2;
            v1 = v1-v2;

        }
       while(x1 >= x2)
       {
           if(x1==x2) {
               k=1;
               break;
           }
           x1 = x1+v1;
           x2 = x2+v2;
       }
       if(k==0)
           System.out.println("No");
       else
           System.out.println("Yes");
    }
}
