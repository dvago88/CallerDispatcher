import controller.Dispatcher;
import helper.SynchronizedCounter;

import java.util.Scanner;

/**
 * Java application which helps a call center to organize and dispatch its calls
 *
 * @author : Daniel Vargas <dvago@hotmail.com>
 * @version 1.0
 * @since 07-08-2018
 */
public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dispatcher dispatcher = new Dispatcher();
        int a;
        while (true) {
            //Replace the scanner for the event that triggers the call
            a = scanner.nextInt();
            if (SynchronizedCounter.get() <= 10) {
                SynchronizedCounter.addOne();
                Thread thread = new Thread(dispatcher::dispatchCall);
                thread.start();
            } else {
                System.out.println("Not enough threads");
            }
        }
    }
}
