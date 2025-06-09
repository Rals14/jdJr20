/**
 * Ejemplo Abstract Factory
 * Enunciado:
 * Implementa un sistema de creación de vehículos donde cada tipo de vehículo se crea mediante un método de fábrica.
 */

public class Main {
    public static void main(String[] args) {
        VehicleAbstractFactory electricalFactory = new ElectricalVehicleFactory();
        VehicleAbstractFactory combustionFactory = new CombustionVehicleFactory();

        IMotorCycle motoElectrica = electricalFactory.createMoto();
        IMotorCycle motoCombustion = combustionFactory.createMoto();

        motoElectrica.encenderMotor();
        motoCombustion.encenderMotor();
    }
}
