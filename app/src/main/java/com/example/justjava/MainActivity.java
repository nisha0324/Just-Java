package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int noOfCoffee;
    int pricePerCoffee = 10;
    int price;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void showCount(View view) {
            noOfCoffee++;
            TextView showCount = (TextView) findViewById(R.id.count_textView);
            showCount.setText(""+noOfCoffee);
        }

        public void showPrice(View view) {
            price = noOfCoffee * pricePerCoffee;
            TextView showPrice = (TextView) findViewById(R.id.price_textView);
            showPrice.setText("$"+price);
        }

        public void decCount(View view) {
            noOfCoffee--;
            TextView showCount = (TextView) findViewById(R.id.count_textView);
            showCount.setText(""+noOfCoffee);
        }

        public void placeOrder(View view) {

            Toast toast =  Toast.makeText(this,"Order placed",Toast.LENGTH_SHORT);
            toast.show();

            reset();

        }

        public void reset(){

            noOfCoffee = 0;
            price = 0;

            TextView showCount = (TextView) findViewById(R.id.count_textView);
            showCount.setText(""+noOfCoffee);

            TextView showPrice = (TextView) findViewById(R.id.price_textView);
            showPrice.setText("$"+price);
        }

}