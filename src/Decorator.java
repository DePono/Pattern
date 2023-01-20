import Exeptions.DuplicateModelNameException;
import Exeptions.NoSuchModelNameException;

public class Decorator implements Vehicle{
    private final Vehicle vehicle;
    public Decorator(Vehicle vehicle) {
        this.vehicle=vehicle;
    }
    @Override
    public synchronized String getMark() {
        return vehicle.getMark();
    }

    @Override
    public synchronized void setMark(String mark) {
        vehicle.setMark(mark);
    }

    @Override
    public synchronized void setModelName(String oldName, String newName) throws DuplicateModelNameException, NoSuchModelNameException {
        vehicle.setModelName(oldName, newName);
    }

    @Override
    public synchronized String[] getAllModelNames() {
        return vehicle.getAllModelNames();
    }

    @Override
    public synchronized double getPriceModelByName(String modelName) throws NoSuchModelNameException {
        return vehicle.getPriceModelByName(modelName);
    }

    @Override
    public synchronized void setPriceModelByName(String modelName, double price) throws NoSuchModelNameException, DuplicateModelNameException {
        vehicle.setPriceModelByName(modelName, price);
    }

    @Override
    public synchronized double[] getAllModelPrices() {
        return vehicle.getAllModelPrices();
    }

    @Override
    public synchronized void addModel(String modelName, double price) throws DuplicateModelNameException {
        vehicle.addModel(modelName,price);
    }

    @Override
    public synchronized void deleteModel(String modelName) throws NoSuchModelNameException {
        vehicle.deleteModel(modelName);
    }

    @Override
    public synchronized int getSizeModelArray() {
        return vehicle.getSizeModelArray();
    }

    @Override
    public void accept(Visitor visitor) throws NoSuchModelNameException {

    }
}
