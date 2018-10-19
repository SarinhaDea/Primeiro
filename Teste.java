import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;

public class Teste {

	private JFrame frame;
	private JTextField txtVerbo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste window = new Teste();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Teste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 798, 798);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPresente = new JLabel("Presente:");
		lblPresente.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPresente.setForeground(Color.BLACK);
		lblPresente.setBounds(33, 87, 75, 16);
		frame.getContentPane().add(lblPresente);
		
		txtVerbo = new JTextField();
		txtVerbo.setBounds(10, 35, 114, 20);
		frame.getContentPane().add(txtVerbo);
		txtVerbo.setColumns(10);
		
		JLabel lblVerboRegular = new JLabel("Verbo Regular");
		lblVerboRegular.setForeground(Color.BLACK);
		lblVerboRegular.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblVerboRegular.setBounds(10, 11, 152, 16);
		frame.getContentPane().add(lblVerboRegular);
		
		JTextArea PresenteIndic = new JTextArea();
		PresenteIndic.setBounds(10, 114, 98, 144);
		frame.getContentPane().add(PresenteIndic);
		
		JTextArea PreteritoImpIndic = new JTextArea();
		PreteritoImpIndic.setBounds(134, 114, 98, 144);
		frame.getContentPane().add(PreteritoImpIndic);
		
		JLabel lblNewLabel_1 = new JLabel("Pret\u00E9rito Imperfeito\r:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(124, 87, 138, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Indicativo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(10, 66, 114, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pret\u00E9rito Perfeito:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBounds(272, 88, 144, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JTextArea PreteritoPerfIndic = new JTextArea();
		PreteritoPerfIndic.setBounds(272, 114, 98, 144);
		frame.getContentPane().add(PreteritoPerfIndic);
		
		JLabel lblNewLabel_4 = new JLabel("Pret\u00E9rito Mais");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(413, 66, 98, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JTextArea PreteritoMQPerfIndic = new JTextArea();
		PreteritoMQPerfIndic.setBounds(413, 114, 98, 144);
		frame.getContentPane().add(PreteritoMQPerfIndic);
		
		JLabel lblNewLabel_5 = new JLabel("que Perfeito:");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(413, 88, 98, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Futuro do Presente:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setBounds(510, 88, 138, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JTextArea FuturoPres = new JTextArea();
		FuturoPres.setBounds(531, 114, 98, 144);
		frame.getContentPane().add(FuturoPres);
		
		JLabel lblNewLabel_7 = new JLabel("Subjuntivo");
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 269, 114, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_10 = new JLabel("Futuro do Pret\u00E9rito:");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_10.setBounds(643, 88, 139, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_8 = new JLabel("Presente:");
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(33, 294, 75, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(10, 294, 46, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JTextArea FuturoPret = new JTextArea();
		FuturoPret.setBounds(653, 114, 98, 144);
		frame.getContentPane().add(FuturoPret);
		
		JTextArea PresenteSubj = new JTextArea();
		PresenteSubj.setBounds(10, 319, 98, 144);
		frame.getContentPane().add(PresenteSubj);
		
		JLabel lblNewLabel_11 = new JLabel("Pret\u00E9rito Imperfeito:");
		lblNewLabel_11.setForeground(Color.BLACK);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11.setBounds(124, 294, 138, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JTextArea PreteritoImpSubj = new JTextArea();
		PreteritoImpSubj.setBounds(134, 319, 98, 144);
		frame.getContentPane().add(PreteritoImpSubj);
		
		JLabel lblNewLabel_12 = new JLabel("Futuro:");
		lblNewLabel_12.setForeground(Color.BLACK);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12.setBounds(295, 294, 75, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JTextArea FuturoSubj = new JTextArea();
		FuturoSubj.setBounds(268, 319, 102, 154);
		frame.getContentPane().add(FuturoSubj);
		
		JLabel lblNewLabel_13 = new JLabel("Imperativo");
		lblNewLabel_13.setForeground(Color.BLACK);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_13.setBounds(397, 269, 98, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Afirmativo:");
		lblNewLabel_14.setForeground(Color.BLACK);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_14.setBounds(413, 294, 98, 14);
		frame.getContentPane().add(lblNewLabel_14);
		
		JTextArea ImpeAfir = new JTextArea();
		ImpeAfir.setBounds(397, 319, 102, 154);
		frame.getContentPane().add(ImpeAfir);
		
		JLabel lblNewLabel_15 = new JLabel("Negativo:");
		lblNewLabel_15.setForeground(Color.BLACK);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_15.setBounds(554, 294, 75, 14);
		frame.getContentPane().add(lblNewLabel_15);
		
		JTextArea ImperNeg = new JTextArea();
		ImperNeg.setBounds(531, 319, 102, 154);
		frame.getContentPane().add(ImperNeg);
		
		JLabel lblNewLabel_16 = new JLabel("Ger\u00FAndio:");
		lblNewLabel_16.setForeground(Color.BLACK);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_16.setBounds(33, 506, 75, 14);
		frame.getContentPane().add(lblNewLabel_16);
		
		JTextArea Gerundio = new JTextArea();
		Gerundio.setBounds(10, 531, 98, 154);
		frame.getContentPane().add(Gerundio);
		
		JLabel lblNewLabel_17 = new JLabel("Participio:");
		lblNewLabel_17.setForeground(Color.BLACK);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_17.setBounds(152, 506, 95, 14);
		frame.getContentPane().add(lblNewLabel_17);
		
		JTextArea Participio = new JTextArea();
		Participio.setBounds(134, 531, 98, 154);
		frame.getContentPane().add(Participio);
		
		JLabel lblNewLabel_18 = new JLabel("Infinitivo:");
		lblNewLabel_18.setForeground(Color.BLACK);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_18.setBounds(281, 506, 75, 14);
		frame.getContentPane().add(lblNewLabel_18);
		
		JTextArea Infinitivo = new JTextArea();
		Infinitivo.setBounds(268, 531, 102, 154);
		frame.getContentPane().add(Infinitivo);
		
		JLabel lblNewLabel_19 = new JLabel("Normal:");
		lblNewLabel_19.setForeground(Color.BLACK);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_19.setBounds(672, 294, 70, 14);
		frame.getContentPane().add(lblNewLabel_19);
		
		JTextArea Normal = new JTextArea();
		Normal.setBounds(653, 319, 98, 154);
		frame.getContentPane().add(Normal);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setIcon(new ImageIcon("D:\\Verbos\\imagens\\gifs-para-orkut-desenhos-56.gif"));
		lblNewLabel_20.setBounds(554, 531, 203, 163);
		frame.getContentPane().add(lblNewLabel_20);
		
		
		JLabel lblNewLabel_21 = new JLabel("Radical");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_21.setForeground(Color.BLACK);
		lblNewLabel_21.setBounds(423, 535, 75, 14);
		frame.getContentPane().add(lblNewLabel_21);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(397, 562, 120, 20);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_22 = new JLabel("Termina\u00E7\u00E3o");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_22.setForeground(Color.BLACK);
		lblNewLabel_22.setBounds(413, 593, 113, 14);
		frame.getContentPane().add(lblNewLabel_22);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(391, 613, 120, 20);
		frame.getContentPane().add(textArea_1);
		
		JButton btnConjugar = new JButton("Conjugar");
		btnConjugar.setBounds(137, 32, 98, 26);
		
		btnConjugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int tamanho = txtVerbo.getText().length();
				String terminadoEm = txtVerbo.getText().substring(tamanho-2, tamanho);
				String radical = txtVerbo.getText().substring(0, tamanho-2);
				
				switch (terminadoEm) {
					case "ar":{
						//Estudar
						PresenteIndic.setText("Eu  "+radical+"o" + "\n" +
						"Tu  "+radical+"as" + "\n" +
						"Ele "+radical+"a" + "\n" +
						"Nós "+radical+"amos" + "\n" +
						"Vós "+radical+"ais" + "\n" +
						"Eles " + radical+"am" + "\n");
						
			
						PreteritoImpIndic.setText("Eu  "+radical+"ava" + "\n" +
						"Tu  "+radical+"avas" + "\n" + 
						"Ele "+radical+"ava" + "\n" + 
						"Nós "+radical+"ávamos" + "\n" + 
						"Vós "+radical+"áveis" + "\n" + 
						"Eles " + radical+"avam" + "\n");
						
						
						
						PreteritoPerfIndic.setText("Eu  "+radical +"ei" + "\n" +
						"Tu  "+radical+"aste" + "\n" +
						"Ele "+radical+"ou" + "\n" +
						"Nós "+radical+"amos"  + "\n" +
						"Vós "+radical+"astes"+ "\n" +
						"Eles " + radical+"aram" + "\n");
						
						
						
						PreteritoMQPerfIndic.setText("Eu  "+radical+"ara" + "\n" +
						"Tu  "+radical+"aras" + "\n" +
						"Ele "+radical+"ara" + "\n" +
						"Nós "+radical+"áramos" + "\n" +
						"Vós "+radical+"áreis" + "\n" +
						"Eles " + radical+"aram" + "\n");
						
						
						
						FuturoPres.setText("Eu  "+radical+"arei" + "\n" +
						"Tu  "+radical+"arás" + "\n" +
						"Ele "+radical+"ará" + "\n" +
						"Nós "+radical+"aremos" + "\n" +
						"Vós "+radical+"areis" + "\n" +
						"Eles " + radical+"arão" + "\n");
						
						
						
						FuturoPret.setText("Eu  "+radical+"aria" + "\n" +
						"Tu  "+radical+"arias" + "\n" +
						"Ele "+radical+"aria" + "\n" +
						"Nós "+radical+"aríamos" + "\n" +
						"Vós "+radical+"aríeis" + "\n" +
						"Eles " + radical+"ariam" + "\n");
						
						
						PresenteSubj.setText("Eu  "+radical+"e" + "\n" +
						"Tu  "+radical+"es" + "\n" +
						"Ele "+radical+"e" + "\n" +
						"Nós "+radical+"emos" + "\n" +
						"Vós "+radical+"eis" + "\n" +
						"Eles " + radical+"em" + "\n");
						
						
						
						PreteritoImpSubj.setText("Eu  "+radical+"asse" + "\n" +
						"Tu  "+radical+"asses" + "\n" +
						"Ele "+radical+"asse" + "\n" +
						"Nós "+radical+"ássemos" + "\n" +
						"Vós "+radical+"ásseis" + "\n" +
						"Eles " + radical+"assem" + "\n");
						
						
						
						FuturoSubj.setText("Eu  "+radical+"ar" + "\n" +
						"Tu  "+radical+"ares" + "\n" +
						"Ele "+radical+"ar" + "\n" +
						"Nós "+radical+"armos" + "\n" +
						"Vós "+radical+"ardes" + "\n" +
						"Eles " + radical+"arem" + "\n");
						
						
						
				
						ImpeAfir.setText("Eu  ---  " + "\n" +
						"Tu  "+radical+"a" + "\n" +
						"Ele "+radical+"e" + "\n" +
						"Nós "+radical+"emos" + "\n" +
					    "Vós "+radical+"ai" + "\n" +
						"Eles " + radical+"em" + "\n");
						
						
					
						ImperNeg.setText("Eu  ---  " + "\n" +
						"Tu  "+radical+"es" + "\n" +
						"Ele "+radical+"e" + "\n" +
						"Nós "+radical+"emos" + "\n" +
						"Vós "+radical+"eis" + "\n" +
						"Eles " + radical+"em" + "\n");
						
					
						Gerundio.setText("Eu  "+radical+"ando" + "\n" +
						"Tu  "+radical+"ando" + "\n" +
						"Ele "+radical+"ando" + "\n" +
						"Nós "+radical+"ando" + "\n" +
						"Vós "+radical+"ando" + "\n" +
						"Eles " + radical+"ando" + "\n");
						
						
					
						Participio.setText("Eu  "+radical+"ado" + "\n" +
						"Tu  "+radical+"ado" + "\n" +
						"Ele "+radical+"ado" + "\n" +
						"Nós "+radical+"ado" + "\n" +
						"Vós "+radical+"ado" + "\n" +
						"Eles " + radical+"ado" + "\n");
						
						
						Normal.setText("Eu  "+radical+"ar" + "\n" +
						"Tu  "+radical+"ar" + "\n" +
						"Ele "+radical+"ar" + "\n" +
						"Nós "+radical+"ar" + "\n" +
						"Vós "+radical+"ar" + "\n" +
						"Eles " + radical+"ar" + "\n");
						
						
						
						
						Infinitivo.setText("Eu  "+radical+"ar" + "\n" +
						"Tu  "+radical+"ares" + "\n" +
						"Ele "+radical+"ar" + "\n" +
						"Nós "+radical+"armos" + "\n" +
						"Vós "+radical+"ardes" + "\n" +
						"Eles " + radical+"arem" + "\n");
						
						
						
						
						
					}break;
	
					case "er":{
						//Escrever
						
						PresenteIndic.setText("Eu  "+radical+"o" + "\n" +
						"Tu  "+radical+"es" + "\n" +
						"Ele "+radical+"e" + "\n" +
						"Nós "+radical+"emos" + "\n" +
						"Vós "+radical+"eis" + "\n" +
						"Eles " + radical+"em" + "\n");
						
						
						
						PreteritoImpIndic.setText("Eu  "+radical+"ia" + "\n" +
						"Tu  "+radical+"ias" + "\n" + 
						"Ele "+radical+"ia" + "\n" + 
						"Nós "+radical+"íamos" + "\n" + 
						"Vós "+radical+"íeis" + "\n" + 
						"Eles " + radical+"iam" + "\n");
						
						
						
						PreteritoPerfIndic.setText("Eu  "+radical +"i" + "\n" +
						"Tu  "+radical+"este" + "\n" +
						"Ele "+radical+"eu" + "\n" +
						"Nós "+radical+"emos" + "\n" +
						"Vós "+radical+"estes" + "\n" +
						"Eles " + radical+"eram" + "\n");
						
						
						
						PreteritoMQPerfIndic.setText("Eu  "+radical+"era" + "\n" +
						"Tu  "+radical+"eras" + "\n" +
						"Ele "+radical+"era" + "\n" +
						"Nós "+radical+"êramos" + "\n" +
						"Vós "+radical+"êreis" + "\n" +
						"Eles " + radical+"eram" + "\n");
						
						
						
						FuturoPres.setText("Eu  "+radical+"erei" + "\n" +
						"Tu  "+radical+"erás" + "\n" +
						"Ele "+radical+"erá" + "\n" +
						"Nós "+radical+"eremos" + "\n" +
						"Vós "+radical+"ereis" + "\n" +
						"Eles " + radical+"erão" + "\n");
						
						
						
						FuturoPret.setText("Eu  "+radical+"eria" + "\n" +
						"Tu  "+radical+"erias" + "\n" +
						"Ele "+radical+"eria" + "\n" +
						"Nós "+radical+"eríamos" + "\n" +
						"Vós "+radical+"eríeis" + "\n" +
						"Eles " + radical+"eriam" + "\n");
						
						
						PresenteSubj.setText("Eu  "+radical+"a" + "\n" +
						"Tu  "+radical+"as" + "\n" +
						"Ele "+radical+"a" + "\n" +
						"Nós "+radical+"amos" + "\n" +
						"Vós "+radical+"ais" + "\n" +
						"Eles " + radical+"am" + "\n");
						
						
						
						PreteritoImpSubj.setText("Eu  "+radical+"esse" + "\n" +
						"Tu  "+radical+"esses" + "\n" +
						"Ele "+radical+"esse" + "\n" +
						"Nós "+radical+"êssemos" + "\n" +
						"Vós "+radical+"esseis" + "\n" +
						"Eles " + radical+"essem" + "\n");
						
						
						
						FuturoSubj.setText("Eu  "+radical+"er" + "\n" +
						"Tu  "+radical+"eres" + "\n" +
						"Ele "+radical+"er" + "\n" +
						"Nós "+radical+"ermos" + "\n" +
						"Vós "+radical+"erdes" + "\n" +
						"Eles " + radical+"erem" + "\n");
						
						
						
				
						ImpeAfir.setText("Eu  ---  " + "\n" +
						"Tu  "+radical+"e" + "\n" +
						"Ele "+radical+"a" + "\n" +
						"Nós "+radical+"amos" + "\n" +
					    "Vós "+radical+"ei" + "\n" +
						"Eles " + radical+"am" + "\n");
						
						
					
						ImperNeg.setText("Eu  ---  " + "\n" +
						"Tu  "+radical+"as" + "\n" +
						"Ele "+radical+"a" + "\n" +
						"Nós "+radical+"amos" + "\n" +
						"Vós "+radical+"ais" + "\n" +
						"Eles " + radical+"am" + "\n");
						
					
						Gerundio.setText("Eu  "+radical+"endo" + "\n" +
						"Tu  "+radical+"endo" + "\n" +
						"Ele "+radical+"endo" + "\n" +
						"Nós "+radical+"endo" + "\n" +
						"Vós "+radical+"endo" + "\n" +
						"Eles " + radical+"endo" + "\n");
						
						
					
						Participio.setText("Eu  "+radical+"edo" + "\n" +
						"Tu  "+radical+"edo" + "\n" +
						"Ele "+radical+"edo" + "\n" +
						"Nós "+radical+"edo" + "\n" +
						"Vós "+radical+"edo" + "\n" +
						"Eles " + radical+"edo" + "\n");
						
						
						Normal.setText("Eu  "+radical+"er" + "\n" +
						"Tu  "+radical+"er" + "\n" +
						"Ele "+radical+"er" + "\n" +
						"Nós "+radical+"er" + "\n" +
						"Vós "+radical+"er" + "\n" +
						"Eles " + radical+"er" + "\n");
						
						
						
						
						Infinitivo.setText("Eu  "+radical+"er" + "\n" +
						"Tu  "+radical+"eres" + "\n" +
						"Ele "+radical+"er" + "\n" +
						"Nós "+radical+"ermos" + "\n" +
						"Vós "+radical+"erdes" + "\n" +
						"Eles " + radical+"erem" + "\n");
						
					}break;
	
					case "ir":{
						//Dividir
						
						PresenteIndic.setText("Eu  "+radical+"o" + "\n" +
						"Tu  "+radical+"es" + "\n" +
						"Ele "+radical+"e" + "\n" +
						"Nós "+radical+"imos" + "\n" +
						"Vós "+radical+"is" + "\n" +
						"Eles " + radical+"em" + "\n");
						
						
						
						PreteritoImpIndic.setText("Eu  "+radical+"ia" + "\n" +
						"Tu  "+radical+"ias" + "\n" + 
						"Ele "+radical+"ia" + "\n" + 
						"Nós "+radical+"íamos" + "\n" + 
						"Vós "+radical+"íeis" + "\n" + 
						"Eles " + radical+"iam" + "\n");
						
						
						
						PreteritoPerfIndic.setText("Eu  "+radical +"i" + "\n" +
						"Tu  "+radical+"iste" + "\n" +
						"Ele "+radical+"iu" + "\n" +
						"Nós "+radical+"imos"  + "\n" +
						"Vós "+radical+"istes" + "\n" +
						"Eles " + radical+"iram" + "\n");
						
						
						
						PreteritoMQPerfIndic.setText("Eu  "+radical+"ira" + "\n" +
						"Tu  "+radical+"iras" + "\n" +
						"Ele "+radical+"ira" + "\n" +
						"Nós "+radical+"íriamos" + "\n" +
						"Vós "+radical+"íreis" + "\n" +
						"Eles " + radical+"iram" + "\n");
						
						
						
						FuturoPres.setText("Eu  "+radical+"irei" + "\n" +
						"Tu  "+radical+"irás" + "\n" +
						"Ele "+radical+"irá" + "\n" +
						"Nós "+radical+"iremos" + "\n" +
						"Vós "+radical+"ireis" + "\n" +
						"Eles " + radical+"irão" + "\n");
						
						
						
						FuturoPret.setText("Eu  "+radical+"iria" + "\n" +
						"Tu  "+radical+"irias" + "\n" +
						"Ele "+radical+"iria" + "\n" +
						"Nós "+radical+"iríamos" + "\n" +
						"Vós "+radical+"iríeis" + "\n" +
						"Eles " + radical+"iriam" + "\n");
						
						
						PresenteSubj.setText("Eu  "+radical+"a" + "\n" +
						"Tu  "+radical+"as" + "\n" +
						"Ele "+radical+"a" + "\n" +
						"Nós "+radical+"amos" + "\n" +
						"Vós "+radical+"ais" + "\n" +
						"Eles " + radical+"am" + "\n");
						
						
						
						PreteritoImpSubj.setText("Eu  "+radical+"isse" + "\n" +
						"Tu  "+radical+"isses" + "\n" +
						"Ele "+radical+"isse" + "\n" +
						"Nós "+radical+"íssemos" + "\n" +
						"Vós "+radical+"ísseis" + "\n" +
						"Eles " + radical+"issem" + "\n");
						
						
						
						FuturoSubj.setText("Eu  "+radical+"ir" + "\n" +
						"Tu  "+radical+"ires" + "\n" +
						"Ele "+radical+"ir" + "\n" +
						"Nós "+radical+"irmos" + "\n" +
						"Vós "+radical+"irdes" + "\n" +
						"Eles " + radical+"irem" + "\n");
						
						
						
				
						ImpeAfir.setText("Eu  ---  " + "\n" +
						"Tu  "+radical+"e" + "\n" +
						"Ele "+radical+"a" + "\n" +
						"Nós "+radical+"amos" + "\n" +
					    "Vós "+radical+"i" + "\n" +
						"Eles " + radical+"am" + "\n");
						
						
					
						ImperNeg.setText("Eu  ---  " + "\n" +
						"Tu  "+radical+"as" + "\n" +
						"Ele "+radical+"a" + "\n" +
						"Nós "+radical+"amos" + "\n" +
						"Vós "+radical+"ais" + "\n" +
						"Eles " + radical+"am" + "\n");
						
					
						Gerundio.setText("Eu  "+radical+"indo" + "\n" +
						"Tu  "+radical+"indo" + "\n" +
						"Ele "+radical+"indo" + "\n" +
						"Nós "+radical+"indo" + "\n" +
						"Vós "+radical+"indo" + "\n" +
						"Eles " + radical+"indo" + "\n");
						
						
					
						Participio.setText("Eu  "+radical+"ido" + "\n" +
						"Tu  "+radical+"ido" + "\n" +
						"Ele "+radical+"ido" + "\n" +
						"Nós "+radical+"ido" + "\n" +
						"Vós "+radical+"ido" + "\n" +
						"Eles " + radical+"ido" + "\n");
						
						
						Normal.setText("Eu  "+radical+"ir" + "\n" +
						"Tu  "+radical+"ir" + "\n" +
						"Ele "+radical+"ir" + "\n" +
						"Nós "+radical+"ir" + "\n" +
						"Vós "+radical+"ir" + "\n" +
						"Eles " + radical+"ir" + "\n");
						
						
						
						
						Infinitivo.setText("Eu  "+radical+"ir" + "\n" +
						"Tu  "+radical+"ires" + "\n" +
						"Ele "+radical+"ir" + "\n" +
						"Nós "+radical+"irmos" + "\n" +
						"Vós "+radical+"irdes" + "\n" +
						"Eles " + radical+"irem" + "\n");

						
					}break;
				}
				textArea_1.setText(terminadoEm);
				textArea.setText(radical);
				
				
			}
			
			
		});
		frame.getContentPane().add(btnConjugar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\Verbos\\imagens\\depositphotos_26558067-stock-illustration-pattern-for-girls-with-books.jpg"));
		lblNewLabel.setBounds(0, 0, 782, 733);
		frame.getContentPane().add(lblNewLabel);
		

		
	
	}
}
