/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package piano;


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



public class two implements Initializable{
    Media md;
MediaPlayer pl;
@FXML Label l1;
@FXML Label btn;
@FXML ImageView mv;
  ScaleTransition s;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
    }
    public void imageview (MouseEvent me)
    {
        
        try {
            ((Stage)(((ImageView)me.getSource()).getScene().getWindow())).close();
            FXMLLoader loader=new FXMLLoader(getClass().getResource("second.fxml"));
            Parent root=loader.load();
            Stage st=new Stage();
            st.setScene(new Scene(root));
            st.show();
        } catch (IOException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void cello (MouseEvent me)
    {
        
        try {
            ((Stage)(((ImageView)me.getSource()).getScene().getWindow())).close();
            FXMLLoader loader=new FXMLLoader(getClass().getResource("cello.fxml"));
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
            md=new Media(getClass().getResource("C4.wav").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("C4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    public void two(ActionEvent ae){
    
        
    
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("C#4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("C#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public void three(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("D4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("D4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void four(ActionEvent ae){
  
    
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("D#4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("D#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     }
    public void five(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("E4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("E4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void six(ActionEvent ae){
        
      
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("F4.wav").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("F4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void seven(ActionEvent ae){
    
   
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("F#4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("F#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    public void eight(ActionEvent ae){
   
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("G4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("G4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    public void nine(ActionEvent ae){
     
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("G#4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("G#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    public void ten(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("A4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("A4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eleven(ActionEvent ae){
          
  
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("A#4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("A#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void twelve(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("B4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("B4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void thirteen(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("C5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("C5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void fourteen(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("C#5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("C#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void fifteen(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("D5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("D5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void sixteen(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("D#5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("D#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void seventeen(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("E5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("E5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eighteen(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("F5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("F5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void nineteen(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("F#5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("F#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void twenty(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("G5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("G5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void twoOne(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("G#5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("G#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void twoTwo(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("A5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("A5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void twoThree(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("A#5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("A#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void twoFour(ActionEvent ae){
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("B5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("B5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
   
    public void keyOne(KeyEvent k){
    if(k.getCode()==KeyCode.A){
     try {
            md=new Media(getClass().getResource("C4.wav").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("C4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.S){
        
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("C#4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("C#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    if(k.getCode()==KeyCode.D){
    try {
            l1.setText("");
            
            md=new Media(getClass().getResource("D4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("D4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.F){
       try {
            l1.setText("");
            
            md=new Media(getClass().getResource("D#4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("D#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.G){
      try {
            l1.setText("");
            
            md=new Media(getClass().getResource("E4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("E4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.H){
    try {
            l1.setText("");
            
            md=new Media(getClass().getResource("F4.wav").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("F4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    if(k.getCode()==KeyCode.J){
    
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("F#4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("F#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    if(k.getCode()==KeyCode.K){
    
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("G4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("G4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.L){
     try {
            l1.setText("");
            
            md=new Media(getClass().getResource("G#4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("G#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    if(k.getCode()==KeyCode.P){
      try {
            l1.setText("");
            
            md=new Media(getClass().getResource("A4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("A4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.O){
     
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("A#4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("A#4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.I){
     try {
            l1.setText("");
            
            md=new Media(getClass().getResource("B4.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("B4");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.U){
     try {
            l1.setText("");
            
            md=new Media(getClass().getResource("C5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("C5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.Y){
   try {
            l1.setText("");
            
            md=new Media(getClass().getResource("C#5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("C#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    if(k.getCode()==KeyCode.T){
    try {
            l1.setText("");
            
            md=new Media(getClass().getResource("D5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("D5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     if(k.getCode()==KeyCode.R){
    try {
            l1.setText("");
            
            md=new Media(getClass().getResource("D#5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("D#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     if(k.getCode()==KeyCode.E)
     {
        try {
            l1.setText("");
            
            md=new Media(getClass().getResource("E5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("E5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     if(k.getCode()==KeyCode.W)
     {
    try {
            l1.setText("");
            
            md=new Media(getClass().getResource("F5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("F5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     if(k.getCode()==KeyCode.Q)
     {
     try {
            l1.setText("");
            
            md=new Media(getClass().getResource("F#5(1).mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("F#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     if(k.getCode()==KeyCode.Z)
     {
      try {
            l1.setText("");
            
            md=new Media(getClass().getResource("G5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("G5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     if(k.getCode()==KeyCode.X)
   {
   try {
            l1.setText("");
            
            md=new Media(getClass().getResource("G#5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("G#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
     if(k.getCode()==KeyCode.C){
      try {
            l1.setText("");
            
            md=new Media(getClass().getResource("A5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("A5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     if(k.getCode()==KeyCode.V){
     try {
            l1.setText("");
            
            md=new Media(getClass().getResource("A#5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("A#5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     if(k.getCode()==KeyCode.B)
     {
      try {
            l1.setText("");
            
            md=new Media(getClass().getResource("B5.mp3").toURI().toString());
            pl=new MediaPlayer(md);
            pl.play();
            l1.setText("B5");
            s=new ScaleTransition();
            s.setDuration(Duration.seconds(3));
            s.setNode(l1);
            s.setToX(2);
            s.setToY(2);
            s.play();
        } catch (URISyntaxException ex) {
            Logger.getLogger(two.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
    
    
     }
    }

   

