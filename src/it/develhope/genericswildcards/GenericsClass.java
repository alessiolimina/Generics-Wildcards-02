package it.develhope.genericswildcards;

public class GenericsClass <T> {
    private T t;

    public void setT(T valueToSet) {
        this.t = valueToSet;
    }

    public T getT() {
        return t;
    }

    public static <T> void isEqual(GenericsClass gc1, GenericsClass gc2) {
        boolean b = gc1.getT().equals(gc2.getT());
        if (b) {System.out.println("True");
        } else {System.out.println("False");}
    }
}




