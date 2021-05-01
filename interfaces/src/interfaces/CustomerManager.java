package interfaces;

public class CustomerManager {
	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Musteri eklendi: " + customer.getFirstName());

		// eger file loglama istenirse butun dabaselogger lar� degistirmek zorunda
		// kal�rd�k
		// buras� loosly yani kat� bir sekilde bagimlidir.
//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log(customer.getFirstName() + " veri taban�na logland�!");
		
		//Dependency Injection yaparak alltaki kodu yazdik
	//	this.logger.log(customer.getFirstName());coklu yapacagimiz icin comment yapt�k
		
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
	}

	public void delete(Customer customer) {
		System.out.println("Musteri silindi" + customer.getFirstName());

//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log(customer.getFirstName() + " veri taban�na logland�!");
	
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
	}
}
//CustomerManager loglamaya bagimlidir.
//2 tur var. loosly-tigthly
//bu loosly(kati) bagimliliklari tighly ye cevirmemiz gerekir
