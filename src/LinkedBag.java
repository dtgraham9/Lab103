import java.util.Random;
/**
 * Creates a singularly linked list to store generic type
 * @author Graham Thompson
 * @version
 */
public class LinkedBag<T> implements Bag<T>{

    /**
     * private nested node class to create a singularly linked list
     * @param <T> 
     */
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
    
    /**
     * Returns the count of elements in the bag
     * @return 
     */
    @Override
    public int getCurrentSize() {
        return this.size;
    }
    
    /**
     * Checks if the bag is empty,
     * returns true if empty
     * @return 
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * adds num to the bag
     * @param num 
     */
    @Override
    public void add(T num) {
        head = new Node<>(num,head);
        if(this.size==0){
            tail= head;
        }
        this.size++;
    }

    /**
     * removes the first occurrence of num
     * from the bag
     * @param num 
     * @return  
     */
    @Override
    public boolean remove(T num) {
        if(isEmpty()){
            return false;
        }
        Node current = head;
        Node previous = null;
        for(int i = 0; this.size > i; i++){
            if(current.getElement().equals(num)){
                if(i ==0){
                    head = current.getNext();
                    
                }
                
                else{
                    previous.setNext(current.getNext());
                }
                this.size--;
                return true;
                
            }
            previous = current;
            current = current.getNext();
        }
        return false;
    }

    /**
     * removes a randomly selected selected entry 
     * from the bag
     * @return 
     */
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
        if(index == 0){
            head = head.getNext();
        }
        else{
            previous.setNext(current.getNext());
        }
       
        this.size--;
        return save;
    }
    
    /**
     * removes all the elements from the bag
     */
    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    /**
     * returns a count of the number of times
     * num exists in the bag
     * @param num
     * @return 
     */
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

    /**
     * Tests whether the bag contains num.
     * Returns true when nm is contained in the bag
     * @param num
     * @return 
     */
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
    
    /**
     * returns true if the parameter o exactly matches
     * the contents of the bag.  Same numbers in the same order
     * @param o
     * @return 
     */
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
    
    /**
     * returns a String of the contents of the bag
     * @return 
     */
    @Override
    public String toString(){
        String print = "";
        Node current = head;
        for(int i = 0; this.size-1 > i ; i++){
            print += current.getElement().toString() + "; ";
            current = current.getNext();
        }
        print += current.getElement().toString();
        return print;
    }
    
    /**
     * returns T at i index, but if not returns null
     * if index is inside the currently filled section of array
     * @param num
     * @return 
     */
    public T get(int num){
        Node current = head;
        for(int i = 0; i<num;i++){
            current = current.getNext();
        }
        return (T) current.getElement();
    }
    
}
