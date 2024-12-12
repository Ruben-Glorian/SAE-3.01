module com.example.sae301 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.sae301 to javafx.fxml;
    exports com.example.sae301;
}