package com.bertoti.llama_with_tools;

import com.bertoti.llama_with_tools.entities.Passageiro;
import dev.langchain4j.agent.tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassageiroService {
    @Autowired private PassageiroRepository repository;

    @Tool("Return passanger info")
    public void getPassagengerInfo() {
        List<Passageiro> passageiros = repository.findAll();
        passageiros.forEach(passageiro -> System.out.println(passageiro.toString()));
    }
}
