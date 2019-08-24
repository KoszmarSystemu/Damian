package pl.sdaacademy.queue;

import java.util.Arrays;

public class ArrayQueue<T> implements Queue<T> {
    private Object[] elements;
    public ArrayQueue(){
        this.elements = new Object[0];
    }

    //add
    public void enqueue(T element) {


elements = Arrays.copyOf(elements, elements.length +1);
            elements[elements.length - 1] = element;

        }

        public int size() {
            return elements.length;
        }




    // Analogia metody add
    public T dequeue() {
        if (elements.length== 0){
        return null;
    }
    T element = (T) elements [0];
    elements = Arrays.copyOfRange(elements, 1,elements.length);
    return element;
}}