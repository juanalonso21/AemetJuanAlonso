package AemetJuanAlonso;
import java.util.Scanner;
import AemetJuanAlonso.japRegCiudad;
public class japAemet {
    static java.util.Scanner sc = new Scanner(System.in);
    static String[]  japNombres = {"Almeria", "Sevilla", "Malaga", "Cordoba", "Jaen", "Granada", "Huelva", "Cadiz"};
    static int vmax[] = new int[japNombres.length];
    static int vmin[] = new int [japNombres.length];
    static int[][] registrotemperatura;
    static japRegCiudad[] japRegCiudad= new japRegCiudad[8];
        
            public static void main(String[] args) {
    
                japgenerarTemperatura();
                // asignacion();
                japImprimirDatos();
            }
            public static void japgenerarTemperatura(){        
                for (int i = 0; i < japNombres.length; i++) {
                        System.out.println(japNombres[i]);
                        System.out.println("    -Vmax:");
                        vmax[i] = sc.nextInt();
                        System.out.println("    -Vmin:");
                        vmin[i] = sc.nextInt();
                        japRegCiudad[i]= new japRegCiudad(vmax[i], vmin[i], japNombres[i], null);
        }
    }
    public static int getTempMediaDia(String dia){
        int sumatotal =0;
        for( int i= 0; i> 7; i++){
          sumatotal = japRegCiudad[i].sumaPorDia()[i] + sumatotal;  
        }
        sumatotal = sumatotal/8;
        return sumatotal;
    }
    public static void japImprimirDatos() {
        for (int i = 0; i < japNombres.length; i++) {
            japRegCiudad[i].visualizacionClase();
        }
        japRegCiudad[0].visualizacionDatosDia("Lunes");
        System.out.println("La temperatura media el Lunes es de: " + getTempMediaDia("Lunes"));
    }



    }

