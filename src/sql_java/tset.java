package sql_java;

import java.util.Scanner;

public class tset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        String[][] arr = new String[a][b];
        String[] d = new String[a];
        int g = 0;
        int h = 0;
        boolean tr = false;

        for (int i = 0; i < a; i++) {
            d[i] = String.valueOf(sc.next());
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = String.valueOf(d[i].charAt(j));
            }
        }

        System.out.println("~~~~~~~~~");
//        for (int i = 0; i < a; i++) {
//            System.out.println(d[i].indexOf("BW"));
//        }
        for (int i = 0; i < 8; i++) {
            g = 0;
            h = 0;
            for (int j = 0; j < 8; ) {
                if(true) {
                    if (j < 1) {
                        g = 0;
                        h = 1;

                    } else {
                        g = j;
                        h = j + 1;
                    }
                    j+=2;
                }
                if (arr[i][g].equals("W") && arr[i][h].equals("B") || arr[i][g].equals("B") && arr[i][h].equals("W")) {
                } else {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
//        for (int i=0; i<a; i++){
//            System.out.println("@@@@@@@@");
//            for (int j=0; j<b; j++){
//System.out.println(j);
//                System.out.println(arr[i][j]);
//            }
//        }
//        System.out.println(cnt);
//    }
//}