import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaDividir {
	public TelaDividir() {
		
		//Objeto de operacoes
		Operacoes op = new Operacoes();
		
		//criando tela
		JFrame tela = new JFrame();
		tela.setBounds(333,333,333,333);
		tela.setTitle("Dividir");
		tela.setLayout(new GridBagLayout());
		tela.setVisible(true);
		tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		//criando botao da operacao
		JButton dividir = new JButton("/");
		
		//criando label resultado
		JLabel resultado = new JLabel("=");
		
		//criando campos de entrada
		JTextField entrada1 = new JTextField();
		JTextField entrada2 = new JTextField();
		
		//estilizando entrada
		entrada1.setColumns(10);
		entrada2.setColumns(10);
		
		//adcionando componentes
		tela.add(entrada1);
		tela.add(dividir);
		tela.add(entrada2);
		tela.add(resultado);
		
		//configurando botao
		dividir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					resultado.setText("=" + op.dividir(entrada1.getText(), entrada2.getText()));
				} catch (Exception e2) {
					
				}
				
			}
		});
		
	}
}