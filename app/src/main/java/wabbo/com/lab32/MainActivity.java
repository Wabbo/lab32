package wabbo.com.lab32;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements Kobry {

    Dbot bot;
    Dtop top;
    FragmentManager manager ;
    FragmentTransaction transaction ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            top = new Dtop();
            bot = new Dbot();
             manager = getSupportFragmentManager();
             transaction = manager.beginTransaction();
            transaction.add(R.id.top, top, "TOP");
            transaction.add(R.id.bot, bot, "BOT");
            transaction.commit();
        }
        else {
            top = (Dtop) getSupportFragmentManager().findFragmentById(R.id.top);
            bot = (Dbot) getSupportFragmentManager().findFragmentById(R.id.bot);
        }

    }

    @Override
    public void comm(int a) {
        bot.shangData(a);

    }


}