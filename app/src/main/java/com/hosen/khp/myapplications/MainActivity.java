package com.hosen.khp.myapplications;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    Double num1=0.0;
    Double num2=0.0;
    Double result= 0.0;
    Double memory=0.0;
    Character operator = new Character(Character.MAX_VALUE);


    public MainActivity() {


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final EditText  res = (EditText) findViewById(R.id.editText);
        final Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btDot,btAdd,btSub,btMulti,btDevide,btPow,btSqrt,
                btClear,btBack,btEqual,btMS,btMR,btMC,btMinus;


        res.setText(String.valueOf("I'm creazy."));
        bt0 = (Button)findViewById(R.id.button0);
        bt1 = (Button)findViewById(R.id.button1);
        bt2 = (Button)findViewById(R.id.button2);
        bt3 = (Button)findViewById(R.id.button3);
        bt4 = (Button)findViewById(R.id.button4);
        bt5 = (Button)findViewById(R.id.button5);
        bt6 = (Button)findViewById(R.id.button6);
        bt7 = (Button)findViewById(R.id.button7);
        bt8 = (Button)findViewById(R.id.button8);
        bt9 = (Button)findViewById(R.id.button9);
        btDot = (Button)findViewById(R.id.buttonDot);
        btAdd = (Button)findViewById(R.id.buttonAdd);
        btSub = (Button)findViewById(R.id.buttonSub);
        btMulti = (Button)findViewById(R.id.buttonMulti);
        btDevide = (Button)findViewById(R.id.buttonDevide);
        btPow = (Button)findViewById(R.id.buttonPower);
        btSqrt = (Button)findViewById(R.id.buttonSqrt);
        btClear = (Button)findViewById(R.id.buttonClear);
        btBack = (Button)findViewById(R.id.buttonBack);
        btEqual = (Button)findViewById(R.id.buttonEqual);
        btMS = (Button)findViewById(R.id.buttonMS);
        btMR = (Button)findViewById(R.id.buttonMR);
        btMC = (Button)findViewById(R.id.buttonMC);
        btMinus = (Button)findViewById(R.id.buttonMinus);



        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              // Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
res.setText(res.getText()+"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
             res.setText(res.getText()+"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
             res.setText(res.getText()+"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
             res.setText(res.getText()+"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
              res.setText(res.getText()+"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res.setText(res.getText()+"6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res.setText(res.getText()+"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res.setText(res.getText() + "8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res.setText(res.getText() + "9");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res.setText(res.getText() + "0");
            }
        });
        btDot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(res.getText().toString().length() == 0){
                res.setText(res.getText() + "0.");}
                else if(!res.getText().toString().contains(".")) {
                    res.setText(res.getText() + ".");
                }
            }
        });
        btClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               res.setText("");
            }
        });
        btBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                res.setText(TruncatLast.truncat(res.getText().toString()));

            }
        });
        btAdd.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v) {
               try {
                   num1 = Double.parseDouble(res.getText().toString());
               }catch(Exception e){
                  System.out.print("Wrong button pressed");
               }
               res.setText("");
               operator='+';
           }
        });
        btSub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try {
                    num1 = Double.parseDouble(res.getText().toString());
                }catch(Exception e){
                    System.out.print("Wrong button pressed");
                }                res.setText("");
                btSub.getText();
                operator='-';
            }
        });
        btMulti.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try {
                    num1 = Double.parseDouble(res.getText().toString());
                }catch(Exception e){
                    System.out.print("Wrong button pressed");
                }                res.setText("");
                operator='*';
            }
        });
        btDevide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try {
                    num1 = Double.parseDouble(res.getText().toString());
                }catch(Exception e){
                    System.out.print("Wrong button pressed");
                }                res.setText("");
                operator='/';
            }
        });
        btPow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try {
                    num1 = Double.parseDouble(res.getText().toString());
                }catch(Exception e){
                    System.out.print("Wrong button pressed");
                }                res.setText("");
                operator='^';
            }
        });
        btSqrt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try {
                    num1 = Double.parseDouble(res.getText().toString());
                }catch(Exception e){
                    System.out.print("Wrong button pressed");
                }                res.setText("");
                operator='s';
            }
        });
        btEqual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try {
                    num2 = Double.parseDouble(res.getText().toString());
                }catch(Exception e){
                    System.out.print("Wrong button pressed");
                }                res.setText("");
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

                };
                res.setText(result.toString());
                num1=0.0;
                num2=0.0;
                operator=' ';
            }
        });
        btMS.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){

           }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
