import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("<from server>: " + new ProxyClient().send(7, 3));
    }
}
