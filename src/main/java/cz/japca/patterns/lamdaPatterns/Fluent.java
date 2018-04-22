package cz.japca.patterns.lamdaPatterns;

import java.util.function.Consumer;


class Mailer {

	public Mailer from(String addr) {
		System.out.println("from");
		return this;
	}

	public Mailer to(String addr) {
		System.out.println("to");
		return this;
	}

	public Mailer subject(String subjectLine) {
		System.out.println("subject");
		return this;
	}

	public Mailer body(String message) {
		System.out.println("body");
		return this;
	}

	public static void send(Consumer<Mailer> block) {
		block.accept(new Mailer());
		System.out.println("sending...");
	}
}

public class Fluent {
	public static void main(String[] args) {
		Mailer.send(mailer ->
				mailer.from("email@email.com")
						.to("email@email.com")
						.subject("Your email")
						.body("...")
		);
	}
}
