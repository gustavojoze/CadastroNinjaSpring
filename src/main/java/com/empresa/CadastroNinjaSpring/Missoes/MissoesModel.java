package com.empresa.CadastroNinjaSpring.Missoes;

import com.empresa.CadastroNinjaSpring.Ninja.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

