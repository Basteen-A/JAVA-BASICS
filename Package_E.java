import java.util.*;
import Inherittence.Sub_E;

class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       Sub_E e=new Sub_E();
       System.out.println(e.add(a, b));
       sc.close();
    }
}