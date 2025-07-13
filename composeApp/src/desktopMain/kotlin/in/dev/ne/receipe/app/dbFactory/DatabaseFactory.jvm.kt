package `in`.dev.ne.receipe.app.dbFactory

import app.cash.sqldelight.async.coroutines.awaitCreate
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver
import `in`.dev.ne.receipe.app.ReceipeAppCmpDb

actual class DatabaseFactory {
    actual suspend fun createDriver(): SqlDriver{
        val driver = JdbcSqliteDriver(
            JdbcSqliteDriver.IN_MEMORY
        )
        ReceipeAppCmpDb.Schema.awaitCreate(driver)
        return driver
    }
}