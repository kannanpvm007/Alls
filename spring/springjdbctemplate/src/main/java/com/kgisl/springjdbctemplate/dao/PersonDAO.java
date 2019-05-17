package com.kgisl.springjdbctemplate.dao;

import java.util.List;

import com.kgisl.springjdbctemplate.model.Person;



public interface PersonDAO {
	Person getPersonById(Long id);

	List<Person> getAllPersons();

	boolean deletePerson(Person person);

	boolean updatePerson(Person person);

	boolean createPerson(Person person);
}