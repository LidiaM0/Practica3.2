package application;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class SampleController {

    @FXML
    private Circle circulo;
    @FXML
    private TextField tiempoInput;
    @FXML
    private Label tiempoRestanteLabel;

    private DoubleProperty progreso = new SimpleDoubleProperty(0);
    Timeline timeline;
    private int tiempoTotal;
    private int tiempoTranscurrido;

    @FXML
    public void initialize() {
        // vincular la propiedad radius del circulo a la propiedad progreso (escalada para visualizacion)
        circulo.radiusProperty().bind(progreso.multiply(100));

        // crear una timeline para animar el progreso
        timeline = new Timeline(
            new KeyFrame(Duration.seconds(1), new javafx.event.EventHandler<javafx.event.ActionEvent>() {
                @Override
                public void handle(javafx.event.ActionEvent event) {
                    actualizarProgreso();
                }
            })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);

        // añadir listener al TextField para iniciar el progreso
        tiempoInput.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                iniciarProgreso();
            }
        });
    }

    void iniciarProgreso() {
        try {
            tiempoTotal = Integer.parseInt(tiempoInput.getText());
            tiempoTranscurrido = 0;
            progreso.set(0);
            tiempoRestanteLabel.setText("tiempo restante: " + tiempoTotal + " segundos");
            timeline.playFromStart();
        } catch (NumberFormatException e) {
            tiempoRestanteLabel.setText("por favor, introduce un numero valido.");
        }
    }

    private void actualizarProgreso() {
        if (tiempoTranscurrido < tiempoTotal) {
            tiempoTranscurrido++;
            progreso.set((double) tiempoTranscurrido / tiempoTotal);
            tiempoRestanteLabel.setText("tiempo restante: " + (tiempoTotal - tiempoTranscurrido) + " segundos");
        } else {
            progreso.set(1.0);
            timeline.stop();
            tiempoRestanteLabel.setText("¡progreso completado!");
        }
    }

    public double getProgreso() {
        return progreso.get();
    }

    public void setProgreso(double progreso) {
        this.progreso.set(progreso);
    }

    public DoubleProperty progresoProperty() {
        return progreso;
    }
}
