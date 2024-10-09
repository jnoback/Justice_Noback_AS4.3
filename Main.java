import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Justice Noback");
        
FullTimeJob ftJob = new
FullTimeJob("Google", "Software Engineer", LocalDate.of(2004, 8, 03), LocalDate.of(2023, 9, 14), 35, 40);

PartTimeJob ptJob = new
PartTimeJob("Dollar General", "Sales Associate", LocalDate.of(2020, 6, 1), LocalDate.of(2021, 12, 30), 20, 20);

ContractJob ctJob = new
ContractJob("Consulting LLC", "Consultant", LocalDate.of(2022, 3, 15), LocalDate.of(2022, 12, 31), 60, 160);

employee.addJob(ftJob);
employee.addJob(ptJob);
employee.addJob(ctJob);

employee.displayJobHistory();
    }
    
}
