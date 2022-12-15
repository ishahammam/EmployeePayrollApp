package app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AppEmployeePayroll {
    public static void main(String[] args) {

        char enterNewRecord = 'y';

        // Data Collection and Validation
        do {
            // Required Variables
            String employeeName;
            char payType;
            double totalWeeklyHours;
            double hourlyRate;
            double weeklyGrossPayForHourlyEmployee;
            double weeklyFederalTaxForHourlyEmployee;
            double weeklyNetPayForHourlyEmployee;

            // Required Objects Creation
            Scanner scanner = new Scanner(System.in);
            EmployeePayroll payroll = new EmployeePayroll();
            DecimalFormat decimalFormat = new DecimalFormat("###.##");

            System.out.print("Enter employee name: ");
            employeeName = scanner.nextLine();

            while (true) {
                System.out.print("Enter employee pay type ('h' for hourly, 's' for salary): ");
                payType = scanner.next().charAt(0);
                if (payType == 'h' || payType == 'H' || payType == 's' || payType == 'S') {
                    break;
                } else {
                    System.out.println("\t\tInvalid payroll type");
                }
            }

            // Data Collection for Hourly Employee
            if (payType == 'h' || payType == 'H') {
                while (true) {
                    System.out.print("Enter number of hours worked during week: ");
                    totalWeeklyHours = scanner.nextInt();
                    if (totalWeeklyHours >= 0 && totalWeeklyHours <= 60) {
                        break;
                    } else {
                        System.out.println("\t\tInvalid number of hours worked during week");
                    }
                }

                while (true) {
                    System.out.print("Enter hourly rate: ");
                    hourlyRate = scanner.nextDouble();
                    if (hourlyRate >= 5.15 && hourlyRate <= 25) {
                        weeklyGrossPayForHourlyEmployee = payroll.weeklyGrossPayForHourlyEmployee(totalWeeklyHours, hourlyRate);
                        weeklyFederalTaxForHourlyEmployee = payroll.weeklyFederalTaxForHourlyEmployee();
                        weeklyNetPayForHourlyEmployee = weeklyGrossPayForHourlyEmployee - weeklyFederalTaxForHourlyEmployee;
                        break;
                    } else {
                        System.out.println("\t\tInvalid hourly rate");
                    }
                }

                // Information Display
                System.out.println("\nWeekly payroll information for " + employeeName);
                System.out.println("Gross Pay\t$" + decimalFormat.format(weeklyGrossPayForHourlyEmployee));
                System.out.println("Federal Tax\t$" + decimalFormat.format(weeklyFederalTaxForHourlyEmployee));
                System.out.println("Net Pay\t\t$" + decimalFormat.format(weeklyNetPayForHourlyEmployee));
                System.out.print("\nDo you wish to proceed another employee (Y/N): ");
                enterNewRecord = scanner.next().charAt(0);
                System.out.println();
            }

            // Data Collection for Salaried Employee
            if (payType == 's' || payType == 'S') {
                /*
                 *
                 *  PLEASE COMPLETE THE LOGICAL BLOCK HERE...
                 *
                 * */

                // Information Display
                System.out.println("\nWeekly payroll information for " + employeeName);
                System.out.println("Gross Pay\t$");
                System.out.println("Federal Tax\t$");
                System.out.println("Net Pay\t\t$");
                System.out.print("\nDo you wish to proceed another employee (Y/N): ");
                enterNewRecord = scanner.next().charAt(0);
                System.out.println();
            }

        } while (enterNewRecord == 'y' || enterNewRecord == 'Y');
    }
}
