package E01GenericBox;

public class GenerixBox {
    private Object value;

    public GenerixBox(Object value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value.getClass()
                .getName() + ": " + value;
    }
}
