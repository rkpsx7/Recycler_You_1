package com.example.recycler_you_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ArticleModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildDataBase();
        setDataToAdapter();
    }
    private void setDataToAdapter() {
        articleAdapter articleAdapter = new articleAdapter(arrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(articleAdapter);
    }

    private void buildDataBase() {
        arrayList.add(new ArticleModel(R.drawable.wtchdog, "FEATURED", "WATCHDOGS", "Watch Dogs (stylized as WATCH_DOGS) is an action-adventure video game franchise developed and published by Ubisoft. The series' eponymous first title was released in 2014, and it has featured three games in total, the most recent being 2020's Watch Dogs: Legion. Several tie-in books and a comic book miniseries set in the games' universe have also been published."));
        arrayList.add(new ArticleModel(R.drawable.codmw, "FEATURED", "CALL OF DUTY:MW", "Call of Duty: Modern Warfare is a 2019 first-person shooter video game developed by Infinity Ward and published by Activision. Serving as the sixteenth overall installment in the Call of Duty series, as well as a reboot of the Modern Warfare sub-series, it was released on October 25, 2019, for Microsoft Windows, PlayStation 4, and Xbox One"));
        arrayList.add(new ArticleModel(R.drawable.nfstherun, "FEATURED", "NFS:THE RUN", "NFS The Run is a combination of arcade and racing game, which is the work of Electronic Arts studio. In this game huge emphasis was put not only on the races themselves, but also on the storyline. The player becomes the protagonist named Jack. He has got debts in a very dangerous and uncompromising criminal organization called The Mob."));
        arrayList.add(new ArticleModel(R.drawable.forza, "FEATURED", "FORZA HORIZON:4", "Forza Horizon 4 is a PC video game that puts you in the driver’s seat as you compete in a synchronized shared world of motorsport racing. With over 450 different licensed cars, there’s no shortage of rides to choose from.And with fixed seasons across servers, every player will experience the same road conditions as your for an even playing field."));
        arrayList.add(new ArticleModel(R.drawable.pubg, "FEATURED", "PUBG", "PUBG MOBILE is a Battle Royale mobile game created independently by Lightspeed & Quantum Studios of Tencent Game, officially licensed by PLAYERUNKNOWN’S BATTLEGROUNDS. It was released globally in March 2018."));

    }

    private void initViews() {
        recyclerView=findViewById(R.id.RecyclerViewMain);
    }

}