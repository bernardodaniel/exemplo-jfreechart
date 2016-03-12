package exemplo;

import java.util.List;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class GeradorDeGrafico {

	private DefaultPieDataset ds;
	private List<Montadora> montadoras;
	private JFreeChart grafico;
	
	public GeradorDeGrafico(List<Montadora> montadoras) {
		this.montadoras = montadoras;
		constroiDataSet();
		criaGrafico();
	}

	private void criaGrafico() {
		grafico = ChartFactory.createPieChart3D("Meu Grafico", ds, true, true, false);
	}

	private void constroiDataSet() {
		ds = new DefaultPieDataset();
		
		for (Montadora montadora : montadoras) {
			ds.setValue(montadora.getNome(), montadora.getValor());
		}
		
	}
	
	public JPanel getGraficoEmPainel() {
		return new ChartPanel(grafico);
	}
	
}
