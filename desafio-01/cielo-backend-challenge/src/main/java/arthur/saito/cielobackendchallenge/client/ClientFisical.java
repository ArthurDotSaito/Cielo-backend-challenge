package arthur.saito.cielobackendchallenge.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public final class ClientFisical extends Client{
    private String cpf;
    public ClientFisical(){
        setCategory(ClientCategory.FISICAL_CLIENT);
    }
}
