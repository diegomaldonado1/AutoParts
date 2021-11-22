package com.usa.autoparts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ProductoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Productos");
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_inicial, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){



        int id = item.getItemId();
        if(id == R.id.menuServicios){
            Intent intent = new Intent(getApplicationContext(), ServicioActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Usted ha seleccionado la opción menu servicio", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.menuSucursales){
            Intent intent = new Intent(getApplicationContext(), SucursalesActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Usted ha seleccionado la opción menu sucursales", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.menuProductos){
            Intent intent = new Intent(getApplicationContext(), ProductoActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Usted ha seleccionado la opción menu Productos", Toast.LENGTH_LONG).show();

        }

        return super.onOptionsItemSelected(item);


    }

}