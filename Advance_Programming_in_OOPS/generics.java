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
    }
}
