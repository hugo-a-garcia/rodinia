package be.kuleuven.rodinia.epsilon.service.exception;

public class ParameterStateNotValidException extends RuntimeException {

	private static final long serialVersionUID = -5799709291992612940L;

	public ParameterStateNotValidException() {
	}

	public ParameterStateNotValidException(String message) {
		super(message);
	}

	public ParameterStateNotValidException(Throwable cause) {
		super(cause);
	}

	public ParameterStateNotValidException(String message, Throwable cause) {
		super(message, cause);
	}

	public ParameterStateNotValidException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
