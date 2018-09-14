import java.util.Random;
/**
 *
 * @author Graham Thompson
 * @version
 */
public class LinkedBag<T> implements Bag<T>{

    private static class Node<T> {
        private T element;
        private Node<T> next;
        public Node(T t, Node<T> n){
            element = t;
            next = n;
        }
        public T getElement(){ return element;}
        public Node<T> getNext() {return next;}
        public void setNext(Node<T> n){next = n;}
                
    }
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;
    public LinkedBag(){
        
    }
    
    @Override
    public int getCurrentSize() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void add(T num) {
        head = new Node<>(num,head);
        if(this.size==0){
            tail= head;
        }
        this.size++;
    }

    @Override
    public boolean remove(T num) {
        if(isEmpty()){
            return false;
        }
        Node current = head;
        Node previous = null;
        for(int i = 0; this.size > i; i++){
            if(current.getElement().equals(num)){
                previous.setNext(current.getNext());
                this.size--;
                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return false;
    }

    @Override
    public T remove() {
        Random rand = new Random();
        int index = rand.nextInt(this.size);
        int i = 0;
        Node current = head;
        Node previous = null;
        while(index>i){
            previous = current;
            current = current.getNext();
            i++;
        }
        T save = (T) current.getElement();
        previous.setNext(current.getNext());
        return save;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    @Override
    public int getFrequency(T num) {
        if(isEmpty()){
            return 0;
        }
        Node current = head;
        int count = 0;
        for(int i = 0; this.size > i; i++){
            if(current.getElement().equals(num)){
                count++;
            }
            current = current.getNext();
        }
        return count++; 
    }

    @Override
    public boolean contains(T num) {
        if(isEmpty()){
            return false;
        }
        Node current = head;
        int count = 0;
        for(int i = 0; this.size > i; i++){
            if(current.getElement().equals(num)){
                return true;
            }
            current = current.getNext();
        }
        return false; 
    }
    
    @Override
    public boolean equals(Object o){
        if(!(o instanceof LinkedBag)){
            return false;
        }
        LinkedBag l = (LinkedBag) o;
        if(!(l.getCurrentSize() == this.size)){
            return false;
        }
        Node current = head;
        Node test = l.head;
        for(int i =0; this.size > i; i++){
            if(!(current.getElement().equals(test.getElement()))){
                return false;
            }
            current = current.getNext();
            test = test.getNext();
        }
        return true;
    }
    
    @Override
    public String toString(){
        String print = "";
        Node current = head;
        for(int i = 0; this.size-1 > i ; i++){
            print += current.getElement().toString();
            current = current.getNext();
        }
        print+=current.getElement().toString();
        return print;
    }
    
    public T getIndex(int num){
        Node current = head;
        for(int i = 0; i<num;i++){
            current = current.getNext();
        }
        return (T) current.getElement();
    }
    
}
