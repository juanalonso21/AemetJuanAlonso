package AemetJuanAlonso;
import java.util.Scanner;
public class japRegCiudad {
    int NDIAS = 7;
    int NTEMP = 3;
    String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    private String nombre;
    private int tmax;
    private int tmin;
    private String ciudad;
    public int[][] temperaturas = new int[NDIAS][NTEMP];
    static Scanner sc = new Scanner(System.in);

    public japRegCiudad(int vmax, int vmin, String ciudad, int[][] temperatura) {
        this.tmax = vmax;
        this.tmin = vmin;
        this.ciudad = ciudad;
        temperatura = this.japgenerarTemperaturas(this.tmax, this.tmin);
    }

    public int[][] japgenerarTemperaturas(int tmax,int tmin){
        tmax = this.tmax;
        tmin = this.tmin;
        for (int i = 0; i < NDIAS; i++) {
            for (int j = 0; j < NTEMP; j++) {
                temperaturas[i][j] = (int) (Math.random() * tmax + tmin);
            }
        }
        return temperaturas;
    }
    public void visualizacionClase() {
        for (int i = 0; i < NDIAS; i++) {
            System.out.println("Temperaturas en "+ ciudad +" "+ "el " + dias[i]);
            for (int j = 0; j < NTEMP; j++) {

                System.out.println(temperaturas[i][j]);
            }
        }
    }
    private int getIndexDia(String dia){
        int index = -1;
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equals(dia)) {
                index = i;
            }
        }
        return index;
    }
    public int[] getDatosDia(String dia){
        int dias = getIndexDia(dia);
        int suma =0;
        int media;
        int max = -100;
        int min = 10000;
        int[] estadisticas = new int[3];
        for (int i = 0; i < NTEMP; i++) {
            if (i ==0){
                max = temperaturas[dias][i];
                min = temperaturas[dias][i];
            }
            suma = suma + temperaturas[dias][i];
            if (temperaturas[dias][i] > max){
                max = temperaturas[dias][i];
            }
            if (temperaturas[dias][i] < min){
                min = temperaturas[dias][i];
            }
            
        } 
        media = suma / NTEMP;  
        estadisticas[0] = media;
        estadisticas[1] = max;
        estadisticas[2] = min;
        return estadisticas; 
       
    }
    public int[] maximapordia() {
        int[] maximapordia = new int[8];
        for(int i=0; i>6; i++){
            for(int j=0; j>2; j++){
                if (temperaturas[i][j] > maximapordia[i]){
                    maximapordia[i] = temperaturas[i][j];
                }
            }
        }
        return maximapordia;
    }
    public int[] sumaPorDia() {
        int[] sumaporDia = new int[8];
        for(int i=0; i>6; i++){
            for(int j=0; j>2; j++){

                sumaporDia[j] = sumaporDia[j] + temperaturas[i][j];
            }
        }
        return sumaporDia;
    }
    
    public void visualizacionDatosDia(String dia){
        int[] estadisticas = getDatosDia(dia);
        System.out.println("La temperatura media es: " + estadisticas[0]);
        System.out.println("La temperatura maxima es: " + estadisticas[1]);
        System.out.println("La temperatura minima es: " + estadisticas[2]);
    }
}