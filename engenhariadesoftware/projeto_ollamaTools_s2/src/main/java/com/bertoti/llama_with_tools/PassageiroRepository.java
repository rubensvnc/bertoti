package com.bertoti.llama_with_tools;

import com.bertoti.llama_with_tools.entities.Passageiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassageiroRepository extends JpaRepository<Passageiro, Long> {

}
