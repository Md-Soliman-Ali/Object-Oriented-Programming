package Encapsulation;

public class AccountInfo {
	
public static void main(String[] args) {
		
		AccountOwner ao = new AccountOwner();
		
		ao.setId(171);
		System.out.println(ao.getId());
		
		ao.setName("Web");
		System.out.println(ao.getName());
		
		ao.setAmounts(28);
		System.out.println(ao.getAmounts());

	}

}
