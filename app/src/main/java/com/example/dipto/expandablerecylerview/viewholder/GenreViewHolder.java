package com.example.dipto.expandablerecylerview.viewholder;

import android.view.View;
import android.widget.TextView;

import com.example.dipto.expandablerecylerview.R;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

/**
 * Created by sakib on 11/28/2017.
 */

public class GenreViewHolder extends GroupViewHolder{

    TextView genre ;
    public GenreViewHolder(View itemView) {
        super(itemView);
        genre = itemView.findViewById(R.id.genre) ;
    }

    public void setGenreName(String genreName){
        genre.setText(genreName);
    }
}
