package crud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum; int n = sc.nextInt(); int cnt;
        String[] arr = new String[n];
        char[][] arr2 = new char[n][];

        for(int i=0; i<n; i++) {
            arr[i] = sc.next();
        }

        for(int i=0; i<n; i++) {
            arr2[i] = new char [arr[i].length()];
            cnt=0;
            sum=0;
            for(int j=0; j<arr[i].length(); j++) {
                arr2[i][j] = arr[i].charAt(j);
                if (arr2[i][j] == 'O') {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}