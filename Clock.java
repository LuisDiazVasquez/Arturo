
public class Clock
{
    // instance variables - replace the example below with your own
    private int hour;
    private int minutes;
    private int seconds;
    public Clock( int newHours, int newMinutes, int newSeconds)
    {
        // initialise instance variables
        hour = newHours;
        minutes = newMinutes;
        seconds = newSeconds;
    }
    public void setClock()
    {
        //blah
        //bof
    }
    public String toString( )
    {
        String output = new String();
        output = "The time is " + hour + " hrs" + " : " + minutes + " min" + " : " + seconds + " secs";
        
        return output;
    }
}
