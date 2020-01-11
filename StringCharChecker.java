
import java.util.Scanner;

class StringCharChecker{
public static void main(String args[]){
    System.out.print("Enter a word: ");
    Scanner sn = new Scanner(System.in);
    String word = sn.nextLine();
    // int number = sn.nextInt();
    // System.out.print("The word is palindromed: " + factorial(number));

    System.out.println("Is word is palindrome: " + PalindromeChecker(word));
    System.out.println("The probability of Palindrome: " + PalindromeMaker(word));
    // System.out.println("The chance of it being a palindrome: " + Permutation(word) + " %");
    sn.close();
}
    
    static double PalindromeMaker(String word)
    {
        char ArrChar[] = word.toCharArray();
        String words ="";
        String Theword= word;
        char temp,val1,val2 =' ';
        int length= word.length();
        double factorial = factorial(length);
        String List_of_Unique[]={};
        int charCounter=1;
        
        double chance;
        double number_of_Palindrome = 0;
        boolean status;
        for(int counter = 0; counter<factorial;counter++){
            System.out.println(Theword);
             status = PalindromeChecker(Theword);
            if(status == true)
            {
                number_of_Palindrome +=1;
               
            }
            if(charCounter<length){
                val1 = ArrChar[0];
                val2 = ArrChar[charCounter];
                temp = ArrChar[charCounter];
                ArrChar[0]=val2;
                ArrChar[charCounter]=val1; 
                words = String.copyValueOf(ArrChar);
                Theword= words;
                charCounter++;
            }else{
                charCounter=1;
                val1 = ArrChar[0];
                val2 = ArrChar[charCounter];
                temp = ArrChar[charCounter];
                ArrChar[0]=val2;
                ArrChar[charCounter]=val1; 
                words = String.copyValueOf(ArrChar);
                Theword= words;
                
            }
            
        }
        System.out.println(number_of_Palindrome +" and  "+ factorial);
        chance = number_of_Palindrome/factorial;
        return chance;
    }
// abc -> bac -> end bca  -> cba -> cab  end-> acb -> abc
//haha ahah  ahha haah   aahh hhaa
//haha ahha  ahah end  ahah haah haha
//haha ahha hhaa  ahah haah aahh haha
    static boolean PalindromeChecker(String word){
        boolean status = true;
        
        for(int counter = 0; counter<word.length()-1;counter++){
            char i = word.charAt(counter);
            char j = word.charAt((word.length()-1)-counter);
            if(i!=j)
            {   
             status=false;
            }
        }

        return status;
    }

    static int factorial(int number)
    {
        int result =1;
        for(int x = 1; x<=number; x++)
        {
            result *= x;
        }
        return result;
    }

}