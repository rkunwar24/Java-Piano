/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package piano;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SecondController implements Initializable {

    @FXML Label l2;
      Media md;
MediaPlayer pl;
ScaleTransition s;
@FXML ImageView mv;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
   
     public void imageview (MouseEvent me)
    {
        
        try {
            ((Stage)(((ImageView)me.getSource()).getScene().getWindow())).close();
            FXMLLoader loader=new FXMLLoader(getClass().getResource("one.fxml"));
            Parent root=loader.load();
            Stage st=new Stage();
            st.setScene(new Scene(root));
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

   

    public void one(ActionEvent ae){
        
        try {
            md=new Media(getClass().getResource("TC4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("C4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
     public void two(ActionEvent ae){
    
        
    
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TC#4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("C#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } /////////////////
        catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public void three(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TD4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("D4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void four(ActionEvent ae){
  
    
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TD#4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("D#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     }
    public void five(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TE4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("E4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void six(ActionEvent ae){
        
      
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TF4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("F4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void seven(ActionEvent ae){
    
   
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TF#4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("F#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    public void eight(ActionEvent ae){
   
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TG4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("G4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    public void nine(ActionEvent ae){
     
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TG#4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("G#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    public void ten(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TA4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("A4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eleven(ActionEvent ae){
          
  
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TA#4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("A#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void twelve(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TB4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("B4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void thirteen(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TC5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("C5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void fourteen(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TC#5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("C#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void fifteen(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TD5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("D5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void sixteen(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TD#5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("D#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void seventeen(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TE5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("E5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eighteen(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TF5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("F5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void nineteen(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TF#5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("F#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void twenty(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TG5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("G5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void twoOne(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TG#5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("G#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void twoTwo(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TA5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("A5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void twoThree(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TA#5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("A#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void twoFour(ActionEvent ae){
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TB5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("B5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void keyOne(KeyEvent k){
    if(k.getCode()==KeyCode.A){
try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TC4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("C4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.S){
    try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TC#4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("C#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.D){
   try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TD4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("D4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.F){
 try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TD#4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("D#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.G){
 try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TE4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("E4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.H){
    try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TF4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("F4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.J){
  try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TF#4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("F4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.K){
  try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TG4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("G4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.L){
     try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TG#4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("G#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.P){
     try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TA4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("A4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.O){
      try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TA#4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("A#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.I){
      try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TB4(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("B4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.U){
      try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TC5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("C5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    if(k.getCode()==KeyCode.Y){
    try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TC#5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("C#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    if(k.getCode()==KeyCode.T){
      try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TD5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("D5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     if(k.getCode()==KeyCode.R){
      try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TD#5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("D#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     if(k.getCode()==KeyCode.E)
     {
        try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TE5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("E5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     if(k.getCode()==KeyCode.W)
     {
     try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TF5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("F5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     if(k.getCode()==KeyCode.Q)
     {
     try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TF#5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("F#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     if(k.getCode()==KeyCode.Z)
     {
 try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TG5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("G5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     if(k.getCode()==KeyCode.X)
   {
 try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TG#5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("G#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
     if(k.getCode()==KeyCode.C)
     {
try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TA5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("A5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     if(k.getCode()==KeyCode.V)
     {
     try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TA#5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("A#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     if(k.getCode()==KeyCode.B)
     {
      try {
            l2.setText("");
            
            md=new Media(getClass().getResource("TB5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l2.setText("B5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l2);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(SecondController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    }
}
