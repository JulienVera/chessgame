interface Contenu {
    void encode(String texte);
    String toString();
}

class ContenuTexte implements Contenu {
    private String texte;
    public void encode(String texte) {
        this.texte = texte;
    }
    public String toString() {
        return (texte);
    }
}

class ContenuHtml implements Contenu {
    private String codeHtml;
    public void encode(String texte) {
        codeHtml = "<HTML>" + texte + "</HTML>";
    }
    public String toString() {
        return (codeHtml);
    }
}

class Courrier {
    private Contenu contenu;
    private String destinataire;

    Courrier(Contenu contenu) {
        this.contenu = contenu;
    }

    void prepare(String destinataire, String texte) {
        this.destinataire = destinataire;
        contenu.encode(texte);
    }
    public String toString() {
        String st = "destinataire : " + destinataire + "\n";
        st += "contenu : " + contenu.toString();
        return st;
    }
}

public class TestCourrier {

    public static void main(String[] args) {
        //apres
        Courrier courrierHtml = new Courrier(new ContenuHtml());
        courrierHtml.prepare("adresse1@domaine", "texte1");
        System.out.println(courrierHtml);

        Courrier courrierTexte = new Courrier(new ContenuTexte());
        courrierTexte.prepare("adresse2@domaine", "texte2");
        System.out.println(courrierTexte);

        //avant
//		CourrierHtml courrierHtml = new CourrierHtml();
//		courrierHtml.prepare("adresse1@domaine", "texte1");
//		System.out.println(courrierHtml);
//		CourrierTexte courrierTexte = new CourrierTexte();
//		courrierTexte.prepare("adresse2@domaine", "texte2");
//		System.out.println(courrierTexte);
    }
}
