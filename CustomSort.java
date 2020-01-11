class CustomSort{


    public static void main(String args[]){
        int arrays[] = {3,3,6,1,8,4,2,7};
        
        CustomSorte(arrays);
        System.out.print("{");
        for(int x=0; x<arrays.length;x++)
            {
              System.out.print(arrays[x]+" ,");
            }
            System.out.print("}");
    }

    public static int[] CustomSorte(int arr[]){
        int val1,val2,temp=0;
        int length = arr.length;
        for(int y=0; y<=length-1;y++)
        {

            for(int x=0; x<length-1;x++)
            {
                val1=arr[x];
                val2=arr[x+1];
                
                if(val1>val2)
                {
                    temp=val1;
                    arr[x]=val2;
                    arr[x+1]=val1;
                }
            }

        }

        return arr;
    }



}