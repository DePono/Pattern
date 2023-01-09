import java.io.IOException;
import java.io.OutputStream;

public interface Command {
    void write_to_file (Auto auto, OutputStream outputStream) throws IOException;
}
