package br.com.dio.testgof;

import br.com.dio.gof.facade.Facade;

public class TesteFacade {

	public static void main(String[] args) {
		
		Facade facade = new Facade();
		facade.migrarCliente("Eduardo", "999.999.999-99");

	}

}
