package consistency;
class rudy{
    public String cwel;
    public String smiec;

    public rudy(String cwel, String smiec) {
        this.cwel = cwel;
        this.smiec = smiec;
    }

    public String getCwel() {
        return cwel;
    }

    public void setCwel(String cwel) {
        this.cwel = cwel;
    }

    public String getSmiec() {
        return smiec;
    }

    public void setSmiec(String smiec) {
        this.smiec = smiec;
    }
}

public class main {
    public static <T> boolean areBothNonNull(T arg1, T arg2){
        if(arg1 == null || arg2==null){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
    rudy c1=new rudy("aha","buh");
    rudy c2=new rudy("aha","huh");
        System.out.println("wynik="+areBothNonNull(c1,c2));
    }
}
