package com.bhargab.bharjiticalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StandardCalculator extends AppCompatActivity {

    private boolean isOpPressed = false;

    private double firstNumber = 0;
    private int secondNumberIndex = 0;
    private char currentOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_standard_calculator );



        final TextView calculatorScreen = findViewById(R.id.calculatorScreen);

        final Button n0 = findViewById(R.id.zerobtn);
        final Button n1 = findViewById(R.id.onebtn);
        final Button n2 = findViewById(R.id.twobtn);
        final Button n3 = findViewById(R.id.threebtn);
        final Button n4 = findViewById(R.id.fourbtn);
        final Button n5 = findViewById(R.id.fivebtn);
        final Button n6 = findViewById(R.id.sixbtn);
        final Button n7 = findViewById(R.id.sevenbtn);
        final Button n8 = findViewById(R.id.eightbtn);
        final Button n9 = findViewById(R.id.ninebtn);
        final Button dot = findViewById(R.id.pointbtn);
        final Button equals= findViewById(R.id.equalbtn);
        final Button addition = findViewById(R.id.plusbtn);
        final Button subtraction = findViewById(R.id.minusbtn);
        final Button multiplication = findViewById(R.id.multiplybtn);
        final Button division = findViewById(R.id.dividebtn);




        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id){
                    case R.id.zerobtn:
                        calculatorScreen.append("0");
                        break;
                    case R.id.onebtn:
                        calculatorScreen.append("1");
                        break;
                    case R.id.twobtn:
                        calculatorScreen.append("2");
                        break;
                    case R.id.threebtn:
                        calculatorScreen.append("3");
                        break;
                    case R.id.fourbtn:
                        calculatorScreen.append("4");
                        break;
                    case R.id.fivebtn:
                        calculatorScreen.append("5");
                        break;
                    case R.id.sixbtn:
                        calculatorScreen.append("6");
                        break;
                    case R.id.sevenbtn:
                        calculatorScreen.append("7");
                        break;
                    case R.id.eightbtn:
                        calculatorScreen.append("8");
                        break;
                    case R.id.ninebtn:
                        calculatorScreen.append("9");
                        break;
                    case R.id.pointbtn:
                        calculatorScreen.append( "." );
                        break;
                    case R.id.equalbtn:
                        if(isOpPressed){
                            if(currentOp=='+'){
                                String screenContent = calculatorScreen.getText().toString();
                                String secondNumberString = screenContent.substring(secondNumberIndex);
                                double secondNumber = Double.parseDouble(secondNumberString);
                                secondNumber += firstNumber;
                                calculatorScreen.setText(String.valueOf(secondNumber));
                            }
                        }


                        if(isOpPressed){
                            if(currentOp=='-'){
                                String screenContent = calculatorScreen.getText().toString();
                                String secondNumberString = screenContent.substring(secondNumberIndex);
                                double secondNumber = Double.parseDouble(secondNumberString);
                                firstNumber -= secondNumber;
                                calculatorScreen.setText(String.valueOf(firstNumber));
                            }
                        }

                        if(isOpPressed){
                            if(currentOp=='*'){
                                String screenContent = calculatorScreen.getText().toString();
                                String secondNumberString = screenContent.substring(secondNumberIndex);
                                double secondNumber = Double.parseDouble(secondNumberString);
                                secondNumber*=firstNumber;
                                calculatorScreen.setText(String.valueOf(secondNumber));
                            }
                        }

                        if(isOpPressed){
                            if(currentOp=='/'){
                                String screenContent = calculatorScreen.getText().toString();
                                String secondNumberString = screenContent.substring(secondNumberIndex);
                                double secondNumber = Double.parseDouble(secondNumberString);
                                firstNumber/=secondNumber;
                                calculatorScreen.setText(String.valueOf(firstNumber));
                            }
                        }

                        break;

                    case R.id.plusbtn:
                        String screenContent = calculatorScreen.getText().toString();
                        secondNumberIndex = screenContent.length()+1;
                        firstNumber = Double.parseDouble(screenContent);
                        calculatorScreen.append("+");
                        isOpPressed = true;
                        currentOp = '+';
                        break;
                    case R.id.minusbtn:
                        String screenContent1 = calculatorScreen.getText().toString();
                        secondNumberIndex = screenContent1.length()+1;
                        firstNumber = Double.parseDouble(screenContent1);
                        calculatorScreen.append("-");
                        isOpPressed = true;
                        currentOp = '-';
                        break;
                    case R.id.multiplybtn:
                        String screenContent2 = calculatorScreen.getText().toString();
                        secondNumberIndex = screenContent2.length()+1;
                        firstNumber = Double.parseDouble(screenContent2);
                        calculatorScreen.append("×");
                        isOpPressed = true;
                        currentOp = '*';
                        break;
                    case R.id.dividebtn:
                        String screenContent3 = calculatorScreen.getText().toString();
                        secondNumberIndex = screenContent3.length()+1;
                        firstNumber = Double.parseDouble(screenContent3);
                        calculatorScreen.append("/");
                        isOpPressed = true;
                        currentOp = '/';
                        break;
                    default:
                        throw new IllegalStateException( "Unexpected value: " + id );
                }
            }
        };
        n0.setOnClickListener(calculatorListener);
        n1.setOnClickListener(calculatorListener);
        n2.setOnClickListener(calculatorListener);
        n3.setOnClickListener(calculatorListener);
        n4.setOnClickListener(calculatorListener);
        n5.setOnClickListener(calculatorListener);
        n6.setOnClickListener(calculatorListener);
        n7.setOnClickListener(calculatorListener);
        n8.setOnClickListener(calculatorListener);
        n9.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        equals.setOnClickListener(calculatorListener);
        addition.setOnClickListener(calculatorListener);
        subtraction.setOnClickListener(calculatorListener);
        multiplication.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);



        final Button delete = findViewById(R.id.deletebtn);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displayedElements = calculatorScreen.getText().toString();
                int length =  displayedElements.length();
                if(length > 0){
                    displayedElements = displayedElements.substring(0,length-1);
                    calculatorScreen.setText(displayedElements);
                }
            }
        });
        final Button cleareverything = findViewById(R.id.clearrbtn);
        cleareverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.setText("");
            }
        });

        final Button goToScientificActivity = findViewById(R.id.goToScientificActivity);
        goToScientificActivity.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( StandardCalculator.this, ScientificCalculator.class ) );
            }
        } );

    }

}
