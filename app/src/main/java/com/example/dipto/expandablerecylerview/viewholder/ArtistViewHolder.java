package com.example.dipto.expandablerecylerview.viewholder;

import android.view.View;
import android.widget.TextView;

import com.example.dipto.expandablerecylerview.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by sakib on 11/28/2017.
 */

public class ArtistViewHolder extends ChildViewHolder {

    TextView name ;
    public ArtistViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.artist) ;
    }

    public void setArtistName(String artistName){
        name.setText(artistName);
    }
}
