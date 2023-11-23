package com.exmaple.lookup.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.exmaple.lookup.R;
import com.exmaple.lookup.databinding.ActivityStartUpBinding;
import com.exmaple.lookup.fragments.StartUp;

public class StartUpActivity extends AppCompatActivity {

    private ActivityStartUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStartUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}