import java.io.*; 
public class ConvertToBinarySum 
{
    public String convertToBinary(String value)
    {
      String binary =" ";
      try{
        // System.out.println("Enter Numbers separated by space:");
        // BufferedReader inp = new BufferedReader (new InputStreamReader(System.in)); 
        // String	lines=inp.readLine();
        //Use the following code to print output
        int sum=0;
     
        String strings[] = value.split(" ");
      
       for(int x=0; x<strings.length;x++)
        {sum += Integer.parseInt(strings[x]);}
        while(0<sum)
        {
          int remainder = sum%2;
          sum = sum/2;
          binary = remainder + binary;
  
        }
        System.out.print(binary);
       }catch (Exception e){
          System.out.print("Answer unavailable");
       }
       return binary;
       
    }
  
}