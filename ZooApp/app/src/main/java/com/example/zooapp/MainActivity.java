package com.example.zooapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupAnimals();
        AnimalRepository instance=Animal;
       // AnimalRepository animalRepository = new AnimalRepository();

        private void setupAnimals() {


            //AnimalRepository repo = new AnimalRepository();
            Animal cat1 = new Animal();
            cat1.type = "Cat";
            cat1.name = "Garfield";
            cat1.sex = "Male";
            cat1.age = 12;

            Animal cat2 = new Animal();
            cat1.type = "Cat";
            cat1.name = "Deeba";
            cat1.sex = "Female";
            cat1.age = 8;
            instance.animals.add(cat1);
            instance.animals.add(cat2);


        }
    }
}

