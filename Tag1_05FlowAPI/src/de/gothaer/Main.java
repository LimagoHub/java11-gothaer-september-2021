package de.gothaer;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws Exception{
		var liste = List.of("1","2","drei","4");
		EndSubscriber<Integer> subscriber = new EndSubscriber<>();

		ExecutorService service = Executors.newCachedThreadPool();
		Transformer<String, Integer> transformer = new Transformer<>(Integer::valueOf);

		transformer.subscribe(subscriber);

		try(SubmissionPublisher<String> publisher = new SubmissionPublisher<>(service, 256)){
			publisher.subscribe(transformer);

			liste.forEach(publisher::submit);
		}

		service.shutdown();
		service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);

		System.out.println("Fertig");

//		EndSubscriber<String> endSubscriber = new EndSubscriber<>();
//		try(SubmissionPublisher<String> publisher = new SubmissionPublisher<>()) {
//			publisher.subscribe(endSubscriber);
//			liste.forEach(publisher::submit);
//		}

	}

}
