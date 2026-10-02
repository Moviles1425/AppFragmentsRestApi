package pe.edu.cibertec.appfragmentsrestapi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.cibertec.appfragmentsrestapi.databinding.ItemPersonajeBinding


class PersonajeAdapter
    : RecyclerView.Adapter<PersonajeAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemPersonajeBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonajeAdapter.ViewHolder {
        val binding = ItemPersonajeBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PersonajeAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 0
    }

}