package solid;

import solid.open.closed.problems.AIInterviewQuestion;
import solid.open.closed.problems.InterviewQuestionProcessor;
import solid.open.closed.solutions.SolutionInterviewQuestionProcessor;
import solid.single.responsibility.problems.Employee;
import solid.single.responsibility.solutions.EmployeeReport;
import solid.single.responsibility.solutions.EmployeeRepository;

public class SolidPrincipleApp {
    public static void main(String[] args) {

        // This the example with problem and
        InterviewQuestionProcessor.process(new AIInterviewQuestion());// Problem
        // Solution
        SolutionInterviewQuestionProcessor.process(new solid.open.closed.solutions.FinanceInterviewQuestion());

        // Problem it is violating single responsibility principle.
        Employee employee = new Employee("Badrul", "IT");
        employee.generateReport();
        employee.saveData();

        //Solution
        Employee employee1 = new Employee("Danish","Dev");
        EmployeeReport employeeReport = new EmployeeReport();
        employeeReport.generateReport();
        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.saveData();

    }
}
