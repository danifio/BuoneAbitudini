package com.example.java.buoneabitudini;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button;


    //importo la creazione del file menu_main che conterrà il mio menù

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }


    //gestisco gli item del mio menù. ogni item è connesso ad una pagina

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        final Context context = this;
        int id=item.getItemId();
        switch(id)
        {
            case R.id.item1:
                //connesso a home
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);

                break;
            case R.id.item2:
                //connesso a page1
                Intent intent1 = new Intent(context, MainActivity2.class);
                startActivity(intent1);
                break;

            case R.id.item3:
                //connesso a page2
                Intent intent2 = new Intent(context, MainActivity2_2.class);
                startActivity(intent2);

                break;

            case R.id.item4:
                //connesso a page3
                Intent intent3 = new Intent(context, MainActivity3.class);
                startActivity(intent3);
                break;

            case R.id.item5:
                //connesso a page4
                Intent intent4 = new Intent(context, MainActivity4.class);
                startActivity(intent4);
                break;

            case R.id.item6:
                //connesso a page6
                Intent intent5 = new Intent(context, MainActivity4_2.class);
                startActivity(intent5);

                break;

            case R.id.item7:
                //connesso a page7
                Intent intent6 = new Intent(context, MainActivity5.class);
                startActivity(intent6);
                break;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton(); //richiamo la funzione al click del bottone
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //intent associato al click del bottone
                Intent intent = new Intent(context, MainActivity2.class); //al click sul bottone apre una nuova activity
                startActivity(intent);

            }

        });

    }



}

