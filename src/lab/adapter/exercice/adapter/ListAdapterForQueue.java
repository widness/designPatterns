package lab.adapter.exercice.adapter;

import lab.adapter.exercice.interfaces.MyQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab 8
 *
 * @author egs
 */
public class ListAdapterForQueue<E> implements MyQueue<E> {

    List<E> data;

    public ListAdapterForQueue(List<E> data) {
        this.data = data;
    }

    public ListAdapterForQueue() {
        this(new ArrayList<E>());
    }

    @Override
    public E deQueue() {
        return data.remove(0);
    }

    @Override
    public void enQueue(E element) {
        data.add(element);
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
