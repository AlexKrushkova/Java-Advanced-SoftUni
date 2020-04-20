package E03GenericSwapMethod;

public class GenericSwapMethod<T> {
    private T value;

    public GenericSwapMethod(T value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value.getClass()
                .getName() + ": " + value;
    }
}
