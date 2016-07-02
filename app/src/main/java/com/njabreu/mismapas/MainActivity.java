package com.njabreu.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapa(View v)
    {
        Intent i = new Intent(this, MapsActivity.class);
        switch(v.getId())
        {
            case R.id.ibGetsemani:
                i.putExtra("latitud", 19.305260028808554);
                i.putExtra("longitud", -70.27690251499024);
                i.putExtra("lugar", "Getsemani");
                break;
            case R.id.ibLomaQuitaEspuela:
                i.putExtra("latitud", 19.365555602633776);
                i.putExtra("longitud", -70.15499999999997);
                i.putExtra("lugar", "Loma Quita Espuela");
                break;
            case R.id.ibSaltoDeJimenoaJarabacoa:
                i.putExtra("latitud", 19.091779705496513);
                i.putExtra("longitud", -70.597938);
                i.putExtra("lugar", "Salto de Jimenoa");
                break;
            case R.id.ibSaltoDelLimonSamana:
                i.putExtra("latitud", 19.270374200117587);
                i.putExtra("longitud", -69.44616795714717);
                i.putExtra("lugar", "Salto del Limón");
                break;
        }
        startActivity(i);

    }
}
