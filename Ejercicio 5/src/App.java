import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        var sc=new Scanner(System.in);
        Scanner.out.println("Ingrese el numero entero:");
        var numero=sc.nextInt();

        var digito=numeroDigito(numero);
        System.out.println("El numero tiene"+digito);
    }

    public static int numeroDigito(int numero){
        var cifras=0;

        while (numero!=0){
            numero/=10;
            cifras++;
        }

        return cifras;
    }


}
