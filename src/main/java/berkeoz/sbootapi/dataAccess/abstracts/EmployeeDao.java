package berkeoz.sbootapi.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import berkeoz.sbootapi.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	Employee getByFirstName(String firstName);
}
