
import java.util.*;


public class Application {


	public void main() {
		
//Creation des intances
		
		Professeur prof1 = new Professeur();
			prof1.setNom("Dupont");
			prof1.setPrenom("Robert");
			prof1.setAge(43);
			prof1.setEmail("r.dupont@thatSchool.com");
			prof1.setAdresse("28 rue de l'enseignement, 75012 Paris");
			prof1.setTel("06.01.02.03.04");
			prof1.setDomaine("Histoire");
			prof1.setAnneeDeClasse("Terminale");
			prof1.setProfPrincipal("Terminale B");
			prof1.setAnciennete(12);
			prof1.setSalaire(1487.63);
		Professeur prof2 = new Professeur();
			prof2.setNom("Duval");
			prof2.setPrenom("Henri");
			prof2.setAge(27);
			prof2.setEmail("h.duval@thatSchool.com");
			prof2.setAdresse("12 rue de la fac, 75020 Paris");
			prof2.setTel("06.05.06.07.08");
			prof2.setDomaine("Mathematiques");
			prof2.setAnneeDeClasse("2nd");
			prof2.setProfPrincipal("2nd A");
			prof2.setAnciennete(4);
			prof2.setSalaire(1238.45);
		Etudiant eleve1 = new Etudiant();
			eleve1.setNom("Do");
			eleve1.setPrenom("John");
			eleve1.setAge(15);
			eleve1.setEmail("j.do@thatSchool.com");
			eleve1.setAdresse("89 rue du nombre, 75020 Paris");
			eleve1.setTel("06.09.00.01.02");
			eleve1.setFiliere("Scientifique");
			eleve1.setAnneeDeClasse("2nd");
			eleve1.setClasse("A");
			eleve1.setSpecialisation("S.V.T");
			eleve1.setNoteGenerale(8);
		Etudiant eleve2 = new Etudiant();
			eleve2.setNom("Re");
			eleve2.setPrenom("Jim");
			eleve2.setAge(15);
			eleve2.setEmail("j.re@thatSchool.com");
			eleve2.setAdresse("72 rue du chiffre, 75020 Paris");
			eleve2.setTel("06.03.04.05.06");
			eleve2.setFiliere("Scientifique");
			eleve2.setAnneeDeClasse("2nd");
			eleve2.setClasse("A");
			eleve2.setSpecialisation("Mathematiques");
			eleve2.setNoteGenerale(16);
		Etudiant eleve3 = new Etudiant();
			eleve3.setNom("Mi");
			eleve3.setPrenom("James");
			eleve3.setAge(17);
			eleve3.setEmail("j.mi@thatSchool.com");
			eleve3.setAdresse("59 rue du livre, 75020 Paris");
			eleve3.setTel("06.07.08.09.00");
			eleve3.setFiliere("Litteraire");
			eleve3.setAnneeDeClasse("Terminale");
			eleve3.setClasse("B");
			eleve3.setSpecialisation("Anglais");
			eleve3.setNoteGenerale(14);
		Etudiant eleve4 = new Etudiant();
			eleve4.setNom("Fa");
			eleve4.setPrenom("Johnny");
			eleve4.setAge(17);
			eleve4.setEmail("j.fa@thatSchool.com");
			eleve4.setAdresse("45 rue du bouquin, 75020 Paris");
			eleve4.setTel("06.00.01.02.03");
			eleve4.setFiliere("Litteraire");
			eleve4.setAnneeDeClasse("Terminale");
			eleve4.setClasse("B");
			eleve4.setSpecialisation("Arts plastiques");
			eleve4.setNoteGenerale(14);
		Administratif admin1 = new Administratif();
			admin1.setNom("Vine");
			admin1.setPrenom("Ludi");
			admin1.setAge(37);
			admin1.setEmail("l.vine@thatSchool.com");
			admin1.setAdresse("38 rue de la liberté, 75012 Paris");
			admin1.setTel("06.11.22.33.44");
			admin1.setPoste("Directrice");
			admin1.setAnciennete(8);
			admin1.setSalaire(1799.99);
		Administratif admin2 = new Administratif();
			admin2.setNom("Tournel");
			admin2.setPrenom("Antoine");
			admin2.setAge(54);
			admin2.setEmail("a.tournel@thatSchool.com");
			admin2.setAdresse("38 rue des chaines, 75020 Paris");
			admin2.setTel("06.55.66.77.88");
			admin2.setPoste("Homme à tout faire");
			admin2.setAnciennete(18);
			admin2.setSalaire(2528.12);
	
	}

}