package de.gothaer;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class EndSubscriber<T> implements Subscriber<T> {

	private Subscription subscription;
	
	@Override
	public void onSubscribe(final Subscription subscription) {
		this.subscription = subscription;
		subscription.request(1);
	}

	@Override
	public void onNext(T item) {
		System.out.println(item);
		subscription.request(1);
	}

	@Override
	public void onError(Throwable throwable) {
		throwable.printStackTrace();
		System.out.println("Abbruch erkannt");
	}

	@Override
	public void onComplete() {
		System.out.println("Complete");
		
	}

}
