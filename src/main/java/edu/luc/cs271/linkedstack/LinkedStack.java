package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
  private int n = 0;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO
    Node<E> old = top;
    top = new Node<E>();
    top.data = data;
    top.next = old;
    n++;
  }

  @Override
  public E peek() {
    // TODO
    if (isEmpty()) {
      throw new NoSuchElementException("Stack underflow");
    }
    return top.item;
  }

  @Override
  public E pop() {
    // TODO
    if (isEmpty()) { 
      throw new NoSuchElementException("Stack underflow");
    }
    Item item = top.item;
    top = top.next;
    n--;
    return item;
  }

  @Override
  public boolean isEmpty() {
    // TODO
    return top == null;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    // TODO add any instance variable(s) required to support this
    ArrayList<E> list = new ArrayList<E>(n);
    
    return null;
  }
}
