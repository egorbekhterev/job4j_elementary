package ru.job4j.queue.schedule;

public record Task(Position position, String description, int urgency) {
}
