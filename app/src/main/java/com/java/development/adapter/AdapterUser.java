package com.java.development.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.java.development.data.model.UserModel;
import com.java.development.databinding.UserDataBinding;
import java.util.List;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.ViewHolder> {

    private final List<UserModel> listUser;
    private final Context context;

    public AdapterUser(List<UserModel> listUser, Context context) {
        this.listUser = listUser;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterUser.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        UserDataBinding binding = UserDataBinding.inflate(LayoutInflater.from(context),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterUser.ViewHolder holder, int position) {
        UserModel user = listUser.get(position);
        holder.binding.no.setText(String.valueOf(user.getId()));
        holder.binding.name.setText(user.getName());
        holder.binding.height.setText(String.valueOf(user.getHeight()));
        holder.binding.weight.setText(String.valueOf(user.getWeight()));
        holder.binding.age.setText(String.valueOf(user.getAge()));
    }

    @Override
    public int getItemCount() {
        return listUser.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        UserDataBinding binding;
        public ViewHolder(UserDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
