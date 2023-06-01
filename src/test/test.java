package test;

public class test {
    public static void main(String[] args) {
        String sum = "a";
        doc doc = new doc();
        for(int i=0; i<10000; i++) {
            for(int j=0; j<120; j++) {
                sum += 'a';
                System.out.println(sum);

            }

        }
        System.out.println(sum);
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