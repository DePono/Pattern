import Exeptions.DuplicateModelNameException;
import Exeptions.NoSuchModelNameException;

public class Decorator implements Vehicle{
    private Vehicle vehicle;
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

    }

    @Override
    public synchronized String[] getAllModelNames() {
        return new String[0];
    }

    @Override
    public synchronized double getPriceModelByName(String modelName) throws NoSuchModelNameException {
        return 0;
    }

    @Override
    public synchronized void setPriceModelByName(String modelName, double price) throws NoSuchModelNameException, DuplicateModelNameException {

    }

    @Override
    public synchronized double[] getAllModelPrices() {
        return new double[0];
    }

    @Override
    public synchronized void addModel(String modelName, double price) throws DuplicateModelNameException {

    }

    @Override
    public synchronized void deleteModel(String modelName) throws NoSuchModelNameException {

    }

    @Override
    public synchronized int getSizeModelArray() {
        return 0;
    }
}
