package com.ntk.employeeservice.query.projection;

import com.ntk.employeeservice.command.data.Employee;
import com.ntk.employeeservice.command.data.EmployeeRepository;
import com.ntk.employeeservice.query.model.EmployeeResponseModel;
import com.ntk.employeeservice.query.queries.GetAllEmployeeQuery;
import com.ntk.employeeservice.query.queries.GetDetailEmployeeQuery;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeProjection {
    @Autowired
    private EmployeeRepository employeeRepository;

    @QueryHandler
    public List<EmployeeResponseModel> handle(GetAllEmployeeQuery query){
        List<Employee> listEmployee = employeeRepository.findAllByIsDisciplined(query.getIsDisciplined());
        return listEmployee.stream().map(employee -> {
            EmployeeResponseModel model = new EmployeeResponseModel();
            BeanUtils.copyProperties(employee,model);
            return model;
        }).toList();
    }

    @QueryHandler
    public EmployeeResponseModel handle(GetDetailEmployeeQuery query) throws Exception{
        Employee employee = employeeRepository.findById(query.getId()).orElseThrow(() -> new Exception("Employee not found"));
        EmployeeResponseModel model = new EmployeeResponseModel();
        BeanUtils.copyProperties(employee,model);
        return model;
    }
}
