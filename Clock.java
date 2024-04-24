public class Clock {
    public int hours;
    public int minutes;
    public int seconds;

    // default constructor with default values to set time to 12:00:00
    public Clock () {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }
    // constructor with 3 parameters
    public Clock (int h, int m, int s){
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }
    //constructor to convert value of seconds since midnight to a 12hr time format
    public Clock (int timeSinceMidnight){
        hours = timeSinceMidnight / 3600;
        int remainingTime = timeSinceMidnight % 3600;
        minutes = remainingTime / 60;
        seconds = remainingTime % 60;
    }

    //instance methods
    //prints clock info
    public void ClockInfo(){
        System.out.println("Time: ("+hours+":"+minutes+":"+seconds+")");
    }

    //isEqual method

    public static Boolean isEqual(Clock C1, Clock C2){

        return C1 ==  C2;
    }


}


