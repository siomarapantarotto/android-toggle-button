package br.com.siomara.android.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private TextView textViewDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeComponents();

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                textViewDisplay.setText("");
                if (isChecked) {
                    textViewDisplay.setText(R.string.message_for_turned_on_button);
                } else {
                    textViewDisplay.setText(R.string.message_for_turned_off_button);
                }
            }
        });

    }

    public void initializeComponents() {
        toggleButton = findViewById(R.id.toggleButton);
        textViewDisplay = findViewById(R.id.textViewDisplay);
    }
}