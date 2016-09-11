package sv.edu.fia.eisi.ll08027.mycalculadora;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CodigosNumericosActivity extends Activity {


    EditText editnumber;
    EditText editresult;
    String digitoFinal="";
    String dig;



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
        digitoFinal="";

    }

    public void convertir8421(View v) {

        int cont = -1;
        dig = editnumber.getText().toString();
        for (int i = 0; i < dig.length(); i++) {//captura de datos y validacion asi no podra aceptar letras solo numeros
            if ((Character.isDigit(dig.charAt(i)))) {

                cont++;

            }
        }
        if (cont >= 0 && cont < 10) {
            for (int i = 0; i < dig.length(); i++) {
                digitoFinal = digitoFinal + aBcd8421((dig.charAt(i)));
                editresult.setText(digitoFinal);

            }

        }//END Convertir8421


    } //END de convertir8421

    public String aBcd8421(char digito) {
        String dig1 = "";
        switch (digito) {
            case '0':
                dig1 = "0000";
                break;
            case '1':
                dig1 = "0001";
                break;
            case '2':
                dig1 = "0010";
                break;
            case '3':
                dig1 = "0011";
                break;
            case '4':
                dig1 = "0100";
                break;
            case '5':
                dig1 = "0101";
                break;
            case '6':
                dig1 = "0110";
                break;
            case '7':
                dig1 = "0111";
                break;
            case '8':
                dig1 = "1000";
                break;
            case '9':
                dig1 = "1001";
                break;
        }
        return dig1;
    }

    public void convertir7421(View v) {

        int cont = -1;
        dig = editnumber.getText().toString();
        for (int i = 0; i < dig.length(); i++) {//captura de datos y validacion asi no podra aceptar letras solo numeros
            if ((Character.isDigit(dig.charAt(i)))) {

                cont++;

            }
        }
        if (cont >= 0 && cont < 10) {
            for (int i = 0; i < dig.length(); i++) {
                digitoFinal = digitoFinal + aBcd7421((dig.charAt(i)));
                editresult.setText(digitoFinal);

            }

        }//END Convertir5421


    } //END de convertir5421

    public String aBcd7421(char digito) {
        String dig1 = "";
        switch (digito) {
            case '0':
                dig1 = "0000";
                break;
            case '1':
                dig1 = "0001";
                break;
            case '2':
                dig1 = "0010";
                break;
            case '3':
                dig1 = "0011";
                break;
            case '4':
                dig1 = "0100";
                break;
            case '5':
                dig1 = "0101";
                break;
            case '6':
                dig1 = "0110";
                break;
            case '7':
                dig1 = "1000";
                break;
            case '8':
                dig1 = "1001";
                break;
            case '9':
                dig1 = "1010";
                break;
        }
        return dig1;
    }

    public void convertir5421(View v) {

        int cont = -1;
         dig = editnumber.getText().toString();
            for (int i = 0; i < dig.length(); i++) {//captura de datos y validacion asi no podra aceptar letras solo numeros
                if ((Character.isDigit(dig.charAt(i)))) {

                    cont++;

                }
            }
            if (cont >= 0 && cont < 10) {
                for (int i = 0; i < dig.length(); i++) {
                    digitoFinal = digitoFinal + aBcd5421((dig.charAt(i)));
                    editresult.setText(digitoFinal);

                }

            }//END Convertir5421


    } //END de convertir5421

    public String aBcd5421(char digito) {
        String dig1 = "";
        switch (digito) {
            case '0':
                dig1 = "0000";
                break;
            case '1':
                dig1 = "0001";
                break;
            case '2':
                dig1 = "0010";
                break;
            case '3':
                dig1 = "0011";
                break;
            case '4':
                dig1 = "0100";
                break;
            case '5':
                dig1 = "1000";
                break;
            case '6':
                dig1 = "1001";
                break;
            case '7':
                dig1 = "1010";
                break;
            case '8':
                dig1 = "1011";
                break;
            case '9':
                dig1 = "1100";
                break;
        }
        return dig1;
    }

    public void convertir2421(View v) {

        int cont = -1;
        dig = editnumber.getText().toString();
        for (int i = 0; i < dig.length(); i++) {//captura de datos y validacion asi no podra aceptar letras solo numeros
            if ((Character.isDigit(dig.charAt(i)))) {

                cont++;

            }
        }
        if (cont >= 0 && cont < 10) {
            for (int i = 0; i < dig.length(); i++) {
                digitoFinal = digitoFinal + aBcd2421((dig.charAt(i)));
                editresult.setText(digitoFinal);

            }

        }//END Convertir5421


    } //END de convertir5421

    public String aBcd2421(char digito) {
        String dig1 = "";
        switch (digito) {
            case '0':
                dig1 = "0000";
                break;
            case '1':
                dig1 = "0001";
                break;
            case '2':
                dig1 = "0010";
                break;
            case '3':
                dig1 = "0011";
                break;
            case '4':
                dig1 = "0100";
                break;
            case '5':
                dig1 = "1011";
                break;
            case '6':
                dig1 = "1100";
                break;
            case '7':
                dig1 = "1101";
                break;
            case '8':
                dig1 = "1110";
                break;
            case '9':
                dig1 = "1111";
                break;
        }
        return dig1;
    }

    public void convertirExc3(View v) {

        int cont = -1;
        dig = editnumber.getText().toString();
        for (int i = 0; i < dig.length(); i++) {//captura de datos y validacion asi no podra aceptar letras solo numeros
            if ((Character.isDigit(dig.charAt(i)))) {

                cont++;

            }
        }
        if (cont >= 0 && cont < 10) {
            for (int i = 0; i < dig.length(); i++) {
                digitoFinal = digitoFinal + bcdExc3((dig.charAt(i)));
                editresult.setText(digitoFinal);

            }

        }//END Convertir5421


    } //END de convertir5421

    public String bcdExc3(char digito) {
        String dig1 = "";
        switch (digito) {
            case '0':
                dig1 = "0011";
                break;
            case '1':
                dig1 = "0100";
                break;
            case '2':
                dig1 = "0101";
                break;
            case '3':
                dig1 = "0110";
                break;
            case '4':
                dig1 = "0111";
                break;
            case '5':
                dig1 = "1000";
                break;
            case '6':
                dig1 = "1001";
                break;
            case '7':
                dig1 = "1010";
                break;
            case '8':
                dig1 = "1011";
                break;
            case '9':
                dig1 = "1100";
                break;
        }
        return dig1;
    }



    public void mensajes(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();


    }
} // END Activity



