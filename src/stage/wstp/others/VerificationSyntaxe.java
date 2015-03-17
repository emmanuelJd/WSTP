package stage.wstp.others;

/**
 * V�rification syntaxique pour les diff�rentes entr�es propos�es par l'application notament lors de la saisie des tags pour l'ajout d'un tag sur un webservice
 * @author Emmanuel
 *
 */
public class VerificationSyntaxe {
	
	//v�rification de la saisie utilisateur par une expression r�guli�re
	public static boolean verificationTagWithPoidsAndMeta(String expression){
		boolean success = true;
		String[] service = expression.split(" ");
		int i = 0;
		while(i<service.length && success){
			success = service[i].matches("^(\\[[a-zA-Z0-9_-]+\\])*[a-zA-Z_-]+:([0-9]{1,2}|100)$");
			i++;
		}
		return success;
	}
	
	//v�rification de la saisie utilisateur par une expression r�guli�re sans les m�ta-tags
	public static boolean verificationTagWithPoids(String expression){
		
		boolean success = true;
		String[] service = expression.split(" ");
		int i = 0;
		while(i<service.length && success){
			success = service[i].matches("^[a-zA-Z_-]+:([0-9]{1,2}|100)$");
			i++;
		}
		return success;
	}
}
