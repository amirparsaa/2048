package game.a2020;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import java.io.File;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Optional;
import java.util.Random;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 415, 520);
       gridPane.setStyle("-fx-background-color: black");
        stage.getIcons().add(new Image(getClass().getResource("/gg20.png").toExternalForm()));
        stage.setTitle("2048");

        String musicFile = "StayTheNight.mp3";     // For example

        int[]score = new int[1];
        Label label[][]=new Label[4][4];
        label[0][0] = new Label();
        label[0][1] = new Label();
        label[0][2] = new Label();
        label[0][3] = new Label();
        label[1][0] = new Label();
        label[1][1] = new Label();
        label[1][2] = new Label();
        label[1][3] = new Label();
        label[2][0] = new Label();
        label[2][1] = new Label();
        label[2][2] = new Label();
        label[2][3] = new Label();
        label[3][0] = new Label();
        label[3][1] = new Label();
        label[3][2] = new Label();
        label[3][3] = new Label();
        BackgroundFill backgroundFil = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);
        Background black = new Background(backgroundFil);
        HBox hBox = new HBox();
        Button button = new Button("Reset");
        button.setFont(Font.font(20));
        Button button1 = new Button("Debug");
        button1.setFont(Font.font(20));
        button.setBackground(black);
        button1.setBackground(black);
        button1.setTextFill(Color.CORAL);
        button.setTextFill(Color.CORAL);
        Label scr = new Label();
        scr.setText("Score: "+Integer.toString(score[0]));
        scr.setFont(Font.font(20));
        scr.setTextFill(Color.CORAL);
        scr.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(button, button1, scr);
    //    hBox.setFillHeight(true);
        hBox.setHgrow(button,Priority.ALWAYS);
        hBox.setHgrow(button1,Priority.ALWAYS);
        hBox.setHgrow(scr,Priority.ALWAYS);
        button.setMaxSize(400,400);
        button1.setMaxSize(400,400);
        scr.setMaxSize(400,400);
        hBox.setMaxSize(400,400);
        gridPane.add(hBox, 0, 0,4,1);
        gridPane.add(label[0][0], 0, 1);
        gridPane.add(label[0][1], 1, 1);
        gridPane.add(label[0][2], 2, 1);
        gridPane.add(label[0][3], 3, 1);
        gridPane.add(label[1][0], 0, 2);
        gridPane.add(label[1][1], 1, 2);
        gridPane.add(label[1][2], 2, 2);
        gridPane.add(label[1][3], 3, 2);
        gridPane.add(label[2][0], 0, 3);
        gridPane.add(label[2][1], 1, 3);
        gridPane.add(label[2][2], 2, 3);
        gridPane.add(label[2][3], 3, 3);
        gridPane.add(label[3][0], 0, 4);
        gridPane.add(label[3][1], 1, 4);
        gridPane.add(label[3][2], 2, 4);
        gridPane.add(label[3][3], 3, 4);

        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(20);
        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(20);
        RowConstraints row3 = new RowConstraints();
        row3.setPercentHeight(20);
        RowConstraints row4 = new RowConstraints();
        row4.setPercentHeight(20);
        RowConstraints row5 = new RowConstraints();
        row5.setPercentHeight(20);
        gridPane.getRowConstraints().addAll(row1,row2,row3,row4,row5);

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(25);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(25);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setPercentWidth(25);
        ColumnConstraints col4 = new ColumnConstraints();
        col4.setPercentWidth(25);
        gridPane.getColumnConstraints().addAll(col1, col2, col3,col4);



        label[0][0].setMaxSize(400,400);
        label[0][1].setMaxSize(400,400);
        label[0][2].setMaxSize(400,400);
        label[0][3].setMaxSize(400,400);
        label[1][0].setMaxSize(400,400);
        label[1][1].setMaxSize(400,400);
        label[1][2].setMaxSize(400,400);
        label[1][3].setMaxSize(400,400);
        label[2][0].setMaxSize(400,400);
        label[2][1].setMaxSize(400,400);
        label[2][2].setMaxSize(400,400);
        label[2][3].setMaxSize(400,400);
        label[3][0].setMaxSize(400,400);
        label[3][1].setMaxSize(400,400);
        label[3][2].setMaxSize(400,400);
        label[3][3].setMaxSize(400,400);


        gridPane.setVgap(5);
        gridPane.setHgap(5);
        hBox.setSpacing(5);
        BackgroundFill backgroundFill = new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY);
        Background blue = new Background(backgroundFill);
        BackgroundFill backgroundFill2 = new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY);
        Background green = new Background(backgroundFill2);
        BackgroundFill backgroundFill3 = new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY);
        Background yellow = new Background(backgroundFill3);
        BackgroundFill backgroundFill4 = new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY);
        Background red = new Background(backgroundFill4);
        BackgroundFill backgroundFill5 = new BackgroundFill(Color.BROWN, CornerRadii.EMPTY, Insets.EMPTY);
        Background brown = new Background(backgroundFill5);
        BlockGrid blockGrid = new BlockGrid();
        int[][]emp = new int[4][4];



        if (!haveEmp(emp)){
            System.out.println("finish");
        }
        Boolean[]bool = new Boolean[1];
        bool[0]=false;
        getRandomEmptyPoint(emp);
        setBackForLabel(label,emp);

        button.setOnAction(actionEvent -> {
            for (int i = 0;i<4;i++){
                for (int j =0;j<4;j++){
                     emp[i][j]=0;
                }
            }
            bool[0] = true;
            score[0]=0;
            setBackForLabel(label,emp);
            scr.setText("Score: "+Integer.toString(score[0]));
        });
        button1.setOnAction(actionEvent -> {
            for (int i = 0;i<4;i++){
                for (int j =0;j<4;j++){
                    System.out.print(emp[i][j]+"  ");
                }
                System.out.println();
            }
        });


        scene.setOnKeyPressed(e-> {
            int[][]emp2 = new int[4][4];
            for (int i = 0;i<4;i++){
                for (int j =0;j<4;j++){
                    emp2[i][j] = emp[i][j];
                }

            }
            if (e.getCode() == KeyCode.S) {
                downpressed(label, emp, score);
                if(loseCondition(emp)){
             //       System.out.println("you suck");
                }
            }
            if (e.getCode() == KeyCode.W){
                uppressed(label, emp,score);
                if(loseCondition(emp)){
               //     System.out.println("you suck");
                }
            }
            if (e.getCode() == KeyCode.A){
                leftpressed(label, emp,score);
                if(loseCondition(emp)){
               //     System.out.println("you suck");
                }
            }
            if (e.getCode() == KeyCode.D){
                rightpressed(label, emp,score);
                if(loseCondition(emp)){
               //     System.out.println("you suck");
                }
            }
            Boolean makeNewBlock = false;
            for (int i = 0;i<4;i++){
                for (int j =0;j<4;j++){
                    if (emp2[i][j] != emp[i][j])
                        makeNewBlock=true;
                }
            }
            if (makeNewBlock||bool[0]) {
                getRandomEmptyPoint(emp);
                bool[0]=false;
            }
            setBackForLabel(label,emp);
            scr.setText("Score: "+Integer.toString(score[0]));
            if(loseCondition(emp)){

                Alert alert =new Alert(Alert.AlertType.CONFIRMATION);

                alert.setTitle("Loss");
                alert.setHeaderText("You Lost, my friend.");
                alert.setContentText("You achieved a score of "+score[0]+".\n Do you wish to restart?");

                Optional<ButtonType> result = alert.showAndWait();
                if (result.isPresent()){
                    if (result.get() == ButtonType.OK){
                        for (int i = 0;i<4;i++){
                            for (int j =0;j<4;j++){
                                emp[i][j]=0;
                            }
                        }
                        bool[0] = true;
                        score[0]=0;
                        setBackForLabel(label,emp);
                        scr.setText("Score: "+Integer.toString(score[0]));
                    }
                    if (result.get() ==ButtonType.CANCEL){
                        stage.close();
                    }
                }


            }
        });
        if(loseCondition(emp)){
            System.out.println("you suck");
        }



                stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public void downpressed(Label[][] label,int[][] emp, int[] score){
    for (int j = 0;j<4;j++) {
        int tedadH = 0;
        int[] arr = new int[4];
        int k = 0;
        for (int i = 3; i >= 0; i--) {
            if (emp[i][j] != 0) {
                tedadH++;
                arr[k++] = emp[i][j];
            }
        }
        if (tedadH == 1) {
            for (int i = 3; i >= 0; i--) {
                emp[i][j] = 0;
            }
            emp[3][j] = arr[0];
        } else if (tedadH == 2) {
            for (int i = 3; i >= 0; i--) {
                emp[i][j] = 0;
            }
            if (arr[0] == arr[1]) {
                emp[3][j] = arr[0] * 2;
                score[0]+= arr[0] * 2;

            } else {
                emp[3][j] = arr[0];
                emp[2][j] = arr[1];
            }
        } else if (tedadH == 3) {
            for (int i = 3; i >= 0; i--) {
                emp[i][j] = 0;
            }
            if (arr[0] != arr[1] && arr[1] != arr[2]) {
                emp[3][j] = arr[0];
                emp[2][j] = arr[1];
                emp[1][j] = arr[2];
            } else if (arr[0] == arr[1]) {
                emp[3][j] = arr[0] * 2;
                score[0]+= arr[0] * 2;
                emp[2][j] = arr[2];
            } else if (arr[2] == arr[1]) {
                emp[3][j] = arr[0];
                emp[2][j] = arr[2] * 2;
                score[0]+= arr[2] * 2;
            }
        } else if (tedadH == 4) {
            for (int i = 3; i >= 0; i--) {
                emp[i][j] = 0;
            }
            if (arr[0] == arr[1] && arr[2] == arr[3]) {
                emp[3][j] = arr[0] * 2;
                emp[2][j] = arr[2] * 2;
                score[0]+= arr[0] * 2;
                score[0]+= arr[2] * 2;
            } else if (arr[0] == arr[1]) {
                emp[3][j] = arr[0] * 2;
                score[0]+= arr[0] * 2;
                emp[2][j] = arr[2];
                emp[1][j] = arr[3];
            } else if (arr[2] == arr[1]) {
                emp[3][j] = arr[0];
                emp[2][j] = arr[1] * 2;
                score[0]+= arr[1] * 2;
                emp[1][j] = arr[3];
            } else if (arr[2] == arr[3]) {
                emp[3][j] = arr[0];
                emp[2][j] = arr[1];
                emp[1][j] = arr[2] * 2;
                score[0]+= arr[2] * 2;
            } else {
                emp[3][j] = arr[0];
                emp[2][j] = arr[1];
                emp[1][j] = arr[2];
                emp[0][j] = arr[3];
            }
        }

    }
    }
    public void uppressed(Label[][] label,int[][] emp, int[] score){
        for (int j = 0;j<4;j++) {
            int tedadH = 0;
            int[] arr = new int[4];
            int k = 0;
            for (int i = 0; i <4 ; i++) {
                if (emp[i][j] != 0) {
                    tedadH++;
                    arr[k++] = emp[i][j];
                }
            }
            if (tedadH == 1) {
                for (int i = 3; i >= 0; i--) {
                    emp[i][j] = 0;
                }
                emp[0][j] = arr[0];
            } else if (tedadH == 2) {
                for (int i = 3; i >= 0; i--) {
                    emp[i][j] = 0;
                }
                if (arr[0] == arr[1]) {
                    emp[0][j] = arr[0] * 2;
                    score[0]+= arr[0] * 2;
                } else {
                    emp[0][j] = arr[0];
                    emp[1][j] = arr[1];
                }
            } else if (tedadH == 3) {
                for (int i = 3; i >= 0; i--) {
                    emp[i][j] = 0;
                }
                if (arr[0] != arr[1] && arr[1] != arr[2]) {
                    emp[0][j] = arr[0];
                    emp[1][j] = arr[1];
                    emp[2][j] = arr[2];
                } else if (arr[0] == arr[1]) {
                    emp[0][j] = arr[0] * 2;
                    score[0]+= arr[0] * 2;
                    emp[1][j] = arr[2];
                } else if (arr[2] == arr[1]) {
                    emp[0][j] = arr[0];
                    emp[1][j] = arr[2] * 2;
                    score[0]+= arr[2] * 2;
                }
            } else if (tedadH == 4) {
                for (int i = 3; i >= 0; i--) {
                    emp[i][j] = 0;
                }
                if (arr[0] == arr[1] && arr[2] == arr[3]) {
                    emp[0][j] = arr[0] * 2;
                    emp[1][j] = arr[2] * 2;
                    score[0]+= arr[0] * 2;
                    score[0]+= arr[2] * 2;
                } else if (arr[0] == arr[1]) {
                    emp[0][j] = arr[0] * 2;
                    score[0]+= arr[0] * 2;
                    emp[1][j] = arr[2];
                    emp[2][j] = arr[3];
                } else if (arr[2] == arr[1]) {
                    emp[0][j] = arr[0];
                    emp[1][j] = arr[1] * 2;
                    score[0]+= arr[1] * 2;
                    emp[2][j] = arr[3];
                } else if (arr[2] == arr[3]) {
                    emp[0][j] = arr[0];
                    emp[1][j] = arr[1];
                    emp[2][j] = arr[2] * 2;
                    score[0]+= arr[2] * 2;
                } else {
                    emp[0][j] = arr[0];
                    emp[1][j] = arr[1];
                    emp[2][j] = arr[2];
                    emp[3][j] = arr[3];
                }
            }

        }
    }
    public void rightpressed(Label[][] label,int[][] emp, int[] score){
        for (int j = 0;j<4;j++) {
            int tedadH = 0;
            int[] arr = new int[4];
            int k = 0;
            for (int i = 3; i >= 0; i--) {
                if (emp[j][i] != 0) {
                    tedadH++;
                    arr[k++] = emp[j][i];
                }
            }
            if (tedadH == 1) {
                for (int i = 3; i >= 0; i--) {
                    emp[j][i] = 0;
                }
                emp[j][3] = arr[0];
            } else if (tedadH == 2) {
                for (int i = 3; i >= 0; i--) {
                    emp[j][i] = 0;
                }
                if (arr[0] == arr[1]) {
                    emp[j][3] = arr[0] * 2;
                    score[0]+= arr[0] * 2;
                } else {
                    emp[j][3] = arr[0];
                    emp[j][2] = arr[1];
                }
            } else if (tedadH == 3) {
                for (int i = 3; i >= 0; i--) {
                    emp[j][i] = 0;
                }
                if (arr[0] != arr[1] && arr[1] != arr[2]) {
                    emp[j][3] = arr[0];
                    emp[j][2] = arr[1];
                    emp[j][1] = arr[2];
                } else if (arr[0] == arr[1]) {
                    emp[j][3] = arr[0] * 2;
                    score[0]+= arr[0] * 2;
                    emp[j][2] = arr[2];
                } else if (arr[2] == arr[1]) {
                    emp[j][3] = arr[0];
                    emp[j][2] = arr[2] * 2;
                    score[0]+= arr[2] * 2;
                }
            } else if (tedadH == 4) {
                for (int i = 3; i >= 0; i--) {
                    emp[j][i] = 0;
                }
                if (arr[0] == arr[1] && arr[2] == arr[3]) {
                    emp[j][3] = arr[0] * 2;
                    emp[j][2] = arr[2] * 2;
                    score[0]+= arr[0] * 2;
                    score[0]+= arr[2] * 2;
                } else if (arr[0] == arr[1]) {
                    emp[j][3] = arr[0] * 2;
                    score[0]+= arr[0] * 2;
                    emp[j][2] = arr[2];
                    emp[j][1] = arr[3];
                } else if (arr[2] == arr[1]) {
                    emp[j][3] = arr[0];
                    emp[j][2] = arr[1] * 2;
                    score[0]+= arr[1] * 2;
                    emp[j][1] = arr[3];
                } else if (arr[2] == arr[3]) {
                    emp[j][3] = arr[0];
                    emp[j][2] = arr[1];
                    emp[j][1] = arr[2] * 2;
                    score[0]+= arr[2] * 2;
                } else {
                    emp[j][3] = arr[0];
                    emp[j][2] = arr[1];
                    emp[j][1] = arr[2];
                    emp[j][0] = arr[3];
                }
            }

        }
    }
    public void leftpressed(Label[][] label,int[][] emp, int[] score){
        for (int j = 0;j<4;j++) {
            int tedadH = 0;
            int[] arr = new int[4];
            int k = 0;
            for (int i = 0; i < 4; i++) {
                if (emp[j][i] != 0) {
                    tedadH++;
                    arr[k++] = emp[j][i];
                }
            }
            if (tedadH == 1) {
                for (int i = 3; i >= 0; i--) {
                    emp[j][i] = 0;
                }
                emp[j][0] = arr[0];
            } else if (tedadH == 2) {
                for (int i = 3; i >= 0; i--) {
                    emp[j][i] = 0;
                }
                if (arr[0] == arr[1]) {
                    emp[j][0] = arr[0] * 2;
                    score[0]+= arr[0] * 2;
                } else {
                    emp[j][0] = arr[0];
                    emp[j][1] = arr[1];
                }
            } else if (tedadH == 3) {
                for (int i = 3; i >= 0; i--) {
                    emp[j][i] = 0;
                }
                if (arr[0] != arr[1] && arr[1] != arr[2]) {
                    emp[j][0] = arr[0];
                    emp[j][1] = arr[1];
                    emp[j][2] = arr[2];
                } else if (arr[0] == arr[1]) {
                    emp[j][0] = arr[0] * 2;
                    score[0]+= arr[0] * 2;
                    emp[j][1] = arr[2];
                } else if (arr[2] == arr[1]) {
                    emp[j][0] = arr[0];
                    emp[j][1] = arr[2] * 2;
                    score[0]+= arr[2] * 2;
                }
            } else if (tedadH == 4) {
                for (int i = 3; i >= 0; i--) {
                    emp[j][i] = 0;
                }
                if (arr[0] == arr[1] && arr[2] == arr[3]) {
                    emp[j][0] = arr[0] * 2;
                    emp[j][1] = arr[2] * 2;
                    score[0]+= arr[0] * 2;
                    score[0]+= arr[2] * 2;
                } else if (arr[0] == arr[1]) {
                    emp[j][0] = arr[0] * 2;
                    score[0]+= arr[0] * 2;
                    emp[j][1] = arr[2];
                    emp[j][2] = arr[3];
                } else if (arr[2] == arr[1]) {
                    emp[j][0] = arr[0];
                    emp[j][1] = arr[1] * 2;
                    score[0]+= arr[1] * 2;
                    emp[j][2] = arr[3];
                } else if (arr[2] == arr[3]) {
                    emp[j][0] = arr[0];
                    emp[j][1] = arr[1];
                    emp[j][2] = arr[2] * 2;
                    score[0]+= arr[2] * 2;
                } else {
                    emp[j][0] = arr[0];
                    emp[j][1] = arr[1];
                    emp[j][2] = arr[2];
                    emp[j][3] = arr[3];
                }
            }

        }
    }
    public Boolean loseCondition(int[][]emp){

        for (int i =0 ;i<4;i++){
            for(int j = 0 ; j<4;j++){
                if(emp[i][j]==0)
                    return false;
            }
        }
        for (int i =0 ;i<3;i++){
            for(int j = 0 ; j<3;j++){
               if (emp[i][j]==emp[i+1][j] || emp[i][j]==emp[i][j+1]||emp[i][j+1]==emp[i+1][j+1]||emp[i+1][j]==emp[i+1][j+1])
                   return false;
            }
        }
        return true;
    }

    public void setBackForLabel(Label[][] label,int[][]emp){
        BackgroundFill backgroundFill = new BackgroundFill(Color.LIGHTSKYBLUE, CornerRadii.EMPTY, Insets.EMPTY);
        Background blue = new Background(backgroundFill);
        BackgroundFill backgroundFill2 = new BackgroundFill(Color.LIGHTSEAGREEN, CornerRadii.EMPTY, Insets.EMPTY);
        Background green = new Background(backgroundFill2);
        BackgroundFill backgroundFill3 = new BackgroundFill(Color.LIGHTGOLDENRODYELLOW, CornerRadii.EMPTY, Insets.EMPTY);
        Background yellow = new Background(backgroundFill3);
        BackgroundFill backgroundFill4 = new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY);
        Background red = new Background(backgroundFill4);
        BackgroundFill backgroundFill5 = new BackgroundFill(Color.DARKGREY, CornerRadii.EMPTY, Insets.EMPTY);
        Background brown = new Background(backgroundFill5);
        BackgroundFill backgroundFill6 = new BackgroundFill(Color.CHOCOLATE, CornerRadii.EMPTY, Insets.EMPTY);
        Background ch = new Background(backgroundFill6);
        BackgroundFill backgroundFill7 = new BackgroundFill(Color.DARKOLIVEGREEN, CornerRadii.EMPTY, Insets.EMPTY);
        Background gr = new Background(backgroundFill7);
        BackgroundFill backgroundFill8 = new BackgroundFill(Color.CORAL, CornerRadii.EMPTY, Insets.EMPTY);
        Background co = new Background(backgroundFill8);
        BackgroundFill backgroundFill9 = new BackgroundFill(Color.BLUEVIOLET, CornerRadii.EMPTY, Insets.EMPTY);
        Background pink = new Background(backgroundFill9);
        BackgroundFill backgroundFill10 = new BackgroundFill(Color.DARKGREEN, CornerRadii.EMPTY, Insets.EMPTY);
        Background salmon = new Background(backgroundFill10);
        for (int i = 0; i < 4; i++){
            for (int j = 0 ; j < 4; j++){
                if (emp[i][j]==0){
                    label[i][j].setText("");
                    label[i][j].setBackground(brown);
                }else if (emp[i][j]==2){
                    label[i][j].setBackground(blue);
                    label[i][j].setText("2");
                    label[i][j].setAlignment(Pos.CENTER);
                    label[i][j].setFont(new Font(30));
                }else if (emp[i][j]==4){
                    label[i][j].setBackground(yellow);
                    label[i][j].setText("4");
                    label[i][j].setAlignment(Pos.CENTER);
                    label[i][j].setFont(new Font(30));
                }else if (emp[i][j]==8){
                    label[i][j].setBackground(green);
                    label[i][j].setText("8");
                    label[i][j].setAlignment(Pos.CENTER);
                    label[i][j].setFont(new Font(30));
                }else if (emp[i][j]==16){
                    label[i][j].setBackground(red);
                    label[i][j].setText("16");
                    label[i][j].setAlignment(Pos.CENTER);
                    label[i][j].setFont(new Font(30));
                }else if (emp[i][j]==32){
                    label[i][j].setBackground(ch);
                    label[i][j].setText("32");
                    label[i][j].setAlignment(Pos.CENTER);
                    label[i][j].setFont(new Font(30));
                }else if (emp[i][j]==64){
                    label[i][j].setBackground(gr);
                    label[i][j].setText("64");
                    label[i][j].setAlignment(Pos.CENTER);
                    label[i][j].setFont(new Font(30));
                }else if (emp[i][j]==128){
                    label[i][j].setBackground(co);
                    label[i][j].setText("128");
                    label[i][j].setAlignment(Pos.CENTER);
                    label[i][j].setFont(new Font(30));
                }else if (emp[i][j]==256){
                    label[i][j].setBackground(salmon);
                    label[i][j].setText("256");
                    label[i][j].setAlignment(Pos.CENTER);
                    label[i][j].setFont(new Font(30));
                }else if (emp[i][j]==512){
                    label[i][j].setBackground(pink);
                    label[i][j].setText("512");
                    label[i][j].setAlignment(Pos.CENTER);
                    label[i][j].setFont(new Font(30));
                }else if (emp[i][j]==1024){
                    label[i][j].setBackground(blue);
                    label[i][j].setText("1024");
                    label[i][j].setAlignment(Pos.CENTER);
                    label[i][j].setFont(new Font(30));
                }else if (emp[i][j]==2048){
                    label[i][j].setBackground(red);
                    label[i][j].setText("2048");
                    label[i][j].setAlignment(Pos.CENTER);
                    label[i][j].setFont(new Font(30));
                }
            }
        }
    }
    public Boolean haveEmp(int[][]emp){
        for (int i = 0;i<4;i++){
            for (int j =0;j<4;j++){
                if (emp[i][j]==0)
                    return true;
            }
        }
        return false;
    }
    public void getRandomEmptyPoint(int[][]emp) {
        Boolean hasSpace = false;
        for (int i =0 ;i<4;i++){
            for(int j = 0 ; j<4;j++){
                if(emp[i][j]==0)
                    hasSpace = true;
            }
        }
        if (hasSpace) {
            while (true) {
                Random random = new Random();
                int randI = random.nextInt(4);
                int randJ = random.nextInt(4);
                if (emp[randI][randJ] == 0) {
                    int randNum = random.nextInt(4);
                    if (randNum == 3) {
                        emp[randI][randJ] = 4;
                    } else emp[randI][randJ] = 2;
                    break;
                }
            }
        }
    }
}

