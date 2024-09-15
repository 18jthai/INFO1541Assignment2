
import EmployeeObjects.SalaryEmployee;
import org.junit.jupiter.api.Test;
import EmployeeObjects.CommissionEmployee;

import static org.junit.jupiter.api.Assertions.*;


public class CommissionEmployeeTest {

    @Test
    void calculatesSalaryEmployeeWeeklyPay() {
        var emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

        emp.increaseSales(-5);
        emp.increaseSales(16);
        emp.increaseSales(-7);
        emp.increaseSales(8);

        assertEquals(24, emp.getSales());

    }

    @Test
    void returnsZeroSinceCommissionEmployeesDoNotGetHolidayBonuses() {
        var emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

        assertEquals(0, emp.holidayBonus());

    }

    @Test
    void callsAnnualRaiseTwiceToChangeRate() {
        var emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

        emp.annualRaise();
        emp.annualRaise();

        assertEquals(.0305, emp.getRate());

    }
}
