package milan.panic.master.dependancy.injection;

public class InterfaceInjectionClient implements ServiceSetter {

	private Service service;

	/** Umetanje servisa preko interfejsa. */
	@Override
	public void setService(Service service) {
		this.service = service;
	}

}
