package ru.job4j.queue.schedule;

import java.util.Comparator;

/**
 * @author: Egor Bekhterev
 * @date: 03.03.2023
 * @project: job4j_elementary
 */
public class TaskByUrgencyDesc implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        return Integer.compare(o2.urgency(), o1.urgency());
    }
}
