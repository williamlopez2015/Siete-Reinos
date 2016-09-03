package sv.edu.fia.eisi.ll08027.mycalculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ConvertirBasesActivity extends AppCompatActivity {
    EditText editnumber;
    EditText editbase1;
    EditText editbase2;
    EditText editresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertir_bases);
        setUIComponents();
    }

    private void setUIComponents(){
        editnumber=(EditText) findViewById(R.id.editnumber);
        editnumber.setOnFocusChangeListener(new View.OnFocusChangeListener(){


            @Override
            public void onFocusChange(View v, boolean hasFocus){
                if(TextUtils.isEmpty(editnumber.getText().toString())){
                    editnumber.setError("El campo esta Vacio");

                }else if(Integer.parseInt(editnumber.getText().toString())<=0){
                    editnumber.setError("Debe de ingresar un numero entero positivo");
                }else{
                    editnumber.setError(null);
                }
            }


        });


        editbase1 = (EditText) findViewById(R.id.editbase1);
        editbase1.setOnFocusChangeListener(new View.OnFocusChangeListener(){


            @Override
            public void onFocusChange(View v, boolean hasFocus){
                if(TextUtils.isEmpty(editbase1.getText().toString())){
                    editbase1.setError("El campo esta Vacio");

                }else if(Integer.parseInt(editbase1.getText().toString())<=0){
                    editbase1.setError("Debe de ingresar un numero entero positivo");
                }else{
                    editbase1.setError(null);
                }
            }



        });






        editbase2 = (EditText) findViewById(R.id.editbase2);
        editbase2.setOnFocusChangeListener(new View.OnFocusChangeListener(){


            @Override
            public void onFocusChange(View v, boolean hasFocus){
                if(TextUtils.isEmpty(editbase2.getText().toString())){
                    editbase2.setError("El campo esta Vacio");

                }else if(Integer.parseInt(editbase2.getText().toString())<=0){
                    editbase2.setError("Debe de ingresar un numero entero positivo");
                }else{
                    editbase2.setError(null);
                }
            }



        });

        editresult= (EditText) findViewById(R.id.editresult);

    }


    public void limpiarcampos(View v) {
        editnumber.setText("");
        editbase1.setText("");
        editbase2.setText("");
        editresult.setText("");
    }

    public void convertirbase(View v) {
        if(TextUtils.isEmpty(editnumber.getText().toString())){
            mensajes("El campo numero esta Vacio");
        }else if(Integer.parseInt(editnumber.getText().toString())<=0){
            mensajes("Debe de ingresar un numero entero positivo");
        }else if(TextUtils.isEmpty(editbase1.getText().toString())){
            mensajes("El campo base del numero esta Vacio");
        }else if(Integer.parseInt(editbase1.getText().toString())<=0){
        mensajes("Debe de ingresar un numero entero positivo");
        }else if(TextUtils.isEmpty(editbase2.getText().toString())){
            mensajes("El campo base a convertir numero esta Vacio");
        }else if(Integer.parseInt(editbase2.getText().toString())<=0){
            mensajes("Debe de ingresar un numero entero positivo");
        }else {
            String numero=null;
            numero=editnumber.getText().toString().trim();
            int b1,b2;
            b1= Integer.parseInt(editbase1.getText().toString().trim());
            b2= Integer.parseInt(editbase2.getText().toString().trim());
            editresult.setText(toCualquierBase(numero, b1, b2));
        }
    }




    public String toCualquierBase(String num, int base1, int base2) {
        System.out.print("Convirtiendo numero (" + num + ") de base " + base1 + " a base " + base2 + ">> ");
        Integer numero = 0;
        try{
            numero = Integer.valueOf(num, base1);
        }catch (NumberFormatException e) {
            mensajes("ERROR : El numero " + num + " no es soportado en la base " + base1);
        }
        return Integer.toString(numero.intValue(), base2);
    }

    public void mensajes(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();


    }
}
