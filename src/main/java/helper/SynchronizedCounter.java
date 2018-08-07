package helper;
/**
 * Class which limits the number of threads created for the incoming calls
 *
 * @author : Daniel Vargas <dvago@hotmail.com>
 * @since 07-08-2018
 */
public class SynchronizedCounter {

    private static int i = 1;

    public synchronized static void addOne() {
        i++;
    }

    public synchronized static void removeOne() {
        i--;
    }

    public synchronized static int get() {
        return i;
    }
}
