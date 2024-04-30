import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Enter the time since midnight in seconds: ");
        Scanner scanner = new Scanner(System.in);
        int timeSinceMidnight = scanner.nextInt();

        Clock clock1 = new Clock(timeSinceMidnight);
        clock1.ClockInfo();

        System.out.println("Enter three digits representing time, in hours, minutes, and seconds: ");
// here I initialized clock2 using the default constructor, which sets the time to 12:00:00, so that I can use the setter method to set the values to whatever values the user inputs, in order to demonstrate better data encapsulation
        Clock clock2 = new Clock();

        System.out.println("Hours: ");
        int hoursInputClock2 = scanner.nextInt();
// value validation for hours set to a range of 0-23
        if (hoursInputClock2 >= 0 && hoursInputClock2 <= 23) {
            clock2.setHours(hoursInputClock2);
        }
        else {
            System.out.println("Error: Please enter a value between 0-23 only");
        }

        System.out.println("Minutes: ");
        int minutesInputClock2 = scanner.nextInt();
        if (minutesInputClock2 >= 0 && minutesInputClock2 <= 60){
            clock2.setMinutes(minutesInputClock2);
        }
        else {
            System.out.println("Error: Please enter a value between 0-60 only.");
            minutesInputClock2 = scanner.nextInt();
            clock2.setMinutes(minutesInputClock2);
        }

        System.out.println("Seconds: ");
        int secondsInputClock2 = scanner.nextInt();
        if (secondsInputClock2 >= 0 && secondsInputClock2 <= 60){
            clock2.setSeconds(secondsInputClock2);
        }
        else {
            System.out.println("Error: Please enter a value between 0-60 only.");
        }

        clock2.ClockInfo();
        System.out.println("Is the first clock equal to the second clock? "+ Clock.isEqual(clock1, clock2));

        Clock[] clockArray = new Clock [2];
        clockArray[0] = clock1;
        clockArray[1] = clock2;

        Clock maxTime = Clock.maximum(clockArray);
        int maxHours = maxTime.getHours();
        int maxMinutes = maxTime.getMinutes();
        int maxSeconds = maxTime.getSeconds();

        System.out.println("The maximum number of hours, minutes, and seconds within the array is: ("+maxHours+":"+maxMinutes+":"+maxSeconds+")");

    }
}
