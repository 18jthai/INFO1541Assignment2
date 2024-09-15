
import org.junit.jupiter.api.Test;
import EmployeeObjects.SalaryEmployee;

import static org.junit.jupiter.api.Assertions.*;



class SalaryEmployeeTest {

    @Test
    void calculatesSalaryEmployeeWeeklyPay() {
        var emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);

        assertEquals(1237.02, emp.calculateWeeklyPay());
    }

    @Test
    void calculatesSalaryEmployeeHolidayBonus() {
        var emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);

        assertEquals(2164.54, emp.holidayBonus());
    }
}
