/*
* Practica 1 apps moviles
* figuras geométricas
* Estudiante: Daniel Londoño Echeverri
* cc: 1036946657
* Universidad de Antioquia
* Medellín Colombia
* Febrero 2017
* */
package com.daniellondono.geaometrialondo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    private View contenedorCuadro;  //Contenedor para mostrar cuadro
    private View contenedorCirculo; //Contenedor para mostrar circulo
    private View contenedorTriangulo;
    private View contenedorCubo;
    private View contenedorVolumen;
    EditText Longitud;  //Variable para recibir la medida
    TextView PerimetroNumero;   //Variable para mostar el perímetro
    TextView AreaNumero;   //Variable para mostar el area
    TextView VolumenNumero;
    float Perimetro;    //Variable para calcular el perímetro
    float Area;    //Variable para calcular el area
    float Volumen;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contenedorCuadro = findViewById(R.id.ll_contenedor_Cuadro);
        contenedorCirculo = findViewById(R.id.ll_contenedor_Circulo);
        contenedorTriangulo = findViewById(R.id.ll_contenedor_Triangulo);
        contenedorCubo = findViewById(R.id.ll_contenedor_Cubo);
        contenedorVolumen = findViewById(R.id.Contenedor_Volumen);
        Longitud = (EditText) findViewById(R.id.et_Longitud);
        PerimetroNumero = (TextView) findViewById(R.id.PerimetroNumero);
        AreaNumero = (TextView) findViewById(R.id.AreaNumero);
        VolumenNumero = (TextView) findViewById(R.id.VolumenNumero);
    }

    public void onRadioButton(View view)
    {
        boolean marcado = ((RadioButton) view).isChecked(); //Revisar cual botón está marcado

        switch (view.getId())
        {
            case R.id.Cuadro:
                if (marcado)
                {
                    //Aritmética y mostrar resultados
                    Perimetro= 4*Float.valueOf(Longitud.getText().toString());
                    PerimetroNumero.setText("Perimetro = "+Float.toString(Perimetro));
                    Area= Float.valueOf(Longitud.getText().toString())*Float.valueOf(Longitud.getText().toString());
                    AreaNumero.setText("Area = "+Float.toString(Area));
                    //Visibilidad de elementos
                    contenedorCuadro.setVisibility(View.VISIBLE);
                    contenedorCirculo.setVisibility(View.GONE);
                    contenedorTriangulo.setVisibility(View.GONE);
                    contenedorCubo.setVisibility(View.GONE);
                    contenedorVolumen.setVisibility(View.GONE);
                }
                break;

            case R.id.Circulo:
                if (marcado)
                {
                    Perimetro=2*Float.valueOf(Longitud.getText().toString())*(float)Math.PI;
                    PerimetroNumero.setText("Perimetro = "+Float.toString(Perimetro));
                    Area= Float.valueOf(Longitud.getText().toString())*Float.valueOf(Longitud.getText().toString())*(float)Math.PI;
                    AreaNumero.setText("Area = "+Float.toString(Area));

                    contenedorCuadro.setVisibility(View.GONE);
                    contenedorCirculo.setVisibility(View.VISIBLE);
                    contenedorTriangulo.setVisibility(View.GONE);
                    contenedorCubo.setVisibility(View.GONE);
                    contenedorVolumen.setVisibility(View.GONE);
                }
                break;

            case R.id.Triangulo:
                if (marcado)
                {
                    Perimetro= 3*Float.valueOf(Longitud.getText().toString());
                    PerimetroNumero.setText("Perimetro = "+Float.toString(Perimetro));
                    Area= Float.valueOf(Longitud.getText().toString())*Float.valueOf(Longitud.getText().toString())*(float)0.5;
                    AreaNumero.setText("Area = "+Float.toString(Area));

                    contenedorCuadro.setVisibility(View.GONE);
                    contenedorCirculo.setVisibility(View.GONE);
                    contenedorTriangulo.setVisibility(View.VISIBLE);
                    contenedorCubo.setVisibility(View.GONE);
                    contenedorVolumen.setVisibility(View.GONE);
                }
                break;

            case R.id.Cubo:
                if (marcado)
                {
                    //Aritmética y mostrar resultados
                    Perimetro= 4*Float.valueOf(Longitud.getText().toString());
                    PerimetroNumero.setText("Perimetro = "+Float.toString(Perimetro));
                    Area= Float.valueOf(Longitud.getText().toString())*Float.valueOf(Longitud.getText().toString());
                    AreaNumero.setText("Area = "+Float.toString(Area));
                    Volumen= Float.valueOf(Longitud.getText().toString())*Float.valueOf(Longitud.getText().toString())*Float.valueOf(Longitud.getText().toString());
                    VolumenNumero.setText("Volumen = "+Float.toString(Volumen));
                    //Visibilidad de elementos
                    contenedorCuadro.setVisibility(View.GONE);
                    contenedorCirculo.setVisibility(View.GONE);
                    contenedorTriangulo.setVisibility(View.GONE);
                    contenedorCubo.setVisibility(View.VISIBLE);
                    contenedorVolumen.setVisibility(View.VISIBLE);
                }
                break;
        }
    }
}
