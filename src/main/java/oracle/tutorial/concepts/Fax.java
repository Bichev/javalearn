package oracle.tutorial.concepts;

/**
 * Created by Vladimir Bichev
 * Date: 22.12.11
 * Time: 22:40
 */
public class Fax extends Phone{
    public String documentForPrint;

    public String getDocumentForPrint() {
        return documentForPrint;
    }

    public void setDocumentForPrint(String documentForPrint) {
        this.documentForPrint = documentForPrint;
    }
}
