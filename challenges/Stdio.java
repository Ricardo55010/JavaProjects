package challenges;//this class belongs to package challege

import java.util.*;//import class Scanner from package java/util

public class Stdio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();//we stop the input reading
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
