package sun.hr_management.mapper;

import sun.hr_management.dto.EmployeeDto;
import sun.hr_management.entity.Employee;

public interface EmployeeMapper {
    public EmployeeDto entityToDto(Employee entity);
    public Employee dtoToEntity(EmployeeDto dto);
}
