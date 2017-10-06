package algoritimos;

public class Algoritimos {
    
    public static void quadrado(double n){
        double r = n*n;    
        
        System.out.println("Quadrado é "+r);
    }
    
    public static double metade(double v){
        double r=  v/2;
        
        return r;
    }

    public static void main(String[] args) {
        System.out.println("Incicio");
        //calculando a raiz quadrada
        double raiz;
        raiz = Math.sqrt(15);

        System.out.println("A raiz é "+raiz);
        
        System.out.println("Metade"+metade(15));
        quadrado(15);
    }
    
}
