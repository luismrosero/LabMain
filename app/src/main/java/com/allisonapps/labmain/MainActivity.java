package com.allisonapps.labmain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private KenBurnsView kbvMain;
    private Button btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // relacionamos la vista con los views
        setViews();

        //llenar el view KEN... con picasso
        Picasso.with(this).load("https://i.pinimg.com/originals/69/e7/4a/69e74a27dde130eade415851691bbdd0.jpg")
                .fit().into(kbvMain);

        //lineas para cambiar el color de estatus bar
        getWindow().setStatusBarColor(getResources().getColor(R.color.colorAccent));



    }

    private void setViews() {

        kbvMain = findViewById(R.id.kbv_main);
        btnMain = findViewById(R.id.btn_main);

    }
}
