package com.noscript.moviesearch.entities

class Pelicula(
    val id: String,
    val titulo: String,
    val anio: Int,
    val director: String,
    val genero: String,
    val duracion: Int,
    val descripcion: String,
    val trailer: String

) {
    companion object {
        val dataPeliculas = listOf(
            Pelicula(
                "p1",
                "El Padrino",
                1972,
                "Francis Ford Coppola",
                "Drama, Crimen",
                175,
                "La historia de la familia criminal Corleone en Nueva York, liderada por el patriarca Don Vito Corleone, y los cambios que experimenta la familia a lo largo de los años.",
                "https://www.youtube.com/watch?v=sY1S34973zA"
            ), Pelicula(
                "p2",
                "El Señor de los Anillos: El retorno del Rey",
                2003,
                "Peter Jackson",
                "Fantasía, Aventura",
                201,
                "Frodo y Sam continúan su viaje hacia Mordor para destruir el Anillo Único y derrotar definitivamente a Sauron, mientras Aragorn se prepara para asumir su verdadero destino como rey.",
                "https://www.youtube.com/watch?v=r5X-hFf6Bwo"
            ), Pelicula(
                "p3",
                "Pulp Fiction",
                1994,
                "Quentin Tarantino",
                "Crimen, Drama",
                154,
                "Tres historias se entrelazan en el submundo criminal de Los Ángeles: el cobrador de deudas Jules Winnfield y el sicario Vincent Vega, una pareja de gánsteres que se meten en problemas, la esposa de un gánster y un boxeador que deben esconderse.",
                "https://www.youtube.com/watch?v=s7EdQ4FqbhY"
            ), Pelicula(
                "p4",
                "El Padrino: Parte II",
                1974,
                "Francis Ford Coppola",
                "Drama, Crimen",
                200,
                "La historia de Vito Corleone en sus inicios en la década de 1920 y la de su hijo Michael en los años 50, mientras consolida su poder sobre las familias criminales de Nueva York.",
                "https://www.youtube.com/watch?v=9O1Iy9od7-A"
            ), Pelicula(
                "p5",
                "El Imperio Contraataca",
                1980,
                "Irvin Kershner",
                "Ciencia ficción, Aventura",
                124,
                "Luke Skywalker, junto a Han Solo, Chewbacca y los droides C-3PO y R2-D2, se une a la Alianza Rebelde en su lucha contra el malvado Imperio Galáctico.",
                "https://www.youtube.com/watch?v=JNwNXF9Y6kY"
            ), Pelicula(
                "p6",
                "Uno de los nuestros",
                1990,
                "Martin Scorsese",
                "Crimen, Drama",
                146,
                "La historia de Henry Hill y su vida en la mafia, desde que de niño decide unirse a ella hasta que, años después, decide delatarla.",
                "https://www.youtube.com/watch?v=qo5jJpHtI1Y"
            ), Pelicula(
                "p7",
                "Forrest Gump",
                1994,
                "Robert Zemeckis",
                "Drama, Romance",
                142,
                "Forrest Gump, un hombre con un coeficiente intelectual por debajo del promedio, es testigo y partícipe de los principales acontecimientos históricos y culturales de Estados Unidos desde la década de 1950 hasta finales del siglo XX.",
                "https://www.youtube.com/watch?v=YNh9Es8Ut6U"
            ), Pelicula(
                "p8",
                "El club de la lucha",
                1999,
                "David Fincher",
                "Drama",
                139,
                "Un empleado de oficina insomne, harto de su vida, se cruza con un vendedor peculiar. Juntos crean un club secreto de lucha como terapia y pronto se extiende por todo el país.",
                "https://www.youtube.com/watch?v=qtRKdVHc-cE"
            ), Pelicula(
                "p9",
                "Terminator 2: El juicio final",
                1991,
                "James Cameron",
                "Ciencia ficción, Acción",
                137,
                "John Connor, el futuro líder de la resistencia, es protegido por un Terminator T-800 enviado del futuro, mientras huye de un Terminator T-1000 más avanzado, enviado para matarlo.",
                "https://www.youtube.com/watch?v=eajuMYNYtuY"
            ), Pelicula(
                "p10",
                "La lista de Schindler",
                1993,
                "Steven Spielberg",
                "Drama, Historia",
                195,
                "Oskar Schindler, un empresario alemán oportunista, se esfuerza por salvar a sus trabajadores judíos de las cámaras de gas, al darse cuenta del horror del Holocausto.",
                "https://www.youtube.com/watch?v=gG22XNhtnoY"
            ), Pelicula(
                "p11",
                "Psicosis",
                1960,
                "Alfred Hitchcock",
                "Terror, Misterio",
                109,
                "Marion Crane, una secretaria que huye con el dinero de su jefe, se detiene a pasar la noche en el solitario Motel Bates, dirigido por el perturbado Norman Bates, un hombre dominado por su madre.",
                "https://www.youtube.com/watch?v=NG3-GlvKPcg"
            ), Pelicula(
                "p12",
                "El Resplandor",
                1980,
                "Stanley Kubrick",
                "Terror, Suspense",
                146,
                "Jack Torrance, un escritor que se convierte en cuidador de invierno de un hotel, junto con su mujer y su hijo, comienza a volverse loco debido al aislamiento y a la influencia paranormal del lugar.",
                "https://www.youtube.com/watch?v=FOP_X8eCeWI"
            ), Pelicula(
                "p13",
                "2001: Odisea del espacio",
                1968,
                "Stanley Kubrick",
                "Ciencia ficción, Drama",
                149,
                "La evolución de la humanidad es observada por misteriosos monolitos negros que aparecen en momentos clave de la historia.",
                "https://www.youtube.com/watch?v=oR_e9y-bka0"
            ), Pelicula(
                "p14",
                "Ciudadano Kane",
                1941,
                "Orson Welles",
                "Drama, Misterio",
                119,
                "Un reportero intenta descubrir el significado de la última palabra pronunciada por el magnate de la prensa Charles Foster Kane en su lecho de muerte: 'Rosebud'.",
                "https://www.youtube.com/watch?v=FPnTtThroww"
            ), Pelicula(
                "p15",
                "El Señor de los Anillos: La comunidad del anillo",
                2001,
                "Peter Jackson",
                "Fantasía, Aventura",
                178,
                "El hobbit Frodo Bolsón hereda un anillo que resulta ser el Anillo Único, un arma de poder absoluto creada por el Señor Oscuro Sauron. Frodo debe destruirlo antes de que caiga en manos de Sauron.",
                "https://www.youtube.com/watch?v=V75dMMIW2B4"
            ), Pelicula(
                "p16",
                "Star Wars: Una nueva esperanza",
                1977,
                "George Lucas",
                "Ciencia ficción, Aventura",
                121,
                "Luke Skywalker se une a los rebeldes para rescatar a una princesa de las garras del malvado Imperio Galáctico y destruir la estación espacial definitiva, la Estrella de la Muerte.",
                "https://www.youtube.com/watch?v=vZ734NWnAHA"
            ), Pelicula(
                "p17",
                "Espartaco",
                1960,
                "Stanley Kubrick",
                "Drama, Historia",
                197,
                "Espartaco, un esclavo tracio, lidera una rebelión de esclavos contra el Imperio Romano. Basada en la novela homónima de Howard Fast.",
                "https://www.youtube.com/watch?v=aBWkP7aar2M"
            ), Pelicula(
                "p18",
                "Taxi Driver",
                1976,
                "Martin Scorsese",
                "Drama, Thriller",
                114,
                "Travis Bickle, un veterano de Vietnam perturbado mentalmente, trabaja como taxista nocturno en una ciudad de Nueva York decadente. Su obsesión por limpiar las calles lo lleva a planear un asesinato político.",
                "https://www.youtube.com/watch?v=UUxD4-dEzn0"
            ), Pelicula(
                "p19",
                "La naranja mecánica",
                1971,
                "Stanley Kubrick",
                "Ciencia ficción, Crimen",
                136,
                "En un futuro distópico, Alex, un joven con tendencias violentas, es sometido a un tratamiento experimental que lo condiciona a odiar la violencia.",
                "https://www.youtube.com/watch?v=sparYLZj7Xw"
            ), Pelicula(
                "p20",
                "Adiós, muñeca",
                1975,
                "Robert Aldrich",
                "Noir, Crimen",
                113,
                "Mickey Spillane's Mike Hammer, un detective privado cínico y violento, se ve envuelto en un caso que involucra a una mujer misteriosa, un cadáver y una valiosa estatuilla.",
                "https://www.youtube.com/watch?v=Iq3Ov1Dn-Qo"
            ), Pelicula(
                "p21",
                "El Exorcista",
                1973,
                "William Friedkin",
                "Terror, Drama",
                122,
                "Una niña de 12 años es poseída por una fuerza demoníaca. Su madre recurre a un sacerdote para que la ayude a exorcizar al demonio.",
                "https://www.youtube.com/watch?v=YDGw1MTEe9k"
            ), Pelicula(
                "p22",
                "Vértigo",
                1958,
                "Alfred Hitchcock",
                "Misterio, Thriller",
                128,
                "Un detective con vértigo se obsesiona con una mujer a la que debe seguir y proteger. Cuando ella muere, se enamora de una mujer que se le parece.",
                "https://www.youtube.com/watch?v=Z1dWCR-l7yw"
            ), Pelicula(
                "p23",
                "El Señor de los Anillos: Las dos torres",
                2002,
                "Peter Jackson",
                "Fantasía, Aventura",
                179,
                "Frodo y Sam continúan su viaje hacia Mordor para destruir el Anillo Único, mientras Aragorn, Legolas y Gimli intentan reunir un ejército para enfrentarse a Saruman.",
                "https://www.youtube.com/watch?v=LbfMDwc4azU"
            ), Pelicula(
                "p24",
                "Apocalypse Now",
                1979,
                "Francis Ford Coppola",
                "Drama, Guerra",
                153,
                "Durante la Guerra de Vietnam, el capitán Willard recibe la misión de adentrarse en Camboya para encontrar y eliminar al coronel Kurtz, un oficial que se ha vuelto loco y ha creado su propio reino.",
                "https://www.youtube.com/watch?v=FcZ6HOh1yvA"
            ), Pelicula(
                "p25",
                "El Padrino III",
                1990,
                "Francis Ford Coppola",
                "Drama, Crimen",
                162,
                "Michael Corleone, ya anciano, intenta redimirse de sus pecados mientras su sobrino Vincent se sumerge en el mundo criminal de la familia.",
                "https://www.youtube.com/watch?v=eROINCcKlQ4"
            ), Pelicula(
                "p26",
                "Casablanca",
                1942,
                "Michael Curtiz",
                "Drama, Romance",
                102,
                "Durante la Segunda Guerra Mundial, Rick Blaine, un estadounidense cínico que regenta un café en Casablanca, se reencuentra con su antiguo amor Ilsa, casada con un líder de la Resistencia.",
                "https://www.youtube.com/watch?v=BkL9l7qovsE"
            ), Pelicula(
                "p27",
                "Blade Runner",
                1982,
                "Ridley Scott",
                "Ciencia ficción, Noir",
                117,
                "En un futuro distópico, un ex-policía es reclutado para cazar y eliminar a unos replicantes rebeldes que han vuelto a la Tierra.",
                "https://www.youtube.com/watch?v=eX3u0IlBBO4"
            ), Pelicula(
                "p28",
                "El Mago de Oz",
                1939,
                "Victor Fleming",
                "Fantasía, Aventura",
                102,
                "Dorothy, una niña de Kansas, es transportada a la mágica tierra de Oz en su casa rodante por un tornado. Acompañada de su perro Toto y tres nuevos amigos, emprende un viaje para encontrar al Mago de Oz y volver a casa.",
                "https://www.youtube.com/watch?v=_2c-hhSm5Ug"
            ), Pelicula(
                "p29",
                "Vidas rebeldes",
                1955,
                "Nicholas Ray",
                "Drama",
                111,
                "Jim Stark, un adolescente problemático, se muda a una nueva ciudad con su familia. Allí conoce a Plato, un chico solitario, y a Judy, una chica rebelde, con quienes forma una amistad.",
                "https://www.youtube.com/watch?v=NPkSCXYuzQI"
            ), Pelicula(
                "p30",
                "Amanece que no es poco",
                1989,
                "José Luis Cuerda",
                "Comedia, Drama",
                142,
                "En un pequeño pueblo de Castilla, los habitantes viven situaciones absurdas y surrealistas, como la llegada de un extraterrestre o la aparición de un oso en la plaza.",
                "https://www.youtube.com/watch?v=Ks5bzvT-D6I"
            )
            // en esta parte se pueden agregar mas peliculas
        )

    }
}