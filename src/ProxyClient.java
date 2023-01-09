import java.io.IOException;

public class ProxyClient {
    public ProxyClient() {}

    public String send(double a, double b) throws IOException {
        return new ClientCustomer().toServer(a, b);
    }

}
