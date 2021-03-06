package com.okom.week5assessment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.okom.week5assessment.databinding.ActivityMainBinding
import com.okom.week5assessment.databinding.ProfileItemBinding

class ProfileAdapter (val names: List<ProfileModel>): RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>(){
    class ProfileViewHolder(val binding: ProfileItemBinding):RecyclerView.ViewHolder(binding.root) {

        fun bind(name : ProfileModel){
            binding.firstname.text = name. firstname
            binding .tvsurname.text = name.tvsurname

            if (name.isObama){
                binding.obama.setImageResource(R.drawable.ic_obama)
                }
            else{
                binding.obama.setImageResource(R.drawable.ic_trump)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val binding:ProfileItemBinding = ProfileItemBinding.inflate(LayoutInflater.from(parent.context))
           return ProfileViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val name = names.get(position)
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return  names.size
    }

}