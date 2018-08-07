package helper;


import model.Worker;

import java.util.Comparator;
/**
 * Helper class to comparate workes for the priority queue base
 * on the worker role.
 *
 * @author : Daniel Vargas <dvago@hotmail.com>
 * @since 07-08-2018
 */
public class WorkerComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker worker1, Worker worker2) {
        return worker1.getRoleId() - worker2.getRoleId();
    }
}
