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

		
		//UTILS s�n�f� yazd�g�m icin kapatt�k		
//		for (Logger logger : loggers) {
//			logger.log(customer.getFirstName());
//		}
		
	///	Utils utils = new Utils(); bunu new lemek yerine static yapar�z
	///utils.runLoggers(loggers, customer.getFirstName());//Static icin S�n�f�n ismini verip kulan�l�r
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}

	public void delete(Customer customer) {
		System.out.println("Musteri silindi" + customer.getFirstName());

//		DatabaseLogger logger = new DatabaseLogger();
//		logger.log(customer.getFirstName() + " veri taban�na logland�!");

		///Asagida static'e cevirek yazd�k
//		for (Logger logger : loggers) {
//			logger.log(customer.getFirstName());
//		}
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}
}
//CustomerManager loglamaya bagimlidir.
//2 tur var. loosly-tigthly
//bu loosly(kati) bagimliliklari tighly ye cevirmemiz gerekir
