package com.kgisl.controller.dao;

import java.util.List;

import com.kgisl.controller.model.Student;

/**
 * StudentDao
 */
public interface StudentDao {

    public int create(Student student);

	public List<Student> read();

	public List<Student> findStudentById(int studentId);

	public int update(Student student);

	public int delete(int studentId);
}