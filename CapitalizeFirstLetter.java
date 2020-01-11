


import java.util.Scanner;


class CapitalizeFirstLetter{
    public static void main(String args[])
    {   System.out.print("Please enter string: ");
        Scanner sn = new Scanner(System.in);
        String answer = sn.nextLine();
        char space = ' ';
        for(int i = 0; i<answer.length();i++){
            char ch = answer.charAt(i);
            if(ch == space){
                char jose = Character.toUpperCase(answer.charAt(i+1));
                System.out.print(" "+jose);
                i++;
            }else if(ch == answer.charAt(0)){
                char jose = Character.toUpperCase(answer.charAt(i));
                System.out.print(jose);
            }else{
                System.out.print(ch);
            }
        }
        sn.close();
    }
}