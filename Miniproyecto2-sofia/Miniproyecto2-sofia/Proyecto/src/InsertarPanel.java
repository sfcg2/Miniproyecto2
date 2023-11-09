import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InsertarPanel extends JPanel {

    private static ArrayList<Candidato> inscritos = new ArrayList<>();
    private JTextField nombreField, cedulaField, ciudadField, ideologiaField, partidoField, promesasField;

    public InsertarPanel() {
        setLayout(new GridLayout(7, 2));

        add(new JLabel("Nombre:"));
        nombreField = new JTextField(20);
        add(nombreField);

        add(new JLabel("Cédula:"));
        cedulaField = new JTextField(20);
        add(cedulaField);

        add(new JLabel("Ciudad:"));
        ciudadField = new JTextField(20);
        add(ciudadField);

        add(new JLabel("Ideología (Derecha/Izquierda):"));
        ideologiaField = new JTextField(20);
        add(ideologiaField);

        add(new JLabel("Partido Político:"));
        partidoField = new JTextField(20);
        add(partidoField);

        add(new JLabel("Promesas:"));
        promesasField = new JTextField(20);
        add(promesasField);

        JButton insertButton = new JButton("Insertar Candidato");
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica de inserción de candidato basada en los campos de texto
                String nombre = nombreField.getText();
                String cedula = cedulaField.getText();
                String ciudad = ciudadField.getText();
                String ideologia = ideologiaField.getText();
                String partido = partidoField.getText();
                String promesas = promesasField.getText();

                // Crea un nuevo candidato y agrégalo a la lista
                Candidato candidato = new Candidato(nombre, cedula, ciudad, ideologia, partido, promesas);
                inscritos.add(candidato);

                // Limpia los campos de texto después de la inserción
                nombreField.setText("");
                cedulaField.setText("");
                ciudadField.setText("");
                ideologiaField.setText("");
                partidoField.setText("");
                promesasField.setText("");
            }
        });
        add(insertButton);
    }

    public static ArrayList<Candidato> getInscritos() {
        return inscritos;
    }

    public JButton getInsertButton() {
        return null;
    }
}





    