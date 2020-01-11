class PassBy{
    public static void main(String args[]){
        int data = 20;

        
        System.out.println(passbyReference(data));
        System.out.println(passbyValue(data));
    }
    static int passbyReference(int value){
        value = 99;

        return value;

    }

    static int passbyValue(int data){
        data = 99;

        return data;
    }






}