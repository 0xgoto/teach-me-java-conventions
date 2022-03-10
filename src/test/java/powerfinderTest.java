import org.junit.*;

import powerpackage.powerfinder;

public class powerfinderTest {
    @Test
    public void one_power_one_is_one() {
        assert powerfinder.calculation(1,1) == 1;
    }

    @Test
    public void two_power_is_two() {
        assert powerfinder.calculation(2,1) == 2;
    }

    @Test
    public void two_power_two_is_four() {
        assert powerfinder.calculation(2, 2) == 4;
    }

    @Test
    public void three_power_two_is_six() {
        assert powerfinder.calculation(3, 2) == 9;
    }
}
