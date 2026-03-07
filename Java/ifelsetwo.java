import java.util.Scanner;

public class ifelsetwo
{
    int num = 10;
    int secnum = 15;
    boolean rain = true;

public void sesyunb()

{
   // boolean rain = true;

    if(rain)
    {
        System.out.println("Bring an umbrela");
    }
    
    else
    {
        System.out.println("Ayo what the helly");
    }
}
public void sesynum()
{
        if (num > secnum) 
        {
            System.out.println("This is secys");
        }
        else 
        {
            System.out.println("ayo what the helly?");
        }
}

    public static void main(String argsp[])
{
    ifelsetwo ife = new ifelsetwo();
    ife.sesynum();
    ife.sesyunb();
}

}
