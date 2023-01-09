import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

public class ColumnCommand implements Command, Serializable{
    public void write_to_file(Auto auto, OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            for (String string : auto.getAllModelNames()) {
                string+="/n";
                byte[] buffer = string.getBytes();
                outputStream.write(buffer);
            }
        } else{
            System.out.println("Потока нет");
        }
    }
}
