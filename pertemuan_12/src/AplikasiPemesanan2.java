import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AplikasiPemesanan2 extends JFrame implements ActionListener, ItemListener {
    private JLabel labelNama = new JLabel("Nama:");
    private JLabel labelAlamat = new JLabel("Alamat:");
    private JLabel labelNoTelp = new JLabel("No Telp:");
    private JLabel labelTotal = new JLabel("Total:");

    private JTextField fieldNama = new JTextField(20);
    private JTextField fieldAlamat = new JTextField(20);
    private JTextField fieldNoTelp = new JTextField(20);
    private JCheckBox cbPizza = new JCheckBox("Pizza", false);
    private JCheckBox cbSpaghetti = new JCheckBox("Spaghetti", false);
    private JCheckBox cbSteak = new JCheckBox("Steak", false);
    private JTextField fieldTotal = new JTextField(15);
    private JButton buttonTambah = new JButton("Tambah");
    private JTextArea areaData = new JTextArea(15, 50);

    // Warna oranye muda atau soft
    private Color softOrange = new Color(255, 224, 178); // Oranye muda
    private Color softButtonOrange = new Color(255, 204, 153); // Oranye untuk tombol
    private Color softTextOrange = new Color(255, 235, 205); // Oranye terang untuk area teks

    public AplikasiPemesanan2() {
        super("APLIKASI PEMESANAN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Judul Aplikasi
        JLabel judulLabel = new JLabel("Aplikasi Pemesanan");
        judulLabel.setFont(new Font("Arial", Font.BOLD, 20));
        judulLabel.setHorizontalAlignment(JLabel.CENTER);
        judulLabel.setForeground(Color.DARK_GRAY); // Teks judul warna gelap untuk kontras
        judulLabel.setOpaque(true);
        judulLabel.setBackground(softOrange); // Warna background judul oranye muda
        add(judulLabel, BorderLayout.NORTH);

        // Panel utama dengan layout BorderLayout
        JPanel panelUtama = new JPanel(new BorderLayout());
        panelUtama.setBackground(softOrange); // Warna latar belakang panel utama oranye muda

        // Panel untuk data customer
        JPanel panelDataCustomer = new JPanel(new GridBagLayout());
        panelDataCustomer.setBorder(BorderFactory.createTitledBorder("Data Kustomer"));
        panelDataCustomer.setBackground(softOrange); // Warna latar belakang data customer oranye muda

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
        panelPilihMenu.setBackground(softOrange); // Warna latar belakang panel menu oranye muda

        panelPilihMenu.add(cbSteak);
        panelPilihMenu.add(cbSpaghetti);
        panelPilihMenu.add(cbPizza);

        // Panel untuk Total
        JPanel panelTotal = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelTotal.setBackground(softOrange); // Warna latar belakang panel total oranye muda
        fieldTotal.setForeground(Color.DARK_GRAY); // Warna teks di field total
        fieldTotal.setBackground(softTextOrange); // Warna latar belakang total oranye terang
        fieldTotal.setOpaque(true);
        fieldTotal.setHorizontalAlignment(JTextField.RIGHT);
        panelTotal.add(labelTotal);
        panelTotal.add(fieldTotal);

        // Tombol Tambah
        buttonTambah.setBackground(softButtonOrange); // Warna tombol tambah oranye lembut
        buttonTambah.setForeground(Color.DARK_GRAY); // Warna teks tombol tambah gelap
        JPanel panelButtonTambah = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelButtonTambah.setBackground(softOrange);
        panelButtonTambah.add(buttonTambah);

        // Panel untuk Tombol Tambah dan Total
        JPanel panelTombolDanTotal = new JPanel(new BorderLayout());
        panelTombolDanTotal.add(panelTotal, BorderLayout.CENTER);
        panelTombolDanTotal.add(panelButtonTambah, BorderLayout.SOUTH);
        panelTombolDanTotal.setBackground(softOrange);

        // Panel tengah antara Data Customer dan Pilih Menu
        JPanel panelTengah = new JPanel(new BorderLayout());
        panelTengah.add(panelDataCustomer, BorderLayout.WEST);
        panelTengah.add(panelPilihMenu, BorderLayout.CENTER);
        panelTengah.setBackground(softOrange);

        // Menambahkan panel-panel ke dalam panel utama
        panelUtama.add(panelTengah, BorderLayout.CENTER);
        panelUtama.add(panelTombolDanTotal, BorderLayout.SOUTH);

        // Panel untuk bagian bawah (Data Penjualan)
        JPanel panelBawah = new JPanel();
        panelBawah.setLayout(new FlowLayout());
        panelBawah.setBorder(BorderFactory.createTitledBorder("Data Penjualan"));
        panelBawah.setBackground(softOrange); // Warna latar belakang data penjualan oranye muda
        areaData.setBackground(softTextOrange); // Warna latar belakang teks area oranye terang
        JScrollPane scrollPane = new JScrollPane(areaData);
        panelBawah.add(scrollPane);

        // Menambahkan panel-panel ke dalam frame
        add(panelUtama, BorderLayout.CENTER);
        add(panelBawah, BorderLayout.SOUTH);

        // Menambahkan listener untuk checkbox dan tombol
        cbPizza.addItemListener(this);
        cbSpaghetti.addItemListener(this);
        cbSteak.addItemListener(this);
        buttonTambah.addActionListener(this);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        int harga = 0;
        if (cbPizza.isSelected()) harga += 80000;
        if (cbSpaghetti.isSelected()) harga += 40000;
        if (cbSteak.isSelected()) harga += 60000;
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

            String dataPenjualan = String.format(
                "Nama: %s\nAlamat: %s\nTelp: %s\n====================================\nPesanan:\n%s====================================\nTotal Bayar:\n Rp.%d",
                nama, alamat, noTelp, pesanan, totalHarga
            );

            areaData.append(dataPenjualan + "\n====================================\n");

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
        new AplikasiPemesanan2();
    }
}
