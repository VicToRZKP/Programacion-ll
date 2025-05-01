import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeatroMunicipalGUI extends JFrame {
    private JTextField txtNumeroBoleto, txtDiasAnticipacion;
    private JLabel lblResultado;
    private JRadioButton rbPalco, rbPlatea, rbGaleria;

    public TeatroMunicipalGUI() {
        setTitle("Teatro Municipal");
        setSize(420, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Título en azul
        JLabel lblTitulo = new JLabel("Teatro Municipal", JLabel.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitulo.setForeground(Color.BLUE);
        lblTitulo.setBounds(90, 10, 240, 30);
        add(lblTitulo);

        // Panel de datos del boleto
        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(null);
        panelDatos.setBorder(BorderFactory.createTitledBorder("Datos del Boleto"));
        panelDatos.setBounds(20, 50, 370, 130);
        add(panelDatos);

        rbPalco = new JRadioButton("Palco");
        rbPalco.setBounds(20, 20, 80, 20);
        rbPlatea = new JRadioButton("Platea");
        rbPlatea.setBounds(130, 20, 80, 20);
        rbGaleria = new JRadioButton("Galería");
        rbGaleria.setBounds(240, 20, 80, 20);

        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(rbPalco);
        grupoBotones.add(rbPlatea);
        grupoBotones.add(rbGaleria);
        rbPalco.setSelected(true);

        panelDatos.add(rbPalco);
        panelDatos.add(rbPlatea);
        panelDatos.add(rbGaleria);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(20, 60, 100, 20);
        panelDatos.add(lblNumero);

        txtNumeroBoleto = new JTextField("1");
        txtNumeroBoleto.setBounds(180, 60, 50, 20);
        panelDatos.add(txtNumeroBoleto);

        JLabel lblDias = new JLabel("Cant. Días para el Evento:");
        lblDias.setBounds(20, 90, 160, 20);
        panelDatos.add(lblDias);

        txtDiasAnticipacion = new JTextField();
        txtDiasAnticipacion.setBounds(180, 90, 50, 20);
        panelDatos.add(txtDiasAnticipacion);

        // Botones
        JButton btnVender = new JButton("Vende");
        btnVender.setBounds(100, 190, 90, 25);
        add(btnVender);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(210, 190, 90, 25);
        add(btnSalir);

        // Información centrada
        JLabel lblInfo = new JLabel("Información", JLabel.CENTER);
        lblInfo.setBounds(20, 230, 370, 20);
        add(lblInfo);

        lblResultado = new JLabel("Número: 1, Precio: 100.0", JLabel.CENTER);
        lblResultado.setFont(new Font("Arial", Font.BOLD, 14));
        lblResultado.setForeground(Color.BLUE);
        lblResultado.setBounds(20, 250, 370, 25);
        add(lblResultado);

        // Acciones
        btnVender.addActionListener(e -> venderBoleto());
        btnSalir.addActionListener(e -> System.exit(0));

        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void venderBoleto() {
        try {
            int numero = Integer.parseInt(txtNumeroBoleto.getText());
            int dias = txtDiasAnticipacion.getText().isEmpty() ? 0 : Integer.parseInt(txtDiasAnticipacion.getText());

            double precio = 0.0;
            if (rbPalco.isSelected()) {
                precio = 100.0; // Precio fijo para Palco
            } else if (rbPlatea.isSelected()) {
                if (dias >= 10) {
                    precio = 50.0; // 10 o más días de anticipación
                } else {
                    precio = 60.0; // Menos de 10 días
                }
            } else if (rbGaleria.isSelected()) {
                if (dias >= 10) {
                    precio = 25.0; // 10 o más días de anticipación
                } else {
                    precio = 30.0; // Menos de 10 días
                }
            }

            lblResultado.setText("Número: " + numero + ", Precio: " + String.format("%.1f", precio) + " Bs.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TeatroMunicipalGUI().setVisible(true));
    }
}