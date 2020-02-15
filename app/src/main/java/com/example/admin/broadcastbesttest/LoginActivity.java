package com.example.admin.broadcastbesttest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends BaseActivity{
private EditText email;
    private EditText password;
    private Button button;
    private CheckBox checkBox;
    private SharedPreferences.Editor editor;
    private  SharedPreferences prf;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        imageView=(ImageView)findViewById(R.id.imgw);
        imageView.setImageResource(R.drawable.imgd1);
        ImageView imageView1=(ImageView)findViewById(R.id.imgw2);
        imageView1.setImageResource(R.drawable.imgd2);
        button=(Button)findViewById(R.id.email_sign_in_button);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password) ;
        checkBox=(CheckBox)findViewById(R.id.checkbox_1);
        prf= PreferenceManager.getDefaultSharedPreferences(this);
        editor=prf.edit();
        boolean right=prf.getBoolean("right",false);
        if(right) {
            email.setText(prf.getString("emailtext", ""));
            password.setText(prf.getString("password", ""));
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String accout=email.getText().toString();
                String mima=password.getText().toString();
                if(checkBox.isChecked()){
                    editor.putString("emailtext",email.getText().toString());
                    editor.putString("password",password.getText().toString());
                }
                if(accout.equals("shilinxiu")&&mima.equals("990624"))
                {
                    if(checkBox.isChecked()){
                        editor.putString("emailtext",email.getText().toString());
                        editor.putString("password",password.getText().toString());
                        editor.putBoolean("right",true);
                    }
                    else {
                        editor.clear();
                    }
                    editor.apply();
                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(LoginActivity.this,"不正确，可以问问大宝贝哟",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
