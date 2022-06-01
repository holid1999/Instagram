package com.example.instagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.instagram.databinding.ItemStoriesBinding;

import java.util.ArrayList;
import java.util.List;

public class StoriesAdapter extends RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder> {

    List<StoriesModel> list = new ArrayList<>();
    private OnStoriesItemClicListenere clicListenere;
    private ItemStoriesBinding binding;

    public StoriesAdapter(List<StoriesModel> list){
        this.list = list;
    }

    public void setClicListenere(OnStoriesItemClicListenere itemClicListenere){
        this.clicListenere = itemClicListenere;
    }

    @NonNull
    @Override
    public StoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemStoriesBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new StoriesViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StoriesViewHolder holder, int position) {
        binding.userAvataka.setIgnoreGravity(list.get(position).getImgUser());
        binding.username.setText(list.get(position).getUsenName());

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class StoriesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ItemStoriesBinding binding;

        public StoriesViewHolder(@NonNull ItemStoriesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;


            binding.userAvataka.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            clicListenere.onClick(view,getAdapterPosition());

        }
    }
}
