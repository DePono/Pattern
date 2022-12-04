import java.io.*;

public class Adapter {

    public void writeOutputStream(String ...arr) throws IOException {
        OutputStream outputStream = new FileOutputStream("WriteOutput.txt");
        try {
            for (String str : arr) {
                str += " ";
                byte[] buffer = str.getBytes();
                outputStream.write(buffer);
            }
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public void readOutputStream() throws IOException {
        InputStream inputStream = new FileInputStream("WriteOutput.txt");
    try {
        int i=-1;
        while((i=inputStream.read())!=-1){
            System.out.print((char)i);
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
