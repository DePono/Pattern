import Exeptions.DuplicateModelNameException;
import Exeptions.NoSuchModelNameException;
import Facade.FacadeTraffic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws DuplicateModelNameException, NoSuchModelNameException, IOException, CloneNotSupportedException, InterruptedException, ClassNotFoundException {
       /* TransportFactory transportFactory2 = new AutoFactory();
        Vehicle auto = transportFactory2.createInstance("BMW",4);
        System.out.println(auto.getClass());
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
        System.out.println(motorcycle.getClass());
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
        }*/
/*//Пункт 3

        Motorcycle motorcycle1 = new Motorcycle("Kawasaki", 2);
        motorcycle1.addModel("loop", 333);
        motorcycle1.addModel("pool", 444);
        System.out.println(motorcycle1);

        for (
                String str : motorcycle1.getAllModelNames()) {
            System.out.println(str);
        }


        System.out.println();
        System.out.println("!----------------Clone------------------!");
        System.out.println();

        Motorcycle motorcycleClone = motorcycle1.clone();
        //TODO: Тест на клона
        System.out.println(motorcycle1);
        System.out.println(motorcycleClone);

        for (
                String str : motorcycleClone.getAllModelNames()) {
            System.out.println(str);
        }*/

        //Лабораторная 3
        //Adapter

        Adapter adapter = new Adapter();
        adapter.writeOutputStream("Fabric", "Adapter", "Decorator");
        adapter.readOutputStream();
        System.out.println();

        //Decorator

        Vehicle auto = new Auto("Polo", 2);
        auto.addModel("Lookok", 320);
        auto.addModel("Plooo", 920);
        System.out.println(auto.getClass());

        Decorator decorator = VehicleStaticClass.getDecorator(auto);
        for (String carName : decorator.getAllModelNames()) {
            System.out.println(carName);
        }

        // Facade
/*        FacadeTraffic.runTrafficJam();
        System.in.read();*/


        //Лабораторная 3


        //Chain of Responsibility

/*        Vehicle vehicleCar = new Auto("Nooo", 5);
*//*        vehicleCar.addModel("Eyyyyc", 32);
        vehicleCar.addModel("Ooop", 92);
        vehicleCar.addModel("Kolk", 73);*//*
        //vehicleCar.addModel("Teana", 1550000);

        Chain chain1 = new Row();
        Chain chain2 = new Column();

        chain2.set_next_chain(chain1);
        chain2.write_to_file(vehicleCar);


        //Command 3.2

        OutputStream outputStream = new FileOutputStream("WriteCommandOutput.txt");
        Auto carCommand = new Auto("Toyota", 2);
        carCommand.addModel("Chaiser", 120);
        carCommand.addModel("Corolla", 100);
        carCommand.setPrintCommand(new ColumnCommand());
        carCommand.print(outputStream);

        //Iterator 3.3

        Auto car = new Auto("Toyota", 3);
        Auto.AutoIterator iterator = car.iterator();
        car.addModel("Chaiser", 1200000);
        car.addModel("Corolla", 1000000);
        car.addModel("Camry", 2500000);


        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            //Memento 3.4


            Auto auto = new Auto("Toyota", 2);
            car.addModel("Chaser", 1200000);
            car.addModel("Corolla", 1000000);


            Auto.Memento memento = auto.createMemento();
            auto.setMemento(memento);

            auto.addModel("Camry", 2500000);
            auto.addModel("Land Cruiser", 5000000);

            for (String modelName : auto.getAllModelNames()) {
                System.out.println(modelName);
            }

            System.out.println("Memento");
            for (int i = 0; i < memento.getCar().getSizeModelArray(); i++) {
                System.out.println(memento.getCar().getModelByIndex(i).toString());
            }*/

            /*Strategy 3.7

//        Analyzer analyzer = new Analyzer();
//        analyzer.setStrategy(new Sax(args[0], args[1]));
//        analyzer.documentParse();

//        Analyzer analyzer = new Analyzer();
//        analyzer.setStrategy(new Dom(args[0], args[1]));
//        analyzer.documentParse();


            /*Visitor 3.8
//        Visitor visitor = new PrintVisitor();
//        Vehicle vehicle = new Motorcycle("Honda",3);
//        vehicle.addModel("Aaa", 175);
//        vehicle.addModel("Bbb", 174);
//        vehicle.addModel("Ccc", 791);
//        vehicle.accept(visitor);



            /*DAO 4.2
/*            Auto auto = new Auto("Ddd", 3);
            car.defaultInit();


            DataTypeGetting file = new Text();
            file.set(auto);
            file.get();
            file.print();*/
        }
    }
