package sdu.cs58.krichapol.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1. ประกาศตัวแปรบน Java
    EditText Number1EditText, Number2EditText;
    Button AddButton;
    TextView ResultTextView;
    int Num1,Num2,Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. ผูกตัวแปรบน Java กับ Element บน XML
        Number1EditText = findViewById(R.id.edtNumber1);
        Number2EditText = findViewById(R.id.edtNumber2);
        AddButton = findViewById(R.id.btnAdd);
        ResultTextView = findViewById(R.id.txvResult);

        //3. สั่งให้ปุ่มดักฟัง
        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //แปลงค่าที่รับจาก EditText เป็นตัวเลขแล้วเก็บในตัวแปรชนิด int
                Num1 = Integer.parseInt(Number1EditText.getText().toString().trim());
                Num2 = Integer.parseInt(Number2EditText.getText().toString().trim());
                Result = Num1 + Num2;

                //แสดงผลลัพธ์การคำนวณ
                ResultTextView.setText(Result + "");
            }
        }); // End setOnClickListener
    }// End onCreate
}//End Class
