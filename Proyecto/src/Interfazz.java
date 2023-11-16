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
    JScrollPane scroll;
    JLabel etq, etq2;
    JButton iniciar, ingresar, salir1, salir2, vtar ;
    ArrayList <Candidato> lsiat = Insertar.getInscritos();

    public static JFrame wnd, wnd2;
    public static JTextField nom, cc, cdad, idel, part, prom, posic;
    public static JTextArea area; 
    public static ArrayList <Candidato> lsiatElim = Eliminar.getListaC2();
    public static String buscarCedula;

    Candidato candidato = new Candidato();
    Insertar in = new Insertar();
    Actualizar ac = new Actualizar();
    Eliminar el = new Eliminar();
    Buscar bc = new Buscar();
    Votar vt = new Votar();
    ListaCandidatos lc = new ListaCandidatos();
    PMasC pc = new PMasC();
    Ciudadestop3 tp = new Ciudadestop3();

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
        etq = new JLabel("                   ");
        etq.setFont(new Font("Serif", Font.ITALIC, 20));
        panel.add(etq);
        contenedor.add(panel, BorderLayout.WEST);

        panel = new JPanel();
        etq = new JLabel("                   ");
        etq.setFont(new Font("Serif", Font.ITALIC, 20));
        panel.add(etq);
        contenedor.add(panel, BorderLayout.EAST);

        panel = new JPanel();
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
            listar.addActionListener(this);
            opciones.add(listar);

            votar = new JMenuItem("Votar");
            votar.addActionListener(this);
            opciones.add(votar);

            info = new JMenuItem("Información");
            info.addActionListener(this);
            opciones.add(info);

            panel = new JPanel();
            etq.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\Miniproyecto2-main\\Proyecto\\img\\colV.jpg"));
            etq.setPreferredSize(new Dimension(800,600));
            panel.add(etq);
            wnd.add(panel, BorderLayout.CENTER);
 
            wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd.setSize(500, 570); 
            wnd.setVisible(true);

        }else if(e.getSource() == insertar){

            inscripciones();
                
        }else if(e.getSource() == ingresar){

            in.insertar();
            
        }else if(e.getSource() == salir1){
            wnd.dispose();
        }else if(e.getSource() == actualizar){

            buscarCedula = JOptionPane.showInputDialog(wnd, "Ingrese la cédula del candidato a actualizar:");
            Actualizar.setVal4(false);
            if (buscarCedula != null){
                
                ac.actualizar();

                if(Actualizar.getVal4() != false){
                    inscripciones();
                }
                
            }else{return;}

        }else if(e.getSource() == eliminar){

            buscarCedula = JOptionPane.showInputDialog(wnd, "Ingrese la cédula del candidato a eliminar:");

            if (buscarCedula != null){
                
                el.eliminar();
                
            }else{return;}

        }else if(e.getSource() == buscar){

            buscarCedula = JOptionPane.showInputDialog(wnd,"Ingrese la cédula del candidato a buscar:");
            
            Buscar.setVal(false);
            
            if (buscarCedula != null){

                area = new JTextArea(100,10);
                
                bc.buscar();

                if(Buscar.getVal() != false){

                    wnd2 = new JFrame("Candidato");
                    wnd2.setLayout(new BorderLayout());
                    area.setEditable(false);
                    scroll = new JScrollPane(area);
                    wnd2.add(scroll, BorderLayout.CENTER);
                    wnd2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    wnd2.setSize(500, 570); 
                    wnd2.setVisible(true);
                    System.out.println(lsiat.toString()); 
                }
               
            }else{return;}
            
        }else if(e.getSource() == listar){

            wnd2 = new JFrame("Lista Candidatos");
            wnd2.setLayout(new BorderLayout());

            area = new JTextArea(250,10);
            lc.listaCandidatos();
            area.setEditable(false);
            scroll = new JScrollPane(area);
            wnd2.add(scroll, BorderLayout.CENTER);
            
            panel = new JPanel();
            salir2 = new JButton("Salir");
            salir2.setFont(new Font("Arial", Font.ITALIC, 20));
            salir2.addActionListener(this);
            panel.add(salir2);
            etq = new JLabel("   ");
            etq.setFont(new Font("Arial", Font.BOLD, 40));
            panel.add(etq);
            wnd2.add(panel,BorderLayout.SOUTH);

            wnd2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd2.setSize(500, 570); 
            wnd2.setVisible(true);

        }else if(e.getSource() == salir2){wnd2.dispose();}
        
        else if (e.getSource() == votar){

            wnd = new JFrame("Votación");
            wnd.setLayout(new BorderLayout());
            panel = new JPanel();
            panel.setLayout(new BorderLayout());
            
            area = new JTextArea(100,10);
            lc.listaCandidatos();

            area.setEditable(false);
            scroll = new JScrollPane(area);
            panel.add(scroll, BorderLayout.CENTER);
            wnd.add(panel, BorderLayout.CENTER);

            panel = new JPanel();
            panel.setLayout(new GridLayout(3,1, 15,15));

            etq = new JLabel("Posición: ");
            etq.setFont(new Font("Arial", Font.BOLD, 20));
            posic = new JTextField(15);
            etq2 = new JLabel("                            ");
            etq2.setFont(new Font("Arial", Font.BOLD, 15));
            panel.add(etq);
            panel.add(posic);
            panel.add(etq2);

            vtar = new JButton("Votar");
            vtar.addActionListener(this);
            panel.add(vtar);
            wnd.add(panel, BorderLayout.SOUTH);
            wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd.setSize(500, 570); 
            wnd.setVisible(true);

        }else if(e.getSource() == vtar){
            
            vt.votar();
            wnd.dispose();

        }else if(e.getSource() == info){

            wnd = new JFrame("Información");
            wnd.setLayout(new BorderLayout());
            area = new JTextArea(100,10);

            vt.VotosTotales();
            pc.pMasC();
            tp.ciudadestop3();

            area.setEditable(false);
            scroll = new JScrollPane(area);
            wnd.add(scroll, BorderLayout.CENTER);
            
            wnd.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            wnd.setSize(500, 570); 
            wnd.setVisible(true);
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
    }public static String getPosic(){
        return posic.getText();
    }public static String getBuscarCedula(){
        return buscarCedula;
    }public static ArrayList <Candidato> getLsiatElim(){
        return lsiatElim;
    }public static JTextArea getArea(){
        return area;
    }public static JFrame getwidth(){
        return wnd;
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
        ingresar = new JButton("Inscribir");
        ingresar.setFont(new Font("Arial", Font.ITALIC, 20));
        ingresar.addActionListener(this);
        p.add(ingresar);
        salir1 = new JButton("Salir");
        salir1.setFont(new Font("Arial", Font.ITALIC, 20));
        salir1.addActionListener(this);
        p.add(salir1);
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
    }
}