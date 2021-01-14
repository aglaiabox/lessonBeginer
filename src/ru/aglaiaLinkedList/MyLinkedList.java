package ru.aglaiaLinkedList;

import ru.aglaia2Animals.Animal;

public class MyLinkedList<T> {
    Node<T> first;
    int size = 0;

    public void add(T animal){
        Node<T> newNode = new Node<>();
        newNode.animal = animal;
        if (size == 0) {
            this.first = newNode;
            size++;
        }
        else {
            Node<T> last = getNote(size);
            last.next = newNode;
            size++;
        }
    }

    public Node<T> getNote(int n){
        Node<T> node = first;
        for (int i = 1; i < n; i++) {
            node = node.next;
        }
        return node;
    }

    public T get(int n){
        Node<T> node = first;
        for (int i = 1; i < n; i++) {
            node = node.next;
        }
        return node.animal;
    }

    public void delete (int n){
        Node nodeForDelite = getNote(n);
        Node node = first;
        if (n==1){
            first = node.next;
            size--;
        }
        else if (n>1 & n<size){
            for (int i = 1; i < size; i++) {
                Node nodeNext = node.next;
                if (nodeNext.animal == nodeForDelite.animal) {
                    node.next = nodeForDelite.next;
                }
            }
            size--;
        }
        else {
            System.out.println("Element with this number does not exist");
        }


    }

    public void delete (Animal animal){
        Node nodeForDelite = new Node();
        nodeForDelite.animal = animal;
        Node node = first;
        if (nodeForDelite.animal == first.animal){
            first = node.next;
        }
        else {
            for (int i = 1; i < size; i++) {
                Node nodeNext = node.next;
                if (nodeNext.animal == nodeForDelite.animal) {
                    node.next = nodeForDelite.next;
                }
            }
        }
        size--;

    }

    @Override
    public String toString() {
        Node node = first;
        String list = "Список: " + node + ", ";

        for (int i = 1; i < size; i++) {
            node = node.next;
            list = list + node + ", ";
        }
        return list;
    }
}
