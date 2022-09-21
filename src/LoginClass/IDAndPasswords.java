package LoginClass;

import java.util.HashMap;

public class IDAndPasswords {

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDAndPasswords(){
        loginInfo.put("Bro","Pizza");
        loginInfo.put("Brometheus","PASSWORD");
        loginInfo.put("BroCode","abc123");
    }

       protected HashMap getLoginInfo(){
        return  loginInfo;
       }
}
