

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.TableView.TableCell;

public class RenderPintar implements TableCellRenderer{


	
	 /**
	 * 
	 */
	private static final TableCellRenderer r=new DefaultTableCellRenderer();

	public Component getTableCellRendererComponent(
	
           JTable table, Object value,
            boolean isSelected, boolean hasFocus,
            int row, int column) {
		Component c=r.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		
		if(column==2) {
			Object re=table.getModel().getValueAt(row, column);
			double av=Double.parseDouble(re.toString());
			Color color=null; 
			if(av<=10 )
			 {
				color=color.red;
				c.setBackground(color);
				
			 }else  {
					if(av<=49 ) {
				
						color=color.yellow;
						c.setBackground(color);	
					}else {
						c.setBackground(Color.GREEN);
					}
					
					
			 }	
					
		}		
			else		{
								
						c.setBackground(Color.white);	
					}
						return c;
			 
			
		
				
		
		
		
	//return la;
	}
	/***
	public RenderPintar() {
        setOpaque(true); //MUST do this for background to show up.
    }

	public Component getTableCellRendererComponent(
         JTable table, Object value,
         boolean isSelected, boolean hasFocus,
         int row, int column) {

//if(column == 4){

if (Integer.valueOf(table.getValueAt(row, column).toString()) <=10 )
{
setBackground(Color.red);
//setForeground(Color.BLACK);
}
else
{if (Integer.valueOf(table.getValueAt(row, column).toString()) >=40 )
setBackground(Color.GREEN);
//setForeground(Color.BLACK);
else setBackground(Color.yellow);
}
//}
return this;
}**/
}



