/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */

import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {

    /*THE PLAN

    1. Inputs: hourly rate, hours worked, sales commission percent, total sales of sales person
    2. calculate: Total money earned a day
    3. calculate commission
    3. Calculate total earnings:
    4.display results

     */

    public static void main(String[] args) {
        double hourlyRate =  input("What is the hourly rate? ");
        double hoursWorked=  input("How many hours did you work? ");
        double salesCommission =  input("What is your commission percent? ");
        double totalSales =  input("What were your total sales? ");

        double weeklyMoney = weeklyMoney(hourlyRate, hoursWorked);
        double commission = commission(totalSales, salesCommission);
        double totalEarning = totalEarning(weeklyMoney,commission);

        output(totalEarning);

    }
    public static double input (String prompt){

        return Double.parseDouble(JOptionPane.showInputDialog(prompt));

    }
    public static double weeklyMoney(double hourlyRate, double hoursWorked){

        return hourlyRate * hoursWorked;

    }
    public static double commission (double totalSales, double salesCommission){

        return totalSales * salesCommission/100.0;

    }
    public static double totalEarning(double weeklyMoney, double commission){

        return weeklyMoney + commission;

    }
    public static void output(double totalEarning){

        DecimalFormat round = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null, "Your total earning is: " + round.format(totalEarning));

    }


}
