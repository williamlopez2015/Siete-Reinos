package sv.edu.fia.eisi.ll08027.mycalculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BinarioActivity extends Activity {


    Button btnCero, btnUno,btnIgual, btnSuma, btnResta, btnMulti, btnDiv, btnLimpiar;

    EditText etProceso, etconcatenar;
    Integer numero1, numero2,resultado1;
    String resultado;

    String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binario);

        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnCero = (Button)findViewById(R.id.btnCero);
        btnUno = (Button)findViewById(R.id.btnUno);


        btnIgual = (Button)findViewById(R.id.btnIgual);
        btnSuma = (Button)findViewById(R.id.btnSuma);
        btnResta = (Button)findViewById(R.id.btnResta);
        btnMulti = (Button)findViewById(R.id.btnMulti);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        etProceso = (EditText)findViewById(R.id.etProceso);

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "0");
            }
        });
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "1");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero2 = Integer.parseInt(etconcatenar.getText().toString(),2);
                if(operador.equals("+")){
                    etProceso.setText("");
                    resultado1 = numero1 + numero2;
                    resultado= Integer.toString(resultado1,2);
                }
                if(operador.equals("-")){
                    etProceso.setText("");
                    resultado1 = numero1 - numero2;
                    resultado= Integer.toString(resultado1,2);
                }
                if(operador.equals("*")){
                    etProceso.setText("");
                    resultado1 = numero1 * numero2;
                    resultado= Integer.toString(resultado1,2);
                }
                if(operador.equals("/")){
                    etProceso.setText("");
                    if(numero2 != 0){
                        resultado1 = numero1 / numero2;
                        resultado= Integer.toString(resultado1,2);
                    }else {
                        etProceso.setText("Infinito");
                    }
                }
                etProceso.setText(String.valueOf(resultado));
            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Integer.parseInt(etconcatenar.getText().toString(),2);
                etProceso.setText("");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Integer.parseInt(etconcatenar.getText().toString(),2);
                etProceso.setText("");
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Integer.parseInt(etconcatenar.getText().toString(),2);
                etProceso.setText("");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Integer.parseInt(etconcatenar.getText().toString(),2);
                etProceso.setText("");
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                etProceso.setText("");
            }
        });
    }

}
