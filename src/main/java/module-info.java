module com.example.fiatdachiigenerator {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.fiatdachiigenerator to javafx.fxml;
    opens de.exceptionHandling to javafx.fxml;
    exports de.fiatdachiigenerator;
    exports de.exceptionHandling;
}