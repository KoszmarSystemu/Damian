package pl.sdaacademy;

import pl.sdaacademy.queue.ArrayQueue;
import pl.sdaacademy.queue.Queue;

public class datastructures {
    public static void main(String[] args) {
        Queue<String> stringQueue = new ArrayQueue<>();
        stringQueue.enqueue( "Darek" );
        stringQueue.enqueue(  "Stefan");
        stringQueue.enqueue( "Jolanta" );
        stringQueue.enqueue( "Anna" );
        stringQueue.enqueue("Zenon"  );

        System.out.println(stringQueue.dequeue());
        System.out.println(stringQueue.dequeue());
        System.out.println(stringQueue.dequeue());
        System.out.println(stringQueue.dequeue());
        System.out.println(stringQueue.dequeue());
        System.out.println(stringQueue.dequeue());


        ArrayQueue array = new  ArrayQueue();

}}
