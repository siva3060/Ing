

@Service
public class ValidationService{


	@Autowired
	CustomerRepository customerRepository;


	public boolean customerExist(int accountNumber){
		
		boolean customerExist = false;
		Customer validCustomer = new Customer();
		validCustomer = customerRepository.findByCustomerAccountNumber(accountNumber);
		if(validCustomer == true){
			customerExist = true;
		}

		return true;
	}
}
