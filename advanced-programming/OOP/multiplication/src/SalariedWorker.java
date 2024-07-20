public class SalariedWorker extends Worker{

    public SalariedWorker(int employeeNumber, String workerName, int salaryRate) {
        super(employeeNumber, workerName, salaryRate);
    }

    @Override
    public int comPay(int hours){
        if (hours >= 40){
            salary = salaryRate * hours;
        } else {
            System.out.println("Low Work hours");
            salary = hours * (salaryRate - 50);
        }
        return salary;
    }
}
