package ru.job4j.queue.schedule;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: Egor Bekhterev
 * @date: 03.03.2023
 * @project: job4j_elementary
 */
public class ScheduleTask {

    private final PriorityQueue<Task> queue;

    public ScheduleTask(Comparator<Task> comparator) {
        this.queue = new PriorityQueue<>(comparator);
    }

    public void addTask(Task task) {
        queue.offer(task);
    }

    public Task readTask() {
        return queue.peek();
    }

    public Task getTask() {
        return queue.poll();
    }
}
