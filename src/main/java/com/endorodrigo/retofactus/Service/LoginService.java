package com.endorodrigo.retofactus.Service;

import com.endorodrigo.retofactus.model.Login;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Slf4j
public class LoginService {
    public static String TOKEN = null;
    private final RestClient restClient;

    public LoginService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder.baseUrl("https://api-sandbox.factus.com.co").build();
    }


    public String login(String username, String password) {
        Login login = new Login(username, password);
        JsonNode body = null;
        try{
            ResponseEntity<JsonNode> response = restClient.post()
                    .uri("/oauth/token")
                    .contentType(APPLICATION_JSON)
                    .body(login)
                    .retrieve()
                    .toEntity(JsonNode.class);
            log.info("Request body {}", login.toString());
            log.info("Response status code: {}", response.getStatusCode());
            log.info("Response body: {}", response.getBody());

            if (response.getBody() != null) {
                body = response.getBody();
                TOKEN = body.get("access_token").asText();
            } else {
                log.info("Response body is empty");
            }
        } catch (Exception e) {
            log.error("Error: {}", e.getMessage());
        }
        return body != null ? "success" : null;
    }
}
