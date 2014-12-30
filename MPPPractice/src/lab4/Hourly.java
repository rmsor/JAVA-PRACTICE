package lab4;

/**
 *
 * @author rmsor_000
 */
class Hourly extends Employee{
    private double hourlyWage;
    private double hoursPerWeek;

    public Hourly(double hourlyWage, double hoursPerWeek) {
        super("HOUR");
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }
 
    public double getHourlyWage() {
        return hourlyWage;
    }


    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    
    public double calcGrossPay(DateRange dr){
        return hourlyWage*hoursPerWeek*4;
    }
}
