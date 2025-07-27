package com.empresa.CadastroNinjaSpring.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long>{

}
