import org.junit.*;

import static org.assertj.core.api.Assertions.*;
import powerpackage.powerfinder;

public class powerfinderTest {
    @Test
    public void one_raised_to_one_is_onew() {
        assert powerfinder.calculation(1,1) == 1;
    }

    @Test
    public void twoRaised_to_one_is_2() {
        assert powerfinder.calculation(2,1) == 2;
    }

    @Test
    public void two_power_2_is_4() {
        assert powerfinder.calculation(2, 2) == 4;
    }

    @Test
    public void power_calculation_2_and_3_Is_SIX() {
        assert powerfinder.calculation(3, 2) == 3*3;
    }
}
