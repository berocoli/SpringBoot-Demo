package berkeoz.sbootapi.dataAccess.abstracts;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import berkeoz.sbootapi.entities.concretes.Employee;
import jakarta.annotation.Nullable;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	Employee getByFirstNameAndLastName(String firstName, @Nullable String lastName);
	List<Employee> getByTitle(String title);
	List<Employee> getByTitleOfCourtesy(String titleOfCourtesy);
	List<Employee> getByCountry(String country);
	List<Employee> getByRegion(String region);
}
