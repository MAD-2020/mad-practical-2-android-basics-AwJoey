package sg.edu.np.mad.whack_a_mole;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    TextView score;
    int Score;
    int location;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        score = findViewById(R.id.score);
        Score = 0;
        score.setText(String.valueOf(Score));
    }

    protected void onStart()
    {
        super.onStart();
        setNewMole();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Whack-A-Mole", "Button Left Clicked!");
                if (button1.getText() == "*"){
                    Log.d("Whack-A-Mole", "Hit, score added!");
                    Score ++;
                }
                else {
                    Log.d("Whack-A-Mole", "Missed, score deducted!");
                    Score--;
                }
                score.setText(String.valueOf(Score));
                setNewMole();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Whack-A-Mole", "Button Middle Clicked!");
                if (button2.getText() == "*"){
                    Log.d("Whack-A-Mole", "Hit, score added!");
                    Score ++;
                }
                else {
                    Log.d("Whack-A-Mole", "Missed, score deducted!");
                    Score--;
                }
                score.setText(String.valueOf(Score));
                setNewMole();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Whack-A-Mole", "Button Right Clicked!");
                if (button3.getText() == "*"){
                    Log.d("Whack-A-Mole", "Hit, score added!");
                    Score ++;
                }
                else {
                    Log.d("Whack-A-Mole", "Missed, score deducted!");
                    Score--;
                }
                score.setText(String.valueOf(Score));
                setNewMole();
            }
        });
    }

    public void setNewMole(){
        Random r = new Random();
        location = r.nextInt(3);
        if (location == 1){
            button1.setText("*");
            button2.setText("O");
            button3.setText("O");
        }
        else if (location == 2){
            button1.setText("O");
            button2.setText("*");
            button3.setText("O");
        }
        else{
            button1.setText("O");
            button2.setText("O");
            button3.setText("*");
        }
    }

}

