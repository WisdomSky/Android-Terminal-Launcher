package com.iwisdomsky.tlauncher;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		WebView tty = (WebView)findViewById(R.id.tty);
		
		tty.getSettings().setJavaScriptEnabled(true);
		tty.getSettings().setBuiltInZoomControls(true);
        tty.getSettings().setDisplayZoomControls(false);
        tty.getSettings().setPluginsEnabled(true);
        tty.getSettings().setJavaScriptEnabled(true);
        tty.setHorizontalScrollBarEnabled(false);
        tty.getSettings().setDomStorageEnabled(true);
		tty.setWebChromeClient(new WebChromeClient());
		tty.loadUrl("file:///android_asset/tty.html");
		
    }
}
