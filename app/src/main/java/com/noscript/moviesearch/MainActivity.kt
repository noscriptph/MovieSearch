package com.noscript.moviesearch

// Importa la clase com.noscript.moviesearch.adapters.PeliculaAdapter que se encuentra en el mismo paquete
import com.noscript.moviesearch.adapters.PeliculaAdapter

// Importa la clase Intent del paquete android.content para crear y manejar intenciones (acciones)
import android.content.Intent

// Importa la clase Bundle del paquete android.os para manejar datos entre componentes de Android
import android.os.Bundle

// Importa la clase View del paquete android.view para trabajar con vistas en la interfaz de usuario
import android.view.View

// Importa la clase Toast del paquete android.widget para mostrar mensajes cortos en la aplicación
import android.widget.Toast

// Importa la clase AppCompatActivity del paquete androidx.appcompat.app para crear actividades compatibles con versiones anteriores de Android
import androidx.appcompat.app.AppCompatActivity

// Importa la clase LinearLayoutManager del paquete androidx.recyclerview.widget para gestionar el diseño de la lista en el RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

// Importa la clase ActivityMainBinding generada automáticamente del paquete com.noscript.moviesearch.databinding para vincular la actividad principal con su layout
import com.noscript.moviesearch.databinding.ActivityMainBinding

// Importa la clase Pelicula del paquete com.noscript.moviesearch.entities para trabajar con objetos de tipo Pelicula en la aplicación
import com.noscript.moviesearch.entities.Pelicula


/**
 * Actividad principal que muestra una lista de películas y permite enviar información sobre cada película por correo electrónico o compartirlo.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Infla el layout de la actividad y establece la vista raíz
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura el RecyclerView con un LinearLayoutManager
        binding.recyclerPeliculas.layoutManager = LinearLayoutManager(this)
        // Inicializa el adaptador para el RecyclerView
        initAdapter()
    }

    /**
     * Inicializa el adaptador para el RecyclerView y lo establece en el RecyclerView.
     */
    private fun initAdapter() {
        val peliculaAdapter = PeliculaAdapter()
        // Establece el adaptador en el RecyclerView
        binding.recyclerPeliculas.adapter = peliculaAdapter
        // Establece la lista de películas en el adaptador
        peliculaAdapter.peliculas = Pelicula.dataPeliculas.toMutableList()

        // Establece los listeners para los íconos de correo electrónico y compartir en el adaptador
        peliculaAdapter.onEmailIconClickListener =
            { pelicula -> enviarCorreoElectronicoPelicula(pelicula) }
        peliculaAdapter.onShareIconClickListener =
            { pelicula -> enviarContenidoCompartir(pelicula) }

        // Muestra un mensaje si la lista de películas está vacía
        if (peliculaAdapter.peliculas.isEmpty()) {
            binding.empty.visibility = View.VISIBLE
        } else {
            binding.empty.visibility = View.GONE
        }
    }

    /**
     * Abre una aplicación de correo electrónico con la información de la película predefinida.
     *
     * @param pelicula La película de la que se enviará la información por correo electrónico.
     */
    private fun enviarCorreoElectronicoPelicula(pelicula: Pelicula) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "message/rfc822"
        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("reemplazar_por_correo@gmail.com"))
        intent.putExtra(
            Intent.EXTRA_SUBJECT, "Te envio informacion de la pelicula ${pelicula.titulo}"
        )
        intent.putExtra(
            Intent.EXTRA_TEXT,
            "Informacion de la pelicula:\n" + "Titulo: ${pelicula.titulo}\n" + "Director: ${pelicula.director}\n" + "Genero: ${pelicula.genero}\n" + "Duracion: ${pelicula.duracion}\n" + "Descripcion: ${pelicula.descripcion}\n" + "Trailer: ${pelicula.trailer}"
        )
        // Verifica si hay una aplicación de correo electrónico disponible antes de iniciar la actividad
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(Intent.createChooser(intent, "Enviar por correo informacion de pelicula"))
        } else {
            // Muestra un mensaje de advertencia si no hay ninguna aplicación de correo electrónico disponible
            Toast.makeText(
                this, "Tienes que tener instalada una aplicacion de correo", Toast.LENGTH_LONG
            ).show()
        }
    }

    /**
     * Comparte la información de la película a través de otras aplicaciones.
     *
     * @param pelicula La película de la que se compartirá la información.
     */
    private fun enviarContenidoCompartir(pelicula: Pelicula) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(
            Intent.EXTRA_TEXT,
            "Informacion de la pelicula:\n" + "Titulo: ${pelicula.titulo}\n" + "Director: ${pelicula.director}\n" + "Genero: ${pelicula.genero}\n" + "Duracion: ${pelicula.duracion}\n" + "Descripcion: ${pelicula.descripcion}\n" + "Trailer: ${pelicula.trailer}"
        )
        // Verifica si hay una aplicación disponible para compartir antes de iniciar la actividad
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(Intent.createChooser(intent, "Compartir"))
        } else {
            // Muestra un mensaje de advertencia si no se encuentra ninguna aplicación para compartir
            Toast.makeText(
                this, "No se encontró ninguna aplicación para compartir", Toast.LENGTH_SHORT
            ).show()
        }
    }
}