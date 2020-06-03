package lambda.ex1;

@FunctionalInterface //nu putem sa adaugam alte metode abstracte la interfata asta
public interface Instrument {
    // exactly one abstract method
    void play();

    default void clean(){
        System.out.println("in default method");
    }

    static void inStatic(){
        System.out.println("in static method");
    }
}
