package com.moonbase.student.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.moonbase.student.dto.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

}
