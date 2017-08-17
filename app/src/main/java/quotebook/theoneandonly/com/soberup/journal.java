package quotebook.theoneandonly.com.soberup;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static android.R.id.edit;
import static android.R.id.input;
import static android.text.TextUtils.concat;
import static quotebook.theoneandonly.com.soberup.R.id.journal_text;


public class journal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);


        Button post_it = (Button) findViewById(R.id.post_to_journal);

        Button look_journal = (Button) findViewById(R.id.view_journals);






        post_it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView journal_write = (TextView) findViewById(journal_text);
                EditText edit = (EditText)findViewById(R.id.entry);
                String result = edit.getText().toString();


                if(result.equals("")){

                    Toast.makeText(journal.this, "You must enter something", Toast.LENGTH_SHORT).show();


                }

                Calendar c = Calendar.getInstance();

                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String formattedDate = df.format(c.getTime());

                SharedPreferences sharedpref = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
                result = result.concat(System.getProperty("line.separator") + formattedDate + System.getProperty("line.separator") +
                        System.getProperty("line.separator") + sharedpref.getString("diarypost", ""));



                int entry_number = sharedpref.getInt("diarynumb", 0);

                entry_number += 1;

                sharedpref = getSharedPreferences("userinfo", Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedpref.edit();


                editor.putString("diarypost", System.getProperty ("line.separator") + result

                +  System.getProperty ("line.separator") +  System.getProperty ("line.separator"));

                editor.putInt("diarynumb", entry_number);


                editor.apply();





                if(edit.getText()!= null) {



                    Intent go_journals = new Intent(journal.this, viewjournal.class);
                    go_journals.putExtra("entrysent", result);
                    startActivity(go_journals);
                }


            }
        });


        look_journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent see_journal = new Intent(journal.this, viewjournal.class);
                see_journal.putExtra("entrysent", "");
                startActivity(see_journal);


            }
        });
    }
}
