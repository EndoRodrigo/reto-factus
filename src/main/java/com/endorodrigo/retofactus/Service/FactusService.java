package com.endorodrigo.retofactus.Service;

import com.endorodrigo.retofactus.model.Factus;
import com.endorodrigo.retofactus.model.Login;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import static com.endorodrigo.retofactus.Service.LoginService.TOKEN;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Slf4j
public class FactusService {
    private final RestClient restClient;

    public FactusService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder.baseUrl("https://api-sandbox.factus.com.co").build();

    }


    public String postDataWithToken(Factus factus) {
        try {
            log.info("toke! {}", TOKEN);

            // Realizar la solicitud HTTP
            ResponseEntity<String> response = restClient.post()
                    .uri("/v1/bills/validate")
                    .header("Authorization", "Bearer " + TOKEN)
                    .contentType(APPLICATION_JSON)
                    .body(factus)  // Usamos bodyValue en lugar de body para enviar el cuerpo correctamente
                    .retrieve()
                    .toEntity(String.class);

            log.info("Response status code: {}", response.getStatusCode());

            if (response.getBody() != null) {
                log.info("Response body: {}", response.getBody());
            } else {
                log.info("Response body is empty");
            }

            return response.getBody() != null ? "success" : "failure";
        } catch (HttpStatusCodeException e) {
            // Si la respuesta HTTP tiene un error, puedes capturarlo aquí
            log.error("Error response: {}", e.getResponseBodyAsString());
            return "failure";
        } catch (RestClientException e) {
            // Si ocurre un error en la ejecución de la solicitud
            log.error("Error in request: {}", e.getMessage());
            return "failure";
        } catch (Exception e) {
            // Captura cualquier otra excepción que pueda ocurrir
            log.error("Unexpected error: {}", e.getMessage());
            return "failure";
        }
    }

}
