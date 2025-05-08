package app.conversor;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public Moeda converter(String origem, String destino, double valor, String chave_key) {

        String url = "https://v6.exchangerate-api.com/v6/"+chave_key+"/pair/" + origem + "/" + destino + "/" + valor;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(url)).
                build();
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode()!=200){
                System.out.println("Erro ao converter. Por favor verifique sua chave API.");
                return null;

            }

        } catch (InterruptedException | IOException e) {
            throw new RuntimeException("Nao Conseguimos Encontrar Essa Moeda");
        }

        var result = response.body();

        return new Gson().fromJson(result, Moeda.class);
    }
}
