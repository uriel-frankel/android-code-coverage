package houzz.com.hellojacoco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        final TextView textView = (TextView) findViewById(R.id.textview);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView != null) { // "if" here is for the example :)
                    textView.setText(R.string.i_am_alive);
                }
            }
        });
    }

    private void iAmRedAMethod() {
        Log.d("hello", "world");
    }
}
