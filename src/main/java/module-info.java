module com.example.aaa {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires javafx.media;

    opens com.example.aaa to javafx.fxml;
    exports com.example.aaa;
}