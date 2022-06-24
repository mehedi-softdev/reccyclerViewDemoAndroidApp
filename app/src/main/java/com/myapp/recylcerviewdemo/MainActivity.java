package com.myapp.recylcerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerContactView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerContactView = findViewById(R.id.recyclerContactView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Shruti Hasan",
                "shrutihasan.in@gmail.com",
                "https://i.pinimg.com/originals/49/ac/cf/49accf0c44d658223cd7c730e06acbbf.jpg"));
        contacts.add(new Contact("Nithya",
                "nithya.in@gmail.com",
                "https://static.toiimg.com/photo/msid-76735766/76735766.jpg"));
        contacts.add(new Contact("Shahrukh Khan",
                "kingkhan.in@gmail.com",
                "https://static.theprint.in/wp-content/uploads/2022/06/shah_rukh_khan_main_image20220605115333.jpg"));
        contacts.add(new Contact("Salman Khan",
                "salmankhan.in@gmail.com",
                "https://filmfare.wwmindia.com/content/2022/jun/salman-khan-sharp-shooters.jpg"));
        ContactRecViewAdapter recViewAdapter = new ContactRecViewAdapter(this);
        recViewAdapter.setContacts(contacts);
        recyclerContactView.setAdapter(recViewAdapter);

        recyclerContactView.setLayoutManager(new GridLayoutManager(this, 1));

    }
}