//import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DemoTest {
    @Test
    public void demo1() {
        assert 1 + 1 == 2;
    }

    @Test
    public void demo2() {
        assertThat(2, equalTo(2));
    }

    @Test
    public void demo3() {
        assertThat(2, equalTo(2));
    }
}