package com.hosen.khp.myapplications;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {
    Double num1=0.0;
    Double num2=0.0;
    Double result= 0.0;
    Double memory=0.0;
    Double minus = 0.0;
    Character operator = ' ';
    Character operatorSign=' ';

    int shake=0;
   boolean progress= true;
    // The following are used for the shake detection
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private ShakeDetector mShakeDetector;
    /*final Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btDot,btAdd,btSub,btMulti,btDevide,btPow,btSqrt,
            btClear,btBack,btEqual,btMS,btMR,btMC,btMinus;*/





    public MainActivity() {


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView restt = (TextView) findViewById(R.id.textViewMain);
        final TextView res = (TextView) findViewById(R.id.textViewMain);
        final TextView mem = (TextView) findViewById(R.id.textViewMemory);
        final TextView tvN1 = (TextView) findViewById(R.id.textViewNum1);
        final TextView tvOpt = (TextView) findViewById(R.id.textViewOP);
        final TextView tvN2 = (TextView) findViewById(R.id.textViewNum2);
        res.setText(String.valueOf(""));
        final Button bt0 = (Button)findViewById(R.id.button0);
        final Button  bt1 = (Button)findViewById(R.id.button1);
        final Button  bt2 = (Button)findViewById(R.id.button2);
        final Button   bt3 = (Button)findViewById(R.id.button3);
        final Button  bt4 = (Button)findViewById(R.id.button4);
        final Button  bt5 = (Button)findViewById(R.id.button5);
        final Button   bt6 = (Button)findViewById(R.id.button6);
        final Button  bt7 = (Button)findViewById(R.id.button7);
        final Button  bt8 = (Button)findViewById(R.id.button8);
        final Button   bt9 = (Button)findViewById(R.id.button9);
        final Button   btDot = (Button)findViewById(R.id.buttonDot);
        final Button   btAdd = (Button)findViewById(R.id.buttonAdd);
        final Button   btSub = (Button)findViewById(R.id.buttonSub);
        final Button   btMulti = (Button)findViewById(R.id.buttonMulti);
        final Button   btDevide = (Button)findViewById(R.id.buttonDevide);
        final Button   btPow = (Button)findViewById(R.id.buttonPower);
        final Button   btSqrt = (Button)findViewById(R.id.buttonSqrt);
        final Button   btClear = (Button)findViewById(R.id.buttonClear);
        final Button   btBack = (Button)findViewById(R.id.buttonBack);
        final Button  btEqual = (Button)findViewById(R.id.buttonEqual);
        final Button  btMS = (Button)findViewById(R.id.buttonMS);
        final Button   btMR = (Button)findViewById(R.id.buttonMR);
        final Button   btMC = (Button)findViewById(R.id.buttonMC);
        final Button   btMinus = (Button)findViewById(R.id.buttonMinus);

        // ShakeDetector initialization
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager
                .getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mShakeDetector = new ShakeDetector();
        mShakeDetector.setOnShakeListener(new ShakeDetector.OnShakeListener() {

            @Override
            public void onShake(int count) {
				/*
				 * The following method, "handleShakeEvent(count):" is a stub //
				 * method you would use to setup whatever you want done once the
				 * device has been shook.
				 */


                restt.setText(count + "");

               // restt.setTextColor(0xFFF06D2F);
                Random rand = new Random();
;
                //tvN1.setText(bb+"");
               /* tvN2.setText(bt7.getLeft()+"");
                mem.setText(bt9.getX()+"");
                int p= bt2.getBottom();
               bt2.setX(bt8.getX());
                bt2.setY(bt8.getY());
                bt1.setBottom(p);*/
                //The random generator creates values between [0,256) for use as RGB values used below to create a random color
                //We call the RelativeLayout object and we change the color.  The first parameter in argb() is the alpha.
                restt.setBackgroundColor(Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256) ));
                handleShakeEvent(count);
                restt.setTextColor(Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256) ));

            }

            private void handleShakeEvent(int count) {
                shake=count;
            }
        });




        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              // Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                if (progress)
                  res.setText(res.getText()+"1");
                else if (!progress)
                { res.setText("");tvOpt.setText("");tvN1.setText("");tvN2.setText("");res.setText(res.getText()+"1");progress=true;}
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (progress)
                    res.setText(res.getText()+"2");
                else if (!progress)
                { res.setText("");tvOpt.setText("");tvN1.setText("");tvN2.setText("");res.setText(res.getText()+"2");progress=true;}
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (progress)
                    res.setText(res.getText()+"3");
                else if (!progress)
                { res.setText("");tvOpt.setText("");tvN1.setText("");tvN2.setText("");res.setText(res.getText()+"3");progress=true;}
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (progress)
                    res.setText(res.getText()+"4");
                else if (!progress)
                { res.setText("");tvOpt.setText("");tvN1.setText("");tvN2.setText("");res.setText(res.getText()+"4");progress=true;}
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (progress)
                    res.setText(res.getText()+"5");
                else if (!progress)
                { res.setText("");tvOpt.setText("");tvN1.setText("");tvN2.setText("");res.setText(res.getText()+"5");progress=true;}
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (progress)
                    res.setText(res.getText()+"6");
                else if (!progress)
                { res.setText("");tvOpt.setText("");tvN1.setText("");tvN2.setText("");res.setText(res.getText()+"6");progress=true;}
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (progress)
                    res.setText(res.getText()+"7");
                else if (!progress)
                { res.setText("");tvOpt.setText("");tvN1.setText("");tvN2.setText("");res.setText(res.getText()+"7");progress=true;}
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (progress)
                    res.setText(res.getText()+"8");
                else if (!progress)
                { res.setText("");tvOpt.setText("");tvN1.setText("");tvN2.setText("");res.setText(res.getText()+"8");progress=true;}
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (progress)
                    res.setText(res.getText()+"9");
                else if (!progress)
                { res.setText("");tvOpt.setText("");tvN1.setText("");tvN2.setText("");res.setText(res.getText()+"9");progress=true;}
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (progress)
                    res.setText(res.getText()+"0");
                else if (!progress)
                { res.setText("");tvOpt.setText("");tvN1.setText("");tvN2.setText("");res.setText(res.getText()+"0");progress=true;}
            }
        });
        btDot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (progress){
                    if(res.getText().toString().length() == 0){
                        res.setText(res.getText() + "0.");}
                    else if(!res.getText().toString().contains(".")) {
                        res.setText(res.getText() + ".");
                    }}
                else if (!progress)
                { res.setText("");tvOpt.setText("");tvN1.setText("");tvN2.setText("");res.setText(res.getText() + "0.");progress=true;

                }

               //
            }
        });
        btClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               res.setText("");tvOpt.setText("");tvN1.setText("");tvN2.setText("");progress=true; operator=' ';
            }
        });
        btBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res.setText(TruncatLast.truncat(res.getText().toString()));

            }
        });
        btAdd.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v) {

               operatorSign= btAdd.getText().charAt(0);
                 if(operator==' '){

                  tvOpt.setText(operator.toString());

                   try {
                       num1 = Double.parseDouble(res.getText().toString());
                   }catch(Exception e){
                       System.out.print("Wrong button pressed");
                   }
                    res.setText("");tvOpt.setText("+"+ " ");tvN1.setText(num1.toString());
                    operator='+';
                    progress=true;
                    tvN2.setText("");}
               else if(operator=='+') {
                    tvOpt.setText(operator.toString()+" ");
                    if (progress){
                   try {
                       num2 = Double.parseDouble(res.getText().toString());
                       num1=num1+num2;

                   }catch(Exception e){
                       System.out.print("Wrong button pressed");
                   }

                   tvN1.setText(num1.toString());
                   tvN2.setText(num2.toString());
                   res.setText("");
                        progress=true;}

               }
               else {
                   if (progress){
if(res.getText().length()==0){
    tvOpt.setText(operator.toString()+" ");
    try {
        num1 = Double.parseDouble(res.getText().toString());
    }catch(Exception e){
        System.out.print("Wrong button pressed");
    }
    res.setText("");tvOpt.setText("+"+ " ");tvN1.setText(num1.toString());
    operator='+';
    progress=true;
    tvN2.setText("");
}

                       try {


                           num2 = Double.parseDouble(res.getText().toString());



                       }catch(Exception e){
                           System.out.print("Wrong button pressed");
                       }
                        Double resssult=operation();
                       num1=resssult;
                       tvN1.setText(resssult.toString());
                       tvN2.setText("");
                       tvOpt.setText("+"+ " ");
                       res.setText("");
                       operator='+';}

               }}

        });
        btSub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(operator==' '){
                    try {
                        num1 = Double.parseDouble(res.getText().toString());
                    }catch(Exception e){
                        System.out.print("Wrong button pressed");
                    }
                    res.setText("");tvOpt.setText("-"+ " ");tvN1.setText(num1.toString());
                    operator='-';
                    progress=true;
                    tvN2.setText("");}
                else if(operator=='-') {
                    tvOpt.setText(operator.toString()+" ");
                    if (progress){
                        try {
                            num2 = Double.parseDouble(res.getText().toString());
                            num1=num1-num2;
                        }catch(Exception e){
                            System.out.print("Wrong button pressed");
                        }

                        tvN1.setText(num1.toString());
                        tvN2.setText(num2.toString());
                        res.setText("");}

                }
                else {

                    if (progress){
                        if(res.getText().length()==0){
                            tvOpt.setText(operator.toString()+" ");
                            try {
                                num1 = Double.parseDouble(res.getText().toString());
                            }catch(Exception e){
                                System.out.print("Wrong button pressed");
                            }
                            res.setText("");tvOpt.setText("-"+ " ");tvN1.setText(num1.toString());
                            operator='-';
                            progress=true;
                            tvN2.setText("");
                        }else{
                        try {


                            num2 = Double.parseDouble(res.getText().toString());



                        }catch(Exception e){
                            System.out.print("Wrong button pressed");
                        }
                        Double resssult=operation();
                        num1=resssult;
                        tvN1.setText(resssult.toString());
                        tvN2.setText("");
                        tvOpt.setText("-"+ " ");
                        res.setText("");
                        operator='-';}

                }}
            }
        });
        btMulti.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(operator==' '){
                    try {
                        num1 = Double.parseDouble(res.getText().toString());
                    }catch(Exception e){
                        System.out.print("Wrong button pressed");
                    }
                    res.setText("");tvOpt.setText("*"+ " ");tvN1.setText(num1.toString());
                    operator='*';
                    progress=true;
                    tvN2.setText("");}
                else if(operator=='*') {
                    tvOpt.setText(operator.toString()+" ");
                    if (progress){
                        try {
                            num2 = Double.parseDouble(res.getText().toString());
                            num1=num1*num2;
                        }catch(Exception e){
                            System.out.print("Wrong button pressed");
                        }

                        tvN1.setText(num1.toString());
                        tvN2.setText(num2.toString());
                        res.setText("");}

                }
                else {

                    if (progress){
                        if(res.getText().length()==0){
                            tvOpt.setText(operator.toString()+" ");
                            try {
                                num1 = Double.parseDouble(res.getText().toString());
                            }catch(Exception e){
                                System.out.print("Wrong button pressed");
                            }
                            res.setText("");tvOpt.setText("*"+ " ");tvN1.setText(num1.toString());
                            operator='*';
                            progress=true;
                            tvN2.setText("");
                        }

                        else{
                        try {


                            num2 = Double.parseDouble(res.getText().toString());



                        }catch(Exception e){
                            System.out.print("Wrong button pressed");
                        }
                        Double resssult=operation();
                        num1=resssult;
                        tvN1.setText(resssult.toString());
                        tvN2.setText("");
                        tvOpt.setText("*"+ " ");
                        res.setText("");
                        operator='*';}

                }}
            }
        });
        btDevide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(operator==' '){
                    try {
                        num1 = Double.parseDouble(res.getText().toString());
                    }catch(Exception e){
                        System.out.print("Wrong button pressed");
                    }
                    res.setText("");tvOpt.setText("/"+ " ");tvN1.setText(num1.toString());
                    operator='/';
                    progress=true;
                    tvN2.setText("");}
                else if(operator=='/') {
                    tvOpt.setText(operator.toString()+" ");
                    if (progress){
                        try {
                            num2 = Double.parseDouble(res.getText().toString());
                            num1=num1/num2;
                        }catch(Exception e){
                            System.out.print("Wrong button pressed");
                        }

                        tvN1.setText(num1.toString());
                        tvN2.setText(num2.toString());
                        res.setText("");}

                }
                else {

                    if (progress){
                        if(res.getText().length()==0){
                            tvOpt.setText(operator.toString()+" ");
                            try {
                                num1 = Double.parseDouble(res.getText().toString());
                            }catch(Exception e){
                                System.out.print("Wrong button pressed");
                            }
                            res.setText("");tvOpt.setText("/"+ " ");tvN1.setText(num1.toString());
                            operator='/';
                            progress=true;
                            tvN2.setText("");
                        }

                        else{
                        try {


                            num2 = Double.parseDouble(res.getText().toString());



                        }catch(Exception e){
                            System.out.print("Wrong button pressed");
                        }
                        Double resssult=operation();
                        num1=resssult;
                        tvN1.setText(resssult.toString());
                        tvN2.setText("");
                        tvOpt.setText("/"+ " ");
                        res.setText("");
                        operator='/';}

                }}
            }
        });
        btPow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(operator==' '){
                    try {
                        num1 = Double.parseDouble(res.getText().toString());
                    }catch(Exception e){
                        System.out.print("Wrong button pressed");
                    }
                    res.setText("");tvOpt.setText("^"+ " ");tvN1.setText(num1.toString());
                    operator='^';
                    progress=true;
                    tvN2.setText("");}
                else if(operator=='^') {
                    tvOpt.setText(operator.toString()+" ");
                    if (progress){
                        try {
                            num2 = Double.parseDouble(res.getText().toString());
                            num1=Math.pow(num1, num2);
                        }catch(Exception e){
                            System.out.print("Wrong button pressed");
                        }

                        tvN1.setText(num1.toString());
                        tvN2.setText(num2.toString());
                        res.setText("");}

                }
                else {

                    if (progress){
                        if(res.getText().length()==0){
                            tvOpt.setText(operator.toString()+" ");
                            try {
                                num1 = Double.parseDouble(res.getText().toString());
                            }catch(Exception e){
                                System.out.print("Wrong button pressed");
                            }
                            res.setText("");tvOpt.setText("^"+ " ");tvN1.setText(num1.toString());
                            operator='^';
                            progress=true;
                            tvN2.setText("");
                        }

                        else{
                        try {


                            num2 = Double.parseDouble(res.getText().toString());



                        }catch(Exception e){
                            System.out.print("Wrong button pressed");
                        }
                        Double resssult=operation();
                        num1=resssult;
                        tvN1.setText(resssult.toString());
                        tvN2.setText("");
                        tvOpt.setText("^"+ " ");
                        res.setText("");
                        operator='^';}

                }}
            }

        });
        btSqrt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(operator==' '){
                    try {
                        num1 = Double.parseDouble(res.getText().toString());
                    }catch(Exception e){
                        System.out.print("Wrong button pressed");
                    }
                    res.setText("");tvOpt.setText("Sqrt"+ " ");tvN1.setText(num1.toString());
                    operator='s';
                    progress=true;
                    tvN2.setText("");}
                else if(operator=='s') {
                    tvOpt.setText(operator.toString()+" ");
                    if (progress){
                        try {
                            num2 = Double.parseDouble(res.getText().toString());
                            num1=Math.pow(num1,(1/num2));
                        }catch(Exception e){
                            System.out.print("Wrong button pressed");
                        }

                        tvN1.setText(num1.toString());
                        tvN2.setText(num2.toString());
                        res.setText("");}

                }
                else {

                    if (progress){
                        if(res.getText().length()==0){
                            tvOpt.setText(operator.toString()+" ");
                            try {
                                num1 = Double.parseDouble(res.getText().toString());
                            }catch(Exception e){
                                System.out.print("Wrong button pressed");
                            }
                            res.setText("");tvOpt.setText("Sqrt"+ " ");tvN1.setText(num1.toString());
                            operator='s';
                            progress=true;
                            tvN2.setText("");
                        }

                        else{
                        try {


                            num2 = Double.parseDouble(res.getText().toString());



                        }catch(Exception e){
                            System.out.print("Wrong button pressed");
                        }
                        Double resssult=operation();
                        num1=resssult;
                        tvN1.setText(resssult.toString());
                        tvN2.setText("");
                        tvOpt.setText("Sqrt"+ " ");
                        res.setText("");
                        operator='s';}

                }}

            }
        });
        btEqual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try {
                    num2 = Double.parseDouble(res.getText().toString());
                }catch(Exception e){
                    System.out.print("Wrong button pressed");
                }  if (progress){res.setText("");}
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    case '^':
                        result= Math.pow(num1, num2);
                        break;
                    case 's':
                        result= Math.pow(num1,(1/num2));
                        break;
                    case ' ':
                        break;

                };
                if(res.getText().length()==0&&tvN1.getText().length()==0&&tvN2.getText().length()==0){System.out.print("Wrong button pressed");}
               else if (progress){
                res.setText(result.toString());tvN2.setText(num2.toString());
                num1=0.0;
                num2=0.0;
                result=0.0;
                operator=' ';
                progress=false;}
            }
        });
        btMS.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               if(res.getText().length()!=0){
memory= Double.parseDouble(res.getText().toString());
               mem.setText(memory.toString());}
           }
        });
        btMR.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){

               res.setText(memory.toString());
           }
        });
btMC.setOnClickListener(new View.OnClickListener(){
   public void onClick(View v){
       memory=0.0;
       mem.setText(memory.toString());
   }

});
        btMinus.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){


              if((res.getText().toString().length() != 0)&& Double.parseDouble(res.getText().toString()) !=0.0) {
                  minus = -1.0*Double.parseDouble(res.getText().toString());
                  res.setText( minus.toString());
               }

               //
           }
        });
    }




    public double operation() {
    switch (operator) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            result = num1 / num2;
            break;
        case '^':
            result = Math.pow(num1, num2);
            break;
        case 's':
            result = Math.pow(num1, (1 / num2));
            break;
        case ' ':
            break;


    }
    return result;
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public void onResume() {
        super.onResume();
        // Add the following line to register the Session Manager Listener onResume
        mSensorManager.registerListener(mShakeDetector, mAccelerometer,	SensorManager.SENSOR_DELAY_UI);
    }

    @Override
    public void onPause() {
        // Add the following line to unregister the Sensor Manager onPause
        mSensorManager.unregisterListener(mShakeDetector);
        super.onPause();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

/*    public void numberMethod(View view) {
Intent inent = new Intent();
        String command = getIntent();
        if (command.equals(".")) {
            res.setText(res.getText() + command);
            return;
        }
        if (result != null) {
            res.setText("");
            result = null;
        }
        res.setText(res.getText() + command);

    }*/
}
