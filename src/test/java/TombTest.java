
import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Tomb;

public class TombTest {
    Tomb tomb;

    @BeforeTest
public void setUp(){
    this.tomb = new Tomb();
}


    @Test
    public void testCalcTomb_8_30(){
        double actual = this.tomb.CalcTombTer(8,30);
        double expected = 32;
        Assert.assertEquals(actual, expected,0.1);

        double Kactual = this.tomb.CalcTombKer(8,30);
        double Kexpected = 32;
        Assert.assertEquals(Kactual, Kexpected,0.1);
    }
    @Test
    public void testCalcTomb_6_40(){
        double actual = this.tomb.CalcTombTer(6,40);
        double expected = 23.1;
        Assert.assertEquals(actual, expected,0.1);

        double Kactual = this.tomb.CalcTombKer(6,40);
        double Kexpected = 24;
        Assert.assertEquals(Kactual, Kexpected,0.1);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcTomb_Zero_Side(){
        this.tomb.CalcTombKer(0, 1);
        this.tomb.CalcTombTer(0, 1);

    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcRadius_Side_Zero(){
        this.tomb.CalcTombKer(1, 0);
        this.tomb.CalcTombTer(1, 0);

    }
}