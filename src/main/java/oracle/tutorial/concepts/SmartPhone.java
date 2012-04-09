package oracle.tutorial.concepts;

/**
 * Created by Vladimir Bichev
 * Date: 22.12.11
 * Time: 22:39
 */
public class SmartPhone {

    public String sms;
    public boolean internetAvailable;

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public boolean isInternetAvailable() {
        return internetAvailable;
    }

    public void setInternetAvailable(boolean internetAvailable) {
        this.internetAvailable = internetAvailable;
    }
}
