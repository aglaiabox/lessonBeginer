package ru.aglaiaLinkedList;

public class Node<T> {
    T animal;
    Node<T> next;

    @Override
    public String toString() {
        return animal.toString();
    }
}
