package ru.job4j.queue;

import java.util.Objects;
import java.util.Queue;

public class AppleStore {

    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    private String getCustomer(int count) {
        for (int i = 0; i < queue.size(); i++) {
            if (i < count) {
                queue.poll();
            }
        }
        return Objects.requireNonNull(queue.peek()).name();
    }

    public String getLastHappyCustomer() {
        return getCustomer(count - 1);
    }

    public String getFirstUpsetCustomer() {
        return getCustomer(count);
    }
}
