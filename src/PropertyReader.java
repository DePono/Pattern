import java.io.*;
import java.util.Properties;
// Создать файл настроек для приложения config.properties (использовать класс java.util.Properties для его чтения).
// Написать класс с использованием паттерна Singleton, который будет загружать данный файл (один раз) и отдавать экземпляр Properties по запросу.
// Продемонстрировать работу в методе main() через вывод считанных настроек в консоль.
public class PropertyReader {
    private static PropertyReader instance = null;
    static Properties properties = null;
    static InputStream in = null;
    public static String discipline = null;
    public static String dayOfWeek = null;
    public static String numberOfWork = null;
    private PropertyReader() {
        try {
            in = new FileInputStream(new File("resources/config.properties"));
            properties = new Properties();
            properties.load(in);
            discipline = properties.getProperty("DISCIPLINE");
            dayOfWeek = properties.getProperty("DAY_OF_WEEK");
            numberOfWork = properties.getProperty("NUMBER_OF_WORK");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static synchronized PropertyReader getInstance() throws IOException {

        if(instance==null){
            instance=new PropertyReader();
        } return instance;
    }

    public static void main(String[] args) throws IOException {
        PropertyReader propertyReader = PropertyReader.getInstance();
        PropertyReader propertyReader1 = PropertyReader.getInstance();
        String configuration = "Дисциплина "+ discipline+"\n"+"День недели "+ dayOfWeek+"\n"+"Номер задания "+ numberOfWork;
        String configuration1 = "Дисциплина "+ discipline+"\n"+"День недели "+ dayOfWeek+"\n"+"Номер задания "+ numberOfWork;
        System.out.println(configuration);
        System.out.println(configuration1);
        System.out.println(configuration.equals(configuration1));

    }
}