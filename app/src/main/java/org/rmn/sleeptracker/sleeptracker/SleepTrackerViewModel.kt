package org.rmn.sleeptracker.sleeptracker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import org.rmn.sleeptracker.database.SleepDatabaseDao

class SleepTrackerViewModel (
    val database: SleepDatabaseDao,
    application: Application) : AndroidViewModel(application) {

}