package br.com.dio.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Est� se movendo defensivamente!");
	}

}
