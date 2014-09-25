import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

/**
 * Created by lenovo on 25/09/2014.
 */
public class Application {

    public static void main(String[] args) {

        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
