package com.kotlin.tutorial.retrofit.domain.model

import android.support.v7.app.AppCompatActivity
import com.kotlin.tutorial.retrofit.http.RetrofitManager
import com.safframework.utils.RxJavaUtils
import io.reactivex.Maybe
import java.io.Serializable

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.retrofit.domain.response.UserEventModel.java
 * @author: Tony Shen
 * @date: 2018-06-18 21:21
 * @version V1.0 <描述当前版本功能>
 */
//data class UserEventModel(var data: List<Event>?) : Serializable {
//
//    constructor() : this(null)
//
//
//    fun publicEvent(activity: AppCompatActivity, userName: String): Maybe<List<UserEventModel>> {
//
//        return RetrofitManager.get().apiService()
//                .publicEvent(userName)
////                .compose(RxLifecycle.bind(activity).toLifecycleTransformer())
//                .compose(RxJavaUtils.maybeToMain())
//    }
//}

data class Event(var id: String,
                 var type: String,
                 var actor: Actor,
                 var repo: Repo,
                 var payload: Payload,
                 var public: Boolean,
                 var created_at: String) : Serializable

data class Actor(var id: String,
                 var login: String,
                 var display_login: String,
                 var gravatar_id: String,
                 var url: String,
                 var avatar_url: String) : Serializable

data class Repo(var id: String,
                var name: String,
                var url: String) : Serializable

data class Payload(var push_id: Long,
                   var size: Int,
                   var distinct_size: Int,
                   var ref: String,
                   var head: String,
                   var before: String,
                   var commits: List<Commit>) : Serializable

data class Commit(var sha: String,
                  var author: Author,
                  var message: String,
                  var distinct: Boolean,
                  var url: String) : Serializable

data class Author(var email:String,
                  var name:String) : Serializable

fun publicEvent(activity: AppCompatActivity, userName: String): Maybe<List<Event>> {

    return RetrofitManager.get().apiService()
            .publicEvent(userName)
//                .compose(RxLifecycle.bind(activity).toLifecycleTransformer())
            .compose(RxJavaUtils.maybeToMain())
}
