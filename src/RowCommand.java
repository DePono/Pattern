import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

public class RowCommand implements Command, Serializable {
    @Override
    public void write_to_file(Auto auto, FileWriter fileWriter) throws IOException {
        if (fileWriter !=null) {
            for (String string: auto.getAllModelNames()){
                fileWriter.write(string + ",");
            }
            fileWriter.close();
        } else {
            System.out.println("Потока is gone...");
        }
    }
}
