package pdm.pratica10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class QueryResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_result);

        LinearLayout layout = (LinearLayout) findViewById(R.id.query_result);

        Intent intent = getIntent();
        ArrayList<CharSequence> data =
                intent.getCharSequenceArrayListExtra("data");

        for (CharSequence entry : data) {
            TextView text = new TextView(this);
            text.setText(entry);
            text.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));

            layout.addView(text);
        }
    }
}