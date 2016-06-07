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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mantenimiento {

	private JFrame frame;
	private JTextField txtexp;
	private JTextField txtnomprof;
	private JTextField txtapellido;
	private JTextField txtexpalumno;
	private JTextField txtnomalumno;
	private JTable tablaprofesor;
	private DefaultTableModel dtmprofe;
	private DefaultTableModel dtmalumno;
	private JButton btnAsignarprofe;
	private String exprofe;
	private String nomprofe;
	private String apellidos;
	private String expalum;
	private String nomalumno;
	private String apellidoalumno;
	private JTable tablaalumnos;
	private JTextField txtapalumno;
	private JButton btnAsignaralumno;

	private void setprofesor(String exprofe, String nomprofe, String apellidos) {
		this.exprofe = exprofe;
		this.nomprofe = nomprofe;
		this.apellidos = apellidos;
	}
	private void setalumno(String expalum, String nomalumno, String apellidoalumno) {
		this.expalum = expalum;
		this.nomalumno = nomalumno;
		this.apellidoalumno = apellidoalumno;
	}
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
		frame.setBounds(100, 100, 567, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane)
		);

		JPanel panelprofesor = new JPanel();
		tabbedPane.addTab("Profesor", null, panelprofesor, null);

		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero de expediente del profesor: ");

		JLabel lblAsignarProfesor = new JLabel("ASIGNAR PROFESOR");
		lblAsignarProfesor.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNombreDelProfesor = new JLabel("Nombre del profesor:");

		JLabel lblApellidosDelProfesor = new JLabel("Apellidos del Profesor: ");

		JSeparator separator_1 = new JSeparator();

		btnAsignarprofe = new JButton("Asignar");
		btnAsignarprofe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[] fila = { txtexp.getText(), txtnomprof.getText(), txtapellido.getText() };
				dtmprofe.addRow(fila);
				setprofesor(txtexp.getText(), txtnomprof.getText(), txtapellido.getText());
				txtexp.setText("");
				txtnomprof.setText("");
				txtapellido.setText("");
			}
		});

		txtexp = new JTextField();
		txtexp.setColumns(10);

		txtnomprof = new JTextField();
		txtnomprof.setColumns(10);

		txtapellido = new JTextField();
		txtapellido.setColumns(10);
		GroupLayout gl_panelprofesor = new GroupLayout(panelprofesor);
		gl_panelprofesor.setHorizontalGroup(
			gl_panelprofesor.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelprofesor.createSequentialGroup()
					.addGroup(gl_panelprofesor.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelprofesor.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panelprofesor.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombreDelProfesor)
								.addComponent(lblNewLabel_1)
								.addComponent(lblApellidosDelProfesor))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panelprofesor.createParallelGroup(Alignment.LEADING)
								.addComponent(txtapellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtnomprof, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtexp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAsignarProfesor)))
						.addGroup(gl_panelprofesor.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_panelprofesor.createSequentialGroup()
					.addContainerGap(244, Short.MAX_VALUE)
					.addComponent(btnAsignarprofe)
					.addGap(223))
		);
		gl_panelprofesor.setVerticalGroup(
			gl_panelprofesor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelprofesor.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAsignarProfesor)
					.addGap(18)
					.addGroup(gl_panelprofesor.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtexp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelprofesor.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombreDelProfesor)
						.addComponent(txtnomprof, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelprofesor.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellidosDelProfesor)
						.addComponent(txtapellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAsignarprofe)
					.addGap(80))
		);
		panelprofesor.setLayout(gl_panelprofesor);

		JPanel panelalumno = new JPanel();
		tabbedPane.addTab("Alumno", null, panelalumno, null);

		JLabel lblNewLabel_2 = new JLabel("ASIGNAR ALUMNO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_3 = new JLabel("N\u00FAmero de expediente del alumno: ");

		JLabel lblNewLabel_4 = new JLabel("Nombre del alumno:");

		JLabel lblNewLabel_5 = new JLabel("Apellido del aluno:");

		txtexpalumno = new JTextField();
		txtexpalumno.setColumns(10);

		txtnomalumno = new JTextField();
		txtnomalumno.setColumns(10);

		txtapalumno = new JTextField();
		txtapalumno.setColumns(10);

		JSeparator separator_2 = new JSeparator();

		btnAsignaralumno = new JButton("Asignar");
		btnAsignaralumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] fila = { txtexpalumno.getText(), txtnomalumno.getText(), txtapalumno.getText() };
				dtmalumno.addRow(fila);
				setalumno(txtexpalumno.getText(), txtnomalumno.getText(), txtapalumno.getText());
				txtexpalumno.setText("");
				txtnomalumno.setText("");
				txtapalumno.setText("");
			}
		});
		GroupLayout gl_panelalumno = new GroupLayout(panelalumno);
		gl_panelalumno.setHorizontalGroup(
			gl_panelalumno.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelalumno.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panelalumno.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_5))
					.addGap(28)
					.addGroup(gl_panelalumno.createParallelGroup(Alignment.LEADING)
						.addComponent(txtapalumno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtnomalumno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtexpalumno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(126, Short.MAX_VALUE))
				.addGroup(gl_panelalumno.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator_2, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
					.addGap(8))
				.addGroup(Alignment.LEADING, gl_panelalumno.createSequentialGroup()
					.addGap(238)
					.addComponent(btnAsignaralumno)
					.addContainerGap(243, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panelalumno.createSequentialGroup()
					.addGap(202)
					.addComponent(lblNewLabel_2)
					.addContainerGap(222, Short.MAX_VALUE))
		);
		gl_panelalumno.setVerticalGroup(
			gl_panelalumno.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelalumno.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2)
					.addGap(26)
					.addGroup(gl_panelalumno.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtexpalumno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panelalumno.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(txtnomalumno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panelalumno.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(txtapalumno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAsignaralumno)
					.addContainerGap(13, Short.MAX_VALUE))
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
			gl_panelmodulo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelmodulo.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_panelmodulo.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSeleccioneProfesorDel)
						.addComponent(lblNewLabel)
						.addComponent(lblSeleccioneCurso))
					.addGap(53)
					.addGroup(gl_panelmodulo.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, 0, 12, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(gl_panelmodulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panelmodulo.createSequentialGroup()
					.addContainerGap(219, Short.MAX_VALUE)
					.addComponent(lblAsignarMdulo)
					.addGap(202))
				.addGroup(Alignment.LEADING, gl_panelmodulo.createSequentialGroup()
					.addGap(232)
					.addComponent(btnAsignar)
					.addContainerGap(244, Short.MAX_VALUE))
		);
		gl_panelmodulo.setVerticalGroup(
			gl_panelmodulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelmodulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAsignarMdulo)
					.addGap(30)
					.addGroup(gl_panelmodulo.createParallelGroup(Alignment.TRAILING)
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
					.addGap(86))
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
																									gl_panelnotas.createParallelGroup(Alignment.TRAILING)
																										.addGroup(gl_panelnotas.createSequentialGroup()
																											.addGroup(gl_panelnotas.createParallelGroup(Alignment.LEADING)
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
																															.addComponent(lblSeleccioneNotaFinal)
																															.addGap(18)
																															.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
																														.addGroup(Alignment.TRAILING, gl_panelnotas.createSequentialGroup()
																															.addPreferredGap(ComponentPlacement.RELATED)
																															.addComponent(separator_4, GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
																															.addGap(18)
																															.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))))
																												.addGroup(gl_panelnotas.createSequentialGroup()
																													.addGap(232)
																													.addComponent(btnAsignar_3))
																												.addGroup(gl_panelnotas.createSequentialGroup()
																													.addGap(204)
																													.addComponent(lblNewLabel_6)))
																											.addContainerGap())
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
																												.addComponent(separator_4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
																											.addPreferredGap(ComponentPlacement.RELATED)
																											.addComponent(btnAsignar_3)
																											.addContainerGap(75, Short.MAX_VALUE))
																								);
																								panelnotas.setLayout(gl_panelnotas);

		JPanel paneltablaprofesor = new JPanel();
		tabbedPane.addTab("tabla profesor", null, paneltablaprofesor, null);

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_paneltablaprofesor = new GroupLayout(paneltablaprofesor);
		gl_paneltablaprofesor.setHorizontalGroup(
			gl_paneltablaprofesor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_paneltablaprofesor.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_paneltablaprofesor.setVerticalGroup(
			gl_paneltablaprofesor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_paneltablaprofesor.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(44, Short.MAX_VALUE))
		);

		tablaprofesor = new JTable();
		tablaprofesor.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {
				txtexp.setText((String) dtmprofe.getValueAt(tablaprofesor.getSelectedRow(), 0));
				txtnomprof.setText((String) dtmprofe.getValueAt(tablaprofesor.getSelectedRow(), 1));
				txtapellido.setText((String) dtmprofe.getValueAt(tablaprofesor.getSelectedRow(), 2));

			}
		});
		dtmprofe = new DefaultTableModel(new Object[][] {},
				new String[] { "Nº Expediente profe", "Nombre profe", "Apellidos profe" });
		tablaprofesor.setModel(dtmprofe);
		scrollPane.setViewportView(tablaprofesor);
		paneltablaprofesor.setLayout(gl_paneltablaprofesor);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("tabla alumno", null, panel, null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		
		tablaalumnos = new JTable();
		tablaalumnos.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent arg0) {
				txtexpalumno.setText((String) dtmalumno.getValueAt(tablaalumnos.getSelectedRow(), 0));
				txtnomalumno.setText((String) dtmalumno.getValueAt(tablaalumnos.getSelectedRow(), 1));
				txtapalumno.setText((String) dtmalumno.getValueAt(tablaalumnos.getSelectedRow(), 2));

			}
		});
		dtmalumno = new DefaultTableModel(new Object[][] {},
				new String[] { "Nº Expediente alumno", "Nombre alumno", "Apellidos alumno" });
		tablaalumnos.setModel(dtmalumno);
		scrollPane_1.setViewportView(tablaalumnos);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
