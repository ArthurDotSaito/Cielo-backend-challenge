package arthur.saito.cielobackendchallenge.client;

import arthur.saito.cielobackendchallenge.client.fisicalClient.ClientFisicalRequestDTO;
import arthur.saito.cielobackendchallenge.client.legalClient.ClientLegalRequestDTO;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    private final ModelMapper modelMapper;

    public ClientService(ClientRepository repository, ModelMapper modelMapper) {
        this.clientRepository = repository;
        this.modelMapper = modelMapper;
    }
    private ClientFisicalRequestDTO convertToDtoFisical(Client client){
        return this.modelMapper.map(client, ClientFisicalRequestDTO.class);
    }

    private ClientLegalRequestDTO convertDtoLegal(Client client){
        return this.modelMapper.map(client, ClientLegalRequestDTO.class);
    }

    public ResponseEntity<?> createClient(){

    }
}
