public class ServiceStation {

    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            car.service();
        } else if (truck != null) {

            System.out.println("Обслуживаем " + truck.getModelName());
            truck.service();

        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            bicycle.service();
        }
    }
}

