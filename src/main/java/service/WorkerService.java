package service;

import data.Repository;
import helper.WorkerComparator;
import model.Worker;

import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Service class
 *
 * @author : Daniel Vargas <dvago@hotmail.com>
 * @since 07-08-2018
 */
public class WorkerService {

    /**
     * This method call the repository and add all the
     * available workers to a priority queue
     * @return PriorityQueue This returns a queue of workers
     */
    public PriorityBlockingQueue<Worker> getQueueOfWorkers() {
        PriorityBlockingQueue<Worker> workers = new PriorityBlockingQueue<>(11, new WorkerComparator());
        workers.addAll(Repository.getWorkers());
        return workers;
    }

    /**
     * This method mocks a call ranging from 5 to 10 seconds
     * @param worker This is the worker receiving th call
     */
    public void mockCall(Worker worker) {
        System.out.println("Contestó el trabajador con id: " + worker.getId() + " y roleId: " + worker.getRoleId());
        int time = getRandomNumberInRange(5, 10);
        try {
            Thread.sleep(1000 * time);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        worker.addOneToNumberOfCalls();
        System.out.println("Terminó la llamada del trabajador con id: " + worker.getId() + " y roleId: " + worker.getRoleId());
    }

    /**
     * This method generates a random int
     * @param min This is the initial value for the range
     * @param max This is the final value for the range
     * @return int Random intenger between min and max
     */
    private static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
