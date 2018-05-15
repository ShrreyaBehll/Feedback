package xyz.shrreya.feedback;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.willy.ratingbar.BaseRatingBar;
import com.willy.ratingbar.ScaleRatingBar;

public class MainActivity extends AppCompatActivity {

    Button button_feedback;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_feedback = (Button) findViewById(R.id.button_feedback);




    }


    public void display_feedback_activity(View view) {


        Intent i = new Intent(this, feedback.class);
        startActivity(i);
    }


}

