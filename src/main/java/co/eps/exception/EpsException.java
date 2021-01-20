package co.eps.exception;

public class EpsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -171683720446357286L;

	public EpsException() {
		super();
	}

	public EpsException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public EpsException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public EpsException(String arg0) {
		super(arg0);
	}

	public EpsException(Throwable arg0) {
		super(arg0);
	}

}
