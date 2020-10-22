package valentin.projects.retrofit.repository

import retrofit2.Response
import valentin.projects.retrofit.api.RetrofitInstance
import valentin.projects.retrofit.model.Post

class Repository {

    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }

    suspend fun getPost2(number: Int): Response<Post> {
        return return RetrofitInstance.api.getPost2(number)
    }

    suspend fun getCustomPosts(userId: Int, sort: String, order: String): Response<List<Post>> {
        return return RetrofitInstance.api.getCustomPost(userId, sort, order)
    }

    suspend fun getCustomPosts2(userId: Int, options: Map<String, String>): Response<List<Post>> {
        return return RetrofitInstance.api.getCustomPost2(userId, options)
    }

}