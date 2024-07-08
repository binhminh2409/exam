package sun.hr_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.hr_management.dto.EmployeeDto;
import sun.hr_management.entity.Employee;
import sun.hr_management.repository.EmployeeRepository;
import sun.hr_management.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping(path = "/all")
    public List<EmployeeDto> findAllEmployee() {
        return employeeService.findAllEmployee();
    }

    @PostMapping(path = "/create")
    public EmployeeDto createEmployee(@RequestBody EmployeeDto dto) {
        return employeeService.createEmployee(dto);
    }
}
