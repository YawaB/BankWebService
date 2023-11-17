import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class Service {


    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("Web service deployé sur la machine de Brie");
    }
}
