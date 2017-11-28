package com.example.dipto.expandablerecylerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dipto.expandablerecylerview.R;
import com.example.dipto.expandablerecylerview.models.Artist;
import com.example.dipto.expandablerecylerview.viewholder.ArtistViewHolder;
import com.example.dipto.expandablerecylerview.viewholder.GenreViewHolder;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by sakib on 11/28/2017.
 */

public class GenreAdapter extends ExpandableRecyclerViewAdapter<GenreViewHolder, ArtistViewHolder> {

    private final LayoutInflater inflater;
    private Context context;

    public GenreAdapter(List<? extends ExpandableGroup> groups, Context context) {
        super(groups);
        this.context = context;
        inflater = LayoutInflater.from(context) ;
    }

    @Override
    public GenreViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_genre, parent, false) ;
        GenreViewHolder genreViewHolder = new GenreViewHolder(view) ;
        return genreViewHolder;
    }

    @Override
    public ArtistViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_artist, parent, false) ;
        ArtistViewHolder artistViewHolder = new ArtistViewHolder(view) ;
        return artistViewHolder;
    }

    @Override
    public void onBindChildViewHolder(ArtistViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        Artist artist = (Artist) group.getItems().get(childIndex);
        holder.setArtistName(artist.getName());
    }

    @Override
    public void onBindGroupViewHolder(GenreViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setGenreName(group.getTitle());
    }
}
