import java.sql.Date;
import java.time.LocalDate;
import java.util.GregorianCalendar;

import org.apache.axis.types.Year;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager bCustomerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("RESUL");
		customer.setLastName("ERTÜRK");
		customer.setDateOfBirth(LocalDate.of(1111, 1, 1));
		customer.setNationalityId(12345678901L);

		bCustomerManager2.save(customer);
		
	}

}
