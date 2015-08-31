package com.hosen.khp.myapplications;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText  res = (EditText) findViewById(R.id.editText);
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btDot,btAdd,btSub,btMulti,btDevide,btPow,btSqrt,
            btClear,btBack,btEqual,btMSave,btMRecal,btMClear;
    Double result= 0.0;
    public MainActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void numberMethod(View view) {
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

    }
}
