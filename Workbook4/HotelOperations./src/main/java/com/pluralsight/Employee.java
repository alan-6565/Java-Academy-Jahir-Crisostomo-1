package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private static String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private static double startTime;
    private static boolean isWorking;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() { return Math.min(40, hoursWorked); }
    public double getOvertimeHours() { return Math.max(0, hoursWorked - 40); }
    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }

    private static double convertToDecimalTime(LocalDateTime time) {
        int hour = time.getHour();      // 0–23
        int minute = time.getMinute();  // 0–59
        return hour + (minute / 60.0);  // e.g., 14:30 = 14.5
    }

    private static String formatTime(double time24) {
        int hours = (int) time24;
        double minutesDecimal = time24 - hours;
        int minutes = (int) (minutesDecimal * 60);
        String amPm = (hours >= 12) ? "PM" : "AM";

        if (hours == 0) hours = 12;
        else if (hours > 12) hours -= 12;

        return String.format("%d:%02d %s", hours, minutes, amPm);
    }

    public static void punchIn(double time) {
        if (isWorking) {
            System.out.println("⚠️ " + name + " has already punched in.");
        } else {
            startTime = time;
            isWorking = true;
            System.out.println(name + " punched in at " + formatTime(time));
        }
    }

    // 2️⃣ punchIn() — automatic
    public static void punchIn() {
        if (isWorking) {
            System.out.println("⚠️ " + name + " has already punched in.");
        } else {
            LocalDateTime now = LocalDateTime.now();
            startTime = convertToDecimalTime(now);
            isWorking = true;
            System.out.println(name + " punched in automatically at " + formatTime(startTime));
        }
    }

    // 3️⃣ punchOut(double)
    public void punchOut(double time) {
        if (!isWorking) {
            System.out.println("⚠️ " + name + " cannot punch out — not clocked in.");
        } else if (time < startTime) {
            System.out.println("⚠️ Invalid time — punch out cannot be earlier than punch in!");
        } else {
            double hoursThisShift = time - startTime;
            hoursWorked += hoursThisShift;
            isWorking = false;

            System.out.printf("%s punched out at %s. Hours worked this shift: %.2f%n",
                    name, formatTime(time), hoursThisShift);
        }
    }

    // 4️⃣ punchOut() — automatic
    public void punchOut() {
        if (!isWorking) {
            System.out.println("⚠️ " + name + " cannot punch out — not clocked in.");
        } else {
            LocalDateTime now = LocalDateTime.now();
            double currentTime = convertToDecimalTime(now);

            double hoursThisShift = currentTime - startTime;
            if (hoursThisShift < 0) hoursThisShift += 24; // handle past midnight

            hoursWorked += hoursThisShift;
            isWorking = false;

            System.out.printf("%s punched out automatically at %s. Hours worked this shift: %.2f%n",
                    name, formatTime(currentTime), hoursThisShift);
        }
    }
}

