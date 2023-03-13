/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rams
 */
public class FileDokumen extends AbstractTableModel {
       List<File> list = new ArrayList<>();

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    synchronized
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0 : return list.get(rowIndex).getFileName();
           case 1 : return list.get(rowIndex).getFileSize();
           default: return "";
       }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
        
            case 0 : return "Nama Dokumen";
            case 1: return "Ukuran";
            default: return "";
        }
    }
    
    public void add (File f){
    
        list.add(f);
        fireTableRowsInserted(getRowCount(),getColumnCount());
    }
    public void set (int i,File f){
    
        list.set(i, f);
        fireTableDataChanged();
    }
    public void clear(){
    
        list.clear();
        fireTableDataChanged();
    }
    public void remove(int row){
    
        list.remove(row);
        fireTableRowsDeleted(row, row);
    }
    public File get(int row){
    
        return (File) list.get(row);
    }
    
   
    

    
    
}
