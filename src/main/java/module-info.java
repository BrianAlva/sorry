module csc331.sorry {
    requires javafx.controls;
    requires javafx.fxml;


    opens csc331.sorry to javafx.fxml;
    exports csc331.sorry;
}