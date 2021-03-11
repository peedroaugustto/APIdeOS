package com.treinamentoapi.osworks.domain.exception;

public class NegocioException extends RuntimeException {

	
	private static final long serialVersionUID = -1551782170464629230L;
	
	public NegocioException(String mensagem) {
		super(mensagem);
	}

}
