public class ElectricalVehicleFactory extends VehicleAbstractFactory{

    @Override
    public ICar createCar() {
        return new ElectricalCar();
    }

    @Override
    public IMotorCycle createMoto() {
        return new ElectricalMotorcycle();
    }
}
