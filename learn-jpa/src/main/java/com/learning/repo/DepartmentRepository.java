package com.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
