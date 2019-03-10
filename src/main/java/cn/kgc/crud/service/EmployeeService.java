package cn.kgc.crud.service;

import cn.kgc.crud.dao.EmployeeMapper;
import cn.kgc.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by HP on 2019/3/10.
 */
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    //查询所有的员工
    public List<Employee> getAll(){
        return employeeMapper.selectByExampleWith(null);
    }

}
