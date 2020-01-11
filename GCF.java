import java.util.Scanner;

class GCF{

    public static void main(String args[])
    {
        System.out.println("Enter number 1: ");
        Scanner sn1 = new Scanner(System.in);
        int number1 = sn1.nextInt();
        System.out.println("Enter number 2: ");
        Scanner sn2 = new Scanner(System.in);
        int number2 = sn1.nextInt();
        findGCF(number1,number2);

    }
    
    public static Integer findGCF(int var1, int var2)
    {
        int GCF=0;
        int result=0;
        int lowerNum=0;
        if(var1<var2){
            lowerNum=var1;
        }else{
            lowerNum=var2;
        }

        for(int counter = 1; counter<=lowerNum+1; counter++)
        {
            if(GCF>result){
                result=GCF;
            }
            if(var1%counter==0 && var2%counter==0){
                GCF=counter;
                // System.out.println(GCF);
            }

        }
        System.out.println("GCF is:" + result);
        
        return result;
    }
    
}

//GCF
//20 30 = 10
//