public class Matrices {

    public int [][] matrizAleatorio(int[][] matrizVacia, int minimo, int maximo){
        for(int fila = 0; fila < matrizVacia.length; fila++){
            for (int columna = 0; columna < matrizVacia[fila].length; columna++){
                matrizVacia[fila][columna] = (int) (Math.floor(Math.abs(maximo - minimo) + 1) * Math.random()) + minimo;
            }
        }
        return matrizVacia;
    }

    //Metodo para mostrar la matriz en pantalla
    public String printMatriz(int[][] matriz){
        String matrizString = "";
        for (int fila = 0; fila < matriz.length; fila++){
            for (int columna = 0; columna < matriz[0].length; columna++){
                matrizString += matriz[fila][columna] + " ";
            }
            matrizString += "\n";
        }
        return matrizString;
    }
}
