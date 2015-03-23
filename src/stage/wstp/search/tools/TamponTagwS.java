package stage.wstp.search.tools;

/**
 * Un objet qui permet de transformer un web service en un simple objet poss�dant l'id du web service, ses tags associ�s et leurs poids.
 * Cette transformation permet un traitement plus simple des donn�es pour la transformation d'un web service.
 * @author Emmanuel
 *
 */
public class TamponTagwS {

	private int idWebService;
	private String tagName;
	private double tagWeight;
	
	public TamponTagwS(int idWebService, String tagName, double tagWeight) {
		this.idWebService = idWebService;
		this.tagName = tagName;
		this.tagWeight = tagWeight;
	}

	public int getIdWebService() {
		return idWebService;
	}

	public void setIdWebService(int idWebService) {
		this.idWebService = idWebService;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public double getTagWeight() {
		return tagWeight;
	}

	public void setTagWeight(double tagWeight) {
		this.tagWeight = tagWeight;
	}
	
	
	
}
