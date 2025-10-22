package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

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

    public double getTotalPay(){
        return Math.min(40, hoursWorked);
    }

    public double getRegularHours(){

        return Math.max(0, hoursWorked - 40);
    }

    public double getOvertimeHours(){

        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }

    public void punchIn(double time){
        System.out.println("punched in at " + time + " o'clock");
        startTime = time;
    }

    public void punchOut(double time){
        double hoursWorked = time - startTime;
        System.out.println("You clocked out at " + time + " o'Clock");
        System.out.println("total hours worked " + hoursWorked;
    }
}
