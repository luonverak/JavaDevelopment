package com.java.development.screen.activity;

import static com.java.development.data.model.UserModel.list;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.java.development.data.model.UserModel;
import com.java.development.databinding.ActivityDetailActivityBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetailActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tbnExit.setOnClickListener(v-> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });

        binding.btnSave.setOnClickListener(v -> {

            String fullName = binding.fullname.getText().toString();
            double height = Double.parseDouble(binding.height.getText().toString());
            String weight = binding.weight.getText().toString();
            String age = binding.age.getText().toString();

            if (fullName.isEmpty() || fullName.isBlank() || height == 0.0 || weight.isEmpty() || weight.isBlank() || age.isEmpty() || age.isBlank()) {
                Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show();
                return;
            }

            int id;
            if (!list.isEmpty()) {
                id = list.get(list.size() - 1).getId() + 1;
            } else {
                id = 1;
            }

            list.add(new UserModel(id, fullName, height, Double.parseDouble(weight), Integer.parseInt(age)));
            Toast.makeText(this, "Save success", Toast.LENGTH_LONG).show();
        });

    }
}