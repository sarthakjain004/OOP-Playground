import java.util.*;

class ExampleGenerics<T>{
    private List<T> list = new ArrayList<>();
    public void add(T val){
        list.add(val);
    }
    public void removeLast(){
        if(list.size() > 0){
            list.remove(list.size()-1);
        }
    }
    public T getElement(int index){
        return list.get(index);
    }
    public void print(){
        for(T val : list){
            System.out.println(val);
        }
    }
}
class GenericMethod{
    public <T> void printArray(T[] arr){
        for(T val : arr){
            System.out.print(val + " ");
        }
    }
}

class calculator <T extends Number>{ //T has to be a subclass of Number
    public double add(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
    public double subtract(T a, T b){
        return a.doubleValue() - b.doubleValue();
    }
    public double multiply(T a, T b){
        return a.doubleValue() * b.doubleValue();
    }
    public double divide(T a, T b){
        return a.doubleValue() / b.doubleValue();
    }
}
class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
public class generics {
    // public static void printArray(T[] arr){ //gives error.write  <T> after the access specifier 
    //     for(T val : arr){
    //         System.out.println(val);
    //     }
    // }
    public static <T> void printArray(T[] arr){
        for(T val : arr){
            System.out.print(val +" ");
        }
    }
    public static <T> void printArrayUsingWildcard(List<? extends T> list){
        for(T val : list){
            System.out.print(val + " "); //read only allowed
        }
        // list.add(60); //not allowed
        // list.remove(0); //not allowed
    }
    /**
     * Demonstrates upper bound wildcard in Java Generics.
     * This method accepts a List that can hold Integer or any of its superclasses (like Number or Object).
     * Upper bound wildcard (? super Type) allows:
     * - WRITE operations: Can add Integer objects to the list
     * - READ operations: Requires explicit casting as the exact type is unknown
     * 
     * Key points about ? super Integer:
     * - Allows adding Integer or its subclasses to the list
     * - When reading, elements must be cast to Integer
     * - Commonly used in scenarios where you want to write to a collection
     * 
     * @param ls a List of type Integer or any of its superclasses
     */
    public static void writeArray(List<? super Integer> ls){ //? can be Integer or any super class of Integer
        ls.add(10); //allowed
        ls.add(20); //allowed
        // Integer i = ls.get(0); //not allowed
        Integer i = (Integer)ls.get(0); //allowed
        //why typecasting is needed?
        //because we don't know the type of the list, it can be any super class of Integer
        //so we need to typecast it to Integer
        // so is reading allowed?
        //yes, but we need to typecast it to Integer
        //if we dont typecast it, it will give compile time error.
        //this is example of upper bound wildcard
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ExampleGenerics<Integer> eg = new ExampleGenerics<>();
        eg.add(10);
        eg.add(20);
        eg.print();
        eg.removeLast();
        eg.print();
        eg.add(30);
        eg.add(40);
        eg.print();
        Integer[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        GenericMethod gm = new GenericMethod();
        gm.printArray(arr);
        calculator<Integer> calc = new calculator<>();
        System.out.println("\nAddition: " + calc.add(10, 20));
        System.out.println("Subtraction: " + calc.subtract(20, 10));
        System.out.println("Multiplication: " + calc.multiply(10, 20));
        System.out.println("Division: " + calc.divide(20, 10));
        System.out.println("\nUsing Wildcard:");
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        printArrayUsingWildcard(numList); 
        // Demonstrating Raw Types (not recommended in modern Java)
        System.out.println("\n\nDemonstrating Raw Types:");
        ExampleGenerics rawList = new ExampleGenerics(); // Raw type, no type safety
        rawList.add("String");  // Can add String
        rawList.add(42);       // Can add Integer
        rawList.add(3.14);     // Can add Double
        rawList.print();       // Mixed types printed

        // This shows why raw types are dangerous:
        // Integer num = (Integer)rawList.getElement(0); // Will throw ClassCastException

        // Demonstrating Type Erasure
        System.out.println("\nDemonstrating Type Erasure:");
        GenericClass<String> stringClass = new GenericClass<>("Hello");
        GenericClass<Integer> intClass = new GenericClass<>(42);
        
        // Due to type erasure, both objects have same runtime class
        System.out.println("stringClass type: " + stringClass.getClass().getName());
        System.out.println("intClass type: " + intClass.getClass().getName());
        System.out.println("Are classes equal? " + (stringClass.getClass() == intClass.getClass()));
        // Type Erasure Example Explanation:
        // 1. At compile time, Java replaces all type parameters with their bounds
        // 2. GenericClass<String> and GenericClass<Integer> become just GenericClass
        // 3. The type parameter T is replaced with Object (or its bounds if specified)
        // 4. That's why both stringClass and intClass have the same runtime class
        // 5. The actual type information (String/Integer) is only available at compile time
    }
}
