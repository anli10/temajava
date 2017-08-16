package co.endava.caluculator;
import com.endava.calculator.ExpertCalculator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Vector;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FactTest {

    private ExpertCalculator calc;
    @BeforeTest()
    public void initBasicCalc()
    {
         calc=new ExpertCalculator();

        System.out.println("Hamcrest");
    }

    @Test
    public void factorial(){
        assertThat(calc.fact(5),is(120));
        assertThat(calc.fact(3),equalTo(6));
        assertThat(calc.fact(4),greaterThanOrEqualTo(24));
        Vector <Integer> v=new Vector<Integer>();
        v.add(calc.fact(5));
        v.add(calc.fact(2));
        v.add(calc.fact(3));
        assertThat(v,hasSize(3));
        assertThat(v,hasItem(120));
        assertThat(calc.fact(4),notNullValue());

    }
}
