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
public class TestLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MyLinkedList<Character> linkedList = new MyLinkedList<>();
        linkedList.add('a');
        linkedList.add('b');
        linkedList.add('c');
        linkedList.add('d');
        linkedList.add('e');
        
        linkedList.print();
        linkedList.reverse();
        
        System.out.println("Number Of Elements : " + linkedList.size);
        System.out.println("First Value : " + linkedList.getFirst());
        System.out.println("Last Value : " + linkedList.getLast());
        
        linkedList.remove(2);
        
        System.out.println("Index of 'b' " + linkedList.indexOf('b'));
        System.out.println("Index of 'c' " + linkedList.indexOf('c'));
        System.out.println("Contains 'c' " + linkedList.contains('c'));
        
        linkedList.set(0,'h');
        linkedList.set(1,'e');
        linkedList.set(2,'l');
        linkedList.set(3,'l');
        linkedList.set(4,'o');
        
        linkedList.print();
        
    }
    
}
