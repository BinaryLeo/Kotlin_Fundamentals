package Advanced

fun main(){
    Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishFetch()
    getResult(result = Repository.getCurrentState())
    Repository.error()
    getResult(result = Repository.getCurrentState())


}
object Repository {
    private var loadState: Result = Result.IDLE
    private var dataFetchState: String? = null
    fun startFetch(){
        loadState = Result.LOADING
        dataFetchState = "data"
    }
    fun finishFetch(){
        loadState = Result.SUCCESS
        dataFetchState = null
    }
    fun error(){
        loadState = Result.FAILURE
        dataFetchState = null
    }
    fun getCurrentState(): Result {
        return loadState
    }


}
fun getResult(result:Result){
    when(result){
        Result.SUCCESS -> println("Success")
        Result.FAILURE -> println("Failure")
        Result.PENDING -> println("Pending")
        Result.LOADING -> println("Loading")
        Result.IDLE -> println("Idle")
    }
}
enum class Result{
    SUCCESS ,
    FAILURE,
    PENDING,
    IDLE,
    LOADING
}