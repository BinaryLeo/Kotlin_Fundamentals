package advanced

fun main() {
    RepositoryData.startFetch()
    handleResult(result = RepositoryData.getCurrentState())
    RepositoryData.finishFetch()
    handleResult(result = RepositoryData.getCurrentState())
    RepositoryData.error()
    handleResult(result = RepositoryData.getCurrentState())
}

fun handleResult(result: ResultData) {
    when (result) {
        is Failure -> { println(result.exception.toString()) }
        is Success -> { println(result.dataFetched ?: "Ensure data is not null") }
        is NotLoading -> { println("Not Loading") }
        is Loading -> { println("Loading") }
        else -> { println("Unknown state") }
    }
}

object RepositoryData {
    private var loadState: ResultData = NotLoading
    private var dataFetchState: String? = null

    fun startFetch() {
        loadState = Loading
        dataFetchState = "data loaded"
    }

    fun finishFetch() {
        loadState = Success(dataFetched = dataFetchState ?: "Default data")
        dataFetchState = null
    }

    fun error() {
        loadState = Failure(exception = Exception("Error"))
        dataFetchState = null
    }

    fun getCurrentState(): ResultData {
        return loadState
    }
}

sealed class ResultData
data class Success(val dataFetched: String) : ResultData()
data class Failure(val exception: Exception) : ResultData()
data object NotLoading : ResultData()
data object Loading : ResultData()