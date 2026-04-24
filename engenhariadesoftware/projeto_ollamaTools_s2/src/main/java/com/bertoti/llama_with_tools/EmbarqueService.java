package com.bertoti.llama_with_tools;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Service;

@Service
public class EmbarqueService {
    @Tool("Return the passanger info")
    public void getPassangerInfo(){

    }
}
