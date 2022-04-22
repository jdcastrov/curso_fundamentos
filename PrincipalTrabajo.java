import java.util.Scanner;
import java.util.ArrayList;
public class PrincipalTrabajo {
    public static void main(String[] args) {
        PrincipalTrabajo.mostrarMenu();
    }
    
    public static void mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run){
            System.out.println("\n Si el numero a ingresar es 0 se detendra el programa");
            System.out.println("Si el numero a ingresar es 1 se creara un Zombie");
            System.out.println("Si el numero a ingresar es 2 se mostrara la cantidad de Zombies creados");
            System.out.println("Si el numero a ingresar es 3 se mostrara la informacion de cada Zombie creado");
            System.out.println("Si el numero a ingresar es 4 se mostrara la información de los Zombies que tengan tipo de de sangre “O+” o “AB+”");
            System.out.println("Si el numero a ingresar es 5 se mostrara la informacion de los Zombies que nacieron despues del 2000");
            System.out.println("Si el numero a ingresar es 6 se disminuira a la mitad la salud de todos los zombies");
            System.out.println("Si el numero a ingresar es 7 ingrese nombre, distancia a Alexandria y cantidad de Zombies de una ubicación");
            System.out.println("Si el numero a ingresar es 8 se mostrara la informacion de cada ubicacion creada");
            System.out.println("Si el numero a ingresar es 9 se mostrara la información de la ubicación más segura de la ciudad");
            System.out.println("Si el numero a ingresar es 10 se mostrara la información de todas las ubicaciones de la ciudad ordenadas por distancia a Alexandria");
            System.out.println("Si el numero a ingresar es 11 se mostrara una frase aleatoria sobre Zombies");
            System.out.println("Si el numero a ingresar es 12 ");
            System.out.println("Ingrese un numero:");
            int num = scan.nextInt();
            switch(num){
                case 0:
                    run = false;
                    break;    
                case 1:
                    System.out.println("\nIngrese el nombre de un Zombie:");
                    String nombre = scan.next();
                    System.out.println("Ingrese la salud de un Zombie (0-100):");
                    double salud = scan.nextDouble();
                    System.out.println("Ingrese la fecha de nacimiento de un Zombie(dia/mes/año):");
                    String fecha = scan.next();
                    System.out.println("Ingrese el tipo de sangre de un Zombie:");
                    String tiposangre = scan.next();
                    tiposangre = tiposangre.toUpperCase();
                    Zombie z1 = new Zombie(nombre, salud, fecha,tiposangre);
                    break;
                case 2:
                    System.out.println("\nLa cantidad de zombies creados es: " + Zombie.zombies.size());
                    break;
                case 3:
                    if(Zombie.zombies.size() == 0){
                        System.out.println("\nNo hay informacion de ningun zombie");
                    }else{
                        for(int i = 0;i < Zombie.zombies.size();i++){
                            System.out.println("\nZombie# " + (i+1) + ":");
                            System.out.println("Nombre: " + Zombie.zombies.get(i).getNombre());
                            System.out.println("Salud: " + Zombie.zombies.get(i).getSalud());
                            System.out.println("Fecha de nacimiento: " +Zombie.zombies.get(i).getFechaNacimiento());
                            System.out.println("Tipo de sangre: " + Zombie.zombies.get(i).getTipoSangre());
                        }
                    }
                    break;
                case 4:
                    int contador = 0;
                    if(Zombie.zombies.size() <= 0){
                        System.out.println("\nNo hay informacion de ningun zombie");
                        contador++;
                    }
                    for(int i = 0;i < Zombie.zombies.size();i++){
                        if(Zombie.zombies.get(i).getTipoSangre().equals("O+") ||  Zombie.zombies.get(i).getTipoSangre().equals("AB+")){
                            System.out.println("\nZombie# " + (i+1) + ":");
                            System.out.println("Nombre: " + Zombie.zombies.get(i).getNombre());
                            System.out.println("Salud: " + Zombie.zombies.get(i).getSalud());
                            System.out.println("Fecha de nacimiento: " +Zombie.zombies.get(i).getFechaNacimiento());
                            System.out.println("Tipo de sangre: " + Zombie.zombies.get(i).getTipoSangre());
                            contador++;
                        }
                    }
                    if(contador == 0){
                        System.out.println("\nNingun zombie tiene tipo de de sangre O+ o AB+");
                    }
                    break;
                case 5:
                    int contador1 = 0;
                    if(Zombie.zombies.size() <= 0){
                        System.out.println("\nNo hay informacion de ningun zombie");
                        contador1++;
                    }
                    for(int i = 0;i < Zombie.zombies.size();i++){
                        if(Zombie.zombies.get(i).getFechaNacimiento().charAt(6) == '2'){
                            System.out.println("\nZombie# " + (i+1) + ":");
                            System.out.println("Nombre: " + Zombie.zombies.get(i).getNombre());
                            System.out.println("Salud: " + Zombie.zombies.get(i).getSalud());
                            System.out.println("Fecha de nacimiento: " +Zombie.zombies.get(i).getFechaNacimiento());
                            System.out.println("Tipo de sangre: " + Zombie.zombies.get(i).getTipoSangre());
                            contador1++;
                        }
                    }
                    if(contador1 == 0){
                        System.out.println("\nNingun zombie nacio despues del 2000");
                    }
                    break;
                case 6:
                    if(Zombie.zombies.size() <= 0){
                        System.out.println("\nNo hay zombies para atacar");
                    }else{
                        for(int i = 0;i < Zombie.zombies.size();i++){
                            Zombie.zombies.get(i).atacar();
                        }
                        System.out.println("\nTodos los Zombies han quedado a la mitad de vida");
                    }    
                    break;
                case 7:
                    System.out.println("\nIngrese el nombre de una ubicacion:");
                    String ubicacion = scan.next();
                    System.out.println("Ingrese la distancia entre Alexandria y " + ubicacion + ":");
                    double distancia = scan.nextDouble();
                    System.out.println("Ingrese la cantidad de zombies que hay en " + ubicacion + ":");
                    int cantZombies = scan.nextInt();
                    Ubicacion u1 = new Ubicacion(ubicacion, distancia, cantZombies);
                    break;
                case 8:
                    if(Ubicacion.ubicaciones.size() == 0){
                        System.out.println("\nNo hay informacion de ninguna ubicacion");
                    }else{
                        for(int i = 0;i < Ubicacion.ubicaciones.size();i++){
                            System.out.println("\nUbicacion# " + (i+1) + ":");
                            System.out.println("Nombre: " + Ubicacion.ubicaciones.get(i).getNombre());
                            System.out.println("Distancia: " + Ubicacion.ubicaciones.get(i).getDistancia());
                            System.out.println("Cantidad de zombies: " + Ubicacion.ubicaciones.get(i).getCantZombies());
                        }
                    }
                    break;
                case 9:
                    if(Ubicacion.ubicaciones.size() == 0){
                        System.out.println("\nNo hay informacion de ninguna ubicacion");
                    }else{
                        int mejorUbi = Ubicacion.ubicaciones.get(0).getCantZombies();
                        int y = 0;
                        for(int i = 0;i < Ubicacion.ubicaciones.size();i++){
                            if(mejorUbi > Ubicacion.ubicaciones.get(i).getCantZombies()){
                                mejorUbi = Ubicacion.ubicaciones.get(i).getCantZombies();
                                y = i;
                            }
                        }
                        System.out.println("\nLa ubicacion mas segura es:");
                        System.out.println("Ubicacion# " + (y+1) + ":");
                        System.out.println("Nombre: " + Ubicacion.ubicaciones.get(y).getNombre());
                        System.out.println("Distancia: " + Ubicacion.ubicaciones.get(y).getDistancia());
                        System.out.println("Cantidad de zombies: " + Ubicacion.ubicaciones.get(y).getCantZombies());
                    }
                    break;
                case 10:   
                        if(Ubicacion.ubicaciones.size() == 0){
                            System.out.println("\nNo hay informacion de ninguna ubicacion");
                        }else{
                            Ubicacion.ordenamiento(Ubicacion.ubicaciones,Ubicacion.ubicaciones.size());
                            System.out.println("\nInformación de todas las ubicaciones de la ciudad ordenadas por distancia a Alexandria");
                            for(int i=0; i<Ubicacion.ubicaciones.size(); i++){
                                System.out.println("\nUbicacion# " + (i+1) + ":");
                                System.out.println("Nombre: " + Ubicacion.ubicaciones.get(i).getNombre());
                                System.out.println("Distancia: " + Ubicacion.ubicaciones.get(i).getDistancia());
                                System.out.println("Cantidad de zombies: " + Ubicacion.ubicaciones.get(i).getCantZombies());
                            }
                        }
                    break;
                case 11 :
                    ArrayList palabras = new ArrayList () ;
                        palabras.add ("2 zombies que cuentan chistes...zombienchistosos...?");
                        palabras.add ("¿Cuál es el colmo de zombie?...Asistir a un concierto en vivo");
                        palabras.add ("Zombies...Los unicos seres que te aman por tu cerebro");
                        palabras.add ("Si los Zombies tienen la mirada torcida...Zombizcos?");
                        palabras.add("Sí los zombies se deshacen con el pasar del tiempo...¿zombiodegradables?");
                        int a = (int) (Math. random() * 5);
                        System. out.println (palabras.get (a) ) ;
                    break;
                case 12:
                    int contador3 = 0;
                    if(Zombie.zombies.size() == 0){
                        System.out.println("\nNo hay informacion de ningun zombie");
                    }else{
                        for(int i = 0;i < Zombie.zombies.size();i++){
                            System.out.println("\nZombie# " + (i+1) + ":");
                            System.out.println("Nombre: " + Zombie.zombies.get(i).getNombre());
                            System.out.println("Salud: " + Zombie.zombies.get(i).getSalud());
                            System.out.println("Fecha de nacimiento: " +Zombie.zombies.get(i).getFechaNacimiento());
                            System.out.println("Tipo de sangre: " + Zombie.zombies.get(i).getTipoSangre());
                            contador3++;
                        }
                    }
                    if(contador3 != 0){
                        System.out.println("\nElija el numero del zombie que quiere eliminar");
                        int numZombie = scan.nextInt() - 1;
                        Zombie.zombies.remove(Zombie.zombies.get(numZombie));
                        System.out.println("\nEl zombie " + (numZombie + 1) + " ha sido eliminado");
                    }
                    break;
            }   
            
        }
        scan.close();
    }
    
}