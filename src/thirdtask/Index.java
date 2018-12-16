/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtask;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static thirdtask.ThirdTask.getIndex;

/**
 *
 * @author FADY_
 */
public class Index extends JFrame{
    private JLabel doc1= new JLabel("Doc 1 :");
    private JLabel doc2= new JLabel("Doc 2 :");
    private JLabel doc3= new JLabel("Doc 3 :");
    private JLabel doc4= new JLabel("Doc 4 :");
    private JLabel query= new JLabel("Query:");
    private JLabel result= new JLabel("Result :");
    private JLabel doc1result= new JLabel();
    private JLabel doc2result= new JLabel();
    private JLabel doc3result= new JLabel();
    private JLabel token;
    private ArrayList<JLabel> tokenss = new ArrayList<>(50);
    private ArrayList<JLabel> tokenss2 = new ArrayList<>(50);
    private JLabel doc4result= new JLabel();
    private JLabel match= new JLabel();
    private JTextField inf1 = new JTextField("Write Your Document");
    private JTextField inf2 = new JTextField("Write Your Document");
    private JTextField inf3 = new JTextField("Write Your Document");
    private JTextField inf4 = new JTextField("Write Your Document");
    private JTextField inf5 = new JTextField("Write Your Query");
    JButton button = new JButton("Submit");
    public Index() throws IOException {
       
        setSize(1200,600);
        setTitle("Welcome");
        setVisible(true);
        
        for (int i = 0; i < 50; i++) {
            JLabel token = new JLabel();
            tokenss.add(token);
            JLabel token1 = new JLabel();
            tokenss2.add(token1);
        }
        
     final Container cp = getContentPane();
     cp.setBackground(java.awt.Color.white);
     cp.setLayout(null);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     
     doc1.setBounds(20,40, 100, 20);
     doc1.setFont(new Font("Segoe UI Light",Font.PLAIN, 20));
     cp.add(doc1);
     
     inf1.setBounds(80, 40, 500, 70);
     inf1.setBackground(java.awt.Color.white);
     inf1.setFont(new Font("Segoe UI Light",Font.PLAIN, 18));
     inf1.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
        {
            inf1.setText(""); 
        }});
     cp.add(inf1);
     
     doc2.setBounds(20,150, 100, 20);
     doc2.setFont(new Font("Segoe UI Light",Font.PLAIN, 20));
     cp.add(doc2);
     
     inf2.setBounds(80, 150, 500, 70);
     inf2.setBackground(java.awt.Color.white);
     inf2.setFont(new Font("Segoe UI Light",Font.PLAIN, 18));
     inf2.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
        {
            inf2.setText(""); 
            
            
        }});
     cp.add(inf2);
     
     doc3.setBounds(20,260, 100, 20);
     doc3.setFont(new Font("Segoe UI Light",Font.PLAIN, 20));
     cp.add(doc3);
     
     inf3.setBounds(80, 260, 500, 70);
     inf3.setBackground(java.awt.Color.white);
     inf3.setFont(new Font("Segoe UI Light",Font.PLAIN, 18));
     inf3.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
        {
            inf3.setText(""); 
            
        }});
     cp.add(inf3);
     
     doc4.setBounds(20,370, 100, 20);
     doc4.setFont(new Font("Segoe UI Light",Font.PLAIN, 20));
     cp.add(doc4);
     
     inf4.setBounds(80, 370, 500, 70);
     inf4.setBackground(java.awt.Color.white);
     inf4.setFont(new Font("Segoe UI Light",Font.PLAIN, 18));
     inf4.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
        {
            inf4.setText(""); 
        }});
     cp.add(inf4);
     
     query.setBounds(20,480, 100, 30);
     query.setFont(new Font("Segoe UI Light",Font.PLAIN, 20));
     cp.add(query);
     
     inf5.setBounds(80, 480, 500, 70);
     inf5.setBackground(java.awt.Color.white);
     inf5.setFont(new Font("Segoe UI Light",Font.PLAIN, 18));
     inf5.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e)
        {
            inf5.setText("");
            
        }});
     cp.add(inf5);
     
     button.setBounds(590, 480, 180, 70);
     button.setBackground(java.awt.Color.white);
     button.setFont(new Font("Segoe UI Light",Font.PLAIN, 18));
     button.addMouseListener(new MouseAdapter(){

        public void mouseClicked(MouseEvent e)
        {
        token = new JLabel();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        List<String> docsTokens = new ArrayList();
        
        String doc1 = inf1.getText().toLowerCase();
        String doc1Tokens[] = doc1.split(" ");
        docsTokens.addAll(Arrays.asList(doc1Tokens));

        
        String doc2 = inf2.getText().toLowerCase();
        String doc2Tokens[] = doc2.split(" ");

        docsTokens.addAll(Arrays.asList(doc2Tokens));

        
        String doc3 = inf3.getText().toLowerCase();
        String doc3Tokens[] = doc3.split(" ");

        docsTokens.addAll(Arrays.asList(doc3Tokens));

    
        String doc4 = inf4.getText().toLowerCase();
        String doc4Tokens[] = doc4.split(" ");

        String query = inf5.getText().toLowerCase();
        
        String docs[] = {doc1, doc2, doc3, doc4};
        String tokens[] = query.split(" ");
        
       
        for (int j = 0; j < tokens.length; j++) {
            token = tokenss.get(j);
            token.setBounds(600, 60+j*30*4, 500, 40);
            token.setFont(new Font("Segoe UI Light",Font.PLAIN, 20));
            token.setText(tokens[j]);
            cp.add(token);
            for (int i = 0; i < 4; i++) {
            if (docs[i].contains(tokens[j])) {
                 ArrayList<Integer> match = getIndex(docs[i], tokens[j ]);
                token = tokenss2.get(i);
                token.setBounds(600, 80*(1+j)+i*20, 500, 40);
                token.setFont(new Font("Segoe UI Light",Font.PLAIN, 20));
                token.setText( " in doc "+ (i + 1) + " at index "+match);
                System.out.println(" in doc "+ (i + 1) + " at index "+match);
                cp.add(token);
                }
            }
            
        }
        
        }});
     cp.add(button);
     
     
     result.setBounds(600,40, 100, 20);
     result.setFont(new Font("Segoe UI Light",Font.PLAIN, 20));
     cp.add(result);
    }
}
