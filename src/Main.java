import Exeptions.DuplicateModelNameException;
import Exeptions.NoSuchModelNameException;

public class Main {
    public static void main(String[] args) throws DuplicateModelNameException, CloneNotSupportedException,
            NoSuchModelNameException{
        //---------------------------------ПУНКТ 1.2----------------------------------
        Auto auto = new Auto("ZAZ", 3);
        auto.addModel("ZIZ", 122);
        auto.addModel("ZEZ", 244);

        MotorcycleFactory motorcycleFactory;

        TransportFactory transportFactory = new MotorcycleFactory();
        VehicleStaticClass.setTransportFactory(transportFactory);
        System.out.println(transportFactory.getClass());

        TransportFactory transportFactory2 = new AutoFactory();
        VehicleStaticClass.setTransportFactory(transportFactory2);
        System.out.println(VehicleStaticClass.createInstance("MNW", 4).getClass());

        for (String str : auto.getAllModelNames()) {
            System.out.println(str);
        }

        try {
            auto.setModelName("ZIZ", "ZOZ");
        } catch (DuplicateModelNameException | NoSuchModelNameException e) {
            e.printStackTrace();
        }

        auto.deleteModel("ZEZ");

        System.out.println("-------------------------------------------------");

        for (String str : auto.getAllModelNames()) {
            System.out.println(str);
        }

        Auto auto2 = new Auto("Toyota", 2);

//---------------------------------ПУНКТ 1.3(clone tests)----------------------------------


        Motorcycle motorcycle = new Motorcycle("Kawasaki", 2);
        motorcycle.addModel("loop", 333);
        motorcycle.addModel("pool", 444);
        System.out.println(motorcycle);

        for (
                String str : motorcycle.getAllModelNames()) {
            System.out.println(str);
        }


        System.out.println();
        System.out.println("!----------------Clone------------------!");
        System.out.println();

        Motorcycle motorcycleClone = motorcycle.clone();
        //TODO: Тест на клона
        System.out.println(motorcycle);
        System.out.println(motorcycleClone);

        for (
                String str : motorcycleClone.getAllModelNames()) {
            System.out.println(str);
        }
    }
}
