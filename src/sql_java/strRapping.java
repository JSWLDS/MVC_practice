package sql_java;
import java.util.Scanner;
public class strRapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String s=sc.next();
            char a = '"';
            String str = a+s+a;
            str = str.replace(String.valueOf(","), "");
            System.out.print(str + ",");
        }
    }
}