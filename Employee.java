import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Job> jobHistory;

    public Employee(String name) {
        this.name = name;
        this.jobHistory = new ArrayList();
    }


    public void addJob(Job job) {
        jobHistory.add(job);
    }

    public void displayJobHistory() {
        System.out.println("Job History for " + name + ": ");
        for (Job job : jobHistory) {
            job.displayJobDetails();

            System.out.println(job.assessJobSatisfaction());

        }
    }
}