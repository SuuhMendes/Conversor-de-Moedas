package org.example;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public Moeda converter(String origem, String destino, double valor) {
        String url = "https://v6.exchangerate-api.com/v6/18729af99782b68cc48aedf0/pair/" + origem + "/" + destino + "/" + valor;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(url)).
                build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (InterruptedException | IOException e) {
            throw new RuntimeException("Nao Conseguimos Encontrar Essa Moeda");
        }

        var result = response.body();

        return new Gson().fromJson(result, Moeda.class);
    }
}
