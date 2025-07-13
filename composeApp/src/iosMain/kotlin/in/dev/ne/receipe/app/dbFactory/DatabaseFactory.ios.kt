package `in`.dev.ne.receipe.app.dbFactory

import app.cash.sqldelight.async.coroutines.synchronous
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import `in`.dev.ne.receipe.app.ReceipeAppCmpDb

actual class DatabaseFactory {
    actual suspend fun createDriver(): SqlDriver{
        return NativeSqliteDriver(
            ReceipeAppCmpDb.Schema.synchronous(),
            DB_FILE_NAME
        )
    }
}