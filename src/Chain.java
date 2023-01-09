import java.io.IOException;

public interface Chain {
    void write_to_file (Vehicle vehicle) throws IOException;
    void set_next_chain(Chain next_chain);
}
