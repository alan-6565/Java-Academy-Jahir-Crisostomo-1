package com.pluralsight;

public class Hotel {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Dana Wyatt", "Front Desk", 20.0, 0);
        // Manual punch in/out
        emp1.punchIn(9.5);    // 9:30 AM
        emp1.punchOut(17.25); // 5:15 PM

        // Automatic punch in/out (uses current time)
        emp1.punchIn();
        try {
            Thread.sleep(3000); // wait 3 seconds to simulate working time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        emp1.punchOut();

        System.out.println("\nTotal hours worked: " + emp1.getHoursWorked());
        System.out.println("Total pay: $" + emp1.getTotalPay());

    }
}
