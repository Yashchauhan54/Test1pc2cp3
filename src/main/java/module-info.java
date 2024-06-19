module org.example.yashtest1pc2cp3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens org.example.yashtest1pc2cp3 to javafx.fxml;
    exports org.example.yashtest1pc2cp3;
}