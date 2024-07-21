package dev.gisela;


public class MesesDias {


    public static void main(String[] args) {
        int mes = 5; 
        System.out.println(obtenerMensaje(mes));
    }
    
    public static String obtenerMensaje(int mes) {
        String nombreDelMes;
        int diasDelMes;

        switch (mes) {
            case 1:
                nombreDelMes = "Enero";
                diasDelMes = 31;
                break;
            case 2:
                nombreDelMes = "Febrero";
                diasDelMes = 28; 
                break;
            case 3:
                nombreDelMes = "Marzo";
                diasDelMes = 31;
                break;
            case 4:
                nombreDelMes = "Abril";
                diasDelMes = 30;
                break;
            case 5:
                nombreDelMes = "Mayo";
                diasDelMes = 31;
                break;
            case 6:
                nombreDelMes = "Junio";
                diasDelMes = 30;
                break;
            case 7:
                nombreDelMes = "Julio";
                diasDelMes = 31;
                break;
            case 8:
                nombreDelMes = "Agosto";
                diasDelMes = 31;
                break;
            case 9:
                nombreDelMes = "Septiembre";
                diasDelMes = 30;
                break;
            case 10:
                nombreDelMes = "Octubre";
                diasDelMes = 31;
                break;
            case 11:
                nombreDelMes = "Noviembre";
                diasDelMes = 30;
                break;
            case 12:
                nombreDelMes = "Diciembre";
                diasDelMes = 31;
                break;
            default:
                nombreDelMes = "Mes inválido";
                diasDelMes = 0;
                break;
        }

        if (diasDelMes > 0) {
            return "El mes de " + nombreDelMes + " tiene " + diasDelMes + " días.";
        } else {
            return nombreDelMes;
        }
    }

}