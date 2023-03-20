import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        chequeaPrimos();
    }
    public static void promedio(int array[],int valids){
        int i=0;
        int aux=0;
        while(i<valids){
            aux=aux+array[i];
            i++;
        }
        float pro=aux/i;
        System.out.println(""+pro);
    }
    public static void par(int num){
        if(num%2==0){
            System.out.println("es par");
        }
        System.out.println("no es par");
    }
    public static boolean esPrimo(int num){
        int m=2;
        while(m<num){
            if(num%m==0){
                return false;
            }else{
                m++;
            }
        }
        return true;
    }
    public static void mostrarPrimos(int max){
        for(int i=2;i<max;i++){
            if(esPrimo(i)==true){
                System.out.println(""+i);
            }
        }
    }
    public static void chequeaPrimos(){
        Scanner scan = new Scanner(System.in);
        boolean flag= true;
        while(flag){
            System.out.println("ingrese un numero:");
            int num = scan.nextInt();
            if(esPrimo(num)){
                System.out.println(""+num);
                System.out.println(" es primo");
            }else{
                System.out.println("no es primo");
            }
            System.out.println("desea continuar? s/n");
            char continuar = scan.nextChar();
            if(continuar!='s'){
                flag= false;
            }
        }
    }
    public static int numerosNaturales(){
        int numero=0;
        for (int i=0;i<10;i++){
            numero=numero+i;
        }
        return numero;
    }
}
