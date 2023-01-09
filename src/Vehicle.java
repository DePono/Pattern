import Exeptions.DuplicateModelNameException;
import Exeptions.NoSuchModelNameException;
//  2 лабораторная работа (только интерфейс)
public interface Vehicle {
    String getMark();
    void setMark(String mark);
    void setModelName(String oldName, String newName) throws DuplicateModelNameException, NoSuchModelNameException;
    String[] getAllModelNames();
    double getPriceModelByName(String modelName) throws NoSuchModelNameException;
    void setPriceModelByName(String modelName, double price) throws NoSuchModelNameException,DuplicateModelNameException;
    double[] getAllModelPrices();
    void addModel(String modelName, double price) throws DuplicateModelNameException;
    void deleteModel(String modelName) throws NoSuchModelNameException;
    int getSizeModelArray();

    String toString();
}