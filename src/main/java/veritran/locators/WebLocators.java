package veritran.locators;

public class WebLocators {

	public static class HomePage{
		
		public static final String signInButton = "//div[contains(@class, 'pnlCabDer')]//button[contains(@class, 'VTButtonComponent')]";
	    public static final String userInput = "//div[contains(@class, 'VTPanelComponent') and not(contains(@style, 'display:none'))]/input[contains(@placeholder, 'Usuario')]";
	    public static final String passwordInput = "//div[contains(@class, 'VTPanelComponent') and not(contains(@style, 'display:none'))]/input[contains(@placeholder, 'Clave')]";
	    public static final String signInButtonForm = "//div[contains(@class, 'VTPanelComponent') and not(contains(@style, 'display:none'))]/button[contains(text(), 'Ingresar')]";
	    
	}

	public static class LandingPage{
		public static final String userName = "//span[contains(@class, 'txtNombreUser')]";
		public static final String listOfMoney = "//div[contains(@id, 'PANELCUENTAS')]//tr[contains(@class, 'VTDataGridRowComponent')]//span[contains(@class, 'VTTextComponent pointer')]";
	}
	
}
