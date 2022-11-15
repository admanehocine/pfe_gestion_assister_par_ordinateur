import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTable;
import javax.swing.Renderer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class TableColorCellRendrer implements TableCellRenderer{
    private static final TableCellRenderer RENDERER = new DefaultTableCellRenderer();
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		
		Component c = RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		
		if(column==2) {
			Object result = table.getModel().getValueAt(row, column);
			double quantite = Double.parseDouble(result.toString());
			Color color= null;
			if(quantite<=10) {
				color = Color.RED;
			}else if(quantite <=30) {
				color=Color.YELLOW;
			}else {
				color=Color.GREEN;
			}
			c.setBackground(color);
			c.setForeground(SystemColor.BLACK);
			
		}else {
			if(row % 2 ==0) {
				c.setBackground(SystemColor.controlHighlight);
			}else {
				c.setBackground(SystemColor.WHITE);
			}
		}
		
		c.setFont(new Font("Century Gothic", Font.BOLD, 12));
		// TODO Auto-generated method stub
		return c;
	}

}
