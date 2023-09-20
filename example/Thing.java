package example;

public class Thing{

public static void main(String[] args){
    System.out.println("Hello world");

    if (args.length == 0){
        System.out.println("No arguments supplied"); 

    }

    for ( int index = 0; index < args.length; index++){
        System.out.println(
            String.format("%2d: %s", index, args[index]));
       }
    }
}