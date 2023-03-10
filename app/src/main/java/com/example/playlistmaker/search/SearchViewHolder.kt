package com.example.playlistmaker.search

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.playlistmaker.R
import com.example.playlistmaker.models.Track

class SearchViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val trackName: TextView = itemView.findViewById(R.id.tvTrackName)
    private val artistName: TextView = itemView.findViewById(R.id.tvArtistName)
    private val trackTime: TextView = itemView.findViewById(R.id.tvTrackTime)
    private val artworkUrl100: ImageView = itemView.findViewById(R.id.ivTrackArt)

    fun bind(track: Track) {
        trackName.text = track.trackName
        artistName.text = track.artistName
        trackTime.text = track.trackTime
        Glide
            .with(itemView)
            .load(track.artworkUrl100)
            .placeholder(R.drawable.icon_image)
            .transform(RoundedCorners(2))
            .centerCrop()
            .into(artworkUrl100)
    }
}