import java.util.ArrayList;
public class Zombie {
    
    private String nombre;
    private double salud;
    private String fechaNacimiento;
    private String tipoSangre;
    public static ArrayList<Zombie>zombies = new ArrayList<>();

    public Zombie(String n, Double s, String f, String t){
        this.nombre = n;
        this.salud = s;
        this.fechaNacimiento = f;
        this.tipoSangre = t;
        Zombie.zombies.add(this);
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public void setSalud(double s){
        this.salud = s;
    }

    public void atacar(){
        this.salud = this.salud/2;
    }

    public void setFechaNacimiento(String f){
        this.fechaNacimiento = f;
    }

    public void setTipoSangre(String t){
        this.tipoSangre = t;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getSalud(){
        return this.salud;
    }

    public String getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public String getTipoSangre(){
        return this.tipoSangre;
    }

}