package com.bertoti.llama_with_tools;

import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    public Assistant assistant(OllamaChatModel model, WeatherService weatherService) {
        return AiServices.builder(Assistant.class)
                .chatLanguageModel(model)
                .tools(weatherService) // O Spring injeta o service aqui automaticamente
                .build();
    }
}

// Interface pode ficar no mesmo pacote
interface Assistant {
    String chat(String message);
}