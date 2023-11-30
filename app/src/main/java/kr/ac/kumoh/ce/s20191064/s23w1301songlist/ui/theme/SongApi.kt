package kr.ac.kumoh.ce.s20191064.s23w1301songlist.ui.theme

import kr.ac.kumoh.ce.s20191064.s23w1301songlist.Song
import retrofit2.http.GET

interface SongApi {
    @GET("song")
    suspend fun getSongs(): List<Song>
}