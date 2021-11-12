package com.example.password;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TableNum, Guide, inp1, inp2, inp3, inp4, inp5, inp6;
    TextView inp[] = new TextView[5];
    Button buttons[] = new Button[10];
    Button n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, clear, remove;
    int seq = 1;
    String password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableNum = (TextView) findViewById(R.id.TableNum);
        Guide = (TextView) findViewById(R.id.Guide);
        inp1 = (TextView) findViewById(R.id.input1);
        inp2 = (TextView) findViewById(R.id.input2);
        inp3 = (TextView) findViewById(R.id.input3);
        inp4 = (TextView) findViewById(R.id.input4);
        inp5 = (TextView) findViewById(R.id.input5);
        inp6 = (TextView) findViewById(R.id.input6);

        n0 = (Button) findViewById(R.id.bt_NumPad_0);
        n1 = (Button) findViewById(R.id.bt_NumPad_1);
        n2 = (Button) findViewById(R.id.bt_NumPad_2);
        n3 = (Button) findViewById(R.id.bt_NumPad_3);
        n4 = (Button) findViewById(R.id.bt_NumPad_4);
        n5 = (Button) findViewById(R.id.bt_NumPad_5);
        n6 = (Button) findViewById(R.id.bt_NumPad_6);
        n7 = (Button) findViewById(R.id.bt_NumPad_7);
        n8 = (Button) findViewById(R.id.bt_NumPad_8);
        n9 = (Button) findViewById(R.id.bt_NumPad_9);
        clear = (Button) findViewById(R.id.bt_NumPad_AllClear);
        remove = (Button) findViewById(R.id.bt_NumPad_ClearOne);
    }

    public void onClearAll(View v) {
        for(int i=password.length();i>=0;i--){
            inp[i].setBackgroundColor(R.drawable.password_c2);
            inp[i].setText(" ");
        }

    }

    public void onClearOne(View v){
        inp[password.length()-1].setBackgroundColor(R.drawable.password_c2);
        inp[password.length()-1].setText(" ");
    }

    public void showNumPadInput(int number) {
        TextView textView = inp[password.length()];
        if(password.length()>1){
            TextView textView1 = inp[password.length()-1];
            textView1.setBackgroundColor(R.drawable.password_c);
        }
        textView.setBackgroundColor(R.drawable.password_c3);
        textView.setText(number);


    }

    public void onNumPadClicked(View v) {
        switch (v.getId()) {
            case R.id.bt_NumPad_0:
                password+="0";
                showNumPadInput(0);
                break;
            case R.id.bt_NumPad_1:
                password+="1";
                showNumPadInput(1);
                break;
            case R.id.bt_NumPad_2:
                password+="2";
                showNumPadInput(2);
                break;
            case R.id.bt_NumPad_3:
                password+="3";
                showNumPadInput(3);
                break;
            case R.id.bt_NumPad_4:
                password+="4";
                showNumPadInput(4);
                break;
            case R.id.bt_NumPad_5:
                password+="5";
                showNumPadInput(5);
                break;
            case R.id.bt_NumPad_6:
                password+="6";
                showNumPadInput(6);
                break;
            case R.id.bt_NumPad_7:
                password+="7";
                showNumPadInput(7);
                break;
            case R.id.bt_NumPad_8:
                password+="8";
                showNumPadInput(8);
                break;
            case R.id.bt_NumPad_9:
                password+="9";
                showNumPadInput(9);
                break;
        }
    }
}
