import Exeptions.DuplicateModelNameException;
import Exeptions.NoSuchModelNameException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public class Main {
        public static void main(String[] args) throws IOException, DuplicateModelNameException, CloneNotSupportedException,
                NoSuchModelNameException, ClassNotFoundException, ParserConfigurationException, SAXException,
                XMLStreamException {
                //---------------------------------ПУНКТ 1.2----------------------------------
        Auto auto = new Auto("BMW", 3);
        auto.addModel("F30", 5500000);
        auto.addModel("X6", 6500000);
        auto.addModel("X1", 1200000);
        auto.addModel("i530", 3200000);
        auto.addModel("i730", 7200000);
        auto.addModel("i330", 1800000);

        MotorcycleFactory motorcycleFactory;

         TransportFactory transportFactory = new MotorcycleFactory();
         VehicleStaticClass.setTransportFactory(transportFactory);
         System.out.println(transportFactory.getClass());

        TransportFactory transportFactory2 = new AutoFactory();
        VehicleStaticClass.setTransportFactory(transportFactory2);
        System.out.println(VehicleStaticClass.createInstance("gdfg", 4).getClass());


        for (String str:auto.getAllModelNames()) {
            System.out.println(str);
        }


        try {
                auto.setModelName("X1", "X1");
        } catch (DuplicateModelNameException | NoSuchModelNameException e) {
            e.printStackTrace();
        }

                auto.deleteModel("i730");

        System.out.println("-------------------------------------------------");

        for (String str:auto.getAllModelNames()) {
            System.out.println(str);
        }


      Auto auto2 = new Auto("Toyota",2);}}



//---------------------------------ПУНКТ 1.3(clone tests)----------------------------------


//        Motorcycle motorcycle = new Motorcycle("Yamaha",0); //TODO: Some shit for tests
//
//        motorcycle.addModel("Y500", 540000);
//        motorcycle.addModel("Y300", 340000);
//        motorcycle.addModel("B312", 270000);
//        motorcycle.addByIndex("Test", 12345, 3);
//        motorcycle.addByIndex("Test2", 77777, 4);

    //System.out.println(motorcycle); //TODO: Тест на клона
    // System.out.println(motorcycle.printList(motorcycle));




    // System.out.println(motorcycle.getModelName(motorcycle.getModelByIndex(5)));
    //   motorcycle.deleteModel("Test",12345);

//        for (String str: motorcycle.getAllModelNames()) {
//            System.out.println(str);
//        }


//        System.out.println();
//        System.out.println("!----------------Clone------------------!");
//        System.out.println();
//
//        Motorcycle motorcycleClone = motorcycle.clone();
//        motorcycle.updateModelName("Test2", "Test22");
//        //TODO: Тест на клона
//        System.out.println(motorcycle.printList(motorcycle));
//        System.out.println(motorcycleClone.printList(motorcycleClone));

//        for (String str: motorcycleClone.getAllModelNames()) {
//            System.out.println(str);
//        }
