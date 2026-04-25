package com.bertoti.llama_with_tools.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passageiro {
    @Id
    private Long id_passageiro;
    private int pessoa;
    private int passagem_id;
}
