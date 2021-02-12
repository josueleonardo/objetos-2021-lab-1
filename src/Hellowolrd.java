package src;

public class Hellowolrd{
    public static void main(String []args) {
        System.out.println("Numeros de argumentos" + args.length);

        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("Hola mundo" + 12345);
    }
}