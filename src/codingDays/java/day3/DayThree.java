import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by smoenkemeyer on 18.10.16.
 */
public class DayThree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        if(n%2==1){
            ans = "Weird";
        }
        else{
            if(n<6) ans = "Not Weird";
            else if (n<21)ans = "Weird";
            else ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
