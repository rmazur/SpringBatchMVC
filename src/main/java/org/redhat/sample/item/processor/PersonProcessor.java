package org.redhat.sample.item.processor;

import org.redhat.sample.bean.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonProcessor implements ItemProcessor<Person, Person> {

	@Override
	public Person process(Person person) throws Exception {
		Person item = null;
		if(person.getGender().equals("Female")){
			item = person;
		}
		return item;
	}

}
