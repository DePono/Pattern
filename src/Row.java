import java.io.FileWriter;
import java.io.IOException;

public class Row implements Chain {
    private Chain next_chain;
    @Override
    public void write_to_file(Vehicle vehicle) throws IOException {
        if (vehicle.getSizeModelArray()<=3){
            FileWriter outputStream = new FileWriter("write_to_row");
            for (String string: vehicle.getAllModelNames()){
                outputStream.write(string + "");
            }
            outputStream.close();
        }
    }

    @Override
    public void set_next_chain(Chain next_chain) {
        this.next_chain=next_chain;
    }
}
