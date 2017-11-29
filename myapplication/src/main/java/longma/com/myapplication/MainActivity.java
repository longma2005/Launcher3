package longma.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.launcher3.Launcher;

public class MainActivity extends Launcher {


    @Override
    protected boolean hasCustomContentToLeft() {
        return true;
    }

    @Override
    protected void populateCustomContentContainer() {
        super.populateCustomContentContainer();


        View customView = getLayoutInflater().inflate(R.layout.custom, null);
        CustomContentCallbacks callbacks = new CustomContentCallbacks() {
            @Override
            public void onShow(boolean fromResume) {
                Toast.makeText(MainActivity.this, "custom show", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onScrollProgressChanged(float progress) {
            }

            @Override
            public boolean isScrollingAllowed() {
                return true;
            }

            @Override
            public void onHide() {
                Toast.makeText(MainActivity.this, "custom hide", Toast.LENGTH_SHORT).show();
            }
        };
        addToCustomContentPage(customView, callbacks, "custom view");
    }
}
