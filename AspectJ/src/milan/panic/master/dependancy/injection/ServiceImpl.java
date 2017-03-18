package milan.panic.master.dependancy.injection;

/** Konkretna implementacija servisa koji se umeće. */
public class ServiceImpl implements Service {

	@Override
	public void serviceMethod() {
		System.out.println("Service method");
	}

}
