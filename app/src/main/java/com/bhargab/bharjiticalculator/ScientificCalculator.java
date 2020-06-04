package com.bhargab.bharjiticalculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScientificCalculator extends AppCompatActivity {
    TextView calculatorScreen;
    float mValueOne , mValueTwo ;
    double a;
    double ans=0;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision,mReminder ,
            mNoPower,istpower2ndno,mSin,mArithmetic,mCos,mTan,mSinH,mCosH,mTanH;
    boolean piecheck=false;
    Button  clearbutton,
            dividebutton,
            multiplybutton,
            deletebutton,
            button7,
            button8,
            button9,
            minusbutton,
            button4,
            button5,
            button6,
            plusbutton,
            button1,
            button2,
            button3,
            percentagebutton,
            button0,
            pointbutton,
            equalbutton,
            xcubebutton,
            squarebutton,
            xfactorialbutton,
            logbutton,
            exponentbutton,
            lnbutton,
            sinbutton,
            cosbutton,
            tanbutton,
            oneoverxbutton,
            sinhbutton,
            coshbutton,
            tanhbutton,
            varpower,
            cuberoot,
            tenexponent,
            piebutton,
            squarerootbutton,
            nasbutton,
            cuberootbutton,
            modulosbutton,
            varNoPower,
            epowerbtn,
            stpower2nd,
            ansbuttton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);


        calculatorScreen=(TextView) findViewById(R.id.calculatorScreen );
        clearbutton=(Button) findViewById(R.id.clearrbtn);
        dividebutton=(Button) findViewById(R.id.dividebtn);
        multiplybutton=(Button) findViewById(R.id.multiplybtn);
        deletebutton=(Button) findViewById(R.id.deletebtn);
        button7=(Button) findViewById(R.id.sevenbtn);
        button8=(Button) findViewById(R.id.eightbtn);
        button9=(Button) findViewById(R.id.ninebtn);
        minusbutton=(Button) findViewById(R.id.minusbtn);
        button4=(Button) findViewById(R.id.fourbtn);
        button5=(Button) findViewById(R.id.fivebtn);
        button6=(Button) findViewById(R.id.sixbtn);
        plusbutton=(Button) findViewById(R.id.plusbtn);
        button1=(Button) findViewById(R.id.onebtn);
        button2=(Button) findViewById(R.id.twobtn);
        button3=(Button) findViewById(R.id.threebtn);
        percentagebutton=(Button) findViewById(R.id.goToScientificActivity );
        button0=(Button) findViewById(R.id.zerobtn);
        pointbutton=(Button) findViewById(R.id.pointbtn);
        equalbutton=(Button) findViewById(R.id.equalbtn);
        squarebutton=(Button) findViewById(R.id.squarebtn);
        xcubebutton=(Button) findViewById(R.id.xcubebtn);
        oneoverxbutton=(Button) findViewById(R.id.onedividebtn);
        exponentbutton=(Button) findViewById(R.id.expbtn);
        logbutton=(Button) findViewById(R.id.logbtn);
        squarerootbutton=(Button) findViewById(R.id.squarerootbtn);
        xfactorialbutton=(Button) findViewById(R.id.xfactorialbtn);
        sinbutton=(Button) findViewById(R.id.sinbtn);
        cosbutton=(Button) findViewById(R.id.cosbtn);
        tanbutton=(Button)findViewById(R.id.tanbtn);
        sinhbutton=(Button)findViewById(R.id.sinhbtn);
        coshbutton=(Button)findViewById(R.id.coshbtn);
        tanhbutton=(Button)findViewById(R.id.tanhbtn);
        lnbutton=(Button) findViewById(R.id.lnbtn) ;
        ansbuttton=(Button) findViewById(R.id.ansbtn);
        piebutton=(Button) findViewById(R.id.piebtn);
        deletebutton=(Button) findViewById(R.id.deletebtn);
        tenexponent=(Button) findViewById(R.id.tenexponent) ;
        cuberootbutton=(Button)findViewById(R.id.cuberootbtn);
        modulosbutton=(Button)findViewById(R.id.modulousbtn);
        varNoPower=(Button)findViewById(R.id.varpowerbtn);
        epowerbtn=(Button) findViewById(R.id.epowerbtn);
        stpower2nd=(Button) findViewById(R.id.istpower2nd);


        stpower2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    mValueOne = Float.parseFloat(calculatorScreen.getText() + "");
                    istpower2ndno = true;
                    calculatorScreen.setText(null);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        epowerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double n = Double.parseDouble(calculatorScreen.getText().toString());
                    Double exp = (Double) Math.pow(2.718281828, n);
                    calculatorScreen.setText(exp+"");
                }
                catch (Exception e){
                    e.printStackTrace();

                }

            }
        });
        varNoPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ScientificCalculator.this, StandardCalculator.class);
                startActivity(intent);

            }
        });
        modulosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mValueOne = Float.parseFloat(calculatorScreen.getText() + "");
                    mReminder = true;
                    calculatorScreen.setText(null);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        cuberootbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.cbrt(Double.parseDouble(calculatorScreen.getText().toString()));
                    calculatorScreen.setText("");
                    calculatorScreen.setText(calculatorScreen.getText().toString() + a);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        tenexponent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    int n= Integer.parseInt(calculatorScreen.getText().toString());
                    int exp = (int) Math.pow(10, n);
                    calculatorScreen.setText(exp+"");
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        deletebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String str;
                    str = calculatorScreen.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    calculatorScreen.setText(str);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        piebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(Math.PI + "");
            }
        });
        lnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Double.parseDouble(calculatorScreen.getText().toString());
                    double result = (Math.log(a));
                    calculatorScreen.setText("ln" + calculatorScreen.getText().toString() + " = " + result);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        tanhbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText("tanh");
                mTanH=true;
            }
        });
        coshbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText("cosh");
                mCosH=true;
            }
        });
        sinhbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText("sinh");
                mSinH=true;

            }
        });
        sinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText("sin");
                mSin=true;
            }
        });
        cosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText("cos");
                mCos=true;
            }
        });
        tanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText("tan");
                mTan=true;
            }
        });
        xfactorialbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Double.parseDouble(calculatorScreen.getText().toString());
                    int er = 0;
                    double i, s = 1;
                    if (a< 0) {
                        er = 20;
                    }
                    else {

                        for (i = 2; i <= a; i += 1.0)
                            s *= i;
                    }
                    calculatorScreen.setText("");
                    calculatorScreen.setText(calculatorScreen.getText().toString() + s);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        squarerootbutton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                try {
                    a = Math.sqrt(Double.parseDouble(calculatorScreen.getText().toString()));
                    calculatorScreen.setText("\u221a" + calculatorScreen.getText().toString()
                            + " = " + a);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        logbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.log10(Double.parseDouble(calculatorScreen.getText().toString()));
                    calculatorScreen.setText("log" + calculatorScreen.getText().toString()+ " = ");
                    calculatorScreen.setText(calculatorScreen.getText().toString() + a);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        exponentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.append(Math.E + "");
            }
        });
        oneoverxbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = 1 / Double.parseDouble(calculatorScreen.getText().toString());
                    calculatorScreen.setText("");
                    calculatorScreen.setText(calculatorScreen.getText().toString() + a);
                }
                catch(Exception e){
                }
            }
        });
        squarebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try{
                    a = Math.pow(Double.parseDouble(calculatorScreen.getText().toString()), 2);
                    calculatorScreen.setText("");
                    calculatorScreen.setText(calculatorScreen.getText().toString() + a+"");
                }
                catch (Exception e){

                }
            }
        });
        xcubebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Math.pow(Double.parseDouble(calculatorScreen.getText().toString()), 3);
                    calculatorScreen.setText("");
                    calculatorScreen.setText(calculatorScreen.getText().toString() + a);
                }
                catch (Exception e){

                }
            }
        });
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText("");
            }
        });
        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(null);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.append("1");
                mArithmetic=true;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.append("2");
                mArithmetic=true;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.append("3");
                mArithmetic=true;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.append("4");
                mArithmetic=true;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.append("5");
                mArithmetic=true;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.append("6");
                mArithmetic=true;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.append("7");
                mArithmetic=true;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.append("8");
                mArithmetic=true;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.append("9");
                mArithmetic=true;
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.append("0");
                mArithmetic=true;
            }
        });

        plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    mValueOne = Float.parseFloat(calculatorScreen.getText() + "");
                    mAddition = true;
                    calculatorScreen.setText(null);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        minusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(calculatorScreen.getText() + "");
                    mSubtract = true;
                    calculatorScreen.setText(null);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        multiplybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mValueOne = Float.parseFloat(calculatorScreen.getText() + "");
                    mMultiplication = true;
                    calculatorScreen.setText(null);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    mValueOne = Float.parseFloat(calculatorScreen.getText() + "");
                    mDivision = true;
                    calculatorScreen.setText(null);
                }
                catch (Exception e) {
                   e.printStackTrace();
                }
            }
        });

        equalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                if(mSin){
                    if(mArithmetic){
                        String str = calculatorScreen.getText().toString();
                        str = str.substring(3);
                        a = Math.sin(Math.toRadians(Double.parseDouble(str)));
                        calculatorScreen.setText(a + str);
                        mArithmetic=false;
                        mSin=false;
                    }

                }
                if(mCos){
                    if(mArithmetic){
                        String str;
                        str = calculatorScreen.getText().toString();
                        str = str.substring(3);
                        double b = Math.toRadians(Double.parseDouble(str));
                        a=Math.cos(b);
                        calculatorScreen.setText(a+"");
                        mArithmetic=false;
                        mCos=false;
                    }
                }
                if(mTan){
                    if(mArithmetic){
                        String str;
                        str=calculatorScreen.getText().toString();
                        str=str.substring(3);
                        a=Math.tan(Math.toRadians(Double.parseDouble(str)));
                        calculatorScreen.setText(a+"");
                        mArithmetic=false;
                        mTan=false;
                    }
                }
                if(mSinH){
                    if(mArithmetic){
                        String str;
                        str=calculatorScreen.getText().toString();
                        str=str.substring(4);
                        a=Math.sinh(Double.parseDouble(str));
                        calculatorScreen.setText(a+"");
                        mArithmetic=false;
                        mSinH=false;
                    }

                }
                if(mCosH){
                    if(mArithmetic){
                        String str;
                        str=calculatorScreen.getText().toString();
                        str=str.substring(4);
                        a=Math.cosh(Double.parseDouble(str));
                        calculatorScreen.setText(a+"");
                        mArithmetic=false;
                        mCosH=false;
                    }

                }
                if(mTanH){
                    if(mArithmetic){
                        String str;
                        str=calculatorScreen.getText().toString();
                        str=str.substring(4);
                        a=Math.cosh(Double.parseDouble(str));
                        calculatorScreen.setText(a+"");
                        mArithmetic=false;
                        mTanH=false;
                    }
                }
                if (istpower2ndno){
                    mValueTwo = Float.parseFloat(calculatorScreen.getText() + "");
                    int exp = (int) Math.pow(mValueOne, mValueTwo);
                    calculatorScreen.setText(exp+"");
                    istpower2ndno=false;
                }
                if (mAddition){
                    mValueTwo = Float.parseFloat(calculatorScreen.getText() + "");
                    calculatorScreen.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }
                if (mReminder){
                    mValueTwo = Float.parseFloat(calculatorScreen.getText() + "");
                    calculatorScreen.setText(mValueOne % mValueTwo +"");
                    mReminder=false;
                }
                if(mNoPower) {
                    mValueTwo = Float.parseFloat(calculatorScreen.getText() + "");
                    int exp = (int) Math.pow(mValueOne, mValueTwo);
                    calculatorScreen.setText(exp+"");
                    mNoPower=false;
                }

                if (mSubtract){
                    mValueTwo = Float.parseFloat(calculatorScreen.getText() + "");
                    calculatorScreen.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication){
                    mValueTwo = Float.parseFloat(calculatorScreen.getText() + "");
                    calculatorScreen.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision){
                    mValueTwo = Float.parseFloat(calculatorScreen.getText() + "");
                    calculatorScreen.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
                ans=Double.parseDouble(calculatorScreen.getText().toString());
            }
        });

        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.setText(null);
            }
        });

        pointbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculatorScreen.append( "." );
            }
        });
        ansbuttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatorScreen.setText(ans+"");
            }
        });

    }
}
