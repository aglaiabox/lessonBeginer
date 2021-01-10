package ru.aglaiaLinkedList;

import ru.aglaia2.Animal;

public class Node<T> {
    T animal;
    Node<T> next;

    @Override
    public String toString() {
        return animal.toString();
    }
}
