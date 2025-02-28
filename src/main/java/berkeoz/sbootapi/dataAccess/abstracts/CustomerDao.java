package berkeoz.sbootapi.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import berkeoz.sbootapi.entities.concretes.Customer;

public interface CustomerDao extends JpaRepository<Customer, String> {
	List<Customer> getByCompanyName(String companyName);
	List<Customer> getByContactName(String contactName);
	List<Customer> getByCity(String city);
	List<Customer> getByRegion(String region);
}
