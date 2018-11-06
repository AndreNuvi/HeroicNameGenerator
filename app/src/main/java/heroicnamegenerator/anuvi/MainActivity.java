package heroicnamegenerator.anuvi;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private int buttonClicked;

    private InterstitialAd mInterstitialAd;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.action_info:
                Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
                startActivity(intent);
            default:
        }
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.yourNameEditTextActivityMainId);
        editText2 = findViewById(R.id.yourSurnameEditTextActivityMainId);
        Button buttonGenerate = findViewById(R.id.checkYourDragonNameButtonActivityMainID);
        Button buttonReset = findViewById(R.id.resetButtonActivityMainID);
        Button random = findViewById(R.id.generateButtonActivityMainID);


        //Banner Ad
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-4844192903995686~5445211452");
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        buttonGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked = 1;
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    beginGenerateDragonName();
                }
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
                editText2.setText("");
            }
        });

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked = 2;
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    generateRandom();
                }

            }
        });

        //Interstitial Ad between this and next Activity
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4844192903995686/8398677857");
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
                if (buttonClicked == 1) {
                    beginGenerateDragonName();
                } else if (buttonClicked == 2) {

                    generateRandom();
                }
            }
        });
        requestNewInterstitial();
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mInterstitialAd.loadAd(adRequest);
    }

    private void beginGenerateDragonName() {

        String yourName = editText1.getText().toString();
        String yourLastName = editText2.getText().toString();


        if (yourName.length() == 0) {
            Toast.makeText(MainActivity.this, "Enter your name", Toast.LENGTH_SHORT).show();
        } else if (yourLastName.length() == 0) {
            Toast.makeText(MainActivity.this, "Enter your last name", Toast.LENGTH_SHORT).show();
        } else if (yourName.length() == 1) {
            Toast.makeText(MainActivity.this, "You have to write at least two letters in your name", Toast.LENGTH_SHORT).show();
        } else {

            String firstLettersOfYourName = yourName.substring(0, 1);
            String lastLettersOfYourName = yourName.substring(yourName.length() - 1);
            String firstLetterYourLastName = yourLastName.substring(0, 1);

            String heroicName = firstLettersOfYourName.toLowerCase() + lastLettersOfYourName.toLowerCase() + firstLetterYourLastName.toLowerCase();


            //Send intent
            Intent intent = new Intent(MainActivity.this, HeroicName.class);
            intent.putExtra("HeroicName", heroicName + "");
            startActivity(intent);
        }

    }

    private void generateRandom() {

        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "z", "y", "z"};
        String firstLetter = alphabet[makeRandomLetters()];
        String secondLetter = alphabet[makeRandomLetters()];
        String thirdLetter = alphabet[makeRandomLetters()];

        String wholeLetters = firstLetter + secondLetter + thirdLetter;


        //Send intent
        Intent intent = new Intent(MainActivity.this, HeroicName.class);
        intent.putExtra("HeroicName", wholeLetters);
        startActivity(intent);
    }

    private int makeRandomLetters() {
        int min = 0;
        int max = 25;
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }


}
