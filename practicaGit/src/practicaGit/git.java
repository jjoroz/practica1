package practicaGit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class git extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtComentario;
	private JTextField textField_1;
	private JTextField txtNombre;
	private JTextField txtApellido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					git frame = new git();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public git() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtComentario = new JTextField();
		txtComentario.setText("Comentario");
		txtComentario.setBounds(10, 104, 79, 20);
		contentPane.add(txtComentario);
		txtComentario.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 135, 199, 93);
		contentPane.add(textField_1);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setColumns(10);
		txtNombre.setBounds(10, 22, 79, 20);
		contentPane.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		txtApellido.setColumns(10);
		txtApellido.setBounds(10, 56, 79, 20);
		contentPane.add(txtApellido);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(251, 207, 89, 23);
		contentPane.add(btnNewButton);
	}
}
