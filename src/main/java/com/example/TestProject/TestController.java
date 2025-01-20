package com.example.TestProject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;

public class TestController {
    public Canvas cvsTest;

    @FXML
    private void onClearButtonClick() {
        cvsTest.getGraphicsContext2D().clearRect(0, 0, cvsTest.getWidth(), cvsTest.getHeight());
    }

    public void onSetButtonClick(ActionEvent actionEvent) {
        cvsTest.getGraphicsContext2D().setFill(javafx.scene.paint.Color.RED);
        cvsTest.getGraphicsContext2D().fillRect(0, 0, cvsTest.getWidth(), cvsTest.getHeight());
    }
}