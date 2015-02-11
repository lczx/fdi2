package game.model;

import javax.swing.table.AbstractTableModel;

public abstract class GameGrid extends AbstractTableModel {

    protected char[][] data;

    public GameGrid(int width, int height) {
        data = new char[height][width];
        populateGrid();
    }

    public boolean findWord(String word) {
        String nWord = word.toLowerCase();
        String iWord = new StringBuilder(word).reverse().toString();

        // Rows
        for (int y = 0; y < getRowCount(); ++y) {
            String row = new String(data[y]);
            if (row.contains(nWord) || row.contains(iWord))
                return true;
        }

        // Columns
        for (int x = 0; x < getColumnCount(); x++) {
            StringBuilder colBuilder = new StringBuilder();
            for (int y = 0; y < getRowCount(); ++y)
                colBuilder.append(data[y][x]);

            String col = colBuilder.toString();
            if (col.contains(nWord) || col.contains(iWord))
                return true;
        }

        return false;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return data[0].length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    protected abstract void populateGrid();

}
