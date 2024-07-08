package sun.hr_management.mapper.impl;

import org.springframework.beans.BeanUtils;
import sun.hr_management.dto.EmployeeDto;
import sun.hr_management.entity.Employee;
import sun.hr_management.mapper.EmployeeMapper;

public class EmployeeMapperImpl implements EmployeeMapper {
    @Override
    public EmployeeDto entityToDto(Employee entity) {
        EmployeeDto dto = new EmployeeDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public Employee dtoToEntity(EmployeeDto dto) {
        Employee entity = new Employee();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
