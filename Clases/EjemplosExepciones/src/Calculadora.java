import Exceptions.DivisionPorCeroException;
import Exceptions.FormatoNumericoException;

public class Calculadora {
    public double division(int dividendo, int divisor) throws DivisionPorCeroException {
        if (divisor == 0) {
            throw new DivisionPorCeroException("No se puede dividir entre cero");
        }
        return dividendo / (double)divisor;
    }

    public double division (String dividendo, String divisor) throws DivisionPorCeroException, FormatoNumericoException {
        try{
        int intDividendo = Integer.parseInt(dividendo);
        int intDivisor = Integer.parseInt(divisor);
        return this.division(intDividendo, intDivisor);
        } catch (NumberFormatException e){
            throw new FormatoNumericoException("Debe ingresar un número entero");
        }

    }
}
