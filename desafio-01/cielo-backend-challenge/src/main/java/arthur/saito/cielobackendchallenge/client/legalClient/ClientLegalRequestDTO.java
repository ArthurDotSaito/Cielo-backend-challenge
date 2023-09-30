package arthur.saito.cielobackendchallenge.client.legalClient;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientLegalRequestDTO {
    private UUID uuid;
    private String cnpj;
    private String razaoSocial;
    private String mcc;
    private String cpf;
    private String name;
    private String email;

}
