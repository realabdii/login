package Login;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Window.Type;

/* Dette er et program lavet af 

Mohamed Said Abdi Ahmed 


*/ 


// Det her er min java class 
public class Login {

	
	
	// jeg har valgt at bruge private foran mine variabler da det er mest sikkeret 
	private JFrame minform;
	private JTextField txtbrugernavn;
	private JPasswordField txtadgangskode;

	/**
	 * D.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				//Her køre jeg en simple try catch loop for at fange nye login 	
				try {
					Login window = new Login();
					window.minform.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Jeg brugerr denne funktion til at starte min applikation 	
	 */
	public Login() {
		initialize();
	}

	/**
	 * her har jeg sat alle mine variabler til min GUI - jeg har brugt WindowsBuilder for at bygge min GUI (https://www.eclipse.org/windowbuilder) 
	 */
	private void initialize() {
		minform = new JFrame();
		minform.setTitle("Login ");
		minform.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		minform.setBackground(SystemColor.activeCaptionBorder);
		minform.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Downloads\\Loginnn.png"));
		minform.setBounds(200, 200, 332, 378);
		minform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minform.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Brugernavn");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(29, 139, 86, 17);
		minform.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Adgangskode");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(31, 195, 84, 14);
		minform.getContentPane().add(lblNewLabel_2);
		
		txtbrugernavn = new JTextField();
		txtbrugernavn.setBounds(100, 137, 158, 20);
		minform.getContentPane().add(txtbrugernavn);
		txtbrugernavn.setColumns(10);
		
		txtadgangskode = new JPasswordField();
		txtadgangskode.setEchoChar('*');
		txtadgangskode.setBounds(98, 189, 160, 20);
		minform.getContentPane().add(txtadgangskode);
		txtadgangskode.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = txtadgangskode.getText();
				String username = txtbrugernavn.getText();
				
				if (password.contains("sendre") && username.contains("admin")) {
					txtadgangskode.setText(null);
					txtbrugernavn.setText(null);
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "Forkete oplysninger","Forkert login", JOptionPane.ERROR_MESSAGE);
					txtadgangskode.setText(null);
					txtbrugernavn.setText(null);
				}
				
				
			}
		});
		btnLogin.setHorizontalAlignment(SwingConstants.RIGHT);
		btnLogin.setBounds(31, 261, 61, 23);
		minform.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtbrugernavn.setText(null);
				txtadgangskode.setText(null);
			}
		});
		btnReset.setBounds(124, 261, 70, 23);
		minform.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				minform = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(minform, "Bekræft, hvis du vil afslutte", "Login",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(220, 261, 61, 23);
		minform.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 236, 268, 14);
		minform.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		
		//jeg har brugt et billede som jeg har henter via et permanent link
		
		Image img = new ImageIcon(this.getClass().getResource("/LoginIcon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Iconss\\LoginIcon.png"));
		lblNewLabel.setBounds(80, 11, 158, 117);
		minform.getContentPane().add(lblNewLabel);
	}
}
