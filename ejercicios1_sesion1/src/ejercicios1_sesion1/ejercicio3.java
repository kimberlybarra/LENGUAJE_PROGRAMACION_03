package ejercicios1_sesion1;

import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] frecuencia = new int[6];  
        
        for (int i = 0; i < 20000; i++) {
            int resultado = rand.nextInt(6) + 1;  
            switch (resultado) {
                case 1:
                	frecuencia[0]++;
                    break;
                case 2:
                	frecuencia[1]++;
                    break;
                case 3:
                	frecuencia[2]++;
                    break;
                case 4:
                	frecuencia[3]++;
                    break;
                case 5:
                	frecuencia[4]++;
                    break;
                case 6:
                	frecuencia[5]++;
                    break;
            }
        }

        System.out.println("frecuencias de las caras del dado:");
        for (int i = 0; i < 6; i++) {
            System.out.println("cara " + (i + 1) +": "+ frecuencia[i]);
        }
    }
}









