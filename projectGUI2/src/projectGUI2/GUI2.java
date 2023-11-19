package projectGUI2;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

public class GUI2 extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane, panel1, panel2, panel3;
    private JButton tambahButton;
    private JCheckBox menu1, menu2, menu3;
    private JTextField namaField, alamatField, noTelpField;
    private JTextArea outputArea;
    private JLabel labelTotalBayar;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                GUI2 frame = new GUI2();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        return label;
    }

    private JTextField createTextField() {
        return new JTextField(20);
    }

    private void addComponent(Container container, Component component, GridBagConstraints gbc, int gridx, int gridy) {
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        container.add(component, gbc);
    }

    public GUI2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 768, 576);
        setTitle("Aplikasi Pemesanan Makanan");

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        // Panel 1
        panel1 = new JPanel();
        TitledBorder titledBorder1 = BorderFactory.createTitledBorder("Data Customer");
        panel1.setBorder(titledBorder1);
        panel1.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Adding JTextFields to panel1
        namaField = createTextField();
        alamatField = createTextField();
        noTelpField = createTextField();

        addComponent(panel1, createLabel("Nama:"), gbc, 0, 0);
        addComponent(panel1, namaField, gbc, 1, 0);
        addComponent(panel1, createLabel("Alamat:"), gbc, 0, 1);
        addComponent(panel1, alamatField, gbc, 1, 1);
        addComponent(panel1, createLabel("No. Telp:"), gbc, 0, 2);
        addComponent(panel1, noTelpField, gbc, 1, 2);

        contentPane.setLayout(new BorderLayout());
        contentPane.add(panel1, BorderLayout.WEST);

        // Panel 2
        menu1 = new JCheckBox("Menu 1 - Rp 10.0");
        menu2 = new JCheckBox("Menu 2 - Rp 15.0");
        menu3 = new JCheckBox("Menu 3 - Rp 20.0");

        // Tambahkan ItemListener ke setiap checkbox
        menu1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                calculateTotal();
            }
        });

        menu2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                calculateTotal();
            }
        });

        menu3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                calculateTotal();
            }
        });

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));  // Menggunakan FlowLayout dengan jarak 0
        panel2.setPreferredSize(new Dimension(200, 0));  // Ukuran preferensi, sesuaikan sesuai kebutuhan
        panel2.add(menu1);
        panel2.add(menu2);
        panel2.add(menu3);
        
        TitledBorder titledBorder2 = BorderFactory.createTitledBorder("Pilih Menu");
        panel2.setBorder(titledBorder2);

        contentPane.add(panel2, BorderLayout.EAST);
        
        labelTotalBayar = createLabel("Rp. 0");
        labelTotalBayar.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        // Total Bayar Section
        JPanel totalBayarPanel = new JPanel();
        totalBayarPanel.setLayout(new BoxLayout(totalBayarPanel, BoxLayout.PAGE_AXIS));

        // Check if createLabel("Rp. 0") is already added to totalBayarPanel
        boolean labelRpAdded = false;
        Component[] components = totalBayarPanel.getComponents();
        for (Component component : components) {
            if (component instanceof JLabel) {
                JLabel label = (JLabel) component;
                if ("Rp. 0".equals(label.getText())) {
                    labelRpAdded = true;
                    break;
                }
            }
        }

        // Add createLabel("Rp. 0") to totalBayarPanel only if it's not already added
        if (!labelRpAdded) {
            totalBayarPanel.add(createLabel("TOTAL BAYAR"));  // Assume initial total is 0
        }

        // Add the label to totalBayarPanel only if it's not already added
        if (!Arrays.asList(totalBayarPanel.getComponents()).contains(labelTotalBayar)) {
            totalBayarPanel.add(labelTotalBayar);
        }

        contentPane.add(totalBayarPanel, BorderLayout.CENTER);

        // Button
        tambahButton = new JButton("Tambah");
        tambahButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Set alignment to center
        tambahButton.addActionListener(this);

        // Add the button to totalBayarPanel
        totalBayarPanel.add(tambahButton);

        // Output Area
        outputArea = new JTextArea();
        outputArea.setEditable(false);

        // Menggunakan JScrollPane untuk membuat area teks dapat di-scroll
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Set ukuran tetap untuk outputArea
        outputArea.setPreferredSize(new Dimension(300, 200));  // Ganti dengan ukuran yang Anda inginkan

        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);

        // Panel 3
        panel3 = new JPanel();
        TitledBorder titledBorder3 = BorderFactory.createTitledBorder("Data Penjualan");
        panel3.setBorder(titledBorder3);
        panel3.setLayout(new BorderLayout());
        panel3.add(scrollPane, BorderLayout.CENTER);

        contentPane.add(totalBayarPanel, BorderLayout.CENTER);
        contentPane.add(panel3, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambahButton) {
            String nama = namaField.getText();
            String alamat = alamatField.getText();
            String noTelp = noTelpField.getText();

            StringBuilder pesanan = new StringBuilder("Pesanan:\n");

            double totalBayar = 0;

            if (menu1.isSelected()) {
                pesanan.append(" - Menu 1 (Rp 10.0)\n");
                totalBayar += 10.0;
            }
            if (menu2.isSelected()) {
                pesanan.append(" - Menu 2 (Rp 15.0)\n");
                totalBayar += 15.0;
            }
            if (menu3.isSelected()) {
                pesanan.append(" - Menu 3 (Rp 20.0)\n");
                totalBayar += 20.0;
            }

            labelTotalBayar.setText("Rp. " + totalBayar);

            // Menggunakan append agar data sebelumnya tidak tergantikan
            outputArea.append("Nama: " + nama + "\nAlamat: " + alamat + "\nNo. Telp: " + noTelp
                    + "\n-----------------------------\n" + pesanan
                    + "-----------------------------\nTotal Bayar:\n   Rp. " + totalBayar + "\n\n");
        }
    }

    private void calculateTotal() {
        double totalBayar = 0;

        if (menu1.isSelected()) {
            totalBayar += 10.0;
        }
        if (menu2.isSelected()) {
            totalBayar += 15.0;
        }
        if (menu3.isSelected()) {
            totalBayar += 20.0;
        }

        labelTotalBayar.setText("Rp. " + totalBayar);
    }
}
