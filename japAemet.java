package AemetJuanAlonso;
import java.util.Scanner;
import japRegCiudad;
public class japAemet {
    String[] asgNombres = {"Almeria", "Sevilla", "Malaga", "Cordoba", "Jaen", "Granada", "Huelva", "Cadiz"};
    public static void main(String[] args) {
        
    }
    public static void japgenerarTemperaturas(){
        int[][] temperaturas = new int[7][7];
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                temperaturas[i][j] = (int) (Math.random() * 40 - 10);
            }
        }
    }
    public static void pedidaPorTeclado(String[] args) {
        
    }
}