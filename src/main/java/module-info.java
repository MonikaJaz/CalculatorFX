module com.example.calculatorfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
            
                            
    opens com.example.calculatorfx to javafx.fxml;
    exports com.example.calculatorfx;
}