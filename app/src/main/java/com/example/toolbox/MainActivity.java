package com.example.toolbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int quote = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arraySpinner = new String[] {
                "White", "Blue", "Red", "Green", "Yellow"
        };
        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }

    public void changeBackground(View v){

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        String color = (String) spinner.getSelectedItem();

        ConstraintLayout backgroundLayout = (ConstraintLayout) findViewById(R.id.layout);

        //Drawables being used found here:
        //https://stackoverflow.com/questions/34289223/set-background-color-and-also-use-drawable-as-background-in-android

        if(color.equals("White")) {

            backgroundLayout.setBackground(getResources().getDrawable(R.drawable.white_background));
        }

        //Drawables

        if(color.equals("Blue")){

            backgroundLayout.setBackground(getResources().getDrawable(R.drawable.blue_background));
        }

        if(color.equals("Red")){

            backgroundLayout.setBackground(getResources().getDrawable(R.drawable.red_background));
        }

        if(color.equals("Green")){

            backgroundLayout.setBackground(getResources().getDrawable(R.drawable.green_background));
        }

        if(color.equals("Yellow")){

            backgroundLayout.setBackground(getResources().getDrawable(R.drawable.yellow_background));
        }

    }

    public void turnOffOtherButton(View v){

        RadioButton radio1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton radio2 = (RadioButton) findViewById(R.id.radioButton2);
        ImageView apple = (ImageView) findViewById(R.id.imageViewApple);
        ImageView banana = (ImageView) findViewById(R.id.imageViewBanana);

        if(radio1.isChecked()){

            radio2.setChecked(false);
            apple.setVisibility(v.VISIBLE);
            banana.setVisibility(v.INVISIBLE);
        }

        if(radio2.isChecked()){

            radio1.setChecked(false);
            apple.setVisibility(v.INVISIBLE);
            banana.setVisibility(v.VISIBLE);
        }


    }

    public void italicizeTitle(View v){

        CheckBox checkbox = (CheckBox) findViewById(R.id.checkBox);

        TextView title = (TextView) findViewById(R.id.textView);

        if(checkbox.isChecked()){


            String itTitle = "<font color='#ff0000'>W</font><font color='#ff2000'>e</font><font color='#ff4000'>l</font><font color='#ff5f00'>c</font><font color='#ff7f00'>o</font><font color='#ffaa00'>m</font><font color='#ffd400'>e</font><font color='#ffff00'> </font><font color='#bfff00'>T</font><font color='#80ff00'>o</font><font color='#40ff00'> </font><font color='#00ff00'>T</font><font color='#00ff40'>h</font><font color='#00ff80'>e</font><font color='#00ffbf'> </font><font color='#00ffff'>T</font><font color='#00aaff'>o</font><font color='#0055ff'>o</font><font color='#0000ff'>l</font><font color='#2300ff'>B</font><font color='#4600ff'>o</font><font color='#6800ff'>x</font><font color='#8b00ff'>!</font>";

            title.setText(Html.fromHtml(itTitle));
        }

        else{

            title.setText("Welcome To The ToolBox!");
        }
    }

    public void inspirationalQuote(View v){

        int newQuote = (int)(Math.random() * 5) + 1; //1,2,3,4,5

        TextView quoteText = (TextView) findViewById(R.id.textViewQuote); //<-- Create Text View and Start Here!!!

        if(newQuote == quote){

            inspirationalQuote(v);
        }

        else{

            if(newQuote == 1){

                quote = newQuote;

                String usedQuote = "Remember, licking doorknobs is illegal on other planets";

                quoteText.setText(usedQuote);

            }

            if(newQuote == 2){

                quote = newQuote;

                String usedQuote = "May the force be with you";

                quoteText.setText(usedQuote);

            }

            if(newQuote == 3){

                quote = newQuote;

                String usedQuote = "A man who spends no time with his family can never be a real man";

                quoteText.setText(usedQuote);

            }

            if(newQuote == 4){

                quote = newQuote;

                String usedQuote = "Serenity now, insanity later";

                quoteText.setText(usedQuote);

            }

            if(newQuote == 5){

                quote = newQuote;

                String usedQuote = "If you are good at something never do it for free";

                quoteText.setText(usedQuote);

            }




        }
    }


    public void secret(View v){

        Switch switchFlip = (Switch) findViewById(R.id.switch1);

        ImageView bonanza1 = (ImageView) findViewById(R.id.imageViewBonanza);

        ImageView bonanza2 = (ImageView) findViewById(R.id.imageViewBonanza2);

        ImageView bonanza3 = (ImageView) findViewById(R.id.imageViewBonanza3);

        TextView secretText = (TextView) findViewById(R.id.textViewSecret);

        if(switchFlip.isChecked()){

            bonanza1.setVisibility(View.VISIBLE);
            bonanza2.setVisibility(View.VISIBLE);
            bonanza3.setVisibility(View.VISIBLE);
            secretText.setVisibility(View.VISIBLE);
        }

        else{
            bonanza1.setVisibility(View.INVISIBLE);
            bonanza2.setVisibility(View.INVISIBLE);
            bonanza3.setVisibility(View.INVISIBLE);
            secretText.setVisibility(View.INVISIBLE);
        }


    }

}
