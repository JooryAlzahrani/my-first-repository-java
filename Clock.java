public class Clock {

    private int hours;
    private int minutes;
    private int seconds;


    public Clock () {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock (int h, int m, int s){
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    public Clock (int timeSinceMidnight){
        hours = timeSinceMidnight / 3600;
        int remainingTime = timeSinceMidnight % 3600;
        minutes = remainingTime / 60;
        seconds = remainingTime % 60;
    }

    public void ClockInfo(){
        System.out.println("Time: ("+hours+":"+minutes+":"+seconds+")");
    }

    public static Boolean isEqual(Clock C1, Clock C2){

        return C1.getHours() == C2.getHours() &&
                C1.getMinutes() == C2.getMinutes() &&
                C1.getSeconds() == C2.getSeconds();
    }
 // access methods and mutator methods for private instance variables  -- data encapsulation
    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    public void setHours (int hours){
     this.hours = hours;
    }

    public void setMinutes (int minutes){
        this.minutes = minutes;
    }

    public void setSeconds (int seconds){
        this.seconds = seconds;
    }

    static public Clock maximum(Clock[] clockArray) {
        Clock maxTime = clockArray[0];

        for (int i = 1; i < clockArray.length; i++) {
            if (clockArray[i].getHours() > maxTime.getHours()) {
                maxTime = clockArray[i];
            } else if (clockArray[i].getHours() == maxTime.getHours() && clockArray[i].getMinutes() > maxTime.getMinutes()) {
                maxTime = clockArray[i];
            } else if (clockArray[i].getHours() == maxTime.getHours() && clockArray[i].getMinutes() == maxTime.getMinutes() && clockArray[i].getSeconds() > maxTime.getSeconds()) {
                maxTime = clockArray[i];
            }
        }
        return maxTime;
    }
}


