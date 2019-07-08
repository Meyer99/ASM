package com.example.asm.ui;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.asm.R;
import com.example.asm.data.DataManager;
import com.example.asm.data.model.User;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private EditText idText;
    private EditText passText;
    private Button button;
    private Button addHDC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: onCreate");

        SQLiteDatabase db = LitePal.getDatabase();

        idText = (EditText) findViewById(R.id.test_id);
        passText = (EditText) findViewById(R.id.test_pass);
        button = (Button) findViewById(R.id.test_button);
        addHDC = (Button) findViewById(R.id.add_HDC);

        addHDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                user.setId(1000);
                user.setPassword("001");
                user.setName("胡冬础");
                if (user.save()) {
                    Toast.makeText(MainActivity.this, "Save successfully !",
                            Toast.LENGTH_LONG);
                } else {
                    Toast.makeText(MainActivity.this, "Save failed !",
                            Toast.LENGTH_LONG);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = idText.getText().toString();
                String pass = passText.getText().toString();

                if (id == "" || pass == "") {
                    Toast.makeText(MainActivity.this, "sss", Toast.LENGTH_LONG);
                }

//                if (id == "" || pass == "") {
//
//                    Toast.makeText(MainActivity.this, "Login failed !", Toast.LENGTH_LONG);
//                    return;
//                }

//                User user = DataManager.getInstance().getDbHelper().login(Integer.parseInt(id), pass);
//
//                if (user == null) {
//
//                    Toast.makeText(MainActivity.this, "Login failed !", Toast.LENGTH_LONG);
//
//                }
//
//                Toast.makeText(MainActivity.this, "Login Successfully !", Toast.LENGTH_LONG);

            }
        });

    }
}
