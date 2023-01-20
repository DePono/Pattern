import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public interface Command {
    void write_to_file (Auto auto, FileWriter fileWriter) throws IOException;
}
