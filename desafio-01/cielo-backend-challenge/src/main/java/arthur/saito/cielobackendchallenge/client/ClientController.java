package arthur.saito.cielobackendchallenge.client;

import org.springframework.stereotype.Controller;

@Controller
public class ClientController {
    private final ClientService clientService;
    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

}
