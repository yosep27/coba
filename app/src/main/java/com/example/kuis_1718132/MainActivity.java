package com.example.kuis_1718132;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kuis_1718132.keluarga;
import com.example.kuis_1718132.keluargaAdapter;

import java.util.ArrayList;

public class MainActivity  extends AppCompatActivity {

    private RecyclerView recyclerView;
    private keluargaAdapter keluargaAdapter;
    private ArrayList<keluarga>keluargaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recyclerview);
        keluargaAdapter = new keluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(keluargaAdapter);
    }
    private void tambahData(){
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new keluarga("Slamet Budi Santoso", "Bapak",  getDrawable(R.drawable.bapak)));
        keluargaArrayList.add(new keluarga("Lami", "Ibu", getDrawable(R.drawable.ibu)));
        keluargaArrayList.add(new keluarga("Febric Vanda Pratama", "Anak Pertama", getDrawable(R.drawable.kakak)));
        keluargaArrayList.add(new keluarga("Yosep Armindo Putra", "Anak Kedua", getDrawable(R.drawable.aku)));
        keluargaArrayList.add(new keluarga("Gadis Sanla Maria", "Anak Ketiga", getDrawable(R.drawable.adek)));
    }
}
