public class ArrayList<T> implements List<T> {
    private int size;
    private T[] array;

    public ArrayList() {
        size = 0;
        array = (T[]) new Object[10];
    }

    public T get(int index) {
        return array[index];
    }

    @Override
    public void set(T object) {
        if (array.length == size) {

        T[] temp = array;
        array = (T[]) new Object[size + 10];

        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];

        }
        if (array.length == size) {

        }
    }

        array[size] = object;

        size++;
    }

    @Override
    public void sort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
    

}
