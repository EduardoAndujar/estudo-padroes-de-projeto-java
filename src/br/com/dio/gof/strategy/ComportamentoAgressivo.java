package br.com.dio.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Est� se movendo agressivamente!");
	}

}
