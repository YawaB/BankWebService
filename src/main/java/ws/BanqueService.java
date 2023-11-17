package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;


@WebService(serviceName = "BanqueWS")
public class BanqueService {


    @WebMethod
    public double Conversion(@WebParam(name = "montant") double mt) {
        return mt * 11;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random() * 988, new Date());
    }

    @WebMethod
    public List<Compte> listCompte() {
        return List.of(
                new Compte(1, 10000, new Date()),
                new Compte(2, 10000, new Date()),
                new Compte(3, 10000, new Date())
        );
    }

}
