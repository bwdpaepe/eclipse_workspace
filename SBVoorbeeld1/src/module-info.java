module SBVoorbeeld1 {
	
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	requires javafx.fxml;
	
	opens main to javafx.graphics, javafx.fxml;

}