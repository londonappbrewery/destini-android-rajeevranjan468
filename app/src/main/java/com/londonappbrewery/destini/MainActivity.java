package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mQuestion;
    Button mTopButton;
    Button mBottomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mQuestion = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                if(b.getText().toString().equals(getResources().getString(R.string.T1_Ans1))){

                    mQuestion.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);

                }else if (b.getText().equals(getResources().getString(R.string.T2_Ans1))){

                    mQuestion.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);

                }else if(b.getText().equals(getResources().getString(R.string.T3_Ans1))){

                    mQuestion.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBottomButton.setVisibility(View.INVISIBLE);

                }else{
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                if(b.getText().equals(getResources().getString(R.string.T1_Ans2))){


                    mQuestion.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);

                }else if (b.getText().equals(getResources().getString(R.string.T2_Ans2))){

                    mQuestion.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBottomButton.setVisibility(View.INVISIBLE);

                }else if(b.getText().equals(getResources().getString(R.string.T3_Ans2))){

                    mQuestion.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.INVISIBLE);
                    mBottomButton.setVisibility(View.INVISIBLE);

                }else{
                    Toast.makeText(getApplicationContext()," bottom bank pressed",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
