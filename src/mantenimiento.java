import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class mantenimiento {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mantenimiento window = new mantenimiento();
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
	public mantenimiento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
		);
		
		JPanel panelprofesor = new JPanel();
		tabbedPane.addTab("Profesor", null, panelprofesor, null);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero de expediente del profesor: ");
		
		JLabel lblAsignarProfesor = new JLabel("ASIGNAR PROFESOR");
		lblAsignarProfesor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNombreDelProfesor = new JLabel("Nombre del profesor:");
		
		JLabel lblApellidosDelProfesor = new JLabel("Apellidos del Profesor: ");
		
		JSeparator separator_1 = new JSeparator();
		
		JButton btnAsignar_1 = new JButton("Asignar");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GroupLayout gl_panelprofesor = new GroupLayout(panelprofesor);
		gl_panelprofesor.setHorizontalGroup(
			gl_panelprofesor.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelprofesor.createSequentialGroup()
					.addGroup(gl_panelprofesor.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelprofesor.createSequentialGroup()
							.addGap(144)
							.addComponent(lblAsignarProfesor))
						.addGroup(gl_panelprofesor.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panelprofesor.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombreDelProfesor)
								.addComponent(lblNewLabel_1)
								.addComponent(lblApellidosDelProfesor))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panelprofesor.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelprofesor.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_panelprofesor.createSequentialGroup()
					.addContainerGap(187, Short.MAX_VALUE)
					.addComponent(btnAsignar_1)
					.addGap(173))
		);
		gl_panelprofesor.setVerticalGroup(
			gl_panelprofesor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelprofesor.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAsignarProfesor)
					.addGap(18)
					.addGroup(gl_panelprofesor.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelprofesor.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombreDelProfesor)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelprofesor.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellidosDelProfesor)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAsignar_1)
					.addGap(13))
		);
		panelprofesor.setLayout(gl_panelprofesor);
		
		JPanel panelalumno = new JPanel();
		tabbedPane.addTab("Alumno", null, panelalumno, null);
		
		JLabel lblNewLabel_2 = new JLabel("ASIGNAR ALUMNO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3 = new JLabel("N\u00FAmero de expediente del alumno: ");
		
		JLabel lblNewLabel_4 = new JLabel("Nombre del alumno:");
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		
		JButton btnAsignar_2 = new JButton("Asignar");
		GroupLayout gl_panelalumno = new GroupLayout(panelalumno);
		gl_panelalumno.setHorizontalGroup(
			gl_panelalumno.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelalumno.createSequentialGroup()
					.addGroup(gl_panelalumno.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelalumno.createSequentialGroup()
							.addGap(156)
							.addComponent(lblNewLabel_2))
						.addGroup(gl_panelalumno.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_panelalumno.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_5))
							.addGap(28)
							.addGroup(gl_panelalumno.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(126, Short.MAX_VALUE))
				.addGroup(gl_panelalumno.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator_2, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
					.addGap(8))
				.addGroup(Alignment.TRAILING, gl_panelalumno.createSequentialGroup()
					.addContainerGap(175, Short.MAX_VALUE)
					.addComponent(btnAsignar_2)
					.addGap(165))
		);
		gl_panelalumno.setVerticalGroup(
			gl_panelalumno.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelalumno.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2)
					.addGap(26)
					.addGroup(gl_panelalumno.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panelalumno.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panelalumno.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAsignar_2)
					.addContainerGap(30, Short.MAX_VALUE))
		);
		panelalumno.setLayout(gl_panelalumno);
		
		JPanel panelmodulo = new JPanel();
		tabbedPane.addTab("M\u00F3dulo", null, panelmodulo, null);
		
		JLabel lblNewLabel = new JLabel("Seleccione M\u00F3dulo:");
		
		JLabel lblSeleccioneCurso = new JLabel("Seleccione Curso:");
		
		JLabel lblSeleccioneProfesorDel = new JLabel("Seleccione profesor del m\u00F3dulo:");
		
		JComboBox comboBox = new JComboBox();
		
		JComboBox comboBox_1 = new JComboBox();
		
		JComboBox comboBox_2 = new JComboBox();
		
		JLabel lblAsignarMdulo = new JLabel("ASIGNAR M\u00D3DULO");
		lblAsignarMdulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnAsignar = new JButton("Asignar");
		
		JSeparator separator = new JSeparator();
		GroupLayout gl_panelmodulo = new GroupLayout(panelmodulo);
		gl_panelmodulo.setHorizontalGroup(
			gl_panelmodulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelmodulo.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panelmodulo.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panelmodulo.createSequentialGroup()
							.addGroup(gl_panelmodulo.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblSeleccioneCurso))
							.addGap(47)
							.addGroup(gl_panelmodulo.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelmodulo.createSequentialGroup()
							.addComponent(lblSeleccioneProfesorDel)
							.addGap(33)
							.addComponent(comboBox_2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_panelmodulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panelmodulo.createSequentialGroup()
					.addContainerGap(184, Short.MAX_VALUE)
					.addComponent(btnAsignar)
					.addGap(176))
				.addGroup(gl_panelmodulo.createSequentialGroup()
					.addGap(149)
					.addComponent(lblAsignarMdulo)
					.addContainerGap(165, Short.MAX_VALUE))
		);
		gl_panelmodulo.setVerticalGroup(
			gl_panelmodulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelmodulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAsignarMdulo)
					.addGap(33)
					.addGroup(gl_panelmodulo.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelmodulo.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSeleccioneCurso)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelmodulo.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSeleccioneProfesorDel)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAsignar)
					.addGap(20))
		);
		panelmodulo.setLayout(gl_panelmodulo);
		
		JPanel panelnotas = new JPanel();
		tabbedPane.addTab("Notas", null, panelnotas, null);
		
		JLabel lblNewLabel_6 = new JLabel("ASIGNAR NOTAS");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_7 = new JLabel("Seleccione m\u00F3dulo:");
		
		JLabel lblSeleccioneAlumno = new JLabel("Seleccione alumno:");
		
		JLabel lblSeleccioneNotaFinal = new JLabel("Seleccione nota final del m\u00F3dulo:");
		
		JComboBox comboBox_3 = new JComboBox();
		
		JComboBox comboBox_4 = new JComboBox();
		
		JComboBox comboBox_5 = new JComboBox();
		
		JSeparator separator_3 = new JSeparator();
		
		JSeparator separator_4 = new JSeparator();
		
		JButton btnAsignar_3 = new JButton("Asignar");
		GroupLayout gl_panelnotas = new GroupLayout(panelnotas);
		gl_panelnotas.setHorizontalGroup(
			gl_panelnotas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelnotas.createSequentialGroup()
					.addGroup(gl_panelnotas.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelnotas.createSequentialGroup()
							.addGap(162)
							.addComponent(lblNewLabel_6))
						.addGroup(gl_panelnotas.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_panelnotas.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelnotas.createSequentialGroup()
									.addGroup(gl_panelnotas.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_7)
										.addComponent(lblSeleccioneAlumno))
									.addGap(60)
									.addGroup(gl_panelnotas.createParallelGroup(Alignment.LEADING, false)
										.addComponent(comboBox_4, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(comboBox_3, 0, 80, Short.MAX_VALUE)))
								.addGroup(gl_panelnotas.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_panelnotas.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panelnotas.createSequentialGroup()
											.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
											.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
										.addGroup(Alignment.LEADING, gl_panelnotas.createSequentialGroup()
											.addComponent(lblSeleccioneNotaFinal)
											.addGap(18)
											.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))))))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panelnotas.createSequentialGroup()
					.addContainerGap(185, Short.MAX_VALUE)
					.addComponent(btnAsignar_3)
					.addGap(175))
		);
		gl_panelnotas.setVerticalGroup(
			gl_panelnotas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelnotas.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_6)
					.addGap(34)
					.addGroup(gl_panelnotas.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelnotas.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSeleccioneAlumno)
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelnotas.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSeleccioneNotaFinal)
						.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelnotas.createParallelGroup(Alignment.LEADING)
						.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator_4, GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAsignar_3)
					.addGap(18))
		);
		panelnotas.setLayout(gl_panelnotas);
		frame.getContentPane().setLayout(groupLayout);
	}
}
