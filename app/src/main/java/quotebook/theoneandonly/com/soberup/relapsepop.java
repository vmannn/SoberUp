/*
 * Copyright (c) Victor Ochia
 *    This work is available under the "MIT License".
 *    Please see the file LICENSE for license terms
 */

package quotebook.theoneandonly.com.soberup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class relapsepop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();


        final int[] relapseArray = {R.drawable.relapsequote1,
                R.drawable.relapsequote2,
                R.drawable.relapsequote3,
                R.drawable.relapsequote4,
                R.drawable.relapsequote5,
                R.drawable.relapsequote6,
                R.drawable.relapsequote7,
                R.drawable.relapsequote8,
                R.drawable.relapsequote9,
                R.drawable.relapsequote10,
                R.drawable.relapsequote11,
                R.drawable.relapsequote12,
                R.drawable.relapsequote13,
                R.drawable.relapsequote14,
                R.drawable.relapsequote15,

        };



        setContentView(R.layout.activity_relapsepop);


        Intent activityThatCalled = getIntent();
        int number_provided = activityThatCalled.getExtras().getInt("randomnum");


        final ImageView addictpicture = (ImageView) findViewById(R.id.relapsequote1);

        addictpicture.setImageResource(relapseArray[number_provided]);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .6), (int) (height * .6) );





    }
}
