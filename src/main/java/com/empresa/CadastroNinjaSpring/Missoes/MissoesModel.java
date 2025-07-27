package com.empresa.CadastroNinjaSpring.Missoes;

import com.empresa.CadastroNinjaSpring.Ninja.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    //Uma missão pode ter varios ninjas
    @OneToMany(mappedBy="missoes")
    private List<NinjaModel> ninja;
}
