package de.main;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		BodyPublisher publisher = BodyPublishers.ofString("{\"a\":\"3\",\"b\":\"4\"}");
//
//		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:8085/demo/add?a=3&b=5")).GET()
//				.build();
		
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:8085/demo/add")).POST(publisher).setHeader("Content-Type", "application/json").build();

		HttpClient client = HttpClient.newBuilder().version(Version.HTTP_2).build();

//		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
//		
//		System.out.println(response.statusCode());
//		System.out.println("Ergebnis= " + response.body());

		CompletableFuture<HttpResponse<String>> future = client.sendAsync(request, BodyHandlers.ofString());

		future.thenAccept(res -> {
			System.out.println("status = " + res.statusCode());
			System.out.println("ergebnis = " + res.body());
		}).join();

		System.out.println("Fettiscch");
	}

}
