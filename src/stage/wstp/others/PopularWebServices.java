package stage.wstp.others;

import java.io.Serializable;

import stage.wstp.model.entities.Category;
import stage.wstp.model.entities.Tag;

public class PopularWebServices implements Serializable,Comparable<PopularWebServices> {
	private static final long serialVersionUID = 1L;
	
	private String nomCategory;
	private int nombreWebServices;
	public String getNomCategory() {
		return nomCategory;
	}
	public PopularWebServices(String nomCategory, int nombreWebServices) {
		super();
		this.nomCategory = nomCategory;
		this.nombreWebServices = nombreWebServices;
	}
	public void setNomCategory(String nomcategory) {
		nomCategory = nomcategory;
	}
	public int getNombreWebServices() {
		return nombreWebServices;
	}
	public void setNombreWebServices(int nombreWebServices) {
		this.nombreWebServices = nombreWebServices;
	}
	
	@Override
	public int compareTo(PopularWebServices o) {
		
		int res=this.nombreWebServices-o.getNombreWebServices();
		if(res > 0)
			return -1;//On met -1 comme resultat afin d'avoir une liste tri�e de mani�re croissante
		if(res < 0)
			return 1;//On met 1 si le resulat de la comparaison s'av�re n�gative comme resultat afin d'avoir une liste tri�e de mani�re croissante
		
		return 0;
	}
	
}
