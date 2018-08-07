import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import com.anarsoft.vmlens.concurrent.junit.ThreadCount;
import controller.Dispatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Tests for the Dispatcher class
 *
 * @author : Daniel Vargas <dvago@hotmail.com>
 * @since 07-08-2018
 */
@RunWith(ConcurrentTestRunner.class)
public class DispatcherTests {

    private Dispatcher dispatcher;

    @Before
    public void initialCount() {
        dispatcher = new Dispatcher();
    }

    @Test
    @ThreadCount(10)
    public void dispatchTenCalls() {
        dispatcher.dispatchCall();
    }

    @After
    public void testCount() {
    }

}
