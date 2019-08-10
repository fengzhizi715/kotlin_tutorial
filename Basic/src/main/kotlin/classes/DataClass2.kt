package classes

import com.google.gson.Gson

/**
 * Created by tony on 2019-08-10.
 */
abstract class Message{
    abstract var action:String
}

data class PingMsg(override var action:String="ping"):Message()

data class PongMsg(override var action:String="pong"):Message()

data class AskMsg(override var action:String="change_color",val body:Map<String,String>):Message()

fun main() {
    val gson = Gson()

    println(gson.toJson(PingMsg()))

    val map = mutableMapOf<String,String>()
    map.put("param1","tt")
    map.put("param2","qq")
    val msg = AskMsg(body = map)

    println(gson.toJson(msg))
}