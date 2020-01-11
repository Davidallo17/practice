import java.util.Scanner;

class PasswordChecker{
    public static void main(String args[])
    {
        System.out.println("Please enter string: ");
        Scanner sn = new Scanner(System.in);
        String word = sn.nextLine();
        
       if(checkPW(word)==true){
           System.out.print("The password is safe");
       }else{
        System.out.print("The password is not safe");
       }
       sn.close();
    }

    public static boolean checkPW(String words){
        
        
        int length = words.length();
        boolean status = false;
        int numcount = 0;
        int CapitalLettercount= 0;
        if(length<8){
            return false;
        }
        for(int i=0; i<length;i++)
        {
            char ch = words.charAt(i);
            if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'||ch=='?')
            {
                status=true;
            }
            if(ch >='A' && ch <= 'Z')
            {
                status=true;
                CapitalLettercount +=1;
            }
            if(ch>='0' && ch <='9')
            {
                status=true;
                numcount +=1;
            }
        }
        if(numcount >1 && CapitalLettercount >1)
        {
            status=true;
        }else
        {
            status=false;
        }
       
        return status;
    }
}
