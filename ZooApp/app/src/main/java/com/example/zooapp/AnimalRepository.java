package com.example.zooapp;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository
{
    private static AnimalRepository instance;

    public List<Animal> animals;
   private AnimalRepository(){
       this.animals=new ArrayList<>();
   }
   public static AnimalRepository getInstance(){
       if (instance==null)
       {
           instance=new AnimalRepository();
       }
       return instance;
   }



}
