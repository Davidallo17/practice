import java.util.Scanner;

class IntToString {
   public static void main(String args[]){
    System.out.println("Enter a number: ");
    Scanner sn = new Scanner(System.in);
    int digit = sn.nextInt();
    System.out.println(IntoWords(digit));
    
   }

   public static String IntoWords(int digit){
    String words=" ";
    String StringDigit = Integer.toString(digit);
    int length = StringDigit.length();

    if(length>4)
    {
        words = "Not available";
        return words;
    }
    for(int i=0; i<length;i++)
    {
        char currentDigit= StringDigit.charAt(i);
        switch(length)
        {
            case 3:words+= GetDigit(currentDigit);
            words+= " thousand";
            length--;
            break;
            case 2:words+= GetDigit(currentDigit);
            words+= "hundred";
            length--;
            break;
            
            case 0:words+= GetDigit(currentDigit);
            break;

        }
    }
        System.out.println(words);
        return words;
    }

    static String GetDigit(int currentDigit)
   {
       String words=" ";
       switch(currentDigit)
       {   
           case '0':
           break;
           case '1':words+="one ";
           break;
           case '2': words+="two ";
           break;
           case '3': words+="three ";
           break;
           case '4': words+="four ";
           break;
           case '5': words+="five ";
           break;
           case '6': words+="six ";
           break;
           case '7': words+="seven ";
           break;
           case '8': words+="eight ";
           break;
           case '9': words+="nine ";
           break;
       }
       return words;
   }
    
   }
   

// 
   // // if(i == 0){
        //  if(length==4){
    //             words+= " thousand";
    //         }else if(length==3){
    //             words+= " hundred";
    //         }else if(length==2){
    //             switch(currentDigit){
    //                 case '1':words+=" jose";
    //                 break;
    //                 case '2': words+=" twenty";
    //                 break;
    //                 case '3': words+=" thirty";
    //                 break;
    //                 case '4': words+=" forty";
    //                 break;
    //                 case '5': words+=" fifty";
    //                 break;
    //                 case '6': words+=" sixty";
    //                 break;
    //                 case '7': words+=" seventy";
    //                 break;
    //                 case '8': words+=" eighty";
    //                 break;
    //                 case '9': words+=" ninety";
    //                 break;
    //             }
    //         }
        // //     switch(currentDigit){
        // //         case '1': 
        // //         if(i == length-(length-1)){
        // //             switch(currentDigit){
        // //                 case '0':words+=" one";
        // //                 break;
        // //               
        // //             }
        // //         }
        // //         break;
        // //         case '2': words+=" twenty";
        // //         break;
        // //         case '3': words+=" thirty";
        // //         break;
        // //         case '4': words+=" forty";
        // //         break;
        // //         case '5': words+=" fifty";
        // //         break;
        // //         case '6': words+=" sixty";
        // //         break;
        // //         case '7': words+=" seventy";
        // //         break;
        // //         case '8': words+=" eighty";
        // //         break;
        // //         case '9': words+=" ninety";
        // //         break;
        // //     }
        // // }
        // // if(i == 0)
        // // {
        //     switch(currentDigit){
        //         case '1':words+=" one";
        //         break;
        //         case '2': words+=" two";
        //         break;
        //         case '3': words+=" three";
        //         break;
        //         case '4': words+=" four";
        //         break;
        //         case '5': words+=" five";
        //         break;
        //         case '6': words+=" six";
        //         break;
        //         case '7': words+=" seven";
        //         break;
        //         case '8': words+=" eight";
        //         break;
        //         case '9': words+=" nine";
        //         break;
        //     }


        