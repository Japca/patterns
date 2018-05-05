package cz.japca.patterns.prototype;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;


/**
 * Created by Jakub Krhovják on 5/5/18.
 */

@Data
@Accessors(chain = true, fluent = true)
class Person implements Serializable {
	private String name;
	private Item item;

}

@Data
@Accessors(chain = true, fluent = true)
class Item implements Serializable {
	private String name;
	private int age;
}


@Slf4j
public class Prototype {

	public static void main(String[] args) {
		Person person1 = new Person().name("Person1")
				.item(new Item().name("Item1").age(1));

		Person person2 = SerializationUtils.roundtrip(person1);
		person2.name("person2").item().name("Item2").age(2);
		log.info("Person1 {}", person1);
		log.info("Person2 {}", person2);

	}
}
