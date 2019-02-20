package com.makerspace.tinycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int number = 0;
    private int numberTwo = 0;
    private int mathOpeartion = -1;
    private boolean isFirstNumber = true;
    private TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_show = findViewById(R.id.tv_show);
        tv_show.setText(""+number);

    }


    public void onClickButton(View view){

        switch (view.getId()){
            case R.id.bt_clear_all:
                number  = numberTwo = 0;
                isFirstNumber = true;
                break;
            //if button one was clicked
            case R.id.bt_one: if(isFirstNumber){
                number = number * 10 + 1;
            }else{
                numberTwo = numberTwo * 10 + 1;
            }
                break;

            //if button two was clicked
            case R.id.bt_two: if(isFirstNumber){
                number = number * 10 + 2;
            }else{
                numberTwo = numberTwo * 10 + 2;
            }
                break;

            //if button threee was clicked
            case R.id.bt_three: if(isFirstNumber){
                number = number * 10 + 3;
            }else{
                numberTwo = numberTwo * 10 + 3;
            }
                break;


                //divide mult minus plus
            case R.id.bt_divide: if(isFirstNumber){
                isFirstNumber = false;
                mathOpeartion = R.id.bt_divide;
            }
            break;

            case R.id.bt_equal:
                numberTwo = number / numberTwo;

        }

        if(isFirstNumber){
            tv_show.setText("" + number);
        }else{
            tv_show.setText("" + numberTwo);
        }


        //Toast.makeText(this, "Button was clicked yeaahh"+view.getId(), Toast.LENGTH_SHORT).show();
    }


}

