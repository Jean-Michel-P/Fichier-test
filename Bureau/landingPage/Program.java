import MyPackage.*;
import java.io.BufferedReader; import java.io.InputStreamReader;

public class Program {

	public static void main(String[]args) throws Exception {

		int i = 0;
		int nbOfTry = 3;

		AccountCreation newLogin = new AccountCreation();
		newLogin.setName(); newLogin.setPassword();

		LoginAssignment login = new LoginAssignment();
		login.setUserName(newLogin.getName()); login.setUserPassword(newLogin.getPassword());

		for(nbOfTry = 3; nbOfTry > i; nbOfTry--){

			if(nbOfTry != 3)
				System.out.println("\t\tIl vous reste " + nbOfTry + " essais avant le blocage de votre compte.");

			Login_ID id = new Login_ID();
			id.setName(); id.setPassword();

			if(id.getName().equals(login.getUserName()) && id.getPassword().equals(login.getUserPassword())) {
				System.out.println("\n\t\tBienvenue ".concat(login.getUserName()));
				new Window();
				break;
			}
			else {
				System.out.println("\n\t\tL'identifaint ou le mot passe est incorrecte.");
				if(nbOfTry == 1)
					System.out.println("\t\tVous avez bloquer votre compte.\n");
			}
		}
	}
}