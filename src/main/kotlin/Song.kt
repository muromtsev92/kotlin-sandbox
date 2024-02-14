class Song(val title: String, val artist: String) {
    fun play(): String {
        return "playing the song $title by $artist"
    }

    fun stop(): String {
        return "Stopped playing $title"
    }
}