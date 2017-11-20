
import employe.Personnel;
import employe.manutention_speciale;
import employe.manutention;


public class Salary {
    public static void main(String[] args){  
        
         
 Personnel per = new Personnel();
per.ajouterEmploye(new manutention_speciale("abdel","kader","16A999FS",22,2017,5200));
per.ajouterEmploye(new manutention("IBRAHIMA","DAGAk","11B412FS",52,2010,2510));
per.ajouterEmploye(new production("LALO","YOTIto","15a412fs",12,2003,51000));
per.ajouterEmploye(new production_speciale("tara","ZAKAR","11D412fs",40,1970,400));
per.ajouterEmploye(new manutention_speciale("BABA","zoLo","15D412fs",65,1988,5800));
per.ajouterEmploye(new manutention("lOUYIilo","zAZAz","11E412fs",32,1996,1400));
per.ajouterEmploye(new production("OUMAROU","BRETZIL","15a412fs",32,2001,5220));
per.ajouterEmploye(new production_speciale("CHECK","abdel","11a023fs",40,1970,2540));


per.afficherSalaire();
System.out.println("Les salaire moyen de cette Entreprise est :" + per.Salaire_moyen());
}   


}

