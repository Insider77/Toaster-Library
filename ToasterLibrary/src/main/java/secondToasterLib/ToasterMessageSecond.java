package secondToasterLib;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessageSecond {

    public static void x(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
