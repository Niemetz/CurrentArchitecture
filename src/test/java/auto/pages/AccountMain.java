package auto.pages;

public class AccountMain extends AmazonBasePageObject {
	
 public AccountMain()
 {
	 // I want to see this change
	 super() ;
     pageElementsTable.clear();
        
	 pageElementsTable.put("Your Account".toLowerCase(),"#nav-link-accountList");
	 pageElementsTable.put("Page Unique Element".toLowerCase(),"#nav-link-accountList");
 }
 
}