package com.empresa.CadastroNinjaSpring.Ninja;

import com.empresa.CadastroNinjaSpring.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
//Anotation do lombok: Colocar os getters and setters
@Data
//Anotation do lombok: Criar construtor sem argumentos
@NoArgsConstructor
//Anotation do lombok: Criar construtor com argumentos
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(unique = true,name = "email")
    private String email;
    @Column(name="img_url")
    private String imgUrl;
    @Column(name="idade")
    private int idade;

    //Um ninja só pode estar ligado apenas em uma missão
    @ManyToOne
    @JoinColumn(name="missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;

}
