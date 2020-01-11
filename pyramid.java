public class pyramid{

    public static void main(String args[]) {
        int var1 = 1;
        int var2 = 6;
        
            for(int i = 1; i<6; i++)
            {
                var1+=2;
                var2-=1;
                for(int j=1; j<var2;j++)
                {
                    System.out.print(" ");
                }
                for(int j=2; j<var1;j++)
                {
                    System.out.print("*");
                }
                
                System.out.println(" ");
            }
           
    }
}

//  *
//  ***
//  *****
//  *******
//  *********
//1,3,5,7,9
//5-1