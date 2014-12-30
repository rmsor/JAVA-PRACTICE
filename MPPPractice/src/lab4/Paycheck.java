package lab4;

/**
 *
 * @author rmsor_000
 */
final class Paycheck {
    private double grossPay;
    private double fica,state,local,medicare,socialSecurity;
    private String payPeriod;
    private Employee emp;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity, String payPeriod,Employee emp) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
        this.payPeriod = payPeriod;
        this.emp=emp;
    }

    public double getFica() {
        return fica;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public double getState() {
        return state;
    }
    
    public void print(){
        System.out.println("\t-----------------Pay Check Details ----------------------");
        System.out.println("\tGross Salary:"+grossPay);
        System.out.println("\tPay Period:"+payPeriod);
        System.out.println("\tFICA: "+fica);
        System.out.println("\tState :"+state);
        System.out.println("\tLocal: "+local);
        System.out.println("\tMedicare: "+medicare);
        System.out.println("\tSocialSecurity: "+socialSecurity);
        System.out.println("\tNet Salary: "+getNetPay());
    }
    public double getNetPay(){
      return grossPay+fica+state+local+medicare+socialSecurity;
    }
}
