package sun.hr_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.hr_management.dto.EmployeeDto;
import sun.hr_management.entity.Employee;
import sun.hr_management.mapper.EmployeeMapper;
import sun.hr_management.repository.EmployeeRepository;
import sun.hr_management.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeDto> findAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees = employeeRepository.findAll();
        return employees.stream()
                .map(employeeMapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto dto) {
        Employee employee = employeeMapper.dtoToEntity(dto);
        Employee newEmployee = employeeRepository.save(employee);
        return employeeMapper.entityToDto(newEmployee);
    }
}
