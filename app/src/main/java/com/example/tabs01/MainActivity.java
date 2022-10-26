package com.example.tabs01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TabHost contenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contenedor = (TabHost) findViewById(R.id.contenedorTabs);

        TabHost.TabSpec spect1 = contenedor.newTabSpec("mitab1");
        spect1.setContent(R.id.tab1);
        spect1.setIndicator("",getResources().getDrawable(android.R.drawable.ic_dialog_dialer));

        contenedor.addTab(spect1);

        TabHost.TabSpec spect2 = contenedor.newTabSpec("mitab2");
        spect2.setContent(R.id.tab2);
        spect2.setIndicator("",getResources().getDrawable(android.R.drawable.ic_input_add));

        contenedor.addTab(spect2);


        TabHost.TabSpec spect3 = contenedor.newTabSpec("mitab3");
        spect3.setContent(R.id.tab3);
        spect3.setIndicator("",getResources().getDrawable(android.R.drawable.ic_lock_lock));

        contenedor.addTab(spect3);

        contenedor.setCurrentTab(0);

        contenedor.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {

                Object tabId;
                Toast.makeText(getApplicationContext(),"se apreto la pestaña" + tabId.toast.LENGTH_SHORT).show();
            }
        });
    }
}