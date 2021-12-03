package com.dailycodebuffer.department.service;


import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepositoy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepositoy departmentRepositoy;


    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepositoy.save(department);
    }


    public Department findDepartmentbyID(Long departmentId) {
        log.info("Inside findDepartmentById of DepartmentService");
        return departmentRepositoy.findByDepartmentId(departmentId);
    }
}
