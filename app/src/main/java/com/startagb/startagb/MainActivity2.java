//---------Farmer Login Activity---------------
package com.startagb.startagb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.startagb.startagb.databinding.FarmerLoginPgBinding;

import java.util.concurrent.TimeUnit;

public class MainActivity2 extends AppCompatActivity {

    private ImageView backbtn_from_fal;

    private FarmerLoginPgBinding flpgbng_binding;   //view binding


    private ProgressDialog pd; //progress dialog


    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        flpgbng_binding = FarmerLoginPgBinding.inflate(getLayoutInflater());//Initiate Layout binding
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); //sets default to dark mode
        setContentView(flpgbng_binding.getRoot());//call layout through binding

        //Phone auth
        flpgbng_binding.PhoneNumColumn.setVisibility(View.VISIBLE);
        flpgbng_binding.CodeVerColumn.setVisibility(View.GONE);
        flpgbng_binding.NumErrorMsg.setVisibility(View.GONE);
        flpgbng_binding.CodeErrorMsg.setVisibility(View.GONE);



        //Start
        flpgbng_binding.farmerNumContinue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
        flpgbng_binding.farmerCodeResend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
        flpgbng_binding.farmerCodeSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });


        create_back_button();
    }


    private void startPhoneNumberVer(String phone) {
        pd.setMessage("Verifying Phone Number");
        pd.show();


    }
    private void resendVerCode(String phone, PhoneAuthProvider.ForceResendingToken token) {
        pd.setMessage("Resending Code");
        pd.show();


    }

    private void VerifyPhoneNumberWithCode(String nVerificationId, String code) {


    }

    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {



    }












    public void create_back_button()
    {
        //Going back to choose role page/activity
        backbtn_from_fal = findViewById(R.id.backbtn_from_fal);
        backbtn_from_fal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                //Toast.makeText(MainActivity3.this, "agent sign in clicked", Toast.LENGTH_SHORT).show();
            }
        });
        //====================================
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}