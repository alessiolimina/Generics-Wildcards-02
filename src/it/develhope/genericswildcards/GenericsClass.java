package it.develhope.genericswildcards;

public class GenericsClass <T> {
    private T t;

    public void setT(T valueToSet) {
        this.t = valueToSet;
    }

    public T getT() {
        return t;
    }

    public static <T> boolean isEqual(GenericsClass gc1, GenericsClass gc2) {
       return (gc1.getT().equals(gc2.getT()));
    }
}





