module game.a2020 {
    requires javafx.controls;
    requires javafx.fxml;


    opens game.a2020 to javafx.fxml;
    exports game.a2020;
}