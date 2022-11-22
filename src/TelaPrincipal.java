import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaPrincipal {
	public TelaPrincipal() {
		
		//criando a tela
		JFrame tela = new JFrame();
		tela.setBounds(555,555,555,555);
		tela.setVisible(true);
		tela.setTitle("Tela Principal");
		tela.setLayout(new GridBagLayout());
		tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		//criando botoes
		JButton botao_abrir_tela_soma = new JButton("Somar");
		JButton botao_abrir_tela_subtracao = new JButton("Subtrair");
		JButton botao_abrir_tela_multiplicacao = new JButton("Multiplicar");
		JButton botao_abrir_tela_divisao = new JButton("Dividir");
		
		//configurando botoes
		botao_abrir_tela_soma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaSoma();
			}
		});
		
		botao_abrir_tela_subtracao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaSubtrair();
			}
		});
		
		botao_abrir_tela_multiplicacao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaMultiplicar();
			}
		});
		
		botao_abrir_tela_divisao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new TelaDividir();
			}
		});
		
		//adicionando botoes
		tela.add(botao_abrir_tela_soma);
		tela.add(botao_abrir_tela_subtracao);
		tela.add(botao_abrir_tela_multiplicacao);
		tela.add(botao_abrir_tela_divisao);

	}
}
