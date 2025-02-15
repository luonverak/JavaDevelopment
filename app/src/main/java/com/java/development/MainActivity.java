package com.java.development;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.java.development.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Initialize view binding
    private ActivityMainBinding binding;
    private AdapterUser adapterUser;
    private  RecyclerView recyclerView;

    List<UserModel> list=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        list.add(new UserModel(1,"Sok",1.80,60,23));
        list.add(new UserModel(2,"Thyda",1.60,50,23));

        adapterUser = new AdapterUser(list,this);

        recyclerView = binding.listUsers;
        recyclerView.setAdapter(adapterUser);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        binding.tbnAdd.setOnClickListener(v-> {
            startActivity(new Intent(this, DetailActivity.class));
            finish();
        });

    }
}
