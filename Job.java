import java.time.LocalDate;
import java.time.Period;

public abstract class Job {
    protected String companyName;
    protected String position;
    protected LocalDate startDate;
    protected LocalDate endDate;

    public Job(String companyName, String position, LocalDate startDate, LocalDate endDate) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPosition() {
        return position;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public abstract void displayJobDetails();

    public abstract String assessJobSatisfaction();

    public int calculatingJobDuration() {
        Period period = Period.between(startDate, endDate);
        return period.getYears() * 12 + period.getMonths();
    }

}


