import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;



public class Interfazz extends JFrame implements ActionListener, ItemListener {

    Container contenedor;
    JMenuBar menuB;
    JMenu indica, opciones;
    JMenuItem insertar, actualizar, eliminar, buscar, listar, votar, info;
    JPanel panel;
    JTextArea area; 
    JScrollPane scroll;
    //BorderLayout border;
    JLabel etq, etq2;
    JButton iniciar, ingresar, actu, elim, bcar, salir, vtar ;
    JFrame wnd, wnd2;
    public static JTextField nom, cc, cdad, idel, part, prom;
    ArrayList <Candidato> lsiat = Insertar.getInscritos();
    JOptionPane pane = new JOptionPane(); 
    Candidato candidato = new Candidato();
    Insertar in = new Insertar();
    Actualizar ac = new Actualizar();
    Eliminar el = new Eliminar();
    Buscar bc = new Buscar();

    public Interfazz (){

        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout(50,150));

        panel = new JPanel();
        panel.setLayout(new GridLayout(2,1,5,25));
        contenedor.add(panel, BorderLayout.NORTH);

        etq = new JLabel("      ELECCIONES");
        etq.setFont(new Font("Arial", Font.BOLD, 50)); 
        panel.add(etq);

        etq = new JLabel("      CANDIDATOS");
        etq.setFont(new Font("Arial", Font.BOLD, 50)); 
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

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(500, 580); 
        setVisible(true); 
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == iniciar){

            dispose();
            wnd = new JFrame("Elecciones");
            wnd.setLayout(new BorderLayout(15,15));

            menuB = new JMenuBar();
            menuB.setBounds(10, 5, 230, 12);
            wnd.add(menuB, BorderLayout.NORTH);

            indica = new JMenu("Indicaciones");
            indica.addItemListener(this);
            menuB.add(indica);

            
            opciones = new JMenu("Opciones");
            opciones.addItemListener(this);
            menuB.add(opciones);

            insertar = new JMenuItem("Insertar Candidato");
            insertar.addActionListener(this);
            opciones.add(insertar);
            
            actualizar = new JMenuItem("Actualizar Candidato");
            actualizar.addActionListener(this);
            opciones.add(actualizar);
            
            eliminar = new JMenuItem("Eliminar Candidato");
            eliminar.addActionListener(this);
            opciones.add(eliminar);

            buscar = new JMenuItem("Buscar Candidato");
            buscar.addActionListener(this);
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
 
            wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd.setSize(500, 600); 
            wnd.setVisible(true);

        }else if(e.getSource() == insertar){

            inscripciones();
                
        }else if(e.getSource() == ingresar){

            in.insertar();
            
            System.out.println(lsiat.toString());

        }else if(e.getSource() == actualizar){

            wnd = new JFrame("Actualización");
            wnd.setLayout(new BorderLayout(15,15));

            panel = new JPanel();
            panel.setLayout(new GridLayout(2,1,15,35));
            
            etq = new JLabel("   ACTUALIZAR");
            etq.setFont(new Font("Arial", Font.BOLD, 50));
            panel.add(etq);

            etq2 = new JLabel("     CANDIDATO");
            etq2.setFont(new Font("Arial", Font.BOLD, 50)); 
            panel.add(etq2);
            wnd.add(panel, BorderLayout.NORTH);

            JPanel p = new JPanel();
            //p.setLayout(new FlowLayout());

            etq = new JLabel("                                                                             ");
            etq.setFont(new Font("Arial", Font.BOLD, 80)); 
            p.add(etq);

            etq = new JLabel("Cédula: ");
            etq.setFont(new Font("Arial", Font.BOLD, 15)); 
            cc = new JTextField(15);
            p.add(etq);
            p.add(cc);
            wnd.add(p, BorderLayout.CENTER);

            p = new JPanel();
            actu = new JButton("Actualizar");
            actu.setFont(new Font("Arial", Font.ITALIC, 20));
            actu.addActionListener(this);
            p.add(actu);
            etq = new JLabel("                                                                             ");
            etq.setFont(new Font("Arial", Font.BOLD, 80)); 
            p.add(etq);
            wnd.add(p, BorderLayout.SOUTH);

            wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd.setSize(500, 570); 
            wnd.setVisible(true);

            System.out.println("actuali");

        }else if(e.getSource() == actu){

            ac.actualizar();
            wnd.dispose();
            System.out.println(lsiat.toString());

        }else if(e.getSource() == eliminar){

            wnd = new JFrame("Eliminación");
            wnd.setLayout(new BorderLayout(15,15));

            panel = new JPanel();
            panel.setLayout(new GridLayout(2,1,15,35));
            
            etq = new JLabel("      ELIMINAR");
            etq.setFont(new Font("Arial", Font.BOLD, 50));
            panel.add(etq);

            etq2 = new JLabel("     CANDIDATO");
            etq2.setFont(new Font("Arial", Font.BOLD, 50)); 
            panel.add(etq2);
            wnd.add(panel, BorderLayout.NORTH);

            JPanel p = new JPanel();
            //p.setLayout(new FlowLayout());

            etq = new JLabel("                                                                             ");
            etq.setFont(new Font("Arial", Font.BOLD, 80)); 
            p.add(etq);

            etq = new JLabel("Cédula: ");
            etq.setFont(new Font("Arial", Font.BOLD, 15)); 
            cc = new JTextField(15);
            p.add(etq);
            p.add(cc);
            wnd.add(p, BorderLayout.CENTER);

            p = new JPanel();
            elim = new JButton("Eliminar");
            elim.setFont(new Font("Arial", Font.ITALIC, 20));
            elim.addActionListener(this);
            p.add(elim);
            etq = new JLabel("                                                                             ");
            etq.setFont(new Font("Arial", Font.BOLD, 80)); 
            p.add(etq);
            wnd.add(p, BorderLayout.SOUTH);

            wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd.setSize(500, 570); 
            wnd.setVisible(true);

            System.out.println("elimi");

        }else if(e.getSource() == elim){

            el.eliminar();
            contenedor.setVisible(false);
            wnd.dispose();
            System.out.println(lsiat.toString());

        }else if(e.getSource() == buscar){

            wnd = new JFrame("Busquedad");
            wnd.setLayout(new BorderLayout(15,15));

            panel = new JPanel();
            panel.setLayout(new GridLayout(2,1,15,35));
            
            etq = new JLabel("        BUSCAR");
            etq.setFont(new Font("Arial", Font.BOLD, 50));
            panel.add(etq);

            etq2 = new JLabel("     CANDIDATO");
            etq2.setFont(new Font("Arial", Font.BOLD, 50)); 
            panel.add(etq2);
            wnd.add(panel, BorderLayout.NORTH);

            JPanel p = new JPanel();
            //p.setLayout(new FlowLayout());

            etq = new JLabel("                                                                             ");
            etq.setFont(new Font("Arial", Font.BOLD, 80)); 
            p.add(etq);

            etq = new JLabel("Cédula: ");
            etq.setFont(new Font("Arial", Font.BOLD, 15)); 
            cc = new JTextField(15);
            p.add(etq);
            p.add(cc);
            wnd.add(p, BorderLayout.CENTER);

            p = new JPanel();
            bcar = new JButton("Buscar");
            bcar.setFont(new Font("Arial", Font.ITALIC, 20));
           bcar.addActionListener(this);
            p.add(bcar);
            etq = new JLabel("                                                                             ");
            etq.setFont(new Font("Arial", Font.BOLD, 80)); 
            p.add(etq);
            wnd.add(p, BorderLayout.SOUTH);

            wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd.setSize(500, 570); 
            wnd.setVisible(true);

            System.out.println("buscar");
            
        }else if(e.getSource() == bcar){

            //bc.buscar();
            boolean val4 = false;

            wnd2 = new JFrame("Candidato");
            wnd2.setLayout(new BorderLayout());
            area = new JTextArea(100,10);
            candidato.setCedula(cc.getText());
                
            for(int i = 0; i<lsiat.size(); i++){ 
                
                if(candidato.getCedula().equalsIgnoreCase(lsiat.get(i).getCedula())){
                    val4 = true;
                    JOptionPane.showMessageDialog(wnd, "Candidato Encontrado", "INFO", JOptionPane.INFORMATION_MESSAGE);
                    area.append(lsiat.get(i).toString());
                    //System.out.println("llll" + lsiat.get(i));
                    break;
                }

            }if(val4 == false){

                JOptionPane.showMessageDialog(wnd, "Candidato NO encontrado,\n Vuelva a ingresar la cédula.",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            } 

            area.setEditable(false);
            scroll = new JScrollPane(area);
            wnd2.add(scroll, BorderLayout.CENTER);
            
            System.out.println(lsiat.toString());

            wnd2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd2.setSize(500, 570); 
            wnd2.setVisible(true);
        }

    }
    @Override
    public void itemStateChanged(ItemEvent e) {

        if(e.getStateChange() == 1){
            if(e.getItemSelectable() == indica){
                System.out.println("gkg");
                JOptionPane.showMessageDialog(wnd, "Ingresar:\n *Promesas juntas, separadas por comas (,)\n  *Cedula sin puntos", 
                "Indicaciones", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }

    
    
    
    
    
    public static String getNom() {
        return nom.getText();
    }public static String getCC() {
        return cc.getText();
    }public static String getCdad() {
        return cdad.getText();
    }public static String getIdel() {
        return idel.getText();
    }public static String getPart() {
        return part.getText();
    }public static String getProm() {
        return prom.getText();
    }
    public void inscripciones(){

        wnd = new JFrame("Datos Candidato");
        wnd.setLayout(new BorderLayout(15,15));

        etq = new JLabel("D A T O S");
        
        etq.setFont(new Font("Arial", Font.BOLD, 50)); 

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(etq);
        wnd.add(panel, BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(6,2,20,40));

        etq = new JLabel("Nombre: ");
        etq.setFont(new Font("Arial", Font.BOLD, 15)); 
        nom = new JTextField(15);
        p.add(etq);
        p.add(nom);

        etq = new JLabel("Cédula: ");
        etq.setFont(new Font("Arial", Font.BOLD, 15)); 
        cc = new JTextField(15);
        p.add(etq);
        p.add(cc);

        etq = new JLabel("Ciudad: ");
        etq.setFont(new Font("Arial", Font.BOLD, 15)); 
        cdad = new JTextField(15);
        p.add(etq);
        p.add(cdad);

        etq = new JLabel("Ideología: ");
        etq.setFont(new Font("Arial", Font.BOLD, 15)); 
        idel = new JTextField(15);
        p.add(etq);
        p.add(idel);

        etq = new JLabel("Partido: ");
        etq.setFont(new Font("Arial", Font.BOLD, 15)); 
        part = new JTextField(15);
        p.add(etq);
        p.add(part);

        etq = new JLabel("Promesas: ");
        etq.setFont(new Font("Arial", Font.BOLD, 15)); 
        prom = new JTextField(15);
        p.add(etq);
        p.add(prom);

        wnd.add(p, BorderLayout.CENTER);

        p = new JPanel();
        //p.setBackground(Color.GREEN);
        ingresar = new JButton("Ingresar");
        ingresar.setFont(new Font("Arial", Font.ITALIC, 20));
        ingresar.addActionListener(this);
        p.add(ingresar);
        wnd.add(p, BorderLayout.SOUTH);

        p = new JPanel();
        p.add(new JLabel("                "));
        wnd.add(p, BorderLayout.WEST);

        p = new JPanel();
        p.add(new JLabel("                "));
        wnd.add(p, BorderLayout.EAST);

        wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        wnd.setSize(500, 570); 
        wnd.setVisible(true);
        System.out.println("insert");
    }
    
}