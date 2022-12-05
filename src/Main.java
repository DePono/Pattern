import Exeptions.DuplicateModelNameException;
import Exeptions.NoSuchModelNameException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws DuplicateModelNameException, CloneNotSupportedException,
            NoSuchModelNameException, IOException {
        //---------------------------------ПУНКТ 1.2---------------------------------
        TransportFactory transportFactory2 = new AutoFactory();
        Vehicle auto = transportFactory2.createInstance("BMW",4);
        System.out.println(auto);
        auto.addModel("Zoz",233);

        for (String str : auto.getAllModelNames()) {
            System.out.println(str);
        }

        try {
            auto.setModelName("BMW0", "ZOZ");
        } catch (DuplicateModelNameException | NoSuchModelNameException e) {
            e.printStackTrace();
        }

        auto.deleteModel("BMW1");

        System.out.println("-------------------------------------------------");

        for (String str : auto.getAllModelNames()) {
            System.out.println(str);
        }


        TransportFactory transportFactory = new MotorcycleFactory();
        Vehicle motorcycle = transportFactory.createInstance("SUZUKI", 4);
        System.out.println(motorcycle);
        motorcycle.addModel("Zoz",233);
        for (String str : motorcycle.getAllModelNames()) {
            System.out.println(str);
        }

        try {
            motorcycle.setModelName("SUZUKI0", "ZOZ");
        } catch (DuplicateModelNameException | NoSuchModelNameException e) {
            e.printStackTrace();
        }

        motorcycle.deleteModel("SUZUKI1");

        System.out.println("-------------------------------------------------");

        for (String str : motorcycle.getAllModelNames()) {
            System.out.println(str);
        }
//---------------------------------ПУНКТ 1.3(clone tests)----------------------------------


/*        Motorcycle motorcycle = new Motorcycle("Kawasaki", 2);
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
        }*/

        //------------------------LAB 2-----------------
        /*-----------------------------------Adapter--------------------------------------*/

        Adapter adapter = new Adapter();
        adapter.writeOutputStream("Fabric", "Adapter", "Decorator");
        adapter.readOutputStream();
        System.out.println();
    }
}
