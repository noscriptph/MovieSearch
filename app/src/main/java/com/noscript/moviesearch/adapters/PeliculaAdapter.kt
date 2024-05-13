package com.noscript.moviesearch.adapters

// Importa la clase LayoutInflater del paquete android.view para inflar diseños XML en objetos de vista en la actividad
import android.view.LayoutInflater

// Importa la clase ViewGroup del paquete android.view para proporcionar una vista padre para las vistas en la actividad
import android.view.ViewGroup

// Importa la clase RecyclerView del paquete androidx.recyclerview.widget para trabajar con el componente RecyclerView en la interfaz de usuario
import androidx.recyclerview.widget.RecyclerView

// Importa la clase PeliculaItemBinding generada automáticamente del paquete com.noscript.moviesearch.databinding para vincular los elementos de la vista del elemento de película con su diseño XML
import com.noscript.moviesearch.databinding.PeliculaItemBinding

// Importa la clase Pelicula del paquete com.noscript.moviesearch.entities para trabajar con objetos de tipo Pelicula en la aplicación
import com.noscript.moviesearch.entities.Pelicula


/**
 * Adaptador para el RecyclerView que muestra una lista de películas.
 *
 * @property onItemClickListener Función de devolución de llamada para manejar clics en elementos de películas.
 * @property onEmailIconClickListener Función de devolución de llamada para manejar clics en el ícono de correo electrónico.
 * @property onShareIconClickListener Función de devolución de llamada para manejar clics en el ícono de compartir.
 * @property peliculas Lista mutable de películas que se mostrarán en el RecyclerView.
 */
class PeliculaAdapter : RecyclerView.Adapter<PeliculaAdapter.PeliculaViewHolder>() {

    private lateinit var onItemClickListener: (Pelicula) -> Unit
    var onEmailIconClickListener: ((Pelicula) -> Unit)? = null
    var onShareIconClickListener: ((Pelicula) -> Unit)? = null


    var peliculas = mutableListOf<Pelicula>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    /**
     * Crea y devuelve un nuevo ViewHolder cuando se invocado por el RecyclerView.
     *
     * @param parent El ViewGroup en el que se inflará la nueva vista.
     * @param viewType El tipo de vista del nuevo ViewHolder.
     * @return Un nuevo ViewHolder que contiene la vista de un elemento de película.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder {
        val bindingItem =
            PeliculaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PeliculaViewHolder(bindingItem)
    }

    /**
     * Vincula los datos de una película específica en una posición dada en el RecyclerView.
     *
     * @param holder El ViewHolder que debe actualizarse para representar el contenido de la película en la posición dada en el conjunto de datos.
     * @param position La posición de la película en el conjunto de datos.
     */
    override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) {
        val pelicula = peliculas[position]
        holder.bind(pelicula)

        holder.bindingItem.emailImg.setOnClickListener {
            onEmailIconClickListener?.invoke(pelicula)
        }

        holder.bindingItem.shareImg.setOnClickListener {
            onShareIconClickListener?.invoke(pelicula)
        }
    }

    /**
     * Devuelve el número total de elementos en el conjunto de datos.
     *
     * @return El número total de películas en el conjunto de datos.
     */
    override fun getItemCount(): Int {
        return peliculas.size
    }

    /**
     * ViewHolder que representa cada elemento de película en el RecyclerView.
     *
     * @param bindingItem La instancia de la clase generada Binding para acceder a los elementos de la vista.
     */
    inner class PeliculaViewHolder(val bindingItem: PeliculaItemBinding) :
        RecyclerView.ViewHolder(bindingItem.root) {

        /**
         * Vincula los datos de una película a la vista de elementos de película.
         *
         * @param pelicula La película que se va a mostrar.
         */
        fun bind(pelicula: Pelicula) {
            with(bindingItem) {

                anioTxt.text = pelicula.anio.toString()
                tituloTxt.text = pelicula.titulo
                categoriaTxt.text = pelicula.genero
                descripcionTxt.text = pelicula.descripcion
                // Maneja el clic en el título para expandir o contraer la descripción
                tituloTxt.setOnClickListener {
                    descripcionTxt.visibility =
                        if (descripcionTxt.visibility == android.view.View.VISIBLE ) android.view.View.GONE else android.view.View.VISIBLE
                }
            }
        }
    }
}
