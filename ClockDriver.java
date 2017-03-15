import java.util.Scanner;
public class ClockDriver
{
    public static void main(String[] args)
    {
        Clock kitchenclock = new Clock(3, 45, 16);
       
        System.out.print("In the kitchen ");
        
        System.out.println(kitchenclock);
        
        Scanner key = new Scanner(System.in);
        
        System.out.print("In the bedroom ");
        
        Clock bedroomclock = new Clock(key.nextInt(), key.nextInt(), key.nextInt()); 
        System.out.print(bedroomclock);
    }
}
