package com.example.desoxyribonucleique;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text_view);
        AjoutBase ajoutBase = new AjoutBase(textView);
        findViewById(R.id.a).setOnClickListener(ajoutBase);
        findViewById(R.id.g).setOnClickListener(ajoutBase);
        findViewById(R.id.c).setOnClickListener(ajoutBase);
        findViewById(R.id.t).setOnClickListener(ajoutBase);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_parametres)
            return true;
        
        return super.onOptionsItemSelected(item);
    }
}