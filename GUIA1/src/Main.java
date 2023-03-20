public class Main {
    public static void main(String[] args) {
        mostrarPrimos(1200);
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
}
