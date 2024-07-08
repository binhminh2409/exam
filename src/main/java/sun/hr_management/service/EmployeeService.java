package sun.hr_management.service;

import sun.hr_management.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    public List<EmployeeDto> findAllEmployee();

    public EmployeeDto createEmployee(EmployeeDto dto);
}
