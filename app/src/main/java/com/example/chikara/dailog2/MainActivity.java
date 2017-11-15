package com.example.chikara.dailog2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String key ="sample";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener()

                                  {
                                      @Override
                                      public void onClick(View v) {
                                          final EditText editView = new EditText(MainActivity.this);
                                          new AlertDialog.Builder(MainActivity.this)
                                                  .setIcon(android.R.drawable.ic_dialog_info)
                                                  .setTitle("パスワード入力-->sample")
                                                  //setViewにてビューを設定します。
                                                  .setView(editView)
                                                  .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                      public void onClick(DialogInterface dialog, int whichButton) {
                                                          //入力した文字をトースト出力する
                                                         /* Toast.makeText(MainActivity.this,
                                                                  editView.getText().toString(),
                                                                  Toast.LENGTH_LONG).show();*/

                                                         if(key.equals(editView.getText().toString())) {
                                                             final EditText editView2 = new EditText(MainActivity.this);
                                                             new AlertDialog.Builder(MainActivity.this)
                                                                     .setIcon(android.R.drawable.ic_dialog_info)
                                                                     .setTitle("ポイント入力")
                                                                     .setView(editView2)
                                                                     .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                                         public void onClick(DialogInterface dialog, int whichButton) {
                                                                             Toast.makeText(MainActivity.this,
                                                                                     editView2.getText().toString(),
                                                                                     Toast.LENGTH_LONG).show();
                                                                         }
                                                                     })
                                                                     .setNegativeButton("キャンセル", new DialogInterface.OnClickListener() {
                                                                         public void onClick(DialogInterface dialog, int whichButton) {
                                                                         }
                                                                     })
                                                                     .show();
                                                         }



                                                      }
                                                  })
                                                  .setNegativeButton("キャンセル", new DialogInterface.OnClickListener() {
                                                      public void onClick(DialogInterface dialog, int whichButton) {
                                                      }
                                                  })
                                                  .show();
                                      }
                                  }
        );
    }
}