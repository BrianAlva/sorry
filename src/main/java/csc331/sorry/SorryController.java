package csc331.sorry;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class SorryController {

    @FXML
    private ImageView cardImage;

    @FXML
    private GridPane gridPane;

    @FXML
    private Label turnLabel;

    @FXML
    void onCardClicked(MouseEvent event) {
        int card = (int)(Math.random() * 12 + 1);
        cardImage.setImage(new Image(String.valueOf(getClass().getResource("cards/" + card + ".png"))));
    }

}
