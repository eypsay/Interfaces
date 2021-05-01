package interfaces;

//implemets: logger'ý smslogger'a uyarla demek
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("sms gönderildi" + message);
	}

}
