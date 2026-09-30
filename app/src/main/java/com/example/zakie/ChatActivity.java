package com.example.zakie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        EditText messageBox = findViewById(R.id.messageBox);
        Button sendButton = findViewById(R.id.sendButton);
        Button backButton = findViewById(R.id.backButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = messageBox.getText().toString();

                if (!message.isEmpty()) {
                    Toast.makeText(ChatActivity.this, "Message sent!", Toast.LENGTH_SHORT).show();
                    messageBox.setText("");
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}