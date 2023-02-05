package Lesson4.Lesson4_5;

import java.util.LinkedList;
import java.util.List;

public class Clock {

    private double hour;

    public Clock(double hour) {
        this.hour = hour;
    }

    public double getHourAddMinute() {
        return hour+0.01d;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                '}';
    }

    public static void main(String[] args) {
        List<Clock> clockList = new LinkedList<>();
        clockList.add(new Clock(12));
        clockList.add(new Clock(12));
        clockList.add(new Clock(12));
        clockList.add(new Clock(12));
        clockList.add(new Clock(12));



        System.out.println(clockList);
        List<Double> clockListPlusMinute = new LinkedList<>();
        for (int i = 0; i < clockList.size(); i++) {
            clockListPlusMinute.add(clockList.get(i).getHourAddMinute());
        }
        System.out.println("Clock" + clockListPlusMinute);
    }
}
