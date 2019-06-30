public class HospitalEmployee {
    private String empName;
    private int empNumber;
    private double hoursWorked;
    private double payRate;

    public HospitalEmployee() {
        empName = "Adam Carpenter";
        empNumber = 9999;
        hoursWorked = 0;
        payRate = 0;
    }


    public String getEmpName() {
        return empName; 
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }


    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }


    public double calculateGrossPay() {
        return (hoursWorked * payRate);
    }

    public double calculateBonus(String rating) {
        /*if (String.toLowerCase(rating).equals("excellent")) {
            return 500;
        } else if (String.toLowerCase(rating).equals("satisfactory")) {
            return 300;
        } else {
            return 0;
        }*/
        return 1;
    }

    public void changeHoursWorked(double hours) {
        hoursWorked += hours;
    }

    public void changePayRate(double amount) {
        payRate += amount;
    }


    public String toString() {
        return "TEst";
    }

}