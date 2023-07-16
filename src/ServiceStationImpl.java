public class ServiceStationImpl implements ServiceStation {

    public void check(TransportVehicle transportVehicle) {
        System.out.println("Обслуживаем " + transportVehicle.getModelName());
        transportVehicle.service();
    }
}
