package io.kaen.todo.service;

public class Todo {
    private String task;

    public Todo(){}

    public Todo(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

}
