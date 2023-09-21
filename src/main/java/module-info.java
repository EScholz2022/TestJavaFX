module com.example.testjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.apache.logging.log4j;
    requires org.jsoup;
    requires jxl;
    requires javafx.graphics;

    opens com.example.testjavafx to javafx.fxml;
    exports com.example.testjavafx;
    exports sample;
    opens sample to javafx.fxml;
    exports controller;
    opens controller to javafx.fxml;
}