package com.joshuafranklinjava.checkbox.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private CheckBox momCheckBox;
  private CheckBox dadCheckBox;
  private CheckBox grandpaCheckBox;

  private Button showButton;
  private TextView showTextView;



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    momCheckBox = (CheckBox)findViewById(R.id.momCheckBoxID);
    dadCheckBox = (CheckBox)findViewById(R.id.dadID);
    grandpaCheckBox = (CheckBox) findViewById(R.id.grandpaID);

    showTextView = (TextView)findViewById(R.id.resultID);
    showButton = (Button)findViewById(R.id.showButtonID);

    showButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(momCheckBox.getText().toString() + " status is: " +
        momCheckBox.isChecked() + " \n");
        stringBuilder.append(dadCheckBox.getText().toString() + " status is: " +
          dadCheckBox.isChecked() + " \n");
        stringBuilder.append(grandpaCheckBox.getText().toString() + " status is: " +
          grandpaCheckBox.isChecked() + " \n");

        showTextView.setText(stringBuilder);
      }
    });
  }
}
