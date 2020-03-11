import java.util.Date;

// NOTE: Use fully qualified name only in exceptional cases.
// Never use * imports it might break the code.

public class Packages {

    public static void main(String args[]){
        Date date = new Date();
        System.out.println(date.toGMTString());
    }
}
