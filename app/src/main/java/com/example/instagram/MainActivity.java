package com.example.instagram;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.instagram.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private NavController controller;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        controller = Navigation.findNavController(this, R.id.nav_host_fragment);
    }

    private int initBottomNavigation(int fragment_story) {
        binding.bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_home:
                        break;
                    case R.id.item_search:
                        break;
                    case R.id.item_add:
                        break;
                    case R.id.item_lake:
                        break;
                    case R.id.item_profile:
                        break;
                }
                return true;
            }
        });

        controller.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController navController, @NonNull NavDestination destination, @Nullable Bundle bundle) {
                switch (destination.getId()) {
                    case R.id.storyFragment:
                        binding.bottomNavigation.setVisibility(View.GONE);
                        break;
                    default:
                        binding.bottomNavigation.setVisibility(View.VISIBLE);
                }
            }
        });
        return fragment_story;
    }
}