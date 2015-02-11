package history.ui;

import history.model.HistoryEvent;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {

    public static final String FILTER_ALL_TEXT = "All";

    private JFrame frame = new JFrame();
    private JTextField eventBox = new JTextField();
    private JTextField dateBox = new JTextField();
    private JTextField locBox = new JTextField();
    private JTable eventsTable = new JTable();

    private JMenuItem miSave;
    private JMenu menuFilter;

    public View(String caption) {
        frame.setTitle(caption);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        initializeMenu();
        initializeComponents();

        frame.setVisible(true);
    }

    public void addSaveListener(ActionListener listener) {
        miSave.addActionListener(listener);
    }

    public void addTextBoxListener(ActionListener listener) {
        eventBox.addActionListener(listener);
        dateBox.addActionListener(listener);
        locBox.addActionListener(listener);
    }

    public void addFilterListener(ActionListener listener) {
        for (int i = 0; i < menuFilter.getItemCount(); i++)
            menuFilter.getItem(i).addActionListener(listener);
    }

    public String[] getTextInput() {
        return new String[]{eventBox.getText(), dateBox.getText(), locBox.getText()};
    }

    public void setTableModel(TableModel model) {
        eventsTable.setModel(model);
    }

    private void initializeMenu() {
        JMenuBar bar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        miSave = new JMenuItem("Save");
        menuFile.add(miSave);

        menuFilter = new JMenu("Filter");
        ButtonGroup bg = new ButtonGroup();

        JRadioButtonMenuItem bAll = new JRadioButtonMenuItem(FILTER_ALL_TEXT);
        bg.add(bAll);
        menuFilter.add(bAll);
        for (String s : HistoryEvent.LOCATIONS) {
            JRadioButtonMenuItem b = new JRadioButtonMenuItem(s);
            bg.add(b);
            menuFilter.add(b);
        }

        bar.add(menuFile);
        bar.add(menuFilter);
        frame.setJMenuBar(bar);
    }

    private void initializeComponents() {
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().setBackground(Color.WHITE);

        eventsTable.setFillsViewportHeight(true);
        eventsTable.setBackground(Color.WHITE);
        eventsTable.getTableHeader().setBackground(new Color(240, 240, 240));

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.PAGE_START;

        c.insets = new Insets(5, 5, 5, 5);
        c.weightx = 1;      c.weighty = 0;
        c.gridwidth = 1;    c.gridheight = 1;

        c.gridx = 0;        c.gridy = 0;
        frame.add(eventBox, c);

        c.gridx = 1;
        frame.add(dateBox, c);

        c.gridx = 2;
        frame.add(locBox, c);

        c.insets = new Insets(0, 5, 5, 5);
        c.weighty = 1;

        c.gridx = 0;        c.gridy = 1;
        c.gridwidth = 3;    c.gridheight = 1;
        frame.add(new JScrollPane(eventsTable), c);
    }

}
