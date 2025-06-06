package com.gabrielferreira02.timepedia.service;

import com.gabrielferreira02.timepedia.dto.SummaryResponse;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.stereotype.Service;

@Service
public class SummaryService {

    public SummaryResponse getSummary(String team) {
        String text = "Me conte sobre a historia de forma resumida, como se fosse uma redação porem sem titulo, do " + team + ", se não conhecer o time ou não tiver informações sobre, retorne 'Desculpe, não conheço o time'";

        Client client = new Client();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.0-flash",
                        text,
                        null);

        return new SummaryResponse(response.text());
    }
}
