import java.util.Scanner;

public class AddAllPrimeFrom100{

    public static void main(String args[])
    {
        // System.out.println("Enter number:");
        // Scanner sn = new Scanner(System.in);
        int sumOfPrime=0;

       
        for(int x=1;x<100;x++)
        {
            boolean z= IsPrime(x);
            if(z==true)
            {
                System.out.print(x +" , ");
                sumOfPrime+=x;
            }
        }
        System.out.println(sumOfPrime);
    
    }

    static boolean IsPrime(int var)
    {   
        boolean status =false;
        int FactorCount=0;
        for(int x=1; x<=var;x++)
        {
            if(var%x == 0){
                FactorCount++;

            }
        }
        if(FactorCount>2){
            status=false;
        }else{
            status=true;
        }
        return status;
    }




}