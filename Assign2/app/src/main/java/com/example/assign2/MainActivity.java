package com.example.assign2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName,etpassword,etId;
    Button btAdd;
    RecyclerView user;
    String username;
    String password;
    String goodPassword="1234";
    String goodUsername="Arsh";
    private userAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user= findViewById(R.id.etName);
        layoutManager = new LinearLayoutManager(this);
        user.setLayoutManager(layoutManager);

        mAdapter = new userAdapter(getApplicationContext());
        user.setAdapter(mAdapter);

        final userRepository repository = userRepository.getInstance();


        etName = findViewById(R.id.etName);
        etpassword = findViewById(R.id.etpassword);
        etId=findViewById(R.id.etId);
        btAdd = findViewById(R.id.button);

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = etName.getText().toString();
                password=etpassword.getText().toString();
                if(goodPassword.equals(password)&& goodUsername.equals(username)){
                    Intent intent= new Intent(MainActivity.this,UserIdView.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }

                String password = etpassword.getText().toString();
                String name = etName.getText().toString();
                int id = Integer.parseInt(etId.getText().toString());



                user a = new user();

                a.name = name;
                a.Id = id;


                repository.adduser(a);

                mAdapter.update();


                etName.getText().clear();
                etId.getText().clear();
            }
        });


}
}