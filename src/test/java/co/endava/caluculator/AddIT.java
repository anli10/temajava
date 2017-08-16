package co.endava.caluculator;

import com.endava.calculator.BasicCalculator;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class AddIT {
    private BasicCalculator calc;
    @BeforeTest()
    public void initBasicCalc()
    {
        calc = new BasicCalculator();
        System.out.println("AssertJ");
    }

    @Test
    public void addLongTest(){
        assertThat(calc.add(2,3)).isEqualTo(5L);
        assertThat(calc.add(0,0)).isZero();
        assertThat(calc.add(1,0)).isNotZero();
        assertThat(calc.add(-5,6)).isNotNegative();
    }
    @Test
    public void addDoubleTest(){

        assertThat(calc.add(4.3,5.7)).isBetween(1.0,11.0);
        assertThat(calc.add(1.4,4.7)).isGreaterThan(5.0);
        assertThat(calc.add(4.2,3.1)).isNotSameAs(calc.add(3,4));
    }

}
