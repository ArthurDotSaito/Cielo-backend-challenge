package arthur.saito.cielobackendchallenge.client.fisicalClient;

import arthur.saito.cielobackendchallenge.client.ClientFisical;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ClientFisicalResponseDTO(UUID uuid, String email, String name) {
    public ClientFisicalResponseDTO(ClientFisical clientFisical){
        this(clientFisical.getUuid(), clientFisical.getEmail(), clientFisical.getName());
    }

}
