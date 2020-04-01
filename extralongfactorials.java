import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class ExtraLongFactorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int factorialNum = sc.nextInt();
        BigInteger bigInt = new BigInteger(""+factorialNum);
        for(int i = 1;i<factorialNum;i++){
            bigInt=bigInt.multiply(new BigInteger(""+(factorialNum-i)));
        }
        System.out.println(bigInt);
        
    }
}


