/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarysurvey;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

/**
 *
 * @author x15002756
 *
 *
 */
public class SalarySurveyWindow extends JFrame {
    //Data members

    private JPanel mainPanel;
    private JButton btnYes;
    private JButton btnNo;
    private JLabel lblQuestion;

    public SalarySurveyWindow() {
        setLocation(100, 100);
        setSize(500, 400);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        add(mainPanel);

        btnYes = new JButton("Yes");
        btnNo = new JButton("No");
        lblQuestion = new JLabel("Do you want a salary increase? ");
        
        btnYes.setBounds(140, 130, 100, 30);
        btnNo.setBounds (250, 130, 100, 30);
        lblQuestion.setBounds (150, 100, 300, 30);
        
        MyActionListener myActionListener = new MyActionListener();
        btnNo.addActionListener(myActionListener);
        
        BtnYesActionListener btnYesActionListener = new BtnYesActionListener();
        btnYes.addActionListener(btnYesActionListener);
        btnYes.addMouseMotionListener(new BtnYesMouseMotionListener());
        
        
        mainPanel.add(btnYes);
        mainPanel.add(btnNo);
        mainPanel.add(lblQuestion);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "You are indeed a valued employee");
            System.exit(0);
}
    
}
    public class BtnYesActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            int x = (int)(Math.random() * (getWidth() - btnYes.getWidth()));
            int y = (int)(Math.random() * (getHeight()- btnYes.getHeight()));
        }
    }
    public class BtnYesMouseMotionListener implements MouseMotionListener{


            @Override
            public void mouseDragged(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
          public void mouseMoved(MouseEvent e) {
              int x = (int)(Math.random() * (getWidth() - btnYes.getWidth()));
              int y = (int)(Math.random() * (getHeight()- btnYes.getHeight()));
              
              btnYes.setText("HA! HA! HA!");
            
              btnYes.setLocation(x, y);
              
            }
            
   }
    
 }
      

