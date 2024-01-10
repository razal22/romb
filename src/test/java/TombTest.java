
import org.testng.annotations.BeforeTest;
import com.Tomb;

public class TombTest {
    Tomb tomb;

    @BeforeTest
public void setUp(){
    this.tomb = new Tomb();
}
}
