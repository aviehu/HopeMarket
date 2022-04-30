package Domain.Users.ExternalService.Security;

import Domain.Users.ExternalService.Payment.PaymentAdapter;

public class mySecuritySys {
    private ISecurity realSecurity;

    public mySecuritySys() {
        this.realSecurity = new SecurityAdapter(null);
    }

    public String encode(String pass){
        return realSecurity.encode(pass);
    }
    public String decode(String pass){
        return realSecurity.encode(pass);
    }
    public boolean isExist(){
        return realSecurity.isExist();
    }
}
