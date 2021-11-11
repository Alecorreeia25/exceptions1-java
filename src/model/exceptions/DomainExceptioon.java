package model.exceptions;

public class DomainExceptioon extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainExceptioon(String msg) {
		super(msg);
	}
}
