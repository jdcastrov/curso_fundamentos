import java.util.ArrayList;
public class Ubicacion{
    
    private String nombre;
    private double distancia;
    private int cantZombies;
    public static ArrayList<Ubicacion>ubicaciones = new ArrayList<>();
    
    public Ubicacion(String n, Double d, int c){
        this.nombre = n;
        this.distancia = d;
        this.cantZombies = c;
        Ubicacion.ubicaciones.add(this);
    }
    
    public static void ordenamiento(ArrayList<Ubicacion>ubicaciones,int n){
        int pos_menor;
        double temp;
        for (int i = 0; i < n - 1; i++) {
            pos_menor = i;
            for (int j = i + 1; j < n; j++) {
                if (ubicaciones.get(j).getDistancia() < ubicaciones.get(pos_menor).getDistancia()){
                    pos_menor = j;
                }
            }
            temp = ubicaciones.get(i).getDistancia();
            ubicaciones.get(i).setDistancia(ubicaciones.get(pos_menor).getDistancia());
            ubicaciones.get(pos_menor).setDistancia(temp);
        }
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }

    public void setDistancia(double d){
        this.distancia = d;
    }

    public void setCantZombies(int c){
        this.cantZombies = c;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public double getDistancia(){
        return this.distancia;
    }

    public int getCantZombies(){
        return this.cantZombies;
    }
}