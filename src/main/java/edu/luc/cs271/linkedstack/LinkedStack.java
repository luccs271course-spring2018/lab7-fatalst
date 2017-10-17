package edu.luc.cs271.linkedstack;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  private int n = 0;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // DONE
    top = new Node<E>(obj, top);
    n++;
    return obj;
  }

  @Override
  public E peek() {
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    return top.data;
  }

  @Override
  public E pop() {
    // DONE
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    Node<E> newTop = top;
    top = top.next;
    n--;
    return newTop.data;
  }

  @Override
  public boolean isEmpty() {
    // DONE
    if (top == null) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public List<E> asList() {
    // DONE implement using an ArrayList preallocated with the right size
    // DONE add any instance variable(s) required to support this
    List<E> list = new ArrayList<E>(n);
    while (top != null) {
      list.add(top.data);
      top = top.next;
    }

    return list;
  }
}
