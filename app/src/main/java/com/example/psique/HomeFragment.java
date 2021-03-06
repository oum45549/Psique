package com.example.psique;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    //atributos
    Button b_help, b_info, b_articles, b_news, b_counselling, b_books;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);//para el menú
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        //inicializar atributos
        b_help = getView().findViewById(R.id.b_help);
        b_help.setOnClickListener(new View.OnClickListener() {
            @Override//botón para ir a Ayudas
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), HelpActivity.class));
                getActivity().finish();
            }
        });

        b_info = getView().findViewById(R.id.b_info);
        b_info.setOnClickListener(new View.OnClickListener() {
            @Override//botón para ir a Información
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), InfoActivity.class));
                getActivity().finish();
            }
        });

        b_articles = getView().findViewById(R.id.b_articles);
        b_articles.setOnClickListener(new View.OnClickListener() {
            @Override//botón para ir a Artículos
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ArticlesActivity.class));
                getActivity().finish();
            }
        });

        b_news = getView().findViewById(R.id.b_news);
        b_news.setOnClickListener(new View.OnClickListener() {
            @Override//botón para ir a Noticias
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), NewsActivity.class));
                getActivity().finish();

            }
        });

        b_counselling = getView().findViewById(R.id.b_counselling);
        b_counselling.setOnClickListener(new View.OnClickListener() {
            @Override//botón para ir a Orientación
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), CounsellingActivity.class));
                getActivity().finish();
            }
        });

        b_books = getView().findViewById(R.id.b_books);
        b_books.setOnClickListener(new View.OnClickListener() {
            @Override//botón para ir a Libros
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), BooksActivity.class));
                getActivity().finish();
            }
        });
    }
}
