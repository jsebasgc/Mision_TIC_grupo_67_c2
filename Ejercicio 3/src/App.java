import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese info");
        String result=entrada.nextLine();


        int valor=3;

        if (valor>4){
            System.out.println("Correcto");

        } else{
            System.out.println("Incorrecto");
        }

        if (result.equals("Isr")){
            System.out.println("Es correcto");
        }
        */

        //ciclo for
        /*
        for (int i=0; i<100; i++){
            System.out.println("numero es:"+i);
        }
        */
        //ciclo while
        var num=0;
        while(num<100){
            if(num==10){
                break;
            }
            System.out.println("numero while es:"+num);
            num++;
        }
        do{
            num++;
            if ((num>=100)&(num<=120)){
                System.out.println("Numero do while es:" + num);
                
                //continue;
                
            }
            
            
        }while(num<200);
    }
}
