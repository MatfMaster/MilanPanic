package milan.panic.master.dependency.injection;

/** Konkretna implementacija servisa koji se umeće. */
public class ServiceImpl implements Service {

	@Override
	public void serviceMethod() {
		System.out.println("Service method");
	}

}
