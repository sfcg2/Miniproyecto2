import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class Interfazz extends JFrame implements ActionListener, ItemListener {

    Container contenedor;
    JMenuBar menuB;
    JMenu indica, opciones;
    JMenuItem insertar, actualizar, eliminar, buscar, listar, votar, info;
    JPanel panel;
    //BorderLayout border;
    JLabel etq;
    JButton boton;
    JFrame wnd;
    JTextField campo;

    public Interfazz (){

        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout(50,150));

        panel = new JPanel();
        contenedor.add(panel, BorderLayout.NORTH);

        etq = new JLabel("E L E C C I O N E S");
        etq.setFont(new Font("Serif", Font.ITALIC, 50));
        panel.add(etq);

        panel = new JPanel();
        //panel.setBackground(Color.BLUE);

        etq = new JLabel("                   ");
        etq.setFont(new Font("Serif", Font.ITALIC, 20));
        panel.add(etq);

        contenedor.add(panel, BorderLayout.WEST);

        panel = new JPanel();
        //panel.setBackground(Color.BLUE);

        etq = new JLabel("                   ");
        etq.setFont(new Font("Serif", Font.ITALIC, 20));
        panel.add(etq);

        contenedor.add(panel, BorderLayout.EAST);

        panel = new JPanel();
        //panel.setBackground(Color.BLUE);

        etq = new JLabel("                   ");
        etq.setFont(new Font("Serif", Font.ITALIC, 20));
        panel.add(etq);
        
        contenedor.add(panel, BorderLayout.SOUTH);

        boton = new JButton("Iniciar");
        boton.addActionListener(this);
        contenedor.add(boton, BorderLayout.CENTER);
/* 
        

        
*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500); 
        setVisible(true); 
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        /*if(e.getStateChange() == 1){

                System.out.println("kdflhd");

            if(e.getItemSelectable() == opciones){

                System.out.println("gkg");

            }
        }*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == boton){
            
            wnd = new JFrame("Elecciones");
            wnd.setLayout(new BorderLayout(15,15));

            menuB = new JMenuBar();
            menuB.setBounds(10, 5, 230, 12);
            wnd.add(menuB, BorderLayout.NORTH);

            indica = new JMenu("Indicaciones");
            menuB.add(indica);

            opciones = new JMenu("Opciones");
            opciones.addItemListener(this);
            menuB.add(opciones);

            insertar = new JMenuItem("Insertar Candidato");
            insertar.addActionListener(this);
            opciones.add(insertar);
            
            actualizar = new JMenuItem("Actualizar Candidato");
            opciones.add(actualizar);
            
            eliminar = new JMenuItem("Eliminar Candidato");
            opciones.add(eliminar);

            buscar = new JMenuItem("Buscar Candidato");
            opciones.add(buscar);

            listar = new JMenuItem("Lista Candidatos");
            opciones.add(listar);

            votar = new JMenuItem("Votar");
            opciones.add(votar);

            info = new JMenuItem("Información");
            opciones.add(info);

            panel = new JPanel();
            //panel.setBackground(Color.BLUE);
            etq.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Miniproyecto2-main\\Proyecto\\img\\colV.jpg"));
            etq.setPreferredSize(new Dimension(800,600));
            panel.add(etq);
            wnd.add(panel, BorderLayout.CENTER);
 
            wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            wnd.setSize(700, 700); 
            wnd.setVisible(true);
        }

        if(e.getSource() == insertar){

            wnd = new JFrame("Incripciones");
            wnd.setLayout(new BorderLayout(15,15));

            etq = new JLabel("D A T O S");
            
            etq.setFont(new Font("Serif", Font.ITALIC, 50));

            panel= new JPanel();
            panel.setLayout(new FlowLayout());
            panel.add(etq);
            wnd.add(panel, BorderLayout.NORTH);

            JPanel p = new JPanel();
            p.setLayout(new GridLayout(6,2,20,30));

            etq = new JLabel("Nombre: ");
            etq.setFont(new Font("Serif", Font.ITALIC, 30));
            campo = new JTextField(15);
            p.add(etq);
            p.add(campo);

            etq = new JLabel("Cedula: ");
            etq.setFont(new Font("Serif", Font.ITALIC, 30));
            campo = new JTextField(15);
            p.add(etq);
            p.add(campo);

            etq = new JLabel("Ciudad: ");
            etq.setFont(new Font("Serif", Font.ITALIC, 30));
            campo = new JTextField(15);
            p.add(etq);
            p.add(campo);

            etq = new JLabel("Ideologia: ");
            etq.setFont(new Font("Serif", Font.ITALIC, 30));
            campo = new JTextField(15);
            p.add(etq);
            p.add(campo);

            etq = new JLabel("Partido: ");
            etq.setFont(new Font("Serif", Font.ITALIC, 30));
            campo = new JTextField(15);
            p.add(etq);
            p.add(campo);

            etq = new JLabel("Promesas: ");
            etq.setFont(new Font("Serif", Font.ITALIC, 30));
            campo = new JTextField(15);
            p.add(etq);
            p.add(campo);

            wnd.add(p, BorderLayout.CENTER);

            p = new JPanel();
            p.setBackground(Color.GREEN);
            boton = new JButton("Ingresar");
            boton.setFont(new Font("Serif", Font.ITALIC, 30));
            p.add(boton);
            wnd.add(p, BorderLayout.SOUTH);

            p = new JPanel();
            p.setBackground(Color.CYAN);
            etq = new JLabel("                ");
            p.add(etq);
            wnd.add(p, BorderLayout.WEST);

            p = new JPanel();
            p.setBackground(Color.MAGENTA);
            etq = new JLabel("                ");
            p.add(etq);
            wnd.add(p, BorderLayout.EAST);

            wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            wnd.setSize(700, 700); 
            wnd.setVisible(true);

                System.out.println("insert");
        }
    };
}
