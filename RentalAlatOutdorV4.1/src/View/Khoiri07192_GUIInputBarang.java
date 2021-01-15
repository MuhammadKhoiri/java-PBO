package View;

import Entity.Khoiri07192_AlatEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Khoiri07192_GUIInputBarang {
    JFrame tambahbarang = new JFrame();
    JLabel top;
    JComboBox pilbar1 = new JComboBox(Khoiri07192_AlatEntity.Alat);
    JComboBox pilbar2 = new JComboBox(Khoiri07192_AlatEntity.Alat);
    JComboBox pilbar3 = new JComboBox(Khoiri07192_AlatEntity.Alat);
    JButton input;
    
    public Khoiri07192_GUIInputBarang(){
        tambahbarang.setSize(700,630);
        tambahbarang.setLayout(null);
        tambahbarang.getContentPane().setBackground(Color.CYAN);
        top = new JLabel("INPUT BARANG");
        top.setBounds(200,10,600,50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        tambahbarang.add(top);
        
        pilbar1.setBounds(250, 100, 150, 30);
        tambahbarang.add(pilbar1);
        
        pilbar2.setBounds(250, 150, 150, 30);
        tambahbarang.add(pilbar2);
        
        pilbar3.setBounds(250, 200, 150, 30);
        tambahbarang.add(pilbar3);
        
        input = new JButton("Input");
        input.setBounds(300, 450, 100, 40);
        input.setBackground(Color.GREEN);
        tambahbarang.add(input);
        
        tambahbarang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tambahbarang.setVisible(true);
        tambahbarang.setLocationRelativeTo(null);
        
        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
             
                    int indexalat1 = pilbar1.getSelectedIndex();
                    int indexalat2 = pilbar2.getSelectedIndex();
                    int indexalat3 = pilbar3.getSelectedIndex();
                    String kodebarang = null;

                    Khoiri07192_AllObjCtrl.transaksiAlat.insert(indexalat1, indexalat2, indexalat3, kodebarang);
                    JOptionPane.showMessageDialog(null, "Input Sukses","Information",JOptionPane.INFORMATION_MESSAGE);
                    tambahbarang.dispose();
                    Khoiri07192_GUIPeminjam peminjam = new Khoiri07192_GUIPeminjam();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
