import java.util.Scanner;

public class Ciudadano {

    private String nombre;
    private String cedula;
    private String ciudad;

    Scanner scanner = new Scanner(System.in);

    public Ciudadano(){};

    public String getNombre (){
        return nombre;
    }
    public void setNombre() {

        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula() {
        System.out.print("Cedula: ");
        cedula = scanner.nextLine();
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad() {
        
        System.out.print("Ciudad: ");
        ciudad = scanner.nextLine();
       

    }
    
}