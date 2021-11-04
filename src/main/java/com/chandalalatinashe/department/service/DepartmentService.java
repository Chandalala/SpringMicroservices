package com.chandalalatinashe.department.service;

import com.chandalalatinashe.department.entity.Department;
import com.chandalalatinashe.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department saveDept(Department department) {
        log.info("Inside saveDept method of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long id) {
        log.info("Inside findDepartmentById method of DepartmentService");
        return departmentRepository.getById(id);

    }
}
