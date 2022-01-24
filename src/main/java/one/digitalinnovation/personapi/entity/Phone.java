package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data //geters e setters
@Builder //construtores
@NoArgsConstructor //construtor sem parametros
@AllArgsConstructor //construtor com parametros de todos as propriedades
public class Phone {

    @Id //campo do tipo id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gerar auto incremento da chave primaria
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;

}
