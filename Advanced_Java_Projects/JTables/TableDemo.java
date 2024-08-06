package Advanced_Java_Projects.JTables;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableDemo {

    public static void main(String[] args) {
        new Mytable();
    }
}
class Mytable extends JFrame{

    JTable table;

    Mytable(){
        setSize(500,300);

        Object[][] data = {{1,"a",21},{2,"b",18}};
        String[] coulumnName = {"Sno","Name","abc"};

        DefaultTableModel model = new DefaultTableModel(data, coulumnName);

        table = new JTable(model);

        add(new JScrollPane(table));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        validate();

    }
}