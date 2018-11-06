package heroicnamegenerator.anuvi;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;


public class HeroicName extends AppCompatActivity {

//    private static final String APP_ID = "ca-app-pub-4844192903995686~1540537457";
//    private static final String AD_UNIT_ID = "ca-app-pub-4844192903995686/9344789052";

//    //Test ID
//    private static final String AD_UNIT_ID = "ca-app-pub-3940256099942544/5224354917";
//    private static final String APP_ID = "ca-app-pub-3940256099942544~3347511713";

    TextView dragonNameText;
    TextView dragonTitle;
    TextView dovakinNameText;
    TextView dovakinTitle;
    ImageView dragonImage;
    WebView sandaraWebView;

    TextView videoBanner;
    //private RewardedVideoAd mRewardedVideoAd;
    boolean rewardGain;

    String name;
    String lastname;
    String heroicTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragon_name);
        dragonNameText = (TextView) findViewById(R.id.dragonNameTextViewActivityDragonNameId);
        dragonImage = (ImageView) findViewById(R.id.imageViewActivityDragonNameId);
        dragonTitle =(TextView) findViewById(R.id.dragonNameTextViewActivityDragonTitle);



//        //Initialize the reward ads
//        MobileAds.initialize(this, APP_ID);

        Typeface typeFaceName = Typeface.createFromAsset(getAssets(), "fonts/ArgosGeorge.ttf");
        dragonNameText.setTypeface(typeFaceName);
        dragonTitle.setTypeface(typeFaceName);


//        //Set reward ad
//        videoBanner = (TextView) findViewById(R.id.dovakinBanner);
//        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
//        mRewardedVideoAd.setRewardedVideoAdListener(this);
//        loadRewardedVideoAd();
//
//        videoBanner.setVisibility(View.INVISIBLE);
//
//
//        videoBanner.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (mRewardedVideoAd.isLoaded()) {
//                    mRewardedVideoAd.show();
//                }
//
//            }
//        });


//        //WebView operation
//        sandaraWebView = (WebView) findViewById(R.id.sandara);
//        String sandaraStyle = "<style>  a{ color: white; text-decoration: none; font-size: 14px}</style>";
//        String sandaraLink = "<p align=\"right\"><a href=\"http://sandara.deviantart.com/\">sandara.deviantart.com</a></p>";
//        String sandaraOutput = sandaraStyle + sandaraLink;
//        sandaraWebView.loadDataWithBaseURL(null, sandaraOutput, "text/html", "UTF-8", null);
//        sandaraWebView.setBackgroundColor(Color.TRANSPARENT);

        Intent in = this.getIntent();

        String dragonName = in.getStringExtra("HeroicName");


        String firstLetter = dragonName.substring(0, 1);
        String secondLetter = dragonName.substring(1, 2);
        String thirdLetter = dragonName.substring(2, 3);




        switch (firstLetter) {
            case "a":
                name = "Theo";
                break;
            case "b":
                name = "Thra";
                break;
            case "c":
                name = "Ara";
                break;
            case "d":
                name = "Blad";
                break;
            case "e":
                name = "Aede";
                break;
            case "f":
                name = "Gala";
                break;
            case "g":
                name = "Harren";
                break;
            case "h":
                name = "Bane";
                break;
            case "i":
                name = "Aring";
                break;
            case "j":
                name = "Var";
                break;
            case "k":
                name = "Dae";
                break;
            case "l":
                name = "Mene";
                break;
            case "m":
                name = "Ade";
                break;
            case "n":
                name = "Hilde";
                break;
            case "o":
                name = "Ber";
                break;
            case "p":
                name = "Art";
                break;
            case "q":
                name = "Mal";
                break;
            case "r":
                name = "Hal";
                break;
            case "s":
                name = "Wer";
                break;
            case "t":
                name = "Neme";
                break;
            case "u":
                name = "Riwan";
                break;
            case "w":
                name = "Perce";
                break;
            case "v":
                name = "Mara";
                break;
            case "x":
                name = "Vae";
                break;
            case "y":
                name = "Childe";
                break;
            case "z":
                name = "Rag";
                break;
        }

        switch (secondLetter) {
            case "a":
                lastname = "dor";
                break;
            case "b":
                lastname = "vain";
                break;
            case "c":
                lastname = "thor";
                break;
            case "d":
                lastname = "den";
                break;
            case "e":
                lastname = "wyn";
                break;
            case "f":
                lastname = "lard";
                break;
            case "g":
                lastname = "wen";
                break;
            case "h":
                lastname = "dain";
                break;
            case "i":
                lastname = "elor";
                break;
            case "j":
                lastname = "wann";
                break;
            case "k":
                lastname = "dall";
                break;
            case "l":
                lastname = "vel";
                break;
            case "m":
                lastname = "anor";
                break;
            case "n":
                lastname = "iel";
                break;
            case "o":
                lastname = "rin";
                break;
            case "p":
                lastname = "ley";
                break;
            case "q":
                lastname = "nel";
                break;
            case "r":
                lastname = "on";
                break;
            case "s":
                lastname = "agan";
                break;
            case "t":
                lastname = "lor";
                break;
            case "u":
                lastname = "bon";
                break;
            case "w":
                lastname = "din";
                break;
            case "v":
                lastname = "ric";
                break;
            case "x":
                lastname = "rix";
                break;
            case "y":
                lastname = "val";
                break;
            case "z":
                lastname = "lot";
                break;
        }


        switch (thirdLetter) {
            case "a":
                heroicTitle ="The Silent Death";
                dragonImage.setImageResource(R.drawable.a_the_silent_death);
                break;
            case "b":
                heroicTitle ="The Last Giant Slayer";
                dragonImage.setImageResource(R.drawable.b_the_last_giants_slayer);
                break;
            case "c":
                heroicTitle ="The Dragonslayer";
                dragonImage.setImageResource(R.drawable.c_dragonborn);
                break;
            case "d":
                heroicTitle ="The Falcon Eyed";
                dragonImage.setImageResource(R.drawable.d_falcon_eyed);
                break;
            case "e":
                heroicTitle ="The Black Crow";
                dragonImage.setImageResource(R.drawable.e_the_black_crow);
                break;
            case "f":
                heroicTitle ="The Red Blood";
                dragonImage.setImageResource(R.drawable.f_the_red_blood);
                break;
            case "g":
                heroicTitle ="The Guardian of The West";
                dragonImage.setImageResource(R.drawable.g_guardian_of_the_west);
                break;
            case "h":
                heroicTitle ="The Silverhand";
                dragonImage.setImageResource(R.drawable.h_silverhand);
                break;
            case "i":
                heroicTitle ="The Lost Heir";
                dragonImage.setImageResource(R.drawable.i_the_lost_heir);
                break;
            case "j":
                heroicTitle ="The Colossus";
                dragonImage.setImageResource(R.drawable.j_the_colossus);
                break;
            case "k":
                heroicTitle ="The Last Crusader";
                dragonImage.setImageResource(R.drawable.k_the_last_crusader);
                break;
            case "l":
                heroicTitle ="The Undefeated";
                dragonImage.setImageResource(R.drawable.l_the_undefeated);
                break;
            case "m":
                heroicTitle ="The Flesh Eater";
                dragonImage.setImageResource(R.drawable.m_the_flesh_eater);
                break;
            case "n":
                heroicTitle ="The Necromancer";
                dragonImage.setImageResource(R.drawable.n_the_necromancer);
                break;
            case "o":
                heroicTitle ="The Darkness Lover";
                dragonImage.setImageResource(R.drawable.o_the_darkness_lover);
                break;
            case "p":
                heroicTitle ="The Tyrant";
                dragonImage.setImageResource(R.drawable.p_the_tyrents_plague);
                break;
            case "q":
                heroicTitle ="The Putrid";
                dragonImage.setImageResource(R.drawable.q_the_putrid);
                break;
            case "r":
                heroicTitle ="The Stoneheart";
                dragonImage.setImageResource(R.drawable.r_stoneheart);
                break;
            case "s":
                heroicTitle ="The Reviled Knight";
                dragonImage.setImageResource(R.drawable.s_the_reviled_knight);
                break;
            case "t":
                heroicTitle ="The Son of The Wolves";
                dragonImage.setImageResource(R.drawable.t_son_of_the_wolves);
                break;
            case "u":
                heroicTitle ="The Orc Hunter";
                dragonImage.setImageResource(R.drawable.u_the_orc_hunter);
                break;
            case "w":
                heroicTitle ="The Last of His Blood";
                dragonImage.setImageResource(R.drawable.w_the_last_of_his_blood);
                break;
            case "v":
                heroicTitle ="The Grey Warlock";
                dragonImage.setImageResource(R.drawable.v_the_grey_warlock);
                break;
            case "x":
                heroicTitle ="The Forgotten Hero";
                dragonImage.setImageResource(R.drawable.x_the_forgotten_hero);
                break;
            case "y":
                heroicTitle ="The Bloodthirsty";
                dragonImage.setImageResource(R.drawable.y_the_bloodthirsty);
                break;
            case "z":
                heroicTitle ="The One Eyed";
                dragonImage.setImageResource(R.drawable.z_the_one_eyed);
                break;
        }

        String heroicname = name + lastname;
        dragonNameText.setText(heroicname);
        dragonTitle.setText(heroicTitle.toLowerCase());


//        // Read if you have reward
//        SharedPreferences readReward = getSharedPreferences("Reward", MODE_PRIVATE);
//        rewardGain = readReward.getBoolean("Reward", false);

//        if (rewardGain == true) {
//            //Set font to dovakin text
//            Typeface typeFace = Typeface.createFromAsset(getAssets(), "fonts/dragon_alphabet.ttf");
//            dovakinNameText.setTypeface(typeFace);
//
//            dovakinNameText.setVisibility(View.VISIBLE);
//            dovakinTitle.setVisibility(View.VISIBLE);
//            videoBanner.setVisibility(View.GONE);
//
//            dovakinNameText.setText(dragonName);
//
//
//        } else {
//            dovakinNameText.setVisibility(View.GONE);
//            dovakinTitle.setVisibility(View.GONE);
//
//        }

    }


//    @Override
//    public void onPause() {
//        mRewardedVideoAd.pause(this);
//        super.onPause();
//    }
//
//    @Override
//    public void onResume() {
//       // mRewardedVideoAd.resume(this);
//        super.onResume();
//    }
//
//    @Override
//    public void onDestroy() {
//        //mRewardedVideoAd.resume(this);
//        super.onDestroy();
//    }
//
//
//    private void loadRewardedVideoAd() {
//        //if (!mRewardedVideoAd.isLoaded()) {
//        mRewardedVideoAd.loadAd(AD_UNIT_ID, new AdRequest.Builder().build());
//        // }
//    }
//
//    @Override
//    public void onRewardedVideoAdLoaded() {
//
//        if (rewardGain == false) {
//            videoBanner.setVisibility(View.VISIBLE);
//        }
//
//
//    }
//
//    @Override
//    public void onRewardedVideoAdOpened() {
//    }
//
//    @Override
//    public void onRewardedVideoStarted() {
//    }
//
//    @Override
//    public void onRewardedVideoAdClosed() {
//    }
//
//    @Override
//    public void onRewarded(RewardItem rewardItem) {
//
//        //Write boolen reward
//        boolean reward = true;
//        SharedPreferences.Editor editor = getSharedPreferences("Reward", MODE_PRIVATE).edit();
//        editor.putBoolean("Reward", reward);
//        editor.apply();
//
//
//    }
//
//    @Override
//    public void onRewardedVideoAdLeftApplication() {
//    }
//
//    @Override
//    public void onRewardedVideoAdFailedToLoad(int i) {
//    }
}
