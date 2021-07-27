package com.example.android.scoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.scoreboard.R.id.TeamBScore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    int AScore=0;

    public void GoalA(View view){
      AScore++;
      TeamAScore(AScore);
    }


    public void offsideTeamA(View view){
        if(AScore>0){
            AScore--;
            TeamAScore(AScore);
        }
        else Toast.makeText(this, "You Can't Score is Less Than 0", Toast.LENGTH_LONG).show();

    }




    public void TeamAScore(int ScoreA){
        TextView SC = (TextView) findViewById(R.id.TeamAScore);
        SC.setText(String.valueOf(ScoreA));
    }

    int BScore=0;

    public void GoalB(View view){
        BScore++;
        TeamBScore(BScore);
    }

    public void offsideTeamB(View view){
        if(BScore>0){
            BScore--;
            TeamBScore(BScore);
        }
        else Toast.makeText(this, "You Can't Score is Less Than 0", Toast.LENGTH_LONG).show();

    }

    public void TeamBScore(int ScoreB){
        TextView SC = (TextView) findViewById(TeamBScore);
        SC.setText(String.valueOf(ScoreB));
    }

    public void Reset(View view){
        TeamAScore(0);
        TeamBScore(0);
        AScore=0;
        BScore=0;
    }


}
