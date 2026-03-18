public class passbyref
// this is strictly a pass by value type of languge so this is a simulated version of the  same 
{
    static class IntWrapper
    {
    int value; 
    IntWrapper(int value) {this.value = value; }
    }



    public static void main(String args[])
    {
        IntWrapper myCounter = new IntWrapper(1);

        increment(myCounter);

        System.out.println(myCounter.value + "counter");
    }

        public static void increment(IntWrapper wrapper)
        {
            wrapper.value++;

        }
        
    
}
