import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Un viajero conoce todos los gastos que hizo en su último viaje con la tarjeta de
        // crédito, fueron 5 en total, los cuales se pueden clasificar en cuatro tipos: comida,
        // hospedaje, transporte y ropa.
        // Se deben ordenar los gastos y mostrar los gastos con las categorías.
        // Implementar una matriz para los gastos y categorías

        Scanner sc = new Scanner(System.in);

        // formateamos para centrar . dando valores de ancho a los casilleros
        String formatCategorias = "%-12s"; // asignamos espacios en blnaco a la izquierda 
        String formatGastos = "%-11d"; // asignamos espacios en blanco a la izquierda 

        String [] categorias = {"comida","hospedaje","transporte","ropa"};
        int[][] matriz = {
            {1000, 3500, 600, 500},
            {1200, 3500, 600, 0},
            {800, 3500, 300, 120},
            {200, 3045, 1000, 23}
        };

        for(int i=0;i<categorias.length;i++){
            System.out.print(String.format(formatCategorias, categorias[i]));
        }
        System.out.print('\n');
         
        // ordenar columnas de menor a mayor 
        
        matriz = OrdenarMatriz(matriz);
        MostrarMatriz(matriz,formatGastos);
        
        sc.close();
    }

    public static int[][] OrdenarMatriz(int [][]matriz ){

        int aux=0;
        boolean bubble=true;
        
        // ordenamiento de columnas de menor a mayor
        for(int columna=0;columna<matriz.length;columna++){
            bubble=true; // declaro bubble true asi entra al ciclo
            while (bubble) {
                bubble=false; // lo declaro false al principio. si sigue en false al cumplir el ciclo. significa que ya esta ordenado
                for(int i=0;i<matriz.length-1;i++){ // lenght -1 para que al comparar el i+1 no haya un problema
                    if(matriz[i][columna]>matriz[i+1][columna]){
                        aux=matriz[i+1][columna]; // guardo el valor en aux
                        matriz[i+1][columna]=matriz[i][columna]; // ordeno 
                        matriz[i][columna]=aux; // asigno el menor valor en la posicion
                        bubble=true; // si hubo algun cambio en la recorrida del ciclo. cambio su valor para que vuelva a ordenar.
                    }
                }
            }
        }
        return matriz;
    }

    public static void MostrarMatriz(int[][]matriz, String formatGastos){
        int j;
        for(int i=0;i<matriz.length;i++) {
            for(j=0;j<matriz.length;j++) {
                System.out.print("$"+String.format(formatGastos, matriz[i][j]));                
            }
            System.out.println();
            j=0;
        }
    }
}
