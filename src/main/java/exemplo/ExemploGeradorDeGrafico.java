package exemplo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploGeradorDeGrafico {

	public static void main(String[] args) {
		List<Montadora> montadoras = new ArrayList<Montadora>();
		montadoras.add(new Montadora("GM", 25.0));
		montadoras.add(new Montadora("Ford", 30.0));
		montadoras.add(new Montadora("Fiat", 40.0));
		
		JPanel painel = new GeradorDeGrafico(montadoras).getGraficoEmPainel();
		
		JFrame frame = new JFrame("Minha janela");
		frame.add(painel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
}
