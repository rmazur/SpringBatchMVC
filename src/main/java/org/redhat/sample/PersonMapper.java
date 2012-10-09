package org.redhat.sample;

import java.sql.Date;

import org.redhat.sample.bean.Person;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;

/**
 * @author Unice
 * 
 */
@Component("personMapper")
public class PersonMapper implements FieldSetMapper<Object> {

	private final static String DATE_PATTERN = "dd.mm.yyyy";

	@Override
	public Object mapFieldSet(FieldSet fs) {
		Person item = new Person();
		int idx = 0;

		item.setFirstname(fs.readString(idx++));
		item.setLastname(fs.readString(idx++));
		item.setGender(fs.readString(idx++));
		item.setDob((java.sql.Date) new Date((fs.readDate(idx++,
				DATE_PATTERN)).getTime()));
		return item;

	}

}
