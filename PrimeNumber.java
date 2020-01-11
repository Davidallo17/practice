import java.util.Scanner;

class PrimeNumber{

    public static void main(String args[])
    {
        System.out.print("Enter a number: ");
        Scanner sn = new Scanner(System.in);
        int number = sn.nextInt();
        
        System.out.print("Is the number a prime number?: "+ IsPrimeNumber(number));
        sn.close();
    }

    static Boolean IsPrimeNumber(int number){
        boolean status = true;
        int factorCount=0;
        for(int i = 1; i<=number;i++)
        {
            if(number%i==0)
            {   
                factorCount+=1;
            }
        }
        if(factorCount>2)
        {
            status=false;
        }


        return status;
    }
}