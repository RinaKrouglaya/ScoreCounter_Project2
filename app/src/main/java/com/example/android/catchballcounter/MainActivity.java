package com.example.android.catchballcounter;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA_Round1 = 0;
    int scoreTeamA_Round2 = 0;
    int scoreTeamA_Round3 = 0;
    int scoreTeamA_Final = 0;
    int scoreTeamB_Round1 = 0;
    int scoreTeamB_Round2 = 0;
    int scoreTeamB_Round3 = 0;
    int scoreTeamB_Final = 0;
    String teamA_name;
    String teamB_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        final TextInputLayout teamAInputLayout = findViewById (R.id.teamA_name_text_input_layout);
        final TextInputLayout teamBInputLayout = findViewById (R.id.teamB_name_text_input_layout);
        ActionBar actionBar = getSupportActionBar ();
        actionBar.hide ();
        getWindow ().setSoftInputMode (WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

    }

    public void getTeamAName() {
        EditText simpleEditText = findViewById (R.id.TeamA_Name);
        teamA_name = simpleEditText.getText ().toString ();
    }

    public void getTeamBName() {
        EditText simpleEditText = findViewById (R.id.TeamB_Name);
        teamB_name = simpleEditText.getText ().toString ();
    }


    public void displayTeamAName(String teamA_name) {
        TextView timeView = findViewById (R.id.TeamA_Name);
        timeView.setText (String.valueOf (teamA_name));
    }

    public void displayTeamBName(String teamB_name) {
        TextView timeView = findViewById (R.id.TeamB_Name);
        timeView.setText (String.valueOf (teamB_name));
    }


    // Round 1, Team A

    public void R1_TeamA_Plus(View view) {
        scoreTeamA_Round1 = scoreTeamA_Round1 + 1;
        scoreTeamA_Final = scoreTeamA_Final + 1;
        displayForTeamA_R1 (scoreTeamA_Round1);

    }

    public void R1_TeamA_Minus(View view) {
        if (scoreTeamA_Round1 > 0) {
            scoreTeamA_Round1 = scoreTeamA_Round1 - 1;
            scoreTeamA_Final = scoreTeamA_Final - 1;
        } else Toast.makeText (this, R.string.ifNegative, Toast.LENGTH_SHORT).show ();
        displayForTeamA_R1 (scoreTeamA_Round1);

    }

    /**
     * Displays the given score for Team A Round 1.
     */
    public void displayForTeamA_R1(int score) {
        TextView scoreView = findViewById (R.id.score_A_R1);

        String scoreA_R1 = String.format ("%02d", score);
        scoreView.setText (scoreA_R1);
    }

    // Round 2, Team A

    public void R2_TeamA_Plus(View view) {
        scoreTeamA_Round2 = scoreTeamA_Round2 + 1;
        scoreTeamA_Final = scoreTeamA_Final + 1;
        displayForTeamA_R2 (scoreTeamA_Round2);


    }

    public void R2_TeamA_Minus(View view) {
        if (scoreTeamA_Round2 > 0) {
            scoreTeamA_Round2 = scoreTeamA_Round2 - 1;
            scoreTeamA_Final = scoreTeamA_Final - 1;
        } else Toast.makeText (this, R.string.ifNegative, Toast.LENGTH_SHORT).show ();
        displayForTeamA_R2 (scoreTeamA_Round2);

    }

    /**
     * Displays the given score for Team A Round 2.
     */
    public void displayForTeamA_R2(int score) {
        TextView scoreView = findViewById (R.id.score_A_R2);
        String scoreA_R2 = String.format ("%02d", score);
        scoreView.setText (scoreA_R2);
    }


    // Round 3, Team A

    public void R3_TeamA_Plus(View view) {
        scoreTeamA_Round3 = scoreTeamA_Round3 + 1;
        scoreTeamA_Final = scoreTeamA_Final + 1;
        displayForTeamA_R3 (scoreTeamA_Round3);

    }

    public void R3_TeamA_Minus(View view) {
        if (scoreTeamA_Round3 > 0) {
            scoreTeamA_Round3 = scoreTeamA_Round3 - 1;
            scoreTeamA_Final = scoreTeamA_Final - 1;
        } else Toast.makeText (this, R.string.ifNegative, Toast.LENGTH_SHORT).show ();

        displayForTeamA_R3 (scoreTeamA_Round3);

    }

    /**
     * Displays the given score for Team A Round 3.
     */
    public void displayForTeamA_R3(int score) {
        TextView scoreView = findViewById (R.id.score_A_R3);
        String scoreA_R3 = String.format ("%02d", score);
        scoreView.setText (scoreA_R3);
    }


    // Round 1, Team B

    public void R1_TeamB_Plus(View view) {
        scoreTeamB_Round1 = scoreTeamB_Round1 + 1;
        scoreTeamB_Final = scoreTeamB_Final + 1;
        displayForTeamB_R1 (scoreTeamB_Round1);


    }

    public void R1_TeamB_Minus(View view) {
        if (scoreTeamB_Round1 > 0) {
            scoreTeamB_Round1 = scoreTeamB_Round1 - 1;
            scoreTeamB_Final = scoreTeamB_Final - 1;
        } else Toast.makeText (this, R.string.ifNegative, Toast.LENGTH_SHORT).show ();
        displayForTeamB_R1 (scoreTeamB_Round1);


    }

    /**
     * Displays the given score for Team B Round 1.
     */
    public void displayForTeamB_R1(int score) {
        TextView scoreView = findViewById (R.id.score_B_R1);
        String scoreB_R1 = String.format ("%02d", score);
        scoreView.setText (scoreB_R1);
    }

    // Round 2, Team B

    public void R2_TeamB_Plus(View view) {
        scoreTeamB_Round2 = scoreTeamB_Round2 + 1;
        scoreTeamB_Final = scoreTeamB_Final + 1;
        displayForTeamB_R2 (scoreTeamB_Round2);


    }

    public void R2_TeamB_Minus(View view) {
        if (scoreTeamB_Round2 > 0) {
            scoreTeamB_Round2 = scoreTeamB_Round2 - 1;
            scoreTeamB_Final = scoreTeamB_Final - 1;
        } else Toast.makeText (this, R.string.ifNegative, Toast.LENGTH_SHORT).show ();

        displayForTeamB_R2 (scoreTeamB_Round2);

    }


    /**
     * Displays the given score for Team B Round 2.
     */
    public void displayForTeamB_R2(int score) {
        TextView scoreView = findViewById (R.id.score_B_R2);

        String scoreB_R2 = String.format ("%02d", score);
        scoreView.setText (scoreB_R2);
    }

    // Round 3, Team B
    public void R3_TeamB_Plus(View view) {
        scoreTeamB_Round3 = scoreTeamB_Round3 + 1;
        scoreTeamB_Final = scoreTeamB_Final + 1;

        displayForTeamB_R3 (scoreTeamB_Round3);

    }

    public void R3_TeamB_Minus(View view) {
        if (scoreTeamB_Round3 > 0) {
            scoreTeamB_Round3 = scoreTeamB_Round3 - 1;
            scoreTeamB_Final = scoreTeamB_Final - 1;
        } else Toast.makeText (this, R.string.ifNegative, Toast.LENGTH_SHORT).show ();

        displayForTeamB_R3 (scoreTeamB_Round3);


    }

    /**
     * Displays the given score for Team B Round 2.
     */
    public void displayForTeamB_R3(int score) {
        TextView scoreView = findViewById (R.id.score_B_R3);

        String scoreB_R3 = String.format ("%02d", score);
        scoreView.setText (scoreB_R3);
    }


    //Final score
    public void add_final_score(View view) {
        displayFinalScore (scoreTeamA_Final, scoreTeamB_Final);


    }

    /**
     * Displays Final Score
     */
    public void displayFinalScore(int scoreA, int scoreB) {

        String final_score_string = String.valueOf (scoreA) + ":" + String.valueOf (scoreB);

        TextView scoreView = findViewById (R.id.Final_Score_View);
        scoreView.setText (String.valueOf (final_score_string));
    }


    //* RESET

    public void ResetScore(View view) {
        scoreTeamA_Round1 = 0;
        scoreTeamA_Round2 = 0;
        scoreTeamA_Round3 = 0;
        scoreTeamA_Final = 0;
        scoreTeamB_Round1 = 0;
        scoreTeamB_Round2 = 0;
        scoreTeamB_Round3 = 0;
        scoreTeamB_Final = 0;
        displayForTeamA_R1 (scoreTeamA_Round1);
        displayForTeamA_R2 (scoreTeamA_Round2);
        displayForTeamA_R3 (scoreTeamA_Round3);
        displayForTeamB_R1 (scoreTeamB_Round1);
        displayForTeamB_R2 (scoreTeamB_Round2);
        displayForTeamB_R3 (scoreTeamB_Round3);
        displayFinalScore (scoreTeamA_Final, scoreTeamB_Final);
        teamA_name = "";
        teamB_name = "";
        displayTeamAName (teamA_name);
        displayTeamBName (teamB_name);
        getCurrentFocus ().clearFocus ();


    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState (savedInstanceState);
        /*
       Save UI state changes to the savedInstanceState.
       This bundle will be passed to onCreate if the process is
       killed and restarted.# */

        getTeamAName ();
        getTeamBName ();

        savedInstanceState.putString ("teamA_name", teamA_name);
        savedInstanceState.putString ("teamB_name", teamB_name);
        savedInstanceState.putInt ("scoreTeamA_Round1", scoreTeamA_Round1);
        savedInstanceState.putInt ("scoreTeamA_Round2", scoreTeamA_Round2);
        savedInstanceState.putInt ("scoreTeamA_Round3", scoreTeamA_Round3);
        savedInstanceState.putInt ("scoreTeamA_Final", scoreTeamA_Final);
        savedInstanceState.putInt ("scoreTeamB_Round1", scoreTeamB_Round1);
        savedInstanceState.putInt ("scoreTeamB_Round2", scoreTeamB_Round2);
        savedInstanceState.putInt ("scoreTeamB_Round3", scoreTeamB_Round3);
        savedInstanceState.putInt ("scoreTeamB_Final", scoreTeamB_Final);


    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState (savedInstanceState);

       /*Restore UI state from the savedInstanceState.
       This bundle has also been passed to onCreate.*/

        teamA_name = savedInstanceState.getString ("teamA_name");
        teamB_name = savedInstanceState.getString ("teamB_name");

        scoreTeamA_Round1 = savedInstanceState.getInt ("scoreTeamA_Round1");
        scoreTeamA_Round2 = savedInstanceState.getInt ("scoreTeamA_Round2");
        scoreTeamA_Round3 = savedInstanceState.getInt ("scoreTeamA_Round3");
        scoreTeamA_Final = savedInstanceState.getInt ("scoreTeamA_Final");
        scoreTeamB_Round1 = savedInstanceState.getInt ("scoreTeamB_Round1");
        scoreTeamB_Round2 = savedInstanceState.getInt ("scoreTeamB_Round2");
        scoreTeamB_Round3 = savedInstanceState.getInt ("scoreTeamB_Round3");
        scoreTeamB_Final = savedInstanceState.getInt ("scoreTeamB_Final");
        displayForTeamA_R1 (scoreTeamA_Round1);
        displayForTeamA_R2 (scoreTeamA_Round2);
        displayForTeamA_R3 (scoreTeamA_Round3);
        displayForTeamB_R1 (scoreTeamB_Round1);
        displayForTeamB_R2 (scoreTeamB_Round2);
        displayForTeamB_R3 (scoreTeamB_Round3);
        displayFinalScore (scoreTeamA_Final, scoreTeamB_Final);
        displayTeamAName (teamA_name);
        displayTeamBName (teamB_name);


    }


}

