import java.util.Scanner;

class ReverseString{
    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please enter string: ");
        String word = sn.nextLine();
        int length = word.length();
        for(int counter=length;counter>0;counter--)
        {
        System.out.print(word.charAt(length-1)); 
        length = length-1;
        }
      
        sn.close();
    }
}
//
//jose
//esoj
//