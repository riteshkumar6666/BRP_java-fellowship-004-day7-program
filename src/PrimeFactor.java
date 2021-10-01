//***BRP 004 (DAY 7) PROGRAM***
//factor a number N using prime factorization method program in java
import java.util.Scanner;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter a number: ");
        int N=sc.nextInt();

        for (i=2;N>1;i++)
        {
            while (N%i==0)
            {
                System.out.println(i);
                N=N/i;
            }
        }

    }
}
