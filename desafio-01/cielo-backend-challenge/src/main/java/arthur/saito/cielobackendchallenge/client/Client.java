package arthur.saito.cielobackendchallenge.client;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public sealed abstract  class Client permits  ClientFisical, ClientLegal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private UUID uuid;
    @Size(max = 50)
    private String name;
    @Size(max = 4)
    private String mcc;
    @Pattern(regexp = "^[a-zA-Z0-9_\\-\\.]+@[a-zA-Z0-9_\\-\\.]+\\.[a-zA-Z]{2,5}$")
    private String email;
    @Enumerated(EnumType.STRING)
    private ClientCategory category;
}
