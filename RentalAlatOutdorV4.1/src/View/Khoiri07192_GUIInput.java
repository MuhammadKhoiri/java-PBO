package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Khoiri07192_GUIInput {
    JFrame tambah = new JFrame();
    JButton input,back;
    JLabel top,kode,nama,notelp,alamat,labelbarang, umur, jaminan, namaadmin;
    JTextField textkode,textnama,textnotelp,textalamat,textbarang, textumur, textjaminan, textnamaadmin;
    
    public Khoiri07192_GUIInput(){
        tambah.setSize(700,630);
        tambah.setLayout(null);
        tambah.getContentPane().setBackground(Color.CYAN);
        top = new JLabel("INPUT PEMINJAM");
        top.setBounds(200,10,600,50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        tambah.add(top);
        
        kode = new JLabel("Kode");
        kode.setBounds(200, 100, 100, 30);
        tambah.add(kode);
        
        textkode = new JTextField();
        textkode.setBounds(250, 100, 200, 30);
        tambah.add(textkode);
        
        nama = new JLabel("Nama");
        nama.setBounds(200, 130, 100, 30);
        tambah.add(nama);
        
        textnama = new JTextField();
        textnama.setBounds(250, 130, 200, 30);
        tambah.add(textnama);
        
        notelp = new JLabel("No telp");
        notelp.setBounds(200, 160, 100, 30);
        tambah.add(notelp);
        
        textnotelp = new JTextField();
        textnotelp.setBounds(250, 160, 200, 30);
        tambah.add(textnotelp);
        
        umur =new JLabel("Umur");
        umur.setBounds(200, 190, 100, 30);
        tambah.add(umur);
        
        textumur = new JTextField();
        textumur.setBounds(250, 190, 200, 30);
        tambah.add(textumur);

        alamat =new JLabel("Alamat");
        alamat.setBounds(200, 220, 100, 30);
        tambah.add(alamat);
        
        textalamat = new JTextField();
        textalamat.setBounds(250, 220, 200, 30);
        tambah.add(textalamat);
        
        jaminan =new JLabel("Jaminan");
        jaminan.setBounds(200, 250, 100, 30);
        tambah.add(jaminan);
        
        textjaminan = new JTextField();
        textjaminan.setBounds(250, 250, 200, 30);
        tambah.add(textjaminan);
        
        namaadmin =new JLabel("Admin");
        namaadmin.setBounds(200, 280, 100, 30);
        tambah.add(namaadmin);
        
        textnamaadmin = new JTextField();
        textnamaadmin.setBounds(250, 280, 200, 30);
        tambah.add(textnamaadmin);
        
        input = new JButton("Input");
        input.setBounds(300, 450, 100, 40);
        input.setBackground(Color.GREEN);
        tambah.add(input);
        
        back = new JButton("back");
        back.setBounds(300, 500, 100, 30);
        back.setBackground(Color.RED);
        tambah.add(back);
        
        tambah.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tambah.setVisible(true);
        tambah.setLocationRelativeTo(null);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tambah.dispose();
                Khoiri07192_GUIPeminjam peminjam = new Khoiri07192_GUIPeminjam();
            }
        });
        
        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    
                    String kodepeminjam = textkode.getText();
                    String nama = textnama.getText();
                    String notelp = textnotelp.getText();
                    String umur = textumur.getText();
                    String alamat = textalamat.getText();
                    String jaminan = textjaminan.getText();
                    String namaadmin = textnamaadmin.getText();
                    
                    Khoiri07192_AllObjCtrl.peminjam.insert(nama,notelp,umur,alamat);
                    Khoiri07192_AllObjCtrl.transaksi.insertt(jaminan, namaadmin, kodepeminjam);
                    JOptionPane.showMessageDialog(null, "Input Sukses","Information",JOptionPane.INFORMATION_MESSAGE);
                    tambah.dispose();
                    Khoiri07192_GUIPeminjam peminjam = new Khoiri07192_GUIPeminjam();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
