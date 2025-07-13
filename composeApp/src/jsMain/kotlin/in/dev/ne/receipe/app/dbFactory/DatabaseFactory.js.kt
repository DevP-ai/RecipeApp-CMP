package `in`.dev.ne.receipe.app.dbFactory

import app.cash.sqldelight.async.coroutines.awaitCreate
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.worker.WebWorkerDriver
import `in`.dev.ne.receipe.app.ReceipeAppCmpDb
import org.w3c.dom.Worker

actual class DatabaseFactory {
    actual suspend fun createDriver(): SqlDriver{
        val driver = WebWorkerDriver(
            Worker(
                js("""new URL("@cashapp/sqldelight-sqljs-worker/sqljs.worker.js", import.meta.url)""")
            )
        )
        ReceipeAppCmpDb.Schema.awaitCreate(driver)
        return driver
    }
}