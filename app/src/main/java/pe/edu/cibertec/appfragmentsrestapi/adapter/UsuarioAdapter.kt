package pe.edu.cibertec.appfragmentsrestapi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.cibertec.appfragmentsrestapi.databinding.ItemPersonajeBinding
import pe.edu.cibertec.appfragmentsrestapi.databinding.ItemUsuarioBinding

class UsuarioAdapter : RecyclerView.Adapter<UsuarioAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemUsuarioBinding) :
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UsuarioAdapter.ViewHolder {
        val binding = ItemUsuarioBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UsuarioAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}