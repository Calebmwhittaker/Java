/**
 * A interface representation of a list data structure.
 * 
 * @author Caleb Whittaker
 */


public interface List<T> {
    /**
     * Get T at the provided index.
     * 
     * @param index the index
     * @return the object
     */
    T get(int index);
    void set(T object);
    void sort();
}
