package berkeoz.sbootapi.entities.concretes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "orders" })
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "employee_id")
	private int employeeId;
	@OneToMany(mappedBy = "employee")
	private List<Order> orders;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "title")
	private String title;
	@Column(name = "title_of_courtesy")
	private String titleOfCourtesy;
	@Column(name = "birth_date")
	private String birthDate;
	@Column(name = "hire_date")
	private String hireDate;
	@Column(name = "address")
	private String adress;
	@Column(name = "city")
	private String city;
	@Column(name = "region")
	private String region;
	@Column(name = "postal_code")
	private String postalCode;
	@Column(name = "country")
	private String country;
	@Column(name = "home_phone")
	private String homePhone;
	@Column(name = "extension")
	private String extension;
	@Column(name = "photo")
	private byte[] photo;
	@Column(name = "notes", length = 500)
	private String notes;
	@Column(name = "reports_to")
	private Integer reportsTo;
	@Column(name = "photo_path")
	private String photoPath;
}
