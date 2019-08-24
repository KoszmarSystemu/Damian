package pl.sdaacademy.queue;

public class Link<T> {
    private T value;

    public Link(T value) {
        this.value = value;
    }

    public Link<T> getNext() {
        return next;
    }

    private Link<T> next;

    public void setNext(Link<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }
}