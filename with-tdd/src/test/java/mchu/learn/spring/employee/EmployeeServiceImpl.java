package mchu.learn.spring.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

//    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return null;
    }

    @Override
    public Employee getEmployeeByName(String name) {
        return this.employeeRepository.findByName(name);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public boolean exists(String email) {
        return false;
    }

    @Override
    public Employee save(Employee employee) {
        return null;
    }

}
