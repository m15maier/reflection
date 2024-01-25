module de.telran.reflection {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.telran.reflection to javafx.fxml;
    exports de.telran.reflection;
}