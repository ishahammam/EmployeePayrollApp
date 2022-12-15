package app;

public class EmployeePayroll {

    private double weeklyGrossPayForHourlyEmployee;

    /* -------------------------- PAYROLL CALCULATION FOR HOURLY EMPLOYEE -------------------------- */
    public double weeklyGrossPayForHourlyEmployee(double totalWeeklyHours, double hourlyRate) {
        if (totalWeeklyHours > 40) {
            double overTimeHours = totalWeeklyHours - 40;
            weeklyGrossPayForHourlyEmployee = (40 * hourlyRate) + (overTimeHours * (hourlyRate * 1.5));
        } else {
            weeklyGrossPayForHourlyEmployee = totalWeeklyHours * hourlyRate;
        }
        return weeklyGrossPayForHourlyEmployee;
    }

    public double weeklyFederalTaxForHourlyEmployee() {
        double annualGrossPayForHourlyEmployee = weeklyGrossPayForHourlyEmployee * 52;
        double annualFederalTaxForHourlyEmployee = 0;
        double weeklyFederalTaxForHourlyEmployee;

        if (annualGrossPayForHourlyEmployee >= 0 && annualGrossPayForHourlyEmployee <= 12000) {
            annualFederalTaxForHourlyEmployee = 0;
        }

        if (annualGrossPayForHourlyEmployee > 12000 && annualGrossPayForHourlyEmployee <= 18000) {
            annualFederalTaxForHourlyEmployee = 0 + (annualGrossPayForHourlyEmployee - 12000) * 0.14;
        }

        // PLEASE COMPLETE OTHER RULES HERE...

        weeklyFederalTaxForHourlyEmployee = annualFederalTaxForHourlyEmployee / 52;

        return weeklyFederalTaxForHourlyEmployee;
    }

    /* -------------------------- PAYROLL CALCULATION FOR SALARIED EMPLOYEE -------------------------- */
    public void weeklyGrossPayForSalariedEmployee() {
        //
    }

}
