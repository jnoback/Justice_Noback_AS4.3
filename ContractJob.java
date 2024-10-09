import java.time.LocalDate;

public class ContractJob extends Job {
    private double hourlyRate;
    private int hoursWorked;

    public ContractJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double hourlyRate, int hoursWorked) {
        super(companyName, position, startDate, endDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public void displayJobDetails() {
        System.out.println("Contract Job Details:");
        System.out.println("Company: " + companyName);
        System.out.println("Position: " + position);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Total Hours Worked: " + hoursWorked);
        System.out.println("Job Duration: " + calculatingJobDuration() + " months");
    }     
    
    public String assessJobSatisfaction() {
        return "Job Satisfaction: Variable"; //Placeholder input
    }

    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }

    public String evaluateJobSecurity() {
        return "Medium"; //Placeholder input
    }
}
