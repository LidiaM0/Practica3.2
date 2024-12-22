module Practica3_22 {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.junit.jupiter.api;
	requires javafx.graphics;
	requires org.testfx.junit5;
	
	opens application to javafx.graphics, javafx.fxml;
}
