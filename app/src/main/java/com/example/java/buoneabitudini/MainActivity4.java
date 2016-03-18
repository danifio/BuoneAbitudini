package com.example.java.buoneabitudini;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity4 extends AppCompatActivity {

    //riporto il codice per la creazione del menu e per connettere ogni item alle rispettive pagine

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        final Context context = this;
        int id=item.getItemId();
        switch(id)
        {
            case R.id.item1:

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);

                break;
            case R.id.item2:

                Intent intent1 = new Intent(context, MainActivity2.class);
                startActivity(intent1);
                break;

            case R.id.item3:

                Intent intent2 = new Intent(context, MainActivity2_2.class);
                startActivity(intent2);

                break;

            case R.id.item4:

                Intent intent3 = new Intent(context, MainActivity3.class);
                startActivity(intent3);
                break;

            case R.id.item5:

                Intent intent4 = new Intent(context, MainActivity4.class);
                startActivity(intent4);
                break;

            case R.id.item6:

                Intent intent5 = new Intent(context, MainActivity4_2.class);
                startActivity(intent5);

                break;

            case R.id.item7:
                Intent intent6 = new Intent(context, MainActivity5.class);
                startActivity(intent6);
                break;
        }
        return false;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    final Context context = this;
    //controllo dei bottoni back e next
    public void Back4(View arg0){

        Intent intent = new Intent(context, MainActivity3.class);
        startActivity(intent);
    }

    public void Next4(View arg0){
        Intent intent = new Intent(context, MainActivity4_2.class);
        startActivity(intent);
    }

}

