//Math.random() -> Numeros reales entre 0 y 1, el 1 excluido
// Para obtener un número aleatorio entre minimo y maximo, ambos incluidos:
//((máximo - mínimo + 1) * Math.random()) + mínimo

//Recibe un entero con el valor mínimo, náximo y el número de elementos a generar, los devuelve en un array
public class MisArrays {

    public int[] arregloAleatorioEnteros(int min, int max, int longitud){
        int[] resultado = new int[longitud];
        int aleatorio;
        for (int i = 0; i < longitud; i++) {
            aleatorio = (int) (Math.floor((Math.abs(max-min)+1)*Math.random())+min);
            resultado[i] = aleatorio;
        }
        return resultado;
    }

    public String arrayToString(int[] array){
       String resultado = "[ ";
        for (int dato : array) {
            resultado = resultado + dato + " ";
        }
        resultado = resultado + "]\n";
        return resultado;
    }
}
