package com.dailycodebuffer.department.repository;

import com.dailycodebuffer.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositoy extends JpaRepository<Department, Long> {

    Department findByDepartmentId(Long departmentId);
}
