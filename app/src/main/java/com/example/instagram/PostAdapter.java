package com.example.instagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.instagram.databinding.ItemPostBinding;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private ItemPostBinding binding;
    private List<PostModel> list = new ArrayList<>();

    public void setPosts(List<PostModel> posts) {
        this.list = posts;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemPostBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new PostViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        Glide.with(binding.getRoot().getContext())
                .load(list.get(position).getPostImage())
                .into(binding.post);
        holder.binding.txtUsername.setText(list.get(position).getUserName());
        holder.binding.txtLocation.setText(list.get(position).getLocation());
        holder.binding.txtDescription.setText(list.get(position).getDescription());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        private ItemPostBinding binding;

        public PostViewHolder(@NonNull ItemPostBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
