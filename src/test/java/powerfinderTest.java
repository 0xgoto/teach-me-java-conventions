import org.junit.*;

import powerpackage.PowerFinder;

public class PowerFinderTest {
    @Test
    public void one_power_one_is_one() {
        assert PowerFinder.calculation(1,1) == 1;
    }

    @Test
    public void two_power_one_is_two() {
        assert PowerFinder.calculation(2,1) == 2;
    }

    @Test
    public void two_power_two_is_four() {
        assert PowerFinder.calculation(2, 2) == 4;
    }

    @Test
    public void three_power_two_is_six() {
        assert PowerFinder.calculation(3, 2) == 9;
    }
}
