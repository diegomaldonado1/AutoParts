package com.usa.autoparts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btniniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * agregar Logo en el menu principal
         */
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        /**
         * declarar accion clic de boton pantalla principal
         */

        btniniciar = (Button) findViewById(R.id.button_Iniciar);
        btniniciar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                /**
                 * ingresar al menu Productos
                 */

                Intent intent = new Intent(getApplicationContext(), ProductoActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Menu de Productos", Toast.LENGTH_LONG).show();
            }
        });

    }



}