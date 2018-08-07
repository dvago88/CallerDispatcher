package controller;

import helper.SynchronizedCounter;
import model.Worker;
import service.WorkerService;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * Class which handles de incoming calls
 *
 * @author : Daniel Vargas <dvago@hotmail.com>
 * @since 07-08-2018
 */
public class Dispatcher {

    private static PriorityBlockingQueue<Worker> workers;
    private WorkerService workerService;

    public Dispatcher() {
        workerService = new WorkerService();
        workers = workerService.getQueueOfWorkers();
    }

    /**
     * This method polls a worker from the priority queue
     * checks if it's available, proceeds with the call
     * and when the call is finished it returns the worker
     * to the queue
     */
    public void dispatchCall() {
        Worker worker = workers.poll();
        if (worker != null && worker.getStatusId() == 1) {
            worker.setStatusId(2);
            workerService.mockCall(worker);
            worker.setStatusId(1);
            workers.add(worker);
            SynchronizedCounter.removeOne();
            return;
        }
        SynchronizedCounter.removeOne();
        System.out.println("No hay nadie disponible para atender la llamada");
    }
}
