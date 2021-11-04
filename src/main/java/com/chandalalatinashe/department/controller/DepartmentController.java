package com.chandalalatinashe.department.controller;

import com.chandalalatinashe.department.entity.Department;
import com.chandalalatinashe.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/")
    public Department saveDept(@RequestBody Department department){
        log.info("Inside saveDept method of DepartmentController");
        return departmentService.saveDept(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long id){
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(id);

    }
}
