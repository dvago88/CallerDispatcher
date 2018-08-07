package data;

import model.Role;
import model.Status;
import model.Worker;

import java.util.Arrays;
import java.util.List;

/**
 * Repository class
 * This should be replace for a proper database.
 *
 * @author : Daniel Vargas <dvago@hotmail.com>
 * @since 07-08-2018
 */
public class Repository {
    private static final List<Worker> workers = Arrays.asList(
            new Worker(1, 1, 1),
            new Worker(2, 1, 1),
            new Worker(3, 1, 1),
            new Worker(4, 1, 1),
            new Worker(5, 1, 1),
            new Worker(6, 1, 1),
            new Worker(7, 2, 1),
            new Worker(8, 2, 1),
            new Worker(9, 2, 1),
            new Worker(10, 3, 1)
    );
    private static final List<Role> roles = Arrays.asList(
            new Role(1, "operator", "Operador"),
            new Role(2, "supervisor", "Supervisor"),
            new Role(3, "director", "Director")
    );

    private static final List<Status> status = Arrays.asList(
            new Status(1, "available", "Disponible"),
            new Status(2, "unavailable", "Ocupado")
    );

    public Repository() {
    }

    public static List<Worker> getWorkers() {
        return workers;
    }

    public static List<Role> getRoles() {
        return roles;
    }

    public static List<Status> getStatus() {
        return status;
    }
}
