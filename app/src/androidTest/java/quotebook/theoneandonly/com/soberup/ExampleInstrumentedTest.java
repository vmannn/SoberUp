/*
 * Copyright (c) Victor Ochia
 *    This work is available under the "MIT License".
 *    Please see the file LICENSE for license terms
 */

package quotebook.theoneandonly.com.soberup;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("quotebook.theoneandonly.com.soberup", appContext.getPackageName());
    }
}
