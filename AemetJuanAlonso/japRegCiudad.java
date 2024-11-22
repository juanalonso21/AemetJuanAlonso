package AemetJuanAlonso;
import java.util.Scanner;
public class japRegCiudad {
    int NDIAS = 7;
    int NTEMP = 3;
    private String nombre;
    int tmax;
    int tmin;
    String ciudad;
    int[][] temperaturas = new int[NDIAS][NTEMP];
    static Scanner sc = new Scanner(System.in);

    public japRegCiudad(int vmax, int vmin, String ciudad) {
        int tmax = vmax;
        int tmin = vmin;
        ciudad = nombre;
    }
    public static void main(String[] args) {

    }
    public static void getIndexCiudad() {
        
    }
    public void japgenerarTemperaturas(){
        for (int i = 0; i < NDIAS; i++) {
            for (int j = 0; j < NTEMP; j++) {
                temperaturas[i][j] = (int) (Math.random() * tmax - tmin);
            }
        }
    }
    public void visualizacionClase() {
        for (int i = 0; i < NDIAS; i++) {
            for (int j = 0; j < NTEMP; j++) {
                System.out.println("Temperaturas en "+ ciudad);
                System.out.println(temperaturas[i][j]);
            }
        }
    }
}