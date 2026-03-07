import java.util.Scanner;

public class ifelse
{

public void secynum()

{
    int num = 10;
    int secnum = 15;
    boolean rain = false;

    if(rain)
    {
        System.out.println("Bring an umbrela");
    }
    else if (num > secnum) 
    {
        System.out.println("This is secys");
    }
    else if (num < secnum)
    {
        System.out.println("Could this be secys also?");
    }
    else
    {
        System.out.println("Ayo what the helly");
    }
}


    public static void main(String argsp[])
{
    ifelse ife = new ifelse();
    ife.secynum();
}

}
