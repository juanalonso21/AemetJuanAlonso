package AemetJuanAlonso;
import java.util.Scanner;
import AemetJuanAlonso.japRegCiudad;
public class japAemet {
    static java.util.Scanner sc = new Scanner(System.in);
    static String[]  japNombres = {"Almeria", "Sevilla", "Malaga", "Cordoba", "Jaen", "Granada", "Huelva", "Cadiz"};
    static int vmax[] = new int[japNombres.length];
    static int vmin[] = new int [japNombres.length];
        public static void main(String[] args) {
            japRegCiudad V = new japRegCiudad();
            japgenerarTemperaturas();
        }
        public static void japgenerarTemperaturas(){        
            for (int i = 0; i < japNombres.length; i++) {
                    System.out.println(japNombres[i]);
                    System.out.println("    -Vmax:");
                    vmax[i] = sc.nextInt();
                    System.out.println("    -Vmin:");
                    vmin[i] = sc.nextInt();
                    japRegCiudad V = new japRegCiudad(vmax[i], vmin[i], japNombres[i]);
        }
    }
    public static void ListarRegistroTemp(String[] args) {
        V.visualizacionClase;
    }

}