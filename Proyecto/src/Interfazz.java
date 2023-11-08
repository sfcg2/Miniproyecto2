import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
    JButton iniciar;
    JFrame wnd;

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

        iniciar = new JButton("Iniciar");
        iniciar.addActionListener(this);
        contenedor.add(iniciar, BorderLayout.CENTER);
/* 
        

        
*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500); 
        setVisible(true); 
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if(e.getStateChange() == 1){

                System.out.println("kdflhd");

            if(e.getItemSelectable() == opciones){

                System.out.println("gkg");

                if(e.getStateChange() == 1){

                    System.out.println("kdflhd");

                    if(e.getItemSelectable() == insertar){
                        System.out.println("hola");
                    }
                }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == iniciar){
            
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
            insertar.addItemListener(this);
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

            //if(e.getSource() == opciones){
                //System.out.println("dklfg");
            //}
            

                
            wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            wnd.setSize(700, 700); 
            wnd.setVisible(true);
        }
    };
}
