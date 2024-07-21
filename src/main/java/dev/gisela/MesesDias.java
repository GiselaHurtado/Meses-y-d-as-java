package dev.gisela;


public class MesesDias {
    public static void main(String[] args) {
        int mes = 5; // Puedes cambiar este número para probar con otros meses
        
        String nombreDelMes;
        int diasDelMes;
        
        switch (mes) {
            case 1:
                nombreDelMes = "Enero";
                diasDelMes = 31;
                break;
            case 2:
                nombreDelMes = "Febrero";
                diasDelMes = 28; // Consideramos año no bisiesto por simplicidad
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
            System.out.println("El mes de " + nombreDelMes + " tiene " + diasDelMes + " días.");
        } else {
            System.out.println(nombreDelMes);
        }
    }
}