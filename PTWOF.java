public class PTWOF
{
    public static void PTWOF()
    {
        double[] batswing = new double[9];
        
        double bataverg = -1.0;
        double whole = -1;
        for(int index = 0; index < batswing.length; index++)
        {
            bataverg = ((Math.random() - 2) * 0.500);
            whole = bataverg; 
            whole++;
            
            batswing[index] = whole;   // to run the random values of bataverg into the array
            System.out.println(batswing[index]);
        }
    }
}
            
