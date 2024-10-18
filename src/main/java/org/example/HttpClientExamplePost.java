package org.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class HttpClientExamplePost {
    public static void main(String[] args) {
        // Create HttpClient instance
        HttpClient client = HttpClient.newHttpClient();

        // Build the request with POST method and JSON body
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString("{\"userId\":1}"))
                .build();

        // Send the request asynchronously
        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        // Handle the response when it's available
        response.thenAccept(res -> {
            System.out.println("Response Body: " + res.body());
        }).join();  // Ensure the program waits for completion
    }
}
