package dev.gisela;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MesesDiasTest {
   
        @Test
        public void testEnero(){
            assertEquals("El mes de Enero tiene 31 días.", MesesDias.obtenerMensaje(1));
        }

        @Test
        public void testFebrero() {
            assertEquals("El mes de Febrero tiene 28 días.", MesesDias.obtenerMensaje(2));
        }

        @Test
        public void testMarzo() {
            assertEquals("El mes de Marzo tiene 31 días.", MesesDias.obtenerMensaje(3));
        }

        @Test
        public void testAbril() {
            assertEquals("El mes de Abril tiene 30 días.", MesesDias.obtenerMensaje(4));
        }
    
        @Test
        public void testMayo() {
            assertEquals("El mes de Mayo tiene 31 días.", MesesDias.obtenerMensaje(5));
        }
    
        @Test
        public void testJunio() {
            assertEquals("El mes de Junio tiene 30 días.", MesesDias.obtenerMensaje(6));
        }
    
        @Test
        public void testJulio() {
            assertEquals("El mes de Julio tiene 31 días.", MesesDias.obtenerMensaje(7));
        }
    
        @Test
        public void testAgosto() {
            assertEquals("El mes de Agosto tiene 31 días.", MesesDias.obtenerMensaje(8));
        }
    
        @Test
        public void testSeptiembre() {
            assertEquals("El mes de Septiembre tiene 30 días.", MesesDias.obtenerMensaje(9));
        }
    
        @Test
        public void testOctubre() {
            assertEquals("El mes de Octubre tiene 31 días.", MesesDias.obtenerMensaje(10));
        }
    
        @Test
        public void testNoviembre() {
            assertEquals("El mes de Noviembre tiene 30 días.", MesesDias.obtenerMensaje(11));
        }
    
        @Test
        public void testDiciembre() {
            assertEquals("El mes de Diciembre tiene 31 días.", MesesDias.obtenerMensaje(12));
        }
    

        @Test
        public void testMesInvalido(){
            assertEquals("Mes inválido", MesesDias.obtenerMensaje(13));
            assertEquals("Mes inválido", MesesDias.obtenerMensaje(0));
            assertEquals("Mes inválido", MesesDias.obtenerMensaje(-1));
        }
        


}
