package fr.efrei.rag.web.rest;


import fr.efrei.rag.web.rest.service.AssistantAiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssistantResource {
    private final AssistantAiService assitantAiService;

    public AssistantResource(AssistantAiService assitantAiService) {
        this.assitantAiService = assitantAiService;
    }

    @PostMapping("/assistant/chat")
    public String chat(String query) {
        return assitantAiService.chat(query);
    }
}
