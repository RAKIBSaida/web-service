package serveur;

import javax.xml.ws.Endpoint;

import service.BanqueService;

public class ServeurJWS {

	public static void main(String[] args) {
		String url="http://localhost:8585/";
		//pour publier le web service on fait l'appel à la classe Endpoint avec la methode publish
		Endpoint.publish(url, new BanqueService());
		System.out.println(url);
	}
}
