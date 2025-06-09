package Bai11_ArrayList.my_array_list;

import java.util.ArrayList;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            throw new  IllegalArgumentException("Your input capacity is invalid");
        }
    }

    public void add(int index, E element) {
        Object[] tempArray;
        if (index >= 0 && index < elements.length) {
            if (size == elements.length) {
                tempArray = new Object[elements.length * 2];
                for (int i = 0; i < elements.length; i++) {
                    if (i < index) {
                        tempArray[i] = elements[i];
                    } else if (i == index){
                        tempArray[i] = element;
                    } else {
                        tempArray[i+1] = elements[i];
                    }
                }
                elements = tempArray;
                size++;
            } else {
                for (int i = size - 1; i >= index; i--) {
                    elements[i] = elements[i-1];
                }
                elements[index] = element;
                size++;
            }
        }
    }

    public E remove(int index) {
        Object element = elements[index];
        if (index >= 0 && index < size ) {
            for (int i = index+1; i < size; i++) {
                elements[i-1] = elements[i];
            }
            size--;
        } else {
            throw new IndexOutOfBoundsException("Index is invalid");
        }
        return (E)element;
    }

    public int size() {
        return this.size;
    }

    public MyArrayList<E> clone() {
        MyArrayList<E> newArray = new MyArrayList<>(elements.length);
        for (int i = 0; i < this.elements.length; i++) {
            newArray.add((E)elements[i]);
        }
        return newArray;
    }

    public boolean contains(E element) {
        boolean check = false;
        for (int i = 0; i < elements.length; i++) {
            if (element.equals(elements[i])) {
                check = true;
            }
        }
        return check;
    }

    public boolean add(E element) {
        add(size, element);
        return true;
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return (E) elements[index];
        } else {
            throw new IndexOutOfBoundsException(index + " is out of size " + size);
        }
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
