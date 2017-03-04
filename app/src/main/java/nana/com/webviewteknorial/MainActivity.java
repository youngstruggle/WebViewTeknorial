package nana.com.webviewteknorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    String url = "http://teknorial.com/";
    private WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView view = (WebView) findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setSupportZoom(true);
        view.loadUrl(url);
    }
    

}
