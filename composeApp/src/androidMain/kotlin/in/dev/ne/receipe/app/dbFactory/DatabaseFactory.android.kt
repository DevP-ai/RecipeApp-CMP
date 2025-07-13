package `in`.dev.ne.receipe.app.dbFactory

import android.content.Context
import app.cash.sqldelight.async.coroutines.synchronous
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import `in`.dev.ne.receipe.app.ReceipeAppCmpDb

actual class DatabaseFactory(
    private val context: Context
) {
    actual suspend fun createDriver(): SqlDriver{
        return AndroidSqliteDriver(
            ReceipeAppCmpDb.Schema.synchronous(),
            context,
            DB_FILE_NAME
        )
    }
}