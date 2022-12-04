import java.io.*;

public class Adapter {

    public void writeOutputStream(String ...arr) throws IOException {
        OutputStream outputStream = new FileOutputStream("WriteOutput.txt");

        for (String str: arr) {
            str += " ";
            byte[] buffer = str.getBytes();
            outputStream.write(buffer);
        }
    }


    public void readOutputStream() throws IOException {
        InputStream inputStream = new FileInputStream("WriteOutput.txt");

        int i=-1;
        while((i=inputStream.read())!=-1){
            System.out.print((char)i);
        }
    }
}