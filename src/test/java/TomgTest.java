import org.testng.annotations.BeforeTest;

public class TomgTest {
    Tomb tomb;
    @BeforeTest
public void setUp(){
    this.tomb = new Tomb();
}
}
