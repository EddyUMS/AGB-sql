package com.startagb.startagb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.startagb.startagb.databinding.ActivityFarmerHomeBinding;

public class FarmerHome extends AppCompatActivity {

    private ActivityFarmerHomeBinding fh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


             //logouts the user
        fh.LGbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void checkUserStatus() {
      

    }
}