package com.java.development;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
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
    }
}