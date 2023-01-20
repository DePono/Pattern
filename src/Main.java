import Exeptions.DuplicateModelNameException;
import Exeptions.NoSuchModelNameException;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws DuplicateModelNameException, NoSuchModelNameException, IOException, CloneNotSupportedException, InterruptedException, ClassNotFoundException, XMLStreamException, ParserConfigurationException, SAXException {
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

/*        Adapter adapter = new Adapter();
        adapter.writeOutputStream("Fabric", "Adapter", "Decorator");
        adapter.readOutputStream();
        System.out.println();*/

        //Decorator
/*
        Vehicle auto = new Auto("Polo", 2);
        auto.addModel("Lookok", 320);
        auto.addModel("Plooo", 920);
        System.out.println(auto.getClass());

        Decorator decorator = VehicleStaticClass.getDecorator(auto);
        for (String carName : decorator.getAllModelNames()) {
            System.out.println(carName);
        }*/

        // Facade
/*        FacadeTraffic.runTrafficJam();
        System.in.read();*/


        //Лабораторная 3


        //ChainsOfResponsobility.Chain of Responsibility

/*        Vehicle auto = new Auto("Nooo", 6);
        auto.addModel("Eyyyyc", 32);
        auto.addModel("Ooop", 92);
        auto.addModel("Kolk", 73);

        Chain chain1 = new Row();
        Chain chain2 = new Column();

        chain2.set_next_chain(chain1);
        chain2.write_to_file(auto);*/


        //Command 3.2
/*
        FileWriter fileWriter = new FileWriter("WriteRow.txt");
        FileWriter fileWriter1 = new FileWriter("WriteColumn.txt");
        Auto autoCommand = new Auto("Toyota", 8);
        autoCommand.setPrintCommand(new ColumnCommand());
        autoCommand.print(fileWriter1);
        autoCommand.setPrintCommand(new RowCommand());
        autoCommand.print(fileWriter);*/

        //Iterator 3.3

/*        Auto auto = new Auto("Toyota", 3);
        Auto.AutoIterator iterator = auto.iterator();
        auto.addModel("Cha", 12);
        auto.addModel("olla", 100);
        auto.addModel("Cary", 2500);


        while (iterator.hasNext()) {
            System.out.println(iterator.next());*/

            //Memento 3.4 переделать. чтобы один вызывал getMemento


            Auto auto = new Auto("Toyota", 2);
            auto.addModel("Chaser", 120);
            auto.addModel("Corolla", 100);


            Auto.Memento memento = auto.createMemento();
            auto.setMemento(memento);

            auto.addModel("Camry", 250);
            auto.addModel("Land Cruiser", 500);

            for (String modelName : auto.getAllModelNames()) {
                System.out.println(modelName);
            }

            auto.deleteModel("Corolla");
        for (String modelName : auto.getAllModelNames()) {
            System.out.println(modelName);
        }

            System.out.println("Memento");
            for (int i = 0; i < Auto.Memento.getAuto().getSizeModelArray(); i++) {
                System.out.println(Auto.Memento.getAuto().getModelByIndex(i));
            }

            //Strategy 3.7

/*        Analyzer analyzer = new Analyzer();
        analyzer.setStrategy(new Sax(args[0], args[1]));
        analyzer.documentParse();

        Analyzer analyzer = new Analyzer();
        analyzer.setStrategy(new Dom(args[0], args[1]));
        analyzer.documentParse();*/


            //Visitor 3.9 не то. проверить задание
/*        Visitor visitor = new PrintVisitor();
        Vehicle vehicle = new Motorcycle("Honda",3);
        vehicle.addModel("Aaa", 175);
        vehicle.addModel("Bbb", 174);
        vehicle.addModel("Ccc", 791);
        vehicle.accept(visitor);*/


            //DAO 4.2
/*            Auto auto = new Auto("Ddd", 3);
            auto.defaultInit();


            DataTypeGetting file = new Text();
            file.set(auto);
            file.get();
            file.print();*/
        }
    }

