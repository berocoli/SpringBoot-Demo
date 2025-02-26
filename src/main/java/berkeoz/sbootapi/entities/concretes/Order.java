package berkeoz.sbootapi.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	@Id
	@Column(name = "order_id")
	private int orderId;
	@ManyToOne
    @JoinColumn(name="customer_id")  // Maps to the customer_id column
    private Customer customer;
    @ManyToOne
    @JoinColumn(name="employee_id") // Same
    private Employee employee;
	@Column(name = "order_date")
	private String orderDate;
	@Column(name = "required_date")
	private String requiredDate;
	@Column(name = "shipped_date")
	private String shippedDate;
	@Column(name = "ship_via")
	private int shipVia;
	@Column(name = "ship_city")
	private String shipCity;
	@Column(name = "ship_region")
	private String shipRegion;
	@Column(name = "ship_postal_code")
	private String shipPostalCode;
	@Column(name = "ship_country")
	private String shipCountry;

}
