
/**
 * Write a description of class domiciliarioestructura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class domiciliarioestructura
{
    **
 * Write a description of class EstudianteEstructurada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EstudianteEstructurada
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] identificaciones = new String[50];
        String[] nombres = new String[50];
        String[] edad = new String[50];
        double[] valoruno = new double[50];
        double[] valordos = new double[50];
        double[] valortres = new double[50];
       
        int numeroEstudiantes;
        String identificacion, nombre, edad;
        double valor1, valor2, valor3;
        double promedio = 0;
        System.out.println("Digite la cantidad de estudiantes");
        numeroEstudiantes = sc.nextInt();
        for(int i = 0; i < numeroEstudiantes; i++){
            System.out.println("digite la identificacion del domiciliario");
            identificacion = sc.next();
            System.out.println("digite el nombre del domiciliario");
            nombre = sc.next();
            System.out.println("digite el edad del estudiante");
            edad = sc.next();
            System.out.println("digite valor 1 del estudiante");
            valor1 = sc.nextDouble();
            System.out.println("digite valor 2 del estudiante");
            valor2 = sc.nextDouble();
            System.out.println("digite valor 3 del estudiante");
            valor3 = sc.nextDouble();
            identificaciones[i] = identificacion;
            nombres[i] = nombre;
            edad[i] = edad;
            valoruno[i] = valor1;
            valordos[i] = valor2;
            valorres[i] = valor3;
        }
        for (int i = 0; i < numerodomiciliarios; i++){
            promedio = promedio + ((valoruno[i] + valordos[i] + valortres[i]) / 3) / numerodomiciliarios;
        }
        System.out.println("El promedio de notas es: " + promedio);
    }
}
}

