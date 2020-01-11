import java.util.Scanner;


public class HinduToRoman{
    public static void main (String args[]){
        
        
       System.out.print(RomanNumeral());
    }

    static String RomanNumeral(){
        System.out.print("Please enter number: ");
        Scanner in = new Scanner(System.in);
        String HinduArabic  = in.nextLine();
        System.out.println("Number: "+HinduArabic);
        int number = Integer.parseInt(HinduArabic);
        String result="";
        
        while(number>=1000){
            result+="M";
            number-=1000;
            
        }

        while(number>=900){
            result+="CM";
            number-=900;
        }
        
        while(number>=500){
            result+="D";
            number-=500;
        }
        
        while(number>=400){
            result+="CD";
            number-=400;
        }
        
        while(number>=100){
            result+="C";
            number-=100;
        }

        while(number>=90){
            result+="CX";
            number-=90;
        }

        while(number>=50){
            result+="L";
            number-=50;
        }
        
        while(number>=40){
            result+="XL";
            number-=40;
        }
        
        while(number>=10){
            result+="X";
            number-=10;
        }
        
        while(number>=9){
            result+="IX";
            number-=9;
        }
        
        while(number>=5){
            result+="V";
            number-=5;
        }

        while(number>=4){
            result+="IV";
            number-=4;
        }
        
        while(number>=1){
            result+="I";
            number-=1;
        }

        // System.out.print("The Roman Numeral is "+result);
        in.close();
        return result;
        

    }

    
}