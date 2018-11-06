package heroicnamegenerator.anuvi;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;

public class HeroicName extends AppCompatActivity {

    String name;
    String lastname;
    String heroicTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragon_name);
        TextView dragonNameText = findViewById(R.id.dragonNameTextViewActivityDragonNameId);
        ImageView dragonImage = findViewById(R.id.imageViewActivityDragonNameId);
        TextView dragonTitle = findViewById(R.id.dragonNameTextViewActivityDragonTitle);

        Typeface typeFaceName = Typeface.createFromAsset(getAssets(), "fonts/ArgosGeorge.ttf");
        dragonNameText.setTypeface(typeFaceName);
        dragonTitle.setTypeface(typeFaceName);

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
                heroicTitle = "The Silent Death";
                dragonImage.setImageResource(R.drawable.a_the_silent_death);
                break;
            case "b":
                heroicTitle = "The Last Giant Slayer";
                dragonImage.setImageResource(R.drawable.b_the_last_giants_slayer);
                break;
            case "c":
                heroicTitle = "The Dragonslayer";
                dragonImage.setImageResource(R.drawable.c_dragonborn);
                break;
            case "d":
                heroicTitle = "The Falcon Eyed";
                dragonImage.setImageResource(R.drawable.d_falcon_eyed);
                break;
            case "e":
                heroicTitle = "The Black Crow";
                dragonImage.setImageResource(R.drawable.e_the_black_crow);
                break;
            case "f":
                heroicTitle = "The Red Blood";
                dragonImage.setImageResource(R.drawable.f_the_red_blood);
                break;
            case "g":
                heroicTitle = "The Guardian of The West";
                dragonImage.setImageResource(R.drawable.g_guardian_of_the_west);
                break;
            case "h":
                heroicTitle = "The Silverhand";
                dragonImage.setImageResource(R.drawable.h_silverhand);
                break;
            case "i":
                heroicTitle = "The Lost Heir";
                dragonImage.setImageResource(R.drawable.i_the_lost_heir);
                break;
            case "j":
                heroicTitle = "The Colossus";
                dragonImage.setImageResource(R.drawable.j_the_colossus);
                break;
            case "k":
                heroicTitle = "The Last Crusader";
                dragonImage.setImageResource(R.drawable.k_the_last_crusader);
                break;
            case "l":
                heroicTitle = "The Undefeated";
                dragonImage.setImageResource(R.drawable.l_the_undefeated);
                break;
            case "m":
                heroicTitle = "The Flesh Eater";
                dragonImage.setImageResource(R.drawable.m_the_flesh_eater);
                break;
            case "n":
                heroicTitle = "The Necromancer";
                dragonImage.setImageResource(R.drawable.n_the_necromancer);
                break;
            case "o":
                heroicTitle = "The Darkness Lover";
                dragonImage.setImageResource(R.drawable.o_the_darkness_lover);
                break;
            case "p":
                heroicTitle = "The Tyrant";
                dragonImage.setImageResource(R.drawable.p_the_tyrents_plague);
                break;
            case "q":
                heroicTitle = "The Putrid";
                dragonImage.setImageResource(R.drawable.q_the_putrid);
                break;
            case "r":
                heroicTitle = "The Stoneheart";
                dragonImage.setImageResource(R.drawable.r_stoneheart);
                break;
            case "s":
                heroicTitle = "The Reviled Knight";
                dragonImage.setImageResource(R.drawable.s_the_reviled_knight);
                break;
            case "t":
                heroicTitle = "The Son of The Wolves";
                dragonImage.setImageResource(R.drawable.t_son_of_the_wolves);
                break;
            case "u":
                heroicTitle = "The Orc Hunter";
                dragonImage.setImageResource(R.drawable.u_the_orc_hunter);
                break;
            case "w":
                heroicTitle = "The Last of His Blood";
                dragonImage.setImageResource(R.drawable.w_the_last_of_his_blood);
                break;
            case "v":
                heroicTitle = "The Grey Warlock";
                dragonImage.setImageResource(R.drawable.v_the_grey_warlock);
                break;
            case "x":
                heroicTitle = "The Forgotten Hero";
                dragonImage.setImageResource(R.drawable.x_the_forgotten_hero);
                break;
            case "y":
                heroicTitle = "The Bloodthirsty";
                dragonImage.setImageResource(R.drawable.y_the_bloodthirsty);
                break;
            case "z":
                heroicTitle = "The One Eyed";
                dragonImage.setImageResource(R.drawable.z_the_one_eyed);
                break;
        }

        String heroicname = name + lastname;
        dragonNameText.setText(heroicname);
        dragonTitle.setText(heroicTitle.toLowerCase());


    }
}
