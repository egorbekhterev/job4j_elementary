package ru.job4j.queue;

import java.util.Deque;

/**
 * @author: Egor Bekhterev
 * @date: 03.03.2023
 * @project: job4j_elementary
 */
public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder stringBuilder = new StringBuilder();
        var size = evenElements.size();
        for (int i = 0; i < size; i += 2) {
            stringBuilder.append(evenElements.poll());
            evenElements.poll();
        }
        return stringBuilder.toString();
    }

    private String getDescendingElements() {
        StringBuilder stringBuilder = new StringBuilder();
        var size = descendingElements.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(descendingElements.pollLast());
        }
        return stringBuilder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
