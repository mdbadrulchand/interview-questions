package Java8Stream;

import Java8Stream.usingEmployee.Employee;
import Java8Stream.usingIntegerArrays.Java8StreamProgramUsingIntegerArray;
import Java8Stream.usingString.Java8StreamStringProgram;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Java8MainClass {
    public static void main(String[] args) {
        List<Employee> employeeList = getEmployeeList();

        Java8StreamStringProgram.getReverseStringBasedOnPosition();

        Java8StreamStringProgram.sortWord();

        Java8StreamStringProgram.groupStringBasedOnLength();

        Java8StreamStringProgram.groupStringAndPrintTop3();

        Java8StreamStringProgram.check();
        Java8StreamProgramUsingIntegerArray.reversedBasedOnGivenIndexPosition();

        /*A string consist of 3 comma separated parts -> range, character to find frequency , password
        If the frequency of the given character in the password is within the range (inclusive) , then it's a valid password.
        Otherwise it's not. 1-2,A,UYAMaaSA -> A is repeated twice and is within the range of 1-2 -> valid
        10-12,S,ALJLLSSMSS -> S is repeated 4 times and is outside the range of 10-12 -> invalid
        3-6,B,HBBKIBBBlibHi -> B is repeated 5 times and is within the range of 3-6 -> valid*/
        Java8StreamStringProgram.readPasswordAndValidateBasedOnCriteria();
    }


    private static List<Employee> getEmployeeList() {
        return Arrays.asList(
                new Employee(101, "Md", "Badrul", "M", "SDE", "Dev", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(102, "Khan", "Danish", "F", "ITE", "IT", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(103, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(104, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(105, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(106, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(107, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(108, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(109, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(110, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(111, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(112, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(113, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(114, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(115, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(116, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00),
                new Employee(117, "Md", "Badrul", "M", "Dev", "Development", LocalDate.of(2026, 2, 11), 100000.00)
        );
    }
}


