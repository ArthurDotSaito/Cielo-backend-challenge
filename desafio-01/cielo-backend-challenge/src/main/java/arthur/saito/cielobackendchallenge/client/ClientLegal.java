package arthur.saito.cielobackendchallenge.client;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public final class ClientLegal extends Client{
    @Size(max = 14)
    @Pattern(regexp = "^[0-9]{14}$")
    private String cnpj;
    @Size(max = 14)
    private String razaoSocial;
    @Size(max = 11)
    @Pattern(regexp = "^[0-9]{11}$")
    private String cpf;
}
