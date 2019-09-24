import javax.swing.JFrame;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainWindow() {
		setTitle("Ventana"); 
		this.setSize(320, 200);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	} 

	public static void main(String[] args) {
		MainWindow mainWindow = new MainWindow(); 
		mainWindow.setVisible(true);
	}

}
