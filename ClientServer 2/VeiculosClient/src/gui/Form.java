
package gui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import connection.ClientUDP;
import model.Veiculo;

public class Form extends javax.swing.JFrame {

	public Form() {
		initComponents();

	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		modeloField = new javax.swing.JTextField();
		marcaField = new javax.swing.JTextField();
		anoField = new javax.swing.JTextField();
		placaField = new javax.swing.JTextField();
		nomeField = new javax.swing.JTextField();
		enderecoField = new javax.swing.JTextField();
		dataDiaField = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		dataMesField = new javax.swing.JTextField();
		dataAnoField = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
		jLabel1.setText("Cadastro de Veículos");

		jLabel2.setText("Modelo:");

		jLabel3.setText("Marca:");

		jLabel4.setText("Ano:");

		jLabel5.setText("Placa:");

		jLabel6.setText("Nome Proprietário:");

		jLabel7.setText("Endereço:");

		jLabel8.setText("Data de Nascimento:");

		jButton1.setText("Enviar");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Limpar");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel9.setText("/");

		jLabel10.setText("/");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel1).addGap(104, 104, 104))
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(modeloField))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(marcaField))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(anoField))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(placaField))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel6)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(nomeField))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel8)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(dataDiaField, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel9)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(dataMesField, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel10)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(dataAnoField, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 87, Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel7)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(enderecoField)))
						.addContainerGap())
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(108, 108, 108).addComponent(jButton1)
						.addGap(18, 18, 18).addComponent(jButton2)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(modeloField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(marcaField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(anoField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(placaField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(enderecoField,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8)
								.addComponent(dataDiaField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(dataMesField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(dataAnoField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel9).addComponent(jLabel10))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton1).addComponent(jButton2))
						.addContainerGap(19, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}

	// Metodo enviar -----------------------------

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		// TODO add your handling code here:
		Veiculo veic = new Veiculo();
		veic.setModelo(this.modeloField.getText());
		veic.setMarca(this.marcaField.getText());
		// tratando conversao do ano
		try {

			int ano = Integer.parseInt(this.anoField.getText());
			veic.setAno(ano);

		} catch (NumberFormatException ex) {

			JOptionPane.showMessageDialog(this, "Informação de Ano incompatível!", "Erro", JOptionPane.ERROR_MESSAGE);
			return;

		}
		// fim tratamento ano

		veic.setPlaca(this.placaField.getText());
		veic.setNomeProprietario(this.nomeField.getText());
		veic.setEndereco(this.enderecoField.getText());

		// tratando data nascimento
		try {
			int dia = Integer.parseInt(this.dataDiaField.getText());
			int mes = Integer.parseInt(this.dataMesField.getText());
			int ano = Integer.parseInt(this.dataAnoField.getText());
			Calendar cal = new GregorianCalendar(ano, mes - 1, dia);
			veic.setDataNascimento(cal.getTime());
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Formato de Data Errado use DD MM AAAA");
			return;
		}
		// fim do tratamento data nascimento

		boolean success = ClientUDP.sendObject(veic);
		if (success) {
			JOptionPane.showMessageDialog(this, "Dados Enviados com Sucesso!");
			this.jButton2ActionPerformed(evt);
		} else {
			JOptionPane.showMessageDialog(this, "Falha no envio de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.anoField.setText("");
		this.dataAnoField.setText("");
		this.dataDiaField.setText("");
		this.dataMesField.setText("");
		this.enderecoField.setText("");
		this.marcaField.setText("");
		this.modeloField.setText("");
		this.placaField.setText("");
		this.nomeField.setText("");
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("GTK+".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (InstantiationException e) {
			System.out.println(e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		} catch (javax.swing.UnsupportedLookAndFeelException e) {
			System.out.println(e.getMessage());
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Form().setVisible(true);
			}
		});
	}

	private javax.swing.JTextField anoField;
	private javax.swing.JTextField dataAnoField;
	private javax.swing.JTextField dataDiaField;
	private javax.swing.JTextField dataMesField;
	private javax.swing.JTextField enderecoField;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField marcaField;
	private javax.swing.JTextField modeloField;
	private javax.swing.JTextField nomeField;
	private javax.swing.JTextField placaField;

}
