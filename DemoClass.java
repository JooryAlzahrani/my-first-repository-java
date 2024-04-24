

import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DemoClass {
    public static void main(String[] args) {

            System.out.print("Enter the time since midnight in seconds: ");
            Scanner scanner = new Scanner(System.in);
            int timeSinceMidnight = scanner.nextInt();

            Clock firstClock = new Clock(timeSinceMidnight);
            firstClock.ClockInfo();

            System.out.println("Enter three digits representing time, in hours, minutes, and      seconds: ");

            System.out.println("Hours: ");
            int hours = scanner.nextInt();

            System.out.println("Minutes: ");
            int minutes = scanner.nextInt();

            System.out.println("Seconds: ");
            int seconds = scanner.nextInt();


            Clock secondClock = new Clock(hours, minutes, seconds);
            secondClock.ClockInfo();
            System.out.println(Clock.isEqual(firstClock, secondClock));

        }
}