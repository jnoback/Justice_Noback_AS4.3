import java.time.LocalDate;

public class PartTimeJob extends Job {
    private double hourlyWage;
    private int hoursPerWeek;

    public PartTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double hourlyWage, int hoursPerWeek) {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }
    
    @Override
    public void displayJobDetails() {
        System.out.println("Part Time Job Details:");
        System.out.println("Company: " + companyName);
        System.out.println("Position: " + position);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Weekly Hours: " + hoursPerWeek);
        System.out.println("Job Duration: " + calculatingJobDuration() + " months");
    }

    public String assessJobSatisfaction() {
        return "Level of Job Satisfaction: High"; //Placeholder input
    }

    public double calculateSalary() {
        return hourlyWage * hoursPerWeek;
    }

    public String jobFlexibility() {
        return "Flexible hours available"; //Placeholder input
    }

}
