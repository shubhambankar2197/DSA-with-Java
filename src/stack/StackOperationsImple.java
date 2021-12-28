package stack;

public class StackOperationsImple implements StackOperations{
    Integer stackElem[] = new Integer[5];
    Integer top = -1;

    @Override
    public Integer popInteger() {
        Integer poppedInt = stackElem[top];
        top = top - 1;
        return poppedInt;
    }

    @Override
    public void pushInteger(Integer number) {
        top = top + 1;
        stackElem[top] = number;
    }

    @Override
    public Integer printTop() {
        return stackElem[top];
    }
}
