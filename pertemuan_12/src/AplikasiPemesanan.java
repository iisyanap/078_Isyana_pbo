import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AplikasiPemesanan extends JFrame implements ActionListener, ItemListener {
    private JLabel labelNama = new JLabel("Nama:");
    private JLabel labelAlamat = new JLabel("Alamat:");
    private JLabel labelNoTelp = new JLabel("No Telp:");
    private JLabel labelMenu = new JLabel("");
    private JLabel labelTotal = new JLabel("Total:");

    private JTextField fieldNama = new JTextField(20);
    private JTextField fieldAlamat = new JTextField(20);
    private JTextField fieldNoTelp = new JTextField(20);
    private JCheckBox cbPizza = new JCheckBox("Pizza", false);
    private JCheckBox cbSpaghetti = new JCheckBox("Spaghetti", false);
    private JCheckBox cbSteak = new JCheckBox("Steak");
    private JTextField fieldTotal = new JTextField(15);
    private JButton buttonTambah = new JButton("Tambah");
    private JTextArea areaData = new JTextArea(15, 50);

 public AplikasiPemesanan() {
    super("APLIKASI PEMESANAN");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    // Judul Aplikasi
    JLabel judulLabel = new JLabel("Aplikasi Pemesanan");
    judulLabel.setFont(new Font("Arial", Font.BOLD, 20));
    judulLabel.setHorizontalAlignment(JLabel.CENTER);
    add(judulLabel, BorderLayout.NORTH);

    // Panel utama dengan layout BorderLayout
    JPanel panelUtama = new JPanel(new BorderLayout());

    // Panel untuk data customer
    JPanel panelDataCustomer = new JPanel(new GridBagLayout());
    panelDataCustomer.setBorder(BorderFactory.createTitledBorder("Data Kustomer"));

    GridBagConstraints gbcDataCustomer = new GridBagConstraints();
    gbcDataCustomer.gridx = 0;
    gbcDataCustomer.gridy = 0;
    gbcDataCustomer.anchor = GridBagConstraints.WEST;
    gbcDataCustomer.insets = new Insets(5, 5, 5, 5);

    panelDataCustomer.add(labelNama, gbcDataCustomer);
    gbcDataCustomer.gridy = 1;
    panelDataCustomer.add(labelAlamat, gbcDataCustomer);

    gbcDataCustomer.gridy = 2;
    panelDataCustomer.add(labelNoTelp, gbcDataCustomer);

    gbcDataCustomer.gridx = 1;
    gbcDataCustomer.gridy = 0;
    gbcDataCustomer.gridwidth = 2;
    panelDataCustomer.add(fieldNama, gbcDataCustomer);

    gbcDataCustomer.gridy = 1;
    panelDataCustomer.add(fieldAlamat, gbcDataCustomer);

    gbcDataCustomer.gridy = 2;
    panelDataCustomer.add(fieldNoTelp, gbcDataCustomer);

    // Panel untuk pilihan menu
    JPanel panelPilihMenu = new JPanel();

    panelPilihMenu.setLayout(new BoxLayout(panelPilihMenu, BoxLayout.Y_AXIS));
    panelPilihMenu.setBorder(BorderFactory.createTitledBorder("Pilih Menu"));

    GridBagConstraints gbcPilihMenu = new GridBagConstraints();
    gbcPilihMenu.gridx = 0;
    gbcPilihMenu.gridy = 0;
    gbcPilihMenu.anchor = GridBagConstraints.WEST;
    gbcPilihMenu.insets = new Insets(5, 5, 5, 5);
    panelPilihMenu.add(labelMenu, gbcPilihMenu);

    gbcPilihMenu.gridy = 1;
    panelPilihMenu.add(cbSteak, gbcPilihMenu);

    gbcPilihMenu.gridy = 2;
    panelPilihMenu.add(cbSpaghetti, gbcPilihMenu);
    
    gbcPilihMenu.gridy = 3;
    panelPilihMenu.add(cbPizza, gbcPilihMenu);

    // Panel untuk Total
    JPanel panelTotal = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // Menggunakan FlowLayout agar elemen berada dalam satu baris
    fieldTotal.setForeground(Color.YELLOW);
    fieldTotal.setBackground(Color.BLACK);
    fieldTotal.setOpaque(true);
 
    // Set alignment teks ke kanan
    fieldTotal.setHorizontalAlignment(JTextField.RIGHT);

    // Menambahkan label dan field ke panelTotal
    panelTotal.add(labelTotal, BorderLayout.NORTH);
    panelTotal.add(fieldTotal, BorderLayout.CENTER);

    // Tombol Tambah
    JPanel panelButtonTambah = new JPanel(new 
    FlowLayout(FlowLayout.RIGHT));
    panelButtonTambah.add(buttonTambah);

    // Panel untuk Tombol Tambah dan Total
    JPanel panelTombolDanTotal = new JPanel(new BorderLayout());
    panelTombolDanTotal.add(panelTotal, BorderLayout.CENTER);
    panelTombolDanTotal.add(panelButtonTambah, BorderLayout.SOUTH);

    // Panel tengah antara Data Customer dan Pilih Menu
    JPanel panelTengah = new JPanel(new BorderLayout());
    panelTengah.add(panelDataCustomer, BorderLayout.WEST);
    panelTengah.add(panelPilihMenu, BorderLayout.CENTER);

    // Menambahkan panel-panel ke dalam panel utama
    panelUtama.add(panelTengah, BorderLayout.CENTER);
    panelUtama.add(panelTombolDanTotal, BorderLayout.SOUTH);

    // Panel untuk bagian bawah (Data Penjualan)
    JPanel panelBawah = new JPanel();
    panelBawah.setLayout(new FlowLayout());
    panelBawah.setBorder(BorderFactory.createTitledBorder("Data Penjualan"));

    JScrollPane scrollPane = new JScrollPane(areaData);
    panelBawah.add(scrollPane);

    // Menambahkan panel-panel ke dalam frame
    add(panelUtama, BorderLayout.CENTER);
    add(panelBawah, BorderLayout.SOUTH);

    // Menambahkan listener untuk checkbox
    cbPizza.addItemListener(this);
    cbSpaghetti.addItemListener(this);
    cbSteak.addItemListener(this);

    // Menambahkan listener untuk tombol Tambah
    buttonTambah.addActionListener(this);

    pack();
    setLocationRelativeTo(null);
    setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
    int harga = 0;
    if (cbPizza.isSelected()) {
        harga += 80000;
    }
    if (cbSpaghetti.isSelected()) {
        harga += 40000;
    }
    if (cbSteak.isSelected()) {
        harga += 60000;
    }
    fieldTotal.setText(String.valueOf(harga));
}
 
 public void actionPerformed(ActionEvent e) {
 if (e.getSource() == buttonTambah) {
    String nama = fieldNama.getText();
    String alamat = fieldAlamat.getText();
    String noTelp = fieldNoTelp.getText();
    String pesanan = "";
    int totalHarga = 0;
if (cbPizza.isSelected()) {
    pesanan += "- Pizza (80000)\n";
    totalHarga += 80000;
 }
 if (cbSpaghetti.isSelected()) {
    pesanan += "- Spaghetti (40000)\n";
    totalHarga += 40000;
 }
 if (cbSteak.isSelected()) {
    pesanan += "- Steak (60000)\n";
    totalHarga += 60000;
 }

    // Format data penjualan
    String dataPenjualan = String.format("Nama: %s\nAlamat: %s\nTelp: %s\n====================================\nPesanan:\n%s====================================\nTotal Bayar:\n Rp.%d",
    nama, alamat, noTelp, pesanan, totalHarga);
    // Menampilkan data penjualan di JTextArea
    areaData.append(dataPenjualan + 
    "\n====================================\n");
    // Mengatur ulang input dan pilihan menu
    fieldNama.setText("");
    fieldAlamat.setText("");
    fieldNoTelp.setText("");
    fieldTotal.setText("");
    cbPizza.setSelected(false);
    cbSpaghetti.setSelected(false);
    cbSteak.setSelected(false);
    }
}

 public static void main(String[] args) {
    new AplikasiPemesanan();
 }
}