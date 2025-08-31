import java.util.ArrayList;
import java.util.List;

public class ContactData {
    private List<String> phoneData = new ArrayList<>();
    private List<String> emailData = new ArrayList<>();

    public List<String> getData(String dataType){
        if(dataType.toLowerCase().startsWith("E")){
            return emailData;
        }else{
            return phoneData;
        }
    }
}
