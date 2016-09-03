package sv.edu.fia.eisi.ll08027.mycalculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OctalActivity extends Activity {

    Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete,btnIgual, btnSuma, btnResta, btnMulti, btnDiv, btnLimpiar;

    EditText etProceso, etconcatenar;
    Integer numero1, numero2,resultado1;
    String resultado;

    String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octal);

        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnCero = (Button)findViewById(R.id.btnCero);
        btnUno = (Button)findViewById(R.id.btnUno);
        btnDos = (Button)findViewById(R.id.btnDos);
        btnTres = (Button)findViewById(R.id.btnTres);
        btnCuatro = (Button)findViewById(R.id.btnCuatro);
        btnCinco = (Button)findViewById(R.id.btnCinco);
        btnSeis = (Button)findViewById(R.id.btnSeis);
        btnSiete = (Button)findViewById(R.id.btnSiete);

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
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "2");
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "3");
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "4");
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "5");
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "6");
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "7");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero2 = Integer.parseInt(etconcatenar.getText().toString(),8);
                if(operador.equals("+")){
                    etProceso.setText("");
                    resultado1 = numero1 + numero2;
                    resultado= Integer.toString(resultado1,8);
                }
                if(operador.equals("-")){
                    etProceso.setText("");
                    resultado1 = numero1 - numero2;
                    resultado= Integer.toString(resultado1,8);
                }
                if(operador.equals("*")){
                    etProceso.setText("");
                    resultado1 = numero1 * numero2;
                    resultado= Integer.toString(resultado1,8);
                }
                if(operador.equals("/")){
                    etProceso.setText("");
                    if(numero2 != 0){
                        resultado1 = numero1 / numero2;
                        resultado= Integer.toString(resultado1,8);
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
                numero1 = Integer.parseInt(etconcatenar.getText().toString(),8);
                etProceso.setText("");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Integer.parseInt(etconcatenar.getText().toString(),8);
                etProceso.setText("");
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Integer.parseInt(etconcatenar.getText().toString(),8);
                etProceso.setText("");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                numero1 = Integer.parseInt(etconcatenar.getText().toString(),8);
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
