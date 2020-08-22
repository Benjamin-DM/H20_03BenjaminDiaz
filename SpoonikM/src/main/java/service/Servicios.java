
//package service;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//
//
//public class Servicios {
//
//    public String datosAPI(int DNI) throws IOException, InterruptedException {
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
//                .uri(URI.create("https://api.reniec.cloud/dni/" + DNI + ""))
//                .GET()
//                .build();
//
//        HttpResponse<String> response = client.send(request,
//                HttpResponse.BodyHandlers.ofString());
//
//        return response.body();
//    }
//
//}
