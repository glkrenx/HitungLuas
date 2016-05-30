package com.glkrenx.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editPanjang, editLebar;
    private Button buttonHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPanjang = (EditText)findViewById(R.id.editPanjang);
        editLebar = (EditText)findViewById(R.id.editLebar);
        buttonHitung = (Button)findViewById(R.id.buttonHitung);
        txtLuas = (TextView)findViewById(R.id.txtLuas);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang = editPanjang.getText().toString().trim();
                String lebar = editLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p * l;

                txtLuas.setText("Luas: "+luas);
            }
        });
    }
}
