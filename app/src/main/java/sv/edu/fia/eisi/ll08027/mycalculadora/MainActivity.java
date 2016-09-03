package sv.edu.fia.eisi.ll08027.mycalculadora;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanzarActividad(View v) {
        Intent i = null;
        switch (v.getId()) {
            case R.id.button_OperacionesBasicas:
                i = new Intent(this,OperacionesBasicasActivity.class);
                break;
            case R.id.button_ConversionBases:
                i = new Intent(this,ConvertirBasesActivity.class);
                break;
            case R.id.button_CodigosNumericos:
                i = new Intent(this,CodigosNumericosActivity.class);
                break;
            case R.id.button_BinarioGray:
                i = new Intent(this,GrayBinarioActivity.class);
                break;
        }

        if (i != null)
            startActivity(i);
    }
}
