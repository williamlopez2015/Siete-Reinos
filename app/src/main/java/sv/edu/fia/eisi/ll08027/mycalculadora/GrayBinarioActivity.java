package sv.edu.fia.eisi.ll08027.mycalculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class GrayBinarioActivity extends AppCompatActivity {
    EditText editnumber;
    EditText editresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gray_binario);
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

    public void convertirgrayabinario(View v) {
        if(TextUtils.isEmpty(editnumber.getText().toString())){
            mensajes("El campo numero esta Vacio");
        }else if(Integer.parseInt(editnumber.getText().toString())<=0){
            mensajes("Debe de ingresar un numero entero positivo");
        }else {
            for (int i = 0; i < editnumber.getText().toString().length(); i++) {
            if (editnumber.getText().toString().charAt(i) != '0' && editnumber.getText().toString().charAt(i) != '1') {
                mensajes("tu tienes que ingresar ceros : 0 y unos: 1");
                return;
            }
            }
            String number=editnumber.getText().toString().trim();
            editresult.setText(grayabinario(number));

        }
    }

    public String grayabinario(String gray){
        String binary;

        binary = String.valueOf(gray.charAt(0));

        for (int i = 0; i < gray.length() - 1; i++){

        /* XOR operation */

            if (binary.charAt(i) == gray.charAt(i+1))

                binary = binary + "0";

            else

                binary = binary + "1";

        }
        System.out.println("Codigo Gray " + gray );
        System.out.println("Codigo Binario " + binary);
        return binary;

    }

    public void convertirbinarioagray(View v) {
        if(TextUtils.isEmpty(editnumber.getText().toString())){
            mensajes("El campo numero esta Vacio");
        }else if(Integer.parseInt(editnumber.getText().toString())<=0){
            mensajes("Debe de ingresar un numero entero positivo");
        }else {
            for (int i = 0; i < editnumber.getText().toString().length(); i++) {
                if (editnumber.getText().toString().charAt(i) != '0' && editnumber.getText().toString().charAt(i) != '1') {
                    mensajes("tu tienes que ingresar ceros : 0 y unos: 1");
                    return;
                }
            }
            String number=editnumber.getText().toString().trim();
            int num= Integer.parseInt(number,2);
            System.out.println(number + " base 2 = " + num + " base 10");
            String result =getGreyCode(num);
            editresult.setText(result);
            System.out.println(" El Gray =  " + result);
        }
    }

    public static String getGreyCode(int myNum) {

        //el minimo de  bits requeridos para ver el numero
        int numOfBits = (int)(Math.log(myNum) / Math.log(2)) + 1;
        return getGreyCode(myNum, numOfBits);
    }

    public static String getGreyCode(int myNum, int numOfBits) {
        if (numOfBits == 1) {
            return String.valueOf(myNum);
        }

        if (myNum >= Math.pow(2, (numOfBits - 1))) {
            return "1" + getGreyCode((int)(Math.pow(2, (numOfBits))) - myNum - 1, numOfBits - 1);
        } else {
            return "0" + getGreyCode(myNum, numOfBits - 1);
        }
    }

    public void mensajes(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();


    }
}
