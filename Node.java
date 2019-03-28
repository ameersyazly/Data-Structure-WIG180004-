/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author WIG180004
 */
public class Node<E> {
    public E element;
    public Node<E> next;
    
    public Node(E o){
        element = o;
        next = null;
    }
}
