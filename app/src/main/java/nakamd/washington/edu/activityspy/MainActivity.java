package nakamd.washington.edu.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getEventName("Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        getEventName("Start");
    }

    @Override
    protected void onResume() {
        super.onStart();
        getEventName("Resume");
    }

    @Override
    protected void onRestart() {
        super.onStart();
        getEventName("Restart");
    }

    @Override
    protected void onPause() {
        super.onStart();
        getEventName("Pause");
    }

    @Override
    protected void onStop() {
        super.onStart();
        getEventName("Start");
    }

    private void getEventName(String act) {
        Log.i("ActivitySpy", "on " + act + " event fired");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        getEventName("Destroy");
        Log.e("ActivitySpy", "We’re going down, Captain!");
        super.onDestroy();
        // The activity is about to be destroyed.
    }
}
