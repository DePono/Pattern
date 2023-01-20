
import java.io.FileWriter;
import java.io.IOException;

public class Column implements Chain {
    private Chain next_chain;
    @Override
    public void write_to_file(Vehicle vehicle) throws IOException {
        if (vehicle.getSizeModelArray()>3) {
            FileWriter outputStream = new FileWriter("Write_to_column");

            for (String string : vehicle.getAllModelNames()) {
                string+="\n";
                outputStream.write(string);
            }
            outputStream.close();
        }else {
            next_chain.write_to_file(vehicle);
        }
    }

    @Override
    public void set_next_chain(Chain next_chain) {
        this.next_chain=next_chain;
    }
}
