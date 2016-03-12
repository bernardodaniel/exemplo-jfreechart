package exemplo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class ExemploJFreeChart {

	public static void main(String[] args) throws Exception {
		// cria o conjunto de dados
		DefaultPieDataset ds = new DefaultPieDataset();
		ds.setValue("Fiat", new Double( 20 ));
		ds.setValue("Ford", new Double( 40 ));
		ds.setValue("GM", new Double( 30 ));

		// cria o gráfico
		JFreeChart grafico = ChartFactory.createPieChart3D("Meu Grafico", ds, true, true, false);
		
		// cria um panel
		JFrame frame = new JFrame("Minha janela");
		frame.add(new ChartPanel(grafico));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
		// cria a imagem
//		OutputStream arquivo = new FileOutputStream("grafico.png");
//		ChartUtilities.writeChartAsPNG(arquivo, grafico, 550, 400);
//		arquivo.close();


	}

}
