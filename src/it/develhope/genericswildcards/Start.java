package it.develhope.genericswildcards;

public class Start {
    public static void main(String[] args) {

        System.out.println("-------------------Creating classes------------------");

        GenericsClass <Integer> firstElement = new GenericsClass<>();
        GenericsClass <Integer> secondElement = new GenericsClass<>();
        GenericsClass <String> thirdElement = new GenericsClass<>();
        GenericsClass <String> fourthElement = new GenericsClass<>();

        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");

        System.out.println("First element: " + firstElement.getT());
        System.out.println("Second element: " + secondElement.getT());
        System.out.println("Third Element: " + thirdElement.getT());
        System.out.println("Fourth element: " + fourthElement.getT());

        System.out.println("---------------Comparing elements---------------------");

        System.out.print("Is the first element equal to the second element? ");
        GenericsClass.isEqual(firstElement, secondElement);
        System.out.print("Is the third element equal to the fourth element? ");
        GenericsClass.isEqual(thirdElement, fourthElement);

        System.out.println("-------------------------------------------------------");

    }
}


