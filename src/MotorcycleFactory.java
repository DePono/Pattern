public class MotorcycleFactory implements TransportFactory{
    public Vehicle createInstance(String mark, int arraySize) {
        return new Auto(mark,arraySize);
    }
}