package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] loggers = { new EmailLogger(), new SmsLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer eyyup = new Customer(1, "eyup", "sayilir");
		customerManager.add(eyyup);
	}

}
// Interface'ler new lenenmez!!!!'