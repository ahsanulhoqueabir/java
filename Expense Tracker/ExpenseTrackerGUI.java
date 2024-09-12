
// src/ExpenseTrackerGUI.java
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

public class ExpenseTrackerGUI {
    private JFrame frame;
    private JTextField descriptionField;
    private JTextField amountField;
    private JComboBox<String> dayComboBox;
    private JComboBox<String> monthComboBox;
    private JComboBox<String> yearComboBox;
    private DefaultListModel<Expense> expenseListModel;
    private JList<Expense> expenseList;

    private java.util.List<Expense> expenses;

    public ExpenseTrackerGUI() {
        expenses = new ArrayList<>();
    }

    public void createAndShowGUI() {
        frame = new JFrame("Expense Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mainPanel.setBackground(Color.WHITE);

        JPanel inputPanel = new JPanel(new GridBagLayout());
        inputPanel.setBackground(new Color(240, 248, 255));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel titleLabel = new JLabel("Expense Tracker");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(0, 102, 204));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel descriptionLabel = new JLabel("Description:");
        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        inputPanel.add(descriptionLabel, gbc);

        descriptionField = new JTextField();
        descriptionField.setPreferredSize(new Dimension(200, 30));
        gbc.gridx = 1;
        gbc.gridy = 0;
        inputPanel.add(descriptionField, gbc);

        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 1;
        inputPanel.add(amountLabel, gbc);

        amountField = new JTextField();
        amountField.setPreferredSize(new Dimension(200, 30));
        gbc.gridx = 1;
        gbc.gridy = 1;
        inputPanel.add(amountField, gbc);

        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 2;
        inputPanel.add(dateLabel, gbc);

        dayComboBox = new JComboBox<>();
        monthComboBox = new JComboBox<>();
        yearComboBox = new JComboBox<>();
        populateDateCombos();

        JPanel datePanel = new JPanel();
        datePanel.add(dayComboBox);
        datePanel.add(monthComboBox);
        datePanel.add(yearComboBox);

        gbc.gridx = 1;
        gbc.gridy = 2;
        inputPanel.add(datePanel, gbc);

        JButton addButton = new JButton("Add Expense");
        addButton.setBackground(new Color(0, 204, 102));
        addButton.setForeground(Color.WHITE);
        addButton.setFocusPainted(false);
        addButton.setFont(new Font("Arial", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addExpense();
            }
        });
        inputPanel.add(addButton, gbc);

        expenseListModel = new DefaultListModel<>();
        expenseList = new JList<>(expenseListModel);
        expenseList.setFont(new Font("Arial", Font.PLAIN, 14));
        expenseList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(expenseList);

        JButton deleteButton = new JButton("Delete Selected");
        deleteButton.setBackground(new Color(204, 0, 0));
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setFocusPainted(false);
        deleteButton.setFont(new Font("Arial", Font.BOLD, 14));
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteExpense();
            }
        });

        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(scrollPane, BorderLayout.EAST);
        mainPanel.add(deleteButton, BorderLayout.SOUTH);

        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);
    }

    private void populateDateCombos() {
        for (int i = 1; i <= 31; i++) {
            dayComboBox.addItem(String.format("%02d", i));
        }

        for (int i = 1; i <= 12; i++) {
            monthComboBox.addItem(String.format("%02d", i));
        }

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = currentYear; i >= currentYear - 100; i--) {
            yearComboBox.addItem(Integer.toString(i));
        }
    }

    private void addExpense() {
        String description = descriptionField.getText();
        double amount;
        try {
            amount = Double.parseDouble(amountField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid amount format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String date = String.format("%s-%s-%s", yearComboBox.getSelectedItem(), monthComboBox.getSelectedItem(),
                dayComboBox.getSelectedItem());

        Expense expense = new Expense(description, amount, date);
        expenses.add(expense);
        expenseListModel.addElement(expense);

        descriptionField.setText("");
        amountField.setText("");
        dayComboBox.setSelectedIndex(0);
        monthComboBox.setSelectedIndex(0);
        yearComboBox.setSelectedIndex(0);
    }

    private void deleteExpense() {
        int selectedIndex = expenseList.getSelectedIndex();
        if (selectedIndex != -1) {
            expenses.remove(selectedIndex);
            expenseListModel.remove(selectedIndex);
        } else {
            JOptionPane.showMessageDialog(frame, "No expense selected.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ExpenseTrackerGUI().createAndShowGUI();
            }
        });
    }
}
