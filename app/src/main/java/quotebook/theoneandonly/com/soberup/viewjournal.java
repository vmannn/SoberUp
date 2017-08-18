/*
 * Copyright (c) Victor Ochia
 *    This work is available under the "MIT License".
 *    Please see the file LICENSE for license terms
 */

package quotebook.theoneandonly.com.soberup;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static quotebook.theoneandonly.com.soberup.R.string.diary;

public class viewjournal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewjournal);


        TextView my_entry = (TextView) findViewById(R.id.journal_text);


        SharedPreferences sharedpref = getSharedPreferences("userinfo", Context.MODE_PRIVATE);

        my_entry.append(sharedpref.getString("diarypost", ""));


        Button deletecontents = (Button) findViewById(R.id.deletediary);

        deletecontents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedpref = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpref.edit();
                editor.putString("diarypost", "");
                editor.putInt("diarynumb", 0);
                editor.apply();

                Toast.makeText(viewjournal.this, "Diary contents deleted", Toast.LENGTH_SHORT).show();


            }
        });







    }




}
