public class passbyvalue 
{
    public static void main(String[] args) 
    {
        int x =10; 
        modifyValue(x);
        System.out.println("after method"+ x);
    }
        public static void modifyValue(int value)
        {
            value = 50;
        }
    
}
