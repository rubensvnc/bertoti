package com.bertoti.llama_with_tools;

import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//TODA CLASSE @CONFIGURATION OBRIGATORIAMENTE TEM QUE TER TODOS OS METODOS COMO @BEAN
@Configuration
public class AIConfig {

    @Bean
    public OllamaChatModel ollamaChatModel() {
        return OllamaChatModel.builder()
                .baseUrl("http://localhost:11434")
                .modelName("qwen3.5:2b")
                .temperature(0.3)
                .build();
    }

    @Bean
    public Assistant assistant(OllamaChatModel model, PassageiroService passageiroService) {
        return AiServices.builder(Assistant.class)
                .chatLanguageModel(model)
                .tools(passageiroService)
                .build();
    }
}

interface Assistant {
    String chat(String message);
}