package Assignment_2;

import java.util.Scanner;

public class Generate_Parenthesis {
    public static void check(String s,int c_open, int c_close,int n){
        if(c_open ==n && c_close ==n )
        {
            System.out.println(s);
            return;
        }
        if(c_open> c_close)
        {
            check(s+"}",c_open,c_close+1,n);
        }
        if(c_open<n)
        {
            check(s+"{",c_open+1,c_close,n);
        }
    }

    public static void main(String[] args) {
        String s= "";
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        check(s,0,0,n);
    }
}
