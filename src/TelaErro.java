import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class TelaErro {
	public TelaErro() {
		//criando tela
		JFrame tela = new JFrame();
		tela.setBounds(333,333,333,333);
		tela.setTitle("Erro");
		tela.setLayout(new GridBagLayout());
		tela.setVisible(true);
		tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		tela.add(new JLabel("Operação Inválida"));
	}
}
