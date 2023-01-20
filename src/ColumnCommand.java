import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

public class ColumnCommand implements Command, Serializable {
    public void write_to_file(Auto auto, FileWriter fileWriter) throws IOException {
        if (fileWriter != null) {
            for (String string : auto.getAllModelNames()) {
                string += "\n";
                fileWriter.write(string);
            }
            fileWriter.close();
        } else {
            System.out.println("Поток is gone");
        }
    }
}

