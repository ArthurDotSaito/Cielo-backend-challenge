package arthur.saito.cielobackendchallenge.client.fisicalClient;

import arthur.saito.cielobackendchallenge.client.ClientFisical;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientFisicalRequestDTO {
    private String cpf;
    private String mcc;
    private String name;
    private String email;
}
