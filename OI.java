import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;


public class OI {

	private static JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private static JRadioButton rdbtnMasculino;
	private static JRadioButton rdbtnFeminino;
	private static JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private static JLabel lblAcima;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OI window = new OI();
					OI.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAltura = new JLabel("ALTURA");
		lblAltura.setBounds(29, 161, 46, 14);
		frame.getContentPane().add(lblAltura);
		
		JLabel lblPeso = new JLabel("PESO");
		lblPeso.setBounds(29, 193, 46, 14);
		frame.getContentPane().add(lblPeso);
		
		textField = new JTextField();
		textField.setBounds(93, 158, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 190, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblAcima = new JLabel("");
		lblAcima.setBounds(378, 132, 117, 32);
		frame.getContentPane().add(lblAcima);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(20, 234, 115, 23);
		frame.getContentPane().add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				lblAcima.setText("");
				Calcimc(Float.parseFloat(textField.getText()),(Float.parseFloat(textField_1.getText())));
			}
		});
		JLabel lblSexo = new JLabel("SEXO");
		lblSexo.setBounds(8, 11, 46, 14);
		frame.getContentPane().add(lblSexo);
		
		 rdbtnFeminino = new JRadioButton("FEMININO");
		 rdbtnFeminino.setFont(new Font("Times New Roman", Font.BOLD, 11));
		 rdbtnFeminino.setBackground(Color.PINK);
		rdbtnFeminino.setBounds(8, 97, 86, 23);
		frame.getContentPane().add(rdbtnFeminino);
		
		 rdbtnMasculino = new JRadioButton("MASCULINO");
		 rdbtnMasculino.setFont(new Font("Times New Roman", Font.BOLD, 11));
		 rdbtnMasculino.setBackground(new Color(30, 144, 255));
		rdbtnMasculino.setBounds(8, 51, 99, 23);
		frame.getContentPane().add(rdbtnMasculino);
		
		ButtonGroup bla = new ButtonGroup();
		bla.add(rdbtnFeminino);
		bla.add(rdbtnMasculino);
		
		lblNewLabel = new JLabel("");
	
		
		
	
		
		
		
		
		lblNewLabel.setBounds(240, 11, 184, 468);
		frame.getContentPane().add(lblNewLabel);
		
		
		
	}


	public  static void Calcimc(Float alt,float p){
		Scanner ler = new Scanner(System.in);
		
		float  altura;
		float  peso;
		double  IMC;
		
		
		
		
		IMC =p/Math.pow(alt, 2);
		
		
		if (rdbtnMasculino.isSelected()){
		if (IMC < 18.5)
		{
			System.out.println("Você está abaixo do peso." + IMC);
			lblNewLabel.setIcon(new ImageIcon("D:\\SarahDea\\IMC\\IMC-homem (1).jpg"));
			
		lblAcima.setText("Ta esquelético");
			
			
		}
		
		if (IMC >= 18.5 && IMC <= 24.9)
		{
			System.out.println("Você está Saudavél." + IMC);
			lblNewLabel.setIcon(new ImageIcon("D:\\SarahDea\\IMC\\IMC-homem (2).jpg"));
			
			lblAcima.setText("Ta com um corpicho bom");
			
		}
		
		if (IMC >= 25 && IMC <=29.9)
		{
			System.out.println("Você está com excesso de peso." + IMC);
			lblNewLabel.setIcon(new ImageIcon("D:\\SarahDea\\IMC\\IMC-homem (3).jpg"));
			
			lblAcima.setText("Ta meio gordinho");
			
		
		}
		
		if (IMC >= 30)
		{
			System.out.println("Você está obeso." + IMC);
			lblNewLabel.setIcon(new ImageIcon("D:\\SarahDea\\IMC\\IMC-homem (4).jpg"));
			
			lblAcima.setText("Vai no nutricionista");
		}
	}
		
		if (rdbtnFeminino.isSelected()) {
			if (IMC < 18.5)
			{
				System.out.println("Você está abaixo do peso." + IMC);
				lblNewLabel.setIcon(new ImageIcon("D:\\SarahDea\\IMC\\IMC-mulher (1).jpg"));
				lblAcima.setText("Ta esquelética");
			}
			
			if (IMC >= 18.5 && IMC <= 24.9)
			{
				System.out.println("Você está Saudavél." + IMC);
				lblNewLabel.setIcon(new ImageIcon("D:\\SarahDea\\IMC\\IMC-mulher (2).jpg"));
				lblAcima.setText("Ta com um corpicho bom");
			}
			
			if (IMC >= 25 && IMC <=29.9)
			{
				System.out.println("Você está com excesso de peso." + IMC);
				lblNewLabel.setIcon(new ImageIcon("D:\\SarahDea\\IMC\\IMC-mulher (3).jpg"));
				lblAcima.setText("Ta precisando de uma academia");
			}
			
			if (IMC >= 30)
			{
				System.out.println("Você está obeso." + IMC);
				lblNewLabel.setIcon(new ImageIcon("D:\\SarahDea\\IMC\\IMC-mulher (4).jpg"));
				lblAcima.setText("Vai no nutricionista");
			}
		}
	}
}