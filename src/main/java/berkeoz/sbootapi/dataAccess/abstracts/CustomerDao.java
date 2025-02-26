package berkeoz.sbootapi.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import berkeoz.sbootapi.entities.concretes.Customer;

public interface CustomerDao extends JpaRepository<Customer, String>{

}
