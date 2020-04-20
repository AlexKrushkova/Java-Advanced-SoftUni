package L01.SmartArray;

import java.util.function.Consumer;

public class SmartArrayClass {

    private static final int INITIAL_CAPACITY =4;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArrayClass(){
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    public void add(int element){
        if (this.size == this.capacity){
            this.resize();
        }
        else {
            this.data[this.size++] = element;
        }
    }

    public int get(int index){
        this.validateIndex(index);
        return this.data[index];
    }

    private void validateIndex(int index) {
        if (index < 0 || index>= this.size){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
    }

    public int remove(int index){
        this.validateIndex(index);
        int element = this.data[index];

        this.shiftLeft(index);
        this.size--;
        if (this.size <= this.capacity/4){
            this.shrink();
        }
        return element;
    }

    public void add(int index, int element){
        this.validateIndex(index);
        if(this.size+1 >= this.capacity){
            this.size++;
            this.resize();
        }
        this.shiftRight(index);
        this.data[index]= element;
    }

    private void shiftRight(int index) {
        for (int i = this.size-1; i >index ; i--) {
            this.data[i] = this.data[i-1];
        }
    }

    private void shrink() {
        this.capacity/=2;
        int[] newData = new int[this.capacity];

        if (this.size >= 0)
            System.arraycopy(this.data, 0, newData, 0, this.size);
        this.data = newData;
    }

    private void shiftLeft(int index) {
        for (int i = index; i <this.size-1 ; i++) {
            this.data[i] = this.data[i+1];
        }
        this.data[this.size-1] = 0;
    }

    public boolean contains(int element){
        for (int i = 0; i <this.size ; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void forEach(Consumer<Integer> consumer){
        for (int i = 0; i <this.size ; i++) {
            consumer.accept(this.data[i]);
        }
    }

    private void resize(){
        this.capacity *=2;
        int [] newData = new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            newData[i] = this.data[i];
        }
       // System.arraycopy(this.data,0,newData,0,this.size); (Копираме array)
        this.data = newData;
    }
}
