package warrenhong.generator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements topsectionfragment. TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void generate(String top, String bottom) {
        bottompicturefragment bottomFragment = (bottompicturefragment)
                getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setTheText(top, bottom);
    }
}
