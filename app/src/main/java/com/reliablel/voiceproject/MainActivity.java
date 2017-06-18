package com.reliablel.voiceproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.baidu.tts.auth.AuthInfo;
import com.baidu.tts.client.SpeechError;
import com.baidu.tts.client.SpeechSynthesizer;
import com.baidu.tts.client.SpeechSynthesizerListener;
import com.baidu.tts.client.SynthesizerTool;
import com.baidu.tts.client.TtsMode;

public class MainActivity extends AppCompatActivity{
    Button speak;
    EditText content;
    private VoiceUtils voiceUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        content = (EditText) findViewById(R.id.content);
        speak = (Button) findViewById(R.id.speak);
        voiceUtils=new VoiceUtils();
        voiceUtils.initialTts(this);
    }

    public void speakClick(View view) {
        voiceUtils.startSpeek(content.getText().toString());
    }


}
