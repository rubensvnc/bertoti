package com.bertoti.llama_with_tools;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    @Tool("Returns the current weather for a given city")
    public String getWeather(String city) {
        // In a real app, you'd call a weather API here.
        return "The weather in " + city + " is 22°C and sunny.";
    }
}
