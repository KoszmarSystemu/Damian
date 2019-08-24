import pl.sdaacademy.queue.Link;
import pl.sdaacademy.queue.Queue;

public class LinkQueue<T> implements Queue<T> {
    private Link <T> head;

    public void setHead(Link<T> head) {
        this.head = head;
    }

    @Override
    public void enqueue(T element) {
        Link <T> newLink = new Link<>( element );
        if (head== null){
            head =  newLink;
        } else {
           Link<T> link= head;
           while ( link.getNext() != null){
               link = link.getNext();
           }
           link.setNext( newLink );

        }
    }

    @Override
    public T dequeue() {
        if (head == null){
        return null;
    }
        T element = head.getValue();
        head = head.getNext();
        return element;
}}
