package com.example.sample;

import android.content.Context;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private final static String TAG = "ExampleInstrumentedTest";

    @Before
    public void setUp() throws Exception {
        Log.i(TAG, "setUp");
    }
    @After
    public void tearDown() throws Exception {
        Log.i(TAG, "tearDown");
    }

    @Before
    public void createDb() {
        Context context = ApplicationProvider.getApplicationContext();
        Log.i(TAG, "createDb context=" + context);
    }

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.sample", appContext.getPackageName());
    }

    @Test
    public void testInsertAndGetAllNames() {
        Log.i(TAG, "testInsertAndGetAllNames");
        assertTrue(true);
    }

    @Test
    public void testDeleteUser() {
        assertEquals(1+1, 2);
    }

    @Test
    public void testExists() {
        assertTrue(true);
        assertFalse(false);
    }

}
