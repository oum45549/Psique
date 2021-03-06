package com.example.psique;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ArticlesActivity extends AppCompatActivity {

    //atributos
    List<Articles> articlesList;
    Button b_exitArticles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        /**
         * Salir de la pantalla de artículos
         */
        b_exitArticles = findViewById(R.id.b_exitArticles);
        b_exitArticles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ArticlesActivity.this, MenuActivity.class));
                finish();
            }
        });

        init();
    }


    /**
     * mete en la lista todos los datos de las cards
     */
    public void populateList() {
        articlesList = new ArrayList<>();

        int depressionId = R.drawable.home_depression;
        int anxietyId = R.drawable.home_anxiety;
        int eatingDisorderId = R.drawable.home_eating_disorder;

        articlesList.add(new Articles(depressionId, "Depresión", "Neurotrophins and depression", "https://www.sciencedirect.com/science/article/abs/pii/S0165614799013097"));
        articlesList.add(new Articles(depressionId, "Depresión", "Hypercortisolemia and Depression", "https://journals.lww.com/psychosomaticmedicine/Abstract/2005/05001/Hypercortisolemia_and_Depression.7.aspx"));
        articlesList.add(new Articles(depressionId, "Depresión", "Poststroke Depression: A Review", "https://journals.sagepub.com/doi/abs/10.1177/070674371005500602"));
        articlesList.add(new Articles(depressionId, "Depresión", "The mechanism of depression", "https://psycnet.apa.org/record/1955-01239-001"));

        articlesList.add(new Articles(anxietyId, "Ansiedad", "Measures of Anxiety", "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC3879951/"));
        articlesList.add(new Articles(anxietyId, "Ansiedad", "The development of anxiety", "https://psycnet.apa.org/buy/1998-04232-001"));
        articlesList.add(new Articles(anxietyId, "Ansiedad", "The Psychology of Anxiety", "https://www.taylorfrancis.com/books/mono/10.4324/9781315673127/psychology-anxiety-eugene-levitt"));

        articlesList.add(new Articles(eatingDisorderId, "TCA", "CAUSES OF EATING DISORDERS", "http://www.gruberpeplab.com/teaching/psych3303_spring2019/documents/4.1_Polivy.Herman2002.pdf"));
        articlesList.add(new Articles(eatingDisorderId, "TCA", "Risk factors for eating disorders.", "https://psycnet.apa.org/buy/2007-04834-005"));
        articlesList.add(new Articles(eatingDisorderId, "TCA", "Outcome of Eating Disorders", "https://www.sciencedirect.com/science/article/abs/pii/S1056499308000631"));
    }

    /**
     * LLama al método de meter los objetos a la lista
     * Declara el ReclyclerView
     * Declara el adaptador
     * Declara el layoutManager para el recyclerView
     * Da el adaptador al recyclerView
     */
    public void init() {
        populateList();

        ArticlesListAdapter listAdapter = new ArticlesListAdapter(articlesList, this);
        RecyclerView recyclerView = findViewById(R.id.rv_articles);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}