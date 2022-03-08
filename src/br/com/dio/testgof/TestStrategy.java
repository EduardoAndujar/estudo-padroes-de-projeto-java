package br.com.dio.testgof;

import br.com.dio.gof.strategy.Comportamento;
import br.com.dio.gof.strategy.ComportamentoAgressivo;
import br.com.dio.gof.strategy.ComportamentoDefensivo;
import br.com.dio.gof.strategy.ComportamentoNormal;
import br.com.dio.gof.strategy.Robo;

public class TestStrategy {

	public static void main(String[] args) {
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
	}
}
