import javax.swing.UIManager;

public class App {
 
    public static void main(String[] args) throws Exception {

        try{
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        }catch (Exception e){
            e.printStackTrace();
        }
        
        Interfazz zz = new Interfazz();
    }

}

    

    