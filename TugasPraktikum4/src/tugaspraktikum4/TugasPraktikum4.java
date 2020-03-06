/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum4;

/**
 *
 * @author Asus
 */import javax.swing.*;
public class TugasPraktikum4 {
public static void main(String[] args) {
        GUI g = new GUI();
    }
    
}

class GUI extends JFrame {
final JTextField falamat = new JTextField(10);
JScrollPane scroll = new JScrollPane();

JLabel lID = new JLabel ("BIODATA DIRI");
JLabel labelGambar;
JLabel lnama = new JLabel ("NABILA VALINKA P");
JLabel lTTL = new JLabel ("Yogyakarta, 7 Oktober 2000");
JLabel lagama = new JLabel(" Agama ");
   String[] namaAgama =
            {"Islam","Kristen","Katolik","Hindu","Budha"};
JComboBox cmbAgama = new JComboBox(namaAgama);
JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
JRadioButton rbWanita = new JRadioButton("perempuan ");
JLabel lalamat = new JLabel ("ALAMAT");
JButton btnSave = new JButton("SAVE");
JButton btnEdit = new JButton("EDIT");

public GUI(){
    setTitle ("BIODATA");
    setDefaultCloseOperation(3);
    setSize(350,900);
    
    scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    ButtonGroup group = new ButtonGroup();
    group.add(rbPria);
    group.add(rbWanita);
    labelGambar = new JLabel (new ImageIcon (getClass().getResource(("Gambar.jpg"))));
    
    setLayout (null);
    add(lID);
    add(labelGambar);
    add(lnama);
    add(lTTL);
    add(cmbAgama);
    add(rbPria);
    add(rbWanita);
    add(lalamat);
    add(falamat);
    add(scroll);
    add(btnSave);
    add(btnEdit);
    
    lID.setBounds(130,10,120,20);
    labelGambar.setBounds(100,40,120,120);
    lnama.setBounds(100,200,120,20);
    lTTL.setBounds(85,220,200,20);
    lagama.setBounds(100,230,90,20);
    cmbAgama.setBounds(40,250,230,20);
    rbPria.setBounds(40,270,120,20);
    rbWanita.setBounds(180,270,120,20);
    lalamat.setBounds(130,300,120,20);
    falamat.setBounds(40,320,230,100);
    btnSave.setBounds(40,440,90,30);
    btnEdit.setBounds(180,440,90,30);
    setVisible(true);
}
}