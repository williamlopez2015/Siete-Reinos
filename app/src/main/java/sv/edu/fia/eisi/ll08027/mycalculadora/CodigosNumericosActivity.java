package sv.edu.fia.eisi.ll08027.mycalculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CodigosNumericosActivity extends AppCompatActivity {
    EditText editnumber;
    EditText editresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigos_numericos);
        setUIComponents();
    }

    private void setUIComponents(){
        editnumber=(EditText) findViewById(R.id.editnumber);
        editnumber.setOnFocusChangeListener(new View.OnFocusChangeListener() {


            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (TextUtils.isEmpty(editnumber.getText().toString())) {
                    editnumber.setError("El campo esta Vacio");

                } else if (Integer.parseInt(editnumber.getText().toString()) <= 0) {
                    editnumber.setError("Debe de ingresar un numero entero positivo");
                } else {
                    editnumber.setError(null);
                }
            }


        });

        editresult= (EditText) findViewById(R.id.editresult);

    }

    public void limpiarcampos(View v) {
        editnumber.setText("");
        editresult.setText("");
    }

    public void convertirbcdadecimal(View v) {
        if(TextUtils.isEmpty(editnumber.getText().toString())){
            mensajes("El campo numero esta Vacio");
        }else if(Integer.parseInt(editnumber.getText().toString())<=0){
            mensajes("Debe de ingresar un numero entero positivo");
        }else {
            String numero="";
            numero=editnumber.getText().toString().trim();
            String result ="";
            for ( int i : fromString(numero)) {
                result = result + i;
            }
            editresult.setText(result);
        }
    }
    public void mensajes(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();


    }

    public List<Integer> fromString(String binaryString ) {

        List<Integer> list   = new ArrayList<Integer>();
        StringBuilder buffer = new StringBuilder();
        int count            = 0;
        int numero=0;


        for ( char c : binaryString.toCharArray() ) {
            buffer.append( c );
            count++;

            if ( count >= 4 ) {
                try{
                    numero = Integer.parseInt(buffer.toString(), 2);
                }catch (NumberFormatException e) {
                    mensajes("ERROR : El numero " + numero + " no es soportado ");
                }
                list.add(numero);
                count = 0;
                buffer.delete( 0 , 4 );
            }
        }

        return list;
    }

}
