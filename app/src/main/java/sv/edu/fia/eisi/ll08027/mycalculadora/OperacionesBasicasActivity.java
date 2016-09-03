package sv.edu.fia.eisi.ll08027.mycalculadora;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OperacionesBasicasActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones_basicas);
    }

    public void lanzarActividad(View v) {
        Intent i = null;
        switch (v.getId()) {
            case R.id.button_binario:
                i = new Intent(this,BinarioActivity.class);
                break;
            case R.id.button_octales:
                i = new Intent(this,OctalActivity.class);
                break;
            case R.id.button_decimales:
                i = new Intent(this,DecimalActivity.class);
                break;
            case R.id.button_hexadecimales:
                i = new Intent(this,HexadecimalActivity.class);
                break;
        }

        if (i != null)
            startActivity(i);
    }

}
