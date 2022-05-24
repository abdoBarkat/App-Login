package com.univ_bechar_dz.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
public EditText login;
public EditText f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
login=findViewById(R.id.loginbtn);
f =findViewById(R.id.affichtext);

login.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View v) {
        openHome();
    }


});

//MainActivity ma =new MainActivity();
// f.setText(ma.un.getText());


    }
    public void openHome(){
        Intent intent= new Intent(this,Home.class);
        startActivity(intent);
    }
}