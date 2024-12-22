package application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import javafx.animation.Animation;

public class SampleControllerTest {

    private SampleController controller;

    @BeforeEach
    public void setUp() throws Exception {
        controller = new SampleController();  // Inicia el controlador directamente sin la UI
    }

   

    @Test
    public void testProgresoCompleto() throws Exception {
        // Simula el incremento del progreso a 1.0
        controller.setProgreso(1.0);
        
        // Verifica que el progreso sea 1.0
        assertEquals(1.0, controller.getProgreso(), 0.01);
        
    }

    @Test
    public void testProgresoIncrementa() throws Exception {
        // Establece el progreso a 0.5 y verifica que se haya actualizado correctamente
        controller.setProgreso(0.5);
        assertEquals(0.5, controller.getProgreso(), 0.01);
    }

}
