import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import Exeptions.NoSuchModelNameException;
import Exeptions.DuplicateModelNameException;
import Exeptions.ModelPriceOutOfBoundsException;

public class Auto implements Vehicle, Serializable, Cloneable {
    // 1 поле типа String, хранящее марку автомобиля
    private String mark;
    private Command command = new RowCommand();
    private AutoIterator autoIterator;

    // 2 метод получения марки автомобиля
    public String getMark() {
        return mark;
    }

    // класс Автомобиль хранит массив моделей
    private Model[] ModelArray;

    // 3 метод для модификации марки автомобиля,
    public void setMark(String mark) {
        this.mark = mark;
    }
    //4 внутренний класс Модель, имеющий поля название модели (уникальное) и её цену, а также конструктор (класс Автомобиль хранит массив Моделей)

    private class Model implements Serializable, Cloneable {
        private String ModelName;
        private double ModelPrice;

        public String getModelName() {
            return ModelName;
        }

        public void setModelPrice(double modelPrice) {
            ModelPrice = modelPrice;
        }

        public double getModelPrice() {
            return ModelPrice;
        }

        public Model(String ModelName, double ModelPrice) {
            this.ModelName = ModelName;
            this.ModelPrice = ModelPrice;
        }

        // 4 лабораторная работа
        public int hashCode() {
            int result = ModelName == null ? 0 : ModelName.hashCode();
            result = (int) (result + ModelPrice);
            return result;
        }

        @Override
        public Model clone() throws CloneNotSupportedException {
            Model clone = (Model) super.clone();
            return new Model(ModelName, ModelPrice);
        }
        public String toString() {
            return ModelName + "  " + ModelPrice;
        }
    }

    // конструктор класса должен принимать Марку и размер массивов Моделей
    public Auto(String Mark, int n) {
        mark = Mark;
        ModelArray = new Model[n];
        for (int i = 0; i < n; i++)
            ModelArray[i] = new Model(mark + i, 200 + i);
    }

    @Override
    public Auto clone() throws CloneNotSupportedException {
        Auto clone = (Auto) super.clone();
        clone.ModelArray = this.ModelArray.clone();
        for (int i = 0; i < ModelArray.length; i++) {
            clone.ModelArray[i] = this.ModelArray[i].clone();
        }
        return clone;
    }

    // 5 метод обновления названия модели
    public void setModelName(String oldName, String modelName) throws DuplicateModelNameException, NoSuchModelNameException {
        if (hasModelByName(modelName)) throw new DuplicateModelNameException(modelName);
        int index = getIndexByName(oldName);
        if (index != -1) ModelArray[index].ModelName = modelName;
        else {
            throw new NoSuchModelNameException(oldName);
        }
    }

    // 6.	метод, возвращающий массив названий всех моделей
    public String[] getAllModelNames() {
        int length = ModelArray.length;
        String[] NamesArray = new String[length];
        for (int i = 0; i < length; i++) {
            NamesArray[i] = ModelArray[i].getModelName();
        }
        return NamesArray;
    }

    // 7 метод для получения значения цены модели по её названию
    public double getPriceModelByName(String modelName) throws NoSuchModelNameException {
        for (Model model : ModelArray)
            if (model.ModelName.equals(modelName))
                return model.ModelPrice;
        throw new NoSuchModelNameException(modelName);

    }

    // 8.	метод для модификации значения цены модели по её названию, добавить проверку на цену
    public void setPriceModelByName(String modelName, double newPrice) throws NoSuchModelNameException {
        boolean isChange = true;
        if (newPrice < 0) throw new ModelPriceOutOfBoundsException();
        for (Model model : ModelArray)
            if (Objects.equals(model.getModelName(), modelName)) {
                model.setModelPrice(newPrice);
                isChange = false;
                break;
            }
        if (isChange) throw new NoSuchModelNameException(modelName);
    }

    // 9.	метод, возвращающий массив значений цен моделей
    public double[] getAllModelPrices() {
        int lenght = ModelArray.length;
        double[] PricesArray = new double[lenght];
        for (int i = 0; i < lenght; i++)
            PricesArray[i] = ModelArray[i].getModelPrice();
        return PricesArray;
    }

    // 10 метод добавления названия модели и её цены (путем создания нового массива Моделей), использовать метод Arrays.copyOf()
    public void addModel(String modelName, double modelPrice) throws DuplicateModelNameException {
        if (modelPrice < 0) throw new ModelPriceOutOfBoundsException();
        for (Model model : ModelArray)
            if (Objects.equals(model.getModelName(), modelName)) throw new DuplicateModelNameException(modelName);
        ModelArray = Arrays.copyOf(ModelArray, ModelArray.length + 1);
        ModelArray[ModelArray.length - 1] = new Model(modelName, modelPrice);

    }

    // проверяем, есть ли модель в списке
    public boolean hasModelByName(String modelName) {
        return Arrays.asList(getAllModelNames()).contains(modelName);
    }

    // получаем индекс из массива по имени
    public int getIndexByName(String modelName) {
        if (ModelArray != null) {
            return Arrays.asList(getAllModelNames()).indexOf(modelName);
        } else {
            return -1;
        }
    }

    //11 метод удаления модели по заданному имени, использовать методы System.arraycopy, Arrays.copyOf()
    public void deleteModel(String Name) throws NoSuchModelNameException {
        boolean flug = true;
        for (int i = 0; i < ModelArray.length; i++)
            if (Objects.equals(ModelArray[i].getModelName(), Name)) {
                flug = false;
                System.arraycopy(ModelArray, i + 1, ModelArray, i, ModelArray.length - i - 1);
                ModelArray = Arrays.copyOf(ModelArray, ModelArray.length - 1);
            }
        if (flug) throw new NoSuchModelNameException(Name);
    }

    // 12.метод для получения размера массива Моделей.
    public int getSizeModelArray() {
        return ModelArray.length;
    }

    @Override
    public void accept(Visitor visitor) throws NoSuchModelNameException {
        visitor.visit(this);
    }

    // 4 лабораторная работа


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Auto)) return false;
        if (Objects.equals(this.mark, ((Auto) o).mark)) {
            if (this.getSizeModelArray() == ((Auto) o).getSizeModelArray()) {
                return Arrays.equals(getAllModelPrices(), ((Auto) o).getAllModelPrices());
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mark);
        result = 31 * result + Arrays.hashCode(ModelArray);
        return result;
    }

    public void setPrintCommand(Command command) {
        this.command = command;
    }

    public void print(FileWriter fileWriter) throws IOException {
        if (this.command != null) {
            command.write_to_file(this, fileWriter);
        } else {
            System.out.println("Команда не задана");
        }
    }

    public AutoIterator iterator() {
        if (this.autoIterator != null) return this.autoIterator;
        else return new AutoIterator();
    }

    protected class AutoIterator implements java.util.Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < getSizeModelArray();
        }

        @Override
        public Model next() {
            return ModelArray[index++];
        }

        @Override
        public void remove() {
            deleteByIndex(index);
        }
    }

    public void deleteByIndex(int i) {
        Model[] copy = new Model[ModelArray.length - 1];
        System.arraycopy(ModelArray, 0, copy, 0, i);
        System.arraycopy(ModelArray, i + 1, copy, i, ModelArray.length - i - 1);
        ModelArray = copy;
    }

    public void defaultInit() throws DuplicateModelNameException {
        this.addModel("Elantra", 1500000);
        this.addModel("Solaris", 750000);
        this.addModel("Sonata", 400000);
    }

    public static class Memento implements Serializable {

        private static final ByteArrayOutputStream state = new ByteArrayOutputStream(64);


        public static void setAuto(Auto auto) throws IOException {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(state);
            objectOutputStream.writeObject(auto);
            state.close();
            objectOutputStream.close();
        }

        public ByteArrayOutputStream getCar() {
            return state;
        }

        public static Auto getAuto() throws IOException, ClassNotFoundException {
            byte[] buffer = state.toByteArray();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            byteArrayInputStream.close();
            objectInputStream.close();
            return (Auto) objectInputStream.readObject();

        }
    }


    public Memento createMemento() throws IOException {
        Memento.setAuto(this);
        return null;
    }
    public Auto setMemento(Memento memento) throws IOException, ClassNotFoundException {
        return Memento.getAuto();
    }
    public Model getModelByIndex(int i) {
        return ModelArray[i];
    }
}
