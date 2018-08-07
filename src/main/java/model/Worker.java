package model;

/**
 * Small class to store workers (operators, supervisors, directors)
 *
 * @author : Daniel Vargas <dvago@hotmail.com>
 * @since 07-08-2018
 */
public class Worker {
    private int id;
    private int roleId;
    private int statusId;
    private int numberOfCallsAnswered;

    public Worker(int id, int roleId, int statusId) {
        this.id = id;
        this.roleId = roleId;
        this.statusId = statusId;
        numberOfCallsAnswered = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getNumberOfCallsAnswered() {
        return numberOfCallsAnswered;
    }

    public void addOneToNumberOfCalls() {
        numberOfCallsAnswered++;
    }

}
