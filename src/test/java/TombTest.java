
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
}

    @Test
    public void testCalcTomb_8_30_40(){
        double actual = this.tomb.CalcTomb(8,30,40);
        double expected = 41.1;
        Assert.assertEquals(actual, expected,0.1);
    }
    