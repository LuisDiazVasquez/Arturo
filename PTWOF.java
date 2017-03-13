public class PTWOF
{
    public static void PTWOF()
    {
        double[] batswing = new double[9];
        
        double bataverg = -1;
        
        for(double index = 0.0; index < batswing.length; index++)
        {
            bataverg = Math.random() * 0.500;
            bataverg ++;
            
            batswing[index] = bataverg;   // to run the random values of bataverg into the array
            System.out.println(batswing[index]);
        }
    }
}
            
