package app;

public class EmployeePayroll {
    public double weeklyGrossPayForHourlyEmployee(double totalWeeklyHours, double hourlyRate) {
        double weeklyGrossPay;
        if (totalWeeklyHours > 40) {
            double overTimeHours = totalWeeklyHours - 40;
            weeklyGrossPay = (40 * hourlyRate) + (overTimeHours * (hourlyRate * 1.5));
        } else {
            weeklyGrossPay = totalWeeklyHours * hourlyRate;
        }
        return weeklyGrossPay;
    }

    public void weeklyGrossPayForSalariedEmployee() {
        //
    }

    public void weeklyFederalTax() {
        //
    }
}
