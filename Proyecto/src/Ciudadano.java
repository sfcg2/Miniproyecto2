import java.util.Scanner;

<<<<<<< HEAD
public class Ciudadano {
=======

public class Ciudadano  {
>>>>>>> 4f8d7127c356f427dcf5fb48053d123bc56ccd4a

    private String nombre;
    private String cedula;
    private String ciudad;

    Scanner scanner = new Scanner(System.in);

    public Ciudadano(){};

    public String getNombre (){
        return nombre;
    }
<<<<<<< HEAD
    public void setNombre() {

        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
=======
    public void setNombre(String nom) {
        this.nombre = nom; 
>>>>>>> 4f8d7127c356f427dcf5fb48053d123bc56ccd4a
    }

    public String getCedula() {
        return cedula;
    }

<<<<<<< HEAD
    public void setCedula() {
        System.out.print("Cedula: ");
        cedula = scanner.nextLine();
=======
    public void setCedula(String cc) {
        this.cedula = cc;
>>>>>>> 4f8d7127c356f427dcf5fb48053d123bc56ccd4a
    }

    public String getCiudad() {
        return ciudad;
    }

<<<<<<< HEAD
    public void setCiudad() {
        
        System.out.print("Ciudad: ");
        ciudad = scanner.nextLine();
       
=======
    public void setCiudad(String cc) {
        
        this.ciudad = cc;
>>>>>>> 4f8d7127c356f427dcf5fb48053d123bc56ccd4a

    }
    
}