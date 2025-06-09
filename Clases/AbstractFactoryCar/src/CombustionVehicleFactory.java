public class CombustionVehicleFactory extends VehicleAbstractFactory{

        @Override
        public ICar createCar() {
            return new CombustionCar();
        }

        @Override
        public IMotorCycle createMoto() {
            return new CombustionMotorcycle();
        }
    }


