import org.junit.jupiter.api.Test;
import EmployeeObjects.HourlyEmployee;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {

    @Test
    void hoursShouldIncreaseByInput() {
        var emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(4);
        emp.increaseHours(7);
        emp.increaseHours(-3);

        assertEquals(12, emp.getHoursWorked());
        //System.out.print(emp.getHoursWorked());
    }

    @Test
    void annualRaiseIncreasesWageByFivePercent() {
        var emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.annualRaise();
        assertEquals(34.49, emp.getWage());
    }

    @Test
    void calculatesEmployeesWeeklyPayIncludingOverTime() {
        var emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(35);
        assertEquals(1149.75, emp.calculateWeeklyPay());
        emp.increaseHours(10); // Increases hoursWorked to 45 for overtime check
        assertEquals(1560.38, emp.calculateWeeklyPay()); // Round to nearest 2nd decimal place
    }

}
