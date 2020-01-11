public class Fibonacci{

    public static void main(String args[]) {
        int var1 = 0;
        int var2= 1;
        int result = 0;

            for(int i = 1; result<100; i++)
            {
                 result=var1+var2;
                System.out.print(var1 );
                System.out.print(" , "+var2);
                var1=var2+var1;
                var2=var2+var1;
                if(result<100){
                    System.out.print(" , ");
                }
            }
           
    }
    void jose(){
        

    }
}

//0,1,1,2,3,5,8,13,21