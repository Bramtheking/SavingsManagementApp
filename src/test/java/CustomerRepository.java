import com.savings.Savings.JpaRepository;
import com.savings.Savings.Management.controller.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
