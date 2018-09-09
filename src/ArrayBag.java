/**
 *
 * @author Graham Thompson
 * @version
 */
public class ArrayBag <T> implements Bag<T>{

    private T[] list;
    private int count;
    
    
    public ArrayBag(){
        this.list = (T[]) new Object[50];
        this.count = 0;
    }
    
    public ArrayBag(int length){
        this.list = (T[]) new Object[length];
        this.count=0;
    }
    /**
     * Returns the count of elements in the bag
     * @return 
     */
    @Override
    public int getCurrentSize() {
        return this.count;
    }

    /**
     * Checks if the bag is empty,
     * returns true if empty
     * @return 
     */
    @Override
    public boolean isEmpty() {
        return this.count==0;
    }

    /**
     * adds num to the bag
     * @param num 
     */
    @Override
    public void add(T num) {
        
    }

    /**
     * removes the first occurrence of num
     * from the bag
     * @param num 
     * @return  
     */
    @Override
    public boolean remove(T num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * removes a randomly selected selected entry 
     * from the bag
     * @return 
     */
    @Override
    public T remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * removes all the elements from the bag
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * returns a count of the number of times
     * num exists in the bag
     * @param num
     * @return 
     */
    @Override
    public int getFrequency(T num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Tests whether the bag contains num.
     * Returns true when nm is contained in the bag
     * @param num
     * @return 
     */
    @Override
    public boolean contains(T num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * returns a String of the contents of the bag
     * @return 
     */
    @Override
    public String toString(){
        
    }
    
    /**
     * returns true if the parameter o exactly matches
     * the contents of the bag.  Same numbers in the same order
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o){
        
    }
    
}
