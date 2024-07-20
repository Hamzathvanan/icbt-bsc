public class DailyWorker extends Worker{

    public DailyWorker(int employeeNumber, String workerName, int salaryRate) {
        super(employeeNumber, workerName, salaryRate);
    }

    @Override
    public int comPay(int days){
        salary = salaryRate * days;
        return salary;
    }
}
